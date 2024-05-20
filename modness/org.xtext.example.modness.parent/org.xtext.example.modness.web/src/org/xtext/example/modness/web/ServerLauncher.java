/*
 * generated by Xtext 2.35.0.M1
 */
package org.xtext.example.modness.web;

import java.net.InetSocketAddress;
import org.eclipse.jetty.annotations.AnnotationConfiguration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.Configuration;
import org.eclipse.jetty.webapp.MetaInfConfiguration;
import org.eclipse.jetty.webapp.WebAppConfiguration;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.webapp.WebInfConfiguration;
import org.eclipse.jetty.webapp.WebXmlConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This program starts an HTTP server for testing the web integration of your DSL.
 * Just execute it and point a web browser to http://localhost:8080/
 */
public class ServerLauncher {
	
	private static final Logger LOG = LoggerFactory.getLogger(ServerLauncher.class);
	
	public static void main(String[] args) {
		Server server = new Server(new InetSocketAddress("localhost", 8080));
		WebAppContext ctx = new WebAppContext();
		ctx.setResourceBase("WebRoot");
		ctx.setWelcomeFiles(new String[] {"index.html"});
		ctx.setContextPath("/");
		ctx.setConfigurations(new Configuration[] {
			new AnnotationConfiguration(),
			new WebXmlConfiguration(),
			new WebInfConfiguration(),
			new MetaInfConfiguration(),
			new WebAppConfiguration()
		});
		ctx.setAttribute(MetaInfConfiguration.CONTAINER_JAR_PATTERN,
			".*/org\\.xtext\\.example\\.modness\\.web/.*,.*\\.jar");
		ctx.setInitParameter("org.eclipse.jetty.servlet.Default.useFileMappedBuffer", "false");
		server.setHandler(ctx);
		try {
			server.start();
			LOG.info("Server started " + server.getURI() + "...");
			new Thread() {

				public void run() {
					try {
						LOG.info("Press enter to stop the server...");
						int key = System.in.read();
						if (key != -1) {
							server.stop();
						} else {
							LOG.warn(
									"Console input is not available. In order to stop the server, you need to cancel process manually.");
						}
					} catch (Exception e) {
						LOG.warn(e.getMessage());
					}
				}

			}.start();
			server.join();
		} catch (Exception exception) {
			LOG.warn(exception.getMessage());
			System.exit(1);
		}
	}
}
