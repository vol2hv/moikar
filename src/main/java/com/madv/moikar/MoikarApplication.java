package com.madv.moikar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
@Slf4j
@SpringBootApplication
public class MoikarApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoikarApplication.class, args);
	}

	@PostConstruct
	public void qq(){
		log.info("долго старушка мучалась");
	}

}
