package Diary.controller;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Diary.beans.Entries;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Nov 3, 2021
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Entries entrie() {
		Entries bean = new Entries();
		return bean;
		
	}

}
