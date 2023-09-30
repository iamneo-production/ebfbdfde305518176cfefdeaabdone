import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "examly") // Replace with your actual package name
public class AppConfig {

    // Define beans here

    @Bean
    public Student student() {
        return new Student();
    }
}
