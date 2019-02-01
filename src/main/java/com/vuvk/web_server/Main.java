package com.vuvk.web_server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 *
 * @author Anton "Vuvk" Shcherbatykh
 */
public class Main {
    public static void main(String ... args) throws Exception {
        Server server = new Server(666);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(context);
        
        server.start();
        server.join();
    }
}
