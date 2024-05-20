package site.zhangjiahao.moneyboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class MoneyBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoneyBootApplication.class, args);
    }

}
