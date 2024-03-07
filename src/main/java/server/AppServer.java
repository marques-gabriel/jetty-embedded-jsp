package server;

import org.eclipse.jetty.ee10.jsp.JettyJspServlet;
import org.eclipse.jetty.ee10.servlet.DefaultServlet;
import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import org.eclipse.jetty.ee10.servlet.ServletHolder;
import org.eclipse.jetty.ee10.webapp.WebAppContext;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;

import util.Logger;

public class AppServer {

    private static final String WEBAPP_PATH = "src/main/webapp";

    public static void start(Long startTime) {
        try {
            long endTime;

            Server server = new Server();
            setHttp(server);

            WebAppContext context = setContext();

            server.setHandler(context);

            server.start();

            endTime = System.currentTimeMillis();
            Logger.log("Embedded Web Container", "Started in " + ((double) (endTime - startTime) / 1000) + " seconds");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setHttp(Server server) {

        try {
            ServerConnector http = new ServerConnector(server);
            http.setPort(8080);
            server.addConnector(http);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Logger.log("Embedded Web Container", "Web Container started on port 8080");

        }
    }

    private static WebAppContext setContext() {
        try {
            WebAppContext context = new WebAppContext();
            context.setContextPath("/");
            context.setBaseResourceAsString(WEBAPP_PATH);

            setJspServlet(context);
            setDefaultServlet(context);

            return context;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Logger.log("Embedded Web Container", "Handled Context");

        }
        return null;
    }

    private static void setJspServlet(ServletContextHandler context) {
        try {

            ServletHolder JspServlet = context.addServlet(JettyJspServlet.class, "/webapp");

            JspServlet.setInitOrder(0);
            JspServlet.setAsyncSupported(true);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            Logger.log("Embedded Web Container", "Configured Jsp Servlet");
        }
    }

    private static void setDefaultServlet(ServletContextHandler context) {
        try {

            ServletHolder defaultServletHolder = context.addServlet(DefaultServlet.class, "/");

            defaultServletHolder.setInitParameter("resourceBase", WEBAPP_PATH);
            defaultServletHolder.setInitParameter("dirAllowed", "false");
            defaultServletHolder.setInitParameter("welcomeServlets", "true");
            defaultServletHolder.setAsyncSupported(true);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            Logger.log("Embedded Web Container", "Configured Default Servlet");
        }
    }
}
