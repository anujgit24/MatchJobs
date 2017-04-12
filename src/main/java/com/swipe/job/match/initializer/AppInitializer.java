package com.swipe.job.match.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.swipe.job.match.configuration.AppConfiguration;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

		@Override
		protected Class[] getRootConfigClasses() {
			return new Class[] { AppConfiguration.class };
		}

		@Override
		protected Class[] getServletConfigClasses() {
			return null;
		}

		@Override
		protected String[] getServletMappings() {
			return new String[] { "/" };
		}

}

