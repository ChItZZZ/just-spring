package club.shzhong.config;

import club.shzhong.domain.Car;
import club.shzhong.domain.Man;
import club.shzhong.domain.QQCar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//同xml一样描述bean以及bean之间的依赖关系
@Configuration
public class ManConfig {
    @Bean
    public Man man() {
        return new Man(car());
    }
    @Bean
    public Car car() {
        return new QQCar();
    }
}