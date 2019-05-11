package »ù´¡;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		Catglory c=(Catglory) context.getBean("c");
		
		System.out.println(c.getName());
	}
	
	
}
