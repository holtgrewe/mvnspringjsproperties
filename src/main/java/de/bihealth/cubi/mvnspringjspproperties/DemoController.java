package de.bihealth.cubi.mvnspringjspproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	// Global Config Bean ---------------------------------------------------

	@Autowired
	@Value("#{globalConfig}")
	GlobalConfig config;

	/**
	 * Example for loading configuration from a config bean
	 */
	@RequestMapping(value = "/welcome1.html")
	public ModelAndView welcome1() {
		String message = "Value of section.bar: " + config.getSectionBar()
				+ " (ENV interpreted), value of section.foo: " + config.getSectionFoo() + " (ENV not interpreted)";
		return new ModelAndView("welcome1", "message", message);
	}

	// Plainly accessing configuration --------------------------------------

	@Autowired
	@Value("${section.bar}")
	String sectionBar;

	@Autowired
	@Value("${section.foo}")
	String sectionFoo;

	/**
	 * Example for loading configuration directly from properties
	 */
	@RequestMapping(value = "/welcome2.html")
	public ModelAndView welcome2() {
		String message = "Value of section.bar: " + sectionBar + " (ENV interpreted), value of section.foo: "
				+ sectionFoo + " (ENV not interpreted)";
		return new ModelAndView("welcome2", "message", message);
	}

}
