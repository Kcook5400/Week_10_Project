package Diary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import Diary.beans.Entries;
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

	@GetMapping("/viewAll")
	
	public String viewAllEntries(Model model) {
		model.addAttribute("Entries", repo.findAll());
		return "results";
	}
	@GetMapping("/createEntry")
	public String addNewEntrie(Model model) {
		Entries c = new Entries();
		model.addAttribute("newEntries", c);
		return "input";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateContact(@PathVariable("id") long id, Model model) {
		Entries  c = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + c.toString());
		model.addAttribute("newEntries", c);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseContact(Entries  c, Model model) {
		repo.save(c);
		return viewAllEntries(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Entries  c = repo.findById(id).orElse(null);
	    repo.delete(c);
	    return viewAllEntries(model);
	}


}
