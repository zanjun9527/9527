package com.boot.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(MybatisConfig.class)
public class MapperScanner {
	 @Bean
	    public MapperScannerConfigurer mapperScannerConfigurer() {
	        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
	        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
	        mapperScannerConfigurer.setBasePackage("com.boot.dao.mapper");
	        return mapperScannerConfigurer;
	    }	
}
