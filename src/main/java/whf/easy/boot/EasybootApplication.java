package whf.easy.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource({"classpath:dubbo-provider.xml","classpath:dubbo-consumer.xml"})
public class EasybootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasybootApplication.class, args);
	}

}
