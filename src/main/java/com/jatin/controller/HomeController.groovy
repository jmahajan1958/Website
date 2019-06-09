package com.jatin.controller

import javax.servlet.ServletContext

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class HomeController  extends AbstractUIController {

	static final org.slf4j.Logger logger = LoggerFactory.getLogger(HomeController.class)

	@RequestMapping(value =["/home", "/"], method = RequestMethod.GET)
	public String index(Model modelMap) {
		logger.info("Default page is loaded")
		//This is the index file in the templates folder
		return "index/index";

	}

	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about () {
		logger.info("Pass through about");

		return "About/About";
	}


	@RequestMapping(value="/blogs",method=RequestMethod.GET)
	public String blogs () {
		logger.info("Pass through blogs");

		return "Blogs/Blogs";
	}

	@RequestMapping(value="/contact",method=RequestMethod.GET)
	public String contact () {
		logger.info("Pass through contact");

		return "Contact/Contact";
	}

	@RequestMapping(value="/portfolio",method=RequestMethod.GET)
	public String portfolio () {
		logger.info("Pass through about");

		return "Portfolio/Portfolio";
	}

	@RequestMapping(value="/resume",method=RequestMethod.GET)
	public String resume () {
		logger.info("Pass through resume");

		return "Resume/Resume";
	}
}
