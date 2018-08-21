package com.zhang.springcase.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 应用启动类,springboot应用入口
 */
@SpringBootApplication
public class SpringScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringScheduleApplication.class, args);
	}
	
}
