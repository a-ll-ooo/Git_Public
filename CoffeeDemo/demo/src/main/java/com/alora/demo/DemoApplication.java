package com.alora.demo;

import com.alora.demo.entity.MenuEntity;
import com.alora.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	MenuService menuService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*
		MenuEntity menuEntity = new MenuEntity();
		menuEntity.setId(100);
		menuEntity.setProduct("Coffee");
		menuService.addToMenu(menuEntity);

		menuEntity.setId(102);
		menuEntity.setProduct("Tea");
		menuService.addToMenu(menuEntity);

	 */
	}
}
