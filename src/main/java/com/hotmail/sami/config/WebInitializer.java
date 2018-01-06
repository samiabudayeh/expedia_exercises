package com.hotmail.sami.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext)
			throws ServletException {
		// TODO Auto-generated method stub
		
	}

	/*
	 * public void onStartup(ServletContext servletContext) throws
	 * ServletException {
	 * 
	 * AnnotationConfigWebApplicationContext ctx = new
	 * AnnotationConfigWebApplicationContext(); ctx.register(Config.class);
	 * 
	 * ctx.setServletContext(servletContext);
	 * 
	 * Dynamic servlet = servletContext.addServlet("dispatcher", new
	 * DispatcherServlet(ctx)); servlet.addMapping("/");
	 * servlet.setLoadOnStartup(1);
	 * 
	 * 
	 * // Create the 'root' Spring application context
	 * AnnotationConfigWebApplicationContext rootContext = new
	 * AnnotationConfigWebApplicationContext();
	 * rootContext.register(Config.class);
	 * 
	 * // Manage the lifecycle of the root application context
	 * servletContext.addListener(new ContextLoaderListener(rootContext));
	 * 
	 * // Create the dispatcher servlet's Spring application context
	 * AnnotationConfigWebApplicationContext dispatcherContext = new
	 * AnnotationConfigWebApplicationContext();
	 * //dispatcherContext.register(DispatcherConfig.class);
	 * 
	 * // Register and map the dispatcher servlet ServletRegistration.Dynamic
	 * dispatcher = servletContext.addServlet("dispatcher", new
	 * DispatcherServlet(dispatcherContext)); dispatcher.setLoadOnStartup(1);
	 * dispatcher.addMapping("/");
	 * 
	 * 
	 * }
	 */
//	public void onStartup(ServletContext servletContext)
//			throws ServletException { 
//		WebApplicationContext context = getContext();
//		servletContext.addListener(new ContextLoaderListener(context));
//		ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
//				"DispatcherServlet", new DispatcherServlet(context));
//		dispatcher.setLoadOnStartup(1);
//		dispatcher.addMapping("/*");
//	} 
//
//	private AnnotationConfigWebApplicationContext getContext() {
//		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//		context.setConfigLocation("com.hotmail.sami.config");
//		//context.register(Config.class); 
//		//context.setConfigLocation("/WEB-INF/spring-dispatcher-servlet.xml");
//		return context;
//	}
}