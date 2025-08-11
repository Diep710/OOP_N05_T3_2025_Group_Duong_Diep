package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.servingwebcontent.Model.Phongtro;
@Controller
public class GreetingController {
	@GetMapping("/")
	public String Phongtro(Model model) {
		model.addAttribute("Phongtro", new Phongtro());

		return "Phongtro";
	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
}
