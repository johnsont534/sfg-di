package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {
	
	/**
	 * Apparently putting Autowire here works as well.
	 */
	private GreetingService greetingService;
	
	@Qualifier("setterInjectedGreetingService")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}
	
	public String getGreeting(){
        return greetingService.sayGreeting();
    }

}