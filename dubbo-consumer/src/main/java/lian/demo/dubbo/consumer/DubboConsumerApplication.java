package lian.demo.dubbo.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableDubbo 包含 @EnableDubboConfiguration
@EnableDubboConfiguration
@SpringBootApplication
public class DubboConsumerApplication {

	public static void main(String[] args) {
		org.springframework.boot.SpringApplication.run(DubboConsumerApplication.class, args);

		System.out.println("我是消费方启动啦!");
	}

}
