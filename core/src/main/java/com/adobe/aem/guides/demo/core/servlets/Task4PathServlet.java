package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;
import javax.servlet.Servlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

import java.util.Random;

@Component(service = Servlet.class, immediate = true, property = {
        "sling.servlet.paths=/bin/generate"
})
public class Task4PathServlet extends SlingSafeMethodsServlet {
    private Random random = new Random();

    private String generateRandomWord() {
        StringBuilder word = new StringBuilder();
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(chars.length());
            word.append(chars.charAt(index));
        }
        return word.toString();
    }

    private String generateRandomNumber() {
        return String.format("%06d", random.nextInt(1000000));
    }

    @Override
    protected void doGet(SlingHttpServletRequest req, SlingHttpServletResponse res) throws IOException {
        String sessionParam = req.getParameter("session");
        String randomParam = req.getParameter("random");
        res.setContentType("application/json");
        if ("true".equals(sessionParam)) {

            res.getWriter().write("{\"randomWord\": \"" + generateRandomWord() + "\"}");
        } else if ("true".equals(randomParam)) {

            res.getWriter().write("{\"randomNumber\": \"" + generateRandomNumber() + "\"}");
        } else {
            res.getWriter().write(
                    "{\"error\": \"Invalid request. Please provide either 'session=true' or 'random=true' as a parameter.\"}");
        }
    }
}
