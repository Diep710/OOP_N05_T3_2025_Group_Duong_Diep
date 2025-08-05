package com.example.servingwebcontent;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
}
public class KhachhangController {

	@GetMapping("/Khachhang")
	public String KhachhangController(Model model){
		ArrayList<Khachhang> Khachhang = new ArrayList <Khachhang>();
		Khachhang.add(new Khachhang("1","Nguyen Van A","20","0912345678","Ha Noi","Nam","00123456789"));
		Khachhang.add(new Khachhang("2","Nguyen Thi B","19","0987654321","Ha Noi","Nu","00133456789"));
		model.addAttribute("KH",Khachhang);
		return "Khachhang";
	}
}
	