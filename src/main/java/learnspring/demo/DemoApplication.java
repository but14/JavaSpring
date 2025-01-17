package learnspring.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Outfit outfit = context.getBean(Outfit.class);
		System.out.println("Instance " + outfit);
		outfit.wear();

		Girl girl = context.getBean(Girl.class);

		System.out.print("Girl instance: " + girl);
		System.out.print("Girl outfit: " + girl.outfit);
		girl.outfit.wear();
	}

}
