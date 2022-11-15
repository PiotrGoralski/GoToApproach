package goralski.piotr.gotoapproach.business;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@EnableAutoConfiguration
@Configuration(proxyBeanMethods = false)
@PropertySource("classpath:business.properties")
public class BusinessConfiguration {
}