package min.boot.react;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
public class ReactApplication extends SpringBootServletInitializer {
public static void main(String[ ] args) {
SpringApplication.run(ReactApplication.class, args);
}
@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
return springApplicationBuilder.sources(ReactApplication.class);
}
}