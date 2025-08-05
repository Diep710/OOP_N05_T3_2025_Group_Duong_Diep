package com.example.servingwebcontent;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.servingwebcontent.Model.Khachhang;
import com.example.servingwebcontent.Model.Phongtro;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@GetMapping("/khachhang")
	public String KhanhHang(Model model) {
		Khachhang kh01 = new Khachhang("id01", "Nguyen", "20", "096877773", "Hanoi", "Name", "CC89787828288");
		Khachhang kh02 = new Khachhang("id02", "Tran", "20", "096877773", "Hanoi", "Name", "CC89787828288");
		ArrayList<Khachhang> lkh = new ArrayList<Khachhang>();
		lkh.add(kh01);
		lkh.add(kh02);
		
		model.addAttribute("mykhachhang", kh01);
        model.addAttribute("ListofKhachhang", lkh);
		//view html
		return "Khachhang";
	}
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
