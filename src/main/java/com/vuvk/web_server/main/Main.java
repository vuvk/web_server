package com.vuvk.web_server.main;

import com.vuvk.web_server.servlets.AllRequestsServlet;
import com.vuvk.web_server.servlets.MirrorServlet;
import javax.servlet.Servlet;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


/**
 *
 * @author Anton "Vuvk" Shcherbatykh
 */
public class Main {
    public static void main(String ... args) throws Exception {

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        
        context.addServlet(new ServletHolder(new MirrorServlet()), "/mirror");
        context.addServlet(new ServletHolder(new AllRequestsServlet()), "/*");

        Server server = new Server(8080);
        server.setHandler(context);
        
        server.start();        
        java.util.logging.Logger.getGlobal().info("Server started");       
        server.join();
    }
}
