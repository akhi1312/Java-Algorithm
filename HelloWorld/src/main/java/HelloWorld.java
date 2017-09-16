
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Main Class to run Spring Application
 */

public class HelloWorld{

    public static void main(String[] args){

        // Making Beankfactory
        ApplicationContext context = (ApplicationContext) new FileSystemXmlApplicationContext("beans.xml");
        Greete greete = (Greete) context.getBean("greeter");
        System.out.println("Hello world from " + greete.getGreeting());

    }

}
