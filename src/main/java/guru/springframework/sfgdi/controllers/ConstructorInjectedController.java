package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Note that Autowire is not needed for constructor based dep. injection
 * @author timjohnson
 *
 */

@Controller
public class ConstructorInjectedController {
	
	private final GreetingService greetingService;
	
	
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreeting(){
        return greetingService.sayGreeting();
    }

	

}
