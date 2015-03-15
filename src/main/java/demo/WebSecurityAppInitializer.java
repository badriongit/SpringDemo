package demo;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class WebSecurityAppInitializer extends
		AbstractSecurityWebApplicationInitializer {
	
	public WebSecurityAppInitializer() {
		// TODO Auto-generated constructor stub
	  super(WebSecurityConfig.class);
	}

}
