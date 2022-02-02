package com.Spring2.com.Spring.web1;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.Spring2.com.Spring.web1.Repository.EmployeeRepository;
import com.Spring2.com.Spring.web1.model.Employee;

@SpringBootApplication
public class SpringWebApplication extends SpringBootServletInitializer {
	
	
	@Autowired
	private EmployeeRepository r;
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringWebApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner initDB() {
		return (args) -> {
			r.save(new Employee("Komal", 42000L));
			r.save(new Employee("Kiran", 80000L));
			r.save(new Employee("Divya", 90000L));
			r.save(new Employee("Swarali",5000L));
		};
	}

}