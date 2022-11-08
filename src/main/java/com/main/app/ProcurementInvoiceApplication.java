package com.main.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class ProcurementInvoiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcurementInvoiceApplication.class, args);
}
}