package com.xc.study.framework.springmvc.inaction.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * springmvc配置
 *
 */
@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
@ComponentScan("com.xc.study.framework.springmvc.inaction.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

	/**
	 * 注入jsp视图解析器 
	 */
	/*	@Bean
		public ViewResolver viewResolver() {
			InternalResourceViewResolver resolver = new InternalResourceViewResolver();
			resolver.setPrefix("/springmvc/jsp/");
			resolver.setSuffix(".jsp");
			resolver.setExposeContextBeansAsAttributes(true);
			return resolver;
		}*/

	/*	public ViewResolver cnViewResolver(ContentNegotiationManager cnm) {
			ContentNegotiatingViewResolver cnvr = new ContentNegotiatingViewResolver();
			cnvr.setContentNegotiationManager(cnm);
			return cnvr;
		}*/

	/**
	 * 配置静态资源的处理
	 */
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	/*	@Override
		public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
			configurer.defaultContentType(MediaType.APPLICATION_JSON);
		}*/

}
