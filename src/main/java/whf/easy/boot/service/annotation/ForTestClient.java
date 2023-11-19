package whf.easy.boot.service.annotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForTestClient {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "com.example.ownertest.dm.annotation");

        System.out.println(ForTestClient.class.getSimpleName());
    }

}
