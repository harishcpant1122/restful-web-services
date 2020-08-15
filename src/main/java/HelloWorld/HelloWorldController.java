package HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller - Handling the http request
@RestController
public class HelloWorldController {
	
	//GET
	//URI - /hello-world
	//method -"Hello world"
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World 1";
	}

	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean1 helloWorldBean() {
		return new HelloWorldBean1("Hello World 2");
	}
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean1 helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean1(String.format("Hello World %s",name));
	}
}
