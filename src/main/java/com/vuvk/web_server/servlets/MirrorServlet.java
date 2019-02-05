package com.vuvk.web_server.servlets;

import com.vuvk.web_server.templater.PageGenerator;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Exercise 1.1 
 * https://stepik.org/lesson/12196/step/12?unit=2765
 * @author Anton "Vuvk" Shcherbatykh
 */
public class MirrorServlet extends HttpServlet {
        
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        String message = request.getParameter("key");
        
        response.setContentType("text/html;charset=utf-8");

        if (message == null || message.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        } else {
            response.setStatus(HttpServletResponse.SC_OK);
        }

        response.getWriter().println(message);
    }
}
