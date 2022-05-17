package com.xcky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动接口
 *
 * @author lbchen
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.xcky.mapper"})
public class WxCloudRunApplication {
    public static void main(String[] args) {
        System.out.println("运行容器成功");
        SpringApplication.run(WxCloudRunApplication.class, args);
        System.out.println("运行容器结束");
    }
}
