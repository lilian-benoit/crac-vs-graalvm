package fr.lbenoit.conference.crac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import fr.lbenoit.utils.presentation.utils.horodatage.HorodatageUtils;

@SpringBootApplication
public class Main {
	
	public static void main(String[] args) throws Exception {
		HorodatageUtils.logStartTime();
		
		ApplicationContext ctx = SpringApplication.run(Main.class, args);
	}
}
