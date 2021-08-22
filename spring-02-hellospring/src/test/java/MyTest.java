import com.kaitan.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args){
//        获取Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        我们的对象现在都在Spring中管理了，我们要用，直接取用就好了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
