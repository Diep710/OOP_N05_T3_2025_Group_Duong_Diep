package com.example.servingwebcontent.View;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.servingwebcontent.Model.Phongtro;
@Controller
public class viewPhongtro {
     @GetMapping("/phongtro")
	public String PhongTro(Model model) {
		Phongtro pt01 = new Phongtro("id01", "Hanoi", "20", "ghe,tu,ban");
		Phongtro pt02 = new Phongtro("id02", "Hanam", "22", "ban,may giat, ghe");
		ArrayList<Phongtro> lpt = new ArrayList<Phongtro>();
		lpt.add(pt01);
		lpt.add(pt02);
		
		model.addAttribute("myphongtro", pt01);
        model.addAttribute("ListofPhongtro", lpt);
		//view html
		return "Phongtro";
	}
    
}
