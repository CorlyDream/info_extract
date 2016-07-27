package cc.corly.config;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.PatternLayout;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"cc.corly.service"}, 
		excludeFilters={@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
public class RootConfig {
	
	private PatternLayout patternLayout;
	
	public RootConfig() {
		patternLayout = new PatternLayout();
		patternLayout.setConversionPattern("%d %-5p [%c{1}] %m %n");
	}
	
	@Bean
	public ConsoleAppender consoleAppender(){
		ConsoleAppender consoleAppender = new ConsoleAppender();
		consoleAppender.setThreshold(Level.INFO);
		consoleAppender.setLayout(patternLayout);
		return consoleAppender;
	}
}
