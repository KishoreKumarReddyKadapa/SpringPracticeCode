//package com.skslate.config;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//public class LoveCalculatorAppInitializer implements WebApplicationInitializer
//	{
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		System.out.println("Web Config file Detected by tomcat ...>>>>>>");
//		// step 1 - create dispatcher servelt
//		AnnotationConfigWebApplicationContext aCwac = new AnnotationConfigWebApplicationContext();
//		//xwac.setConfigLocation("classpath:beans.xml");
//		aCwac.register(LCAppConfig.class);
//
//		DispatcherServlet ds = new DispatcherServlet(aCwac);
//
//		ServletRegistration.Dynamic servletReg = servletContext.addServlet("LoveCalculatorDispatcherServlet", ds);
//
//		servletReg.setLoadOnStartup(1);
//		servletReg.addMapping("/");
//
//	}
//
//}
