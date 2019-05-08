package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx =
    			new ClassPathXmlApplicationContext("beans.xml");
    	Greet g = (Greet) ctx.getBean("korea"); 
        System.out.println( "Greeting :" + g.sayHello()
        					+ ((Greeter)g).sayHello2());
        g = (Greet) ctx.getBean("english"); 
        System.out.println( "Greeting :" + ((Greeter)g).sayHello2());
    	
		Greeter korea = (Greeter) ctx.getBean("korea"); 
        System.out.println( "Greeting :" + korea.sayHello());
        Greeter2 eng = (Greeter2) ctx.getBean("english"); 
        System.out.println( "Greeting :" + korea.sayHello2());
    }
}
