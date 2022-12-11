package com.rovinska.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.rovinska.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
