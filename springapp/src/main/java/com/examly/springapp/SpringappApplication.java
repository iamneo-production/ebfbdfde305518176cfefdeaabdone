import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.examly.Student; // Replace with your actual package name

public class MainApp {

    public static void main(String[] args) {
        // Load the Spring application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Student bean
        Student student = context.getBean("student", Student.class);

        // Access student details
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
    }
}
