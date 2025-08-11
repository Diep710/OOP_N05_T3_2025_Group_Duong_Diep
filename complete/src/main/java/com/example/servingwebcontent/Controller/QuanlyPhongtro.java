package com.example.servingwebcontent.Controller;
import com.example.servingwebcontent.Database.PhongtroAiven;
import com.example.servingwebcontent.Model.Phongtro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;



@Controller
public class QuanlyPhongtro {

	@GetMapping("/phongtrolist")
	public String phongtrolist(Model model) {

		ArrayList<Phongtro> listOfArray = new ArrayList<Phongtro>();
		PhongtroAiven ua = new PhongtroAiven();
		listOfArray = ua.phongtroAivenList();

		model.addAttribute("listOfArray", listOfArray);

		return "userlist";
	}

}