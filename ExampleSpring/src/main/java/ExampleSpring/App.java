package ExampleSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import ExampleSpring.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource resource = new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		System.out.println("resource:"+resource);
		
		Student student = (Student)factory.getBean("myObj");
		student.displayInfo();
    }
}
