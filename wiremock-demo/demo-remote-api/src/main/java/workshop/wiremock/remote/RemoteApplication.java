package workshop.wiremock.remote;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("workshop.wiremock")
@SpringBootApplication
public class RemoteApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RemoteApplication.class)
                .run(args);
    }
}