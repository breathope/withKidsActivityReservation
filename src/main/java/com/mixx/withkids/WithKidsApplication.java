package com.mixx.withkids;

import java.util.Date;

import com.mixx.withkids.domain.Repository;
import com.mixx.withkids.domain.Reservation;

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

		Date reserveDate = new Date();
		Reservation reservation = new Reservation("샘플활동", (long) 22222111, "레고랜드", "강원/춘천", "테마파크", reserveDate);
		// reservation.setActName("샘플활동");
		// reservation.setActCode(2022041111);
		// reservation.setReserveAt(new Date());
		// reservation.setCategory("샘플카테고리");
		// reservation.setLocation("서울 강남");
		// reservation.setCanceled(false);

		repository.save(reservation);

		System.out.println(reservation.checkNoShow());
		System.out.println(reservation.checkNoShow() == false);
	}

}
