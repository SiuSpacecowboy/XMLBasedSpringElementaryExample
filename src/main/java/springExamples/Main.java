package springExamples;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springExamples.fromTheMount.FromMount;
import springExamples.fromTheMount.Inventory;
import springExamples.fromTheMount.Skis;
import springExamples.fromTheMount.Snowboard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ForTestBeans character1 = context.getBean("forTB" , ForTestBeans.class);
        ForTestBeans character2 = context.getBean("forTB" , ForTestBeans.class);
        character1.setNickname("Lina");
        System.out.println(character1.getNickname() + " " + character2.getNickname()); // Так как Scope singleton - это ссылки на 1 объект
        System.out.println("=====================================================================================");
        TestBeans bean = context.getBean("firstBean", TestBeans.class);
        TestBeans bean1 = context.getBean("firstBean", TestBeans.class);
        bean.setTestName(new ForTestBeans("Lion")); // Так как firstBean имеет scope prototype, Выше создано 2 разных объекта.
        System.out.println(bean.getNicknames());
        System.out.println(bean1.getNicknames());
        System.out.println("========================================================");
        FromMount mount2 = context.getBean("mount", FromMount.class);
        mount2.ride();
        System.out.println(mount2.getName());
        System.out.println(mount2.getHigh());
        context.close();
    }
}
