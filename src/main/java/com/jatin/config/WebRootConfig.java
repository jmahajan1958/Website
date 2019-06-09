/**
 * 
 */
package com.jatin.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author jatin
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.jatin" }, excludeFilters = {
		@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
@EnableTransactionManagement
public class WebRootConfig {

	static final org.slf4j.Logger logger = LoggerFactory.getLogger(WebRootConfig.class.getName());

}
