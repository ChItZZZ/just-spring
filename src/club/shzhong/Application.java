package club.shzhong;

import club.shzhong.config.ManConfig;
import club.shzhong.domain.Man;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
    
    public static void main(String[] args) {
        //从java注解的配置中加载配置到容器
//        ApplicationContext context = new AnnotationConfigApplicationContext(ManConfig.class);
//        //从容器中获取对象实例
//        Man man = context.getBean(Man.class);
//        man.driveCar();

        ApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/zhongshaohan/java/spring-test/src/spring.xml");
        //从容器中获取对象实例
        Man man = context.getBean(Man.class);
        man.driveCar();
    }
}
