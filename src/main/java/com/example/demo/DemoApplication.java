package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@Component
class Init {

	final TestProperties props;

	public Init(TestProperties props) {
		this.props = props;
	}

	@EventListener(ApplicationReadyEvent.class)
	public void test(){
		System.out.println(props.numbers);
		System.out.println(props.text);
		System.out.println(props.bad);
	}
}