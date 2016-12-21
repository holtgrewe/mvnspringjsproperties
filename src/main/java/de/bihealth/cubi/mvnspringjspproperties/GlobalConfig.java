package de.bihealth.cubi.mvnspringjspproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:application.properties")
public class GlobalConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Value("${section.foo}")
	private String sectionFoo;

	@Value("${section.bar}")
	private String sectionBar;

	public String getSectionFoo() {
		return sectionFoo;
	}

	public void setSectionFoo(String sectionFoo) {
		this.sectionFoo = sectionFoo;
	}

	public String getSectionBar() {
		return sectionBar;
	}

	public void setSectionBar(String sectionBar) {
		this.sectionBar = sectionBar;
	}

}
