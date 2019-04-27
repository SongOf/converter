package cn.edu.bupt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 启动类
 * @Author: CZX
 * @CreateDate: 2018/12/2 13:52
 * @Version: 1.0
 */
@SpringBootApplication
public class ConverterApplication {
	public static void main(String[] args) {
		System.setProperty("org.bytedeco.javacpp.maxphysicalbytes", "0");
		System.setProperty("org.bytedeco.javacpp.maxbytes", "0");
		SpringApplication.run(ConverterApplication.class, args);
	}
}
