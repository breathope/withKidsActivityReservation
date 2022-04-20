package com.mixx.withkids;

import java.util.Date;

import com.mixx.withkids.domain.Repository;
import com.mixx.withkids.domain.Resevation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WithKidsApplication {

	static ApplicationContext applicationContext;
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(WithKidsApplication.class, args);

		Repository repository = applicationContext.getBean(Repository.class);

		Resevation reservarion = new Resevation();
		reservarion.setReserveDate(new Date());
		reservarion.setCanceled(false);

		repository.save(reservarion);

		System.out.println(reservarion.checkNoShow());
		System.out.println(reservarion.checkNoShow() == false);
	}

}
