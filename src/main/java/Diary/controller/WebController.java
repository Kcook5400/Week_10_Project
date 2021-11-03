package Diary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Diary.repository.DiaryRepository;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Nov 1, 2021
 */
@Controller
public class WebController {
	@Autowired
	DiaryRepository repo;

	@GetMapping("/index.html")
	
	public String viewAllEntries(Model model) {
		model.addAttribute("entires", repo.findAll());
		return "results";
	}


}
