package cn.ekgc.ovms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>公务用车管理系统-注册中心启动类</b>
 * @author y
 * @version 1.0.0
 * @since 1.0.0
 * */
@EnableEurekaServer
@SpringBootApplication
public class OvmsRegistryCenterStarter {
	public static void main(String[] args) {
		SpringApplication.run(OvmsRegistryCenterStarter.class, args);
	}
}
