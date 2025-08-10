package com.example.servingwebcontent.View;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.servingwebcontent.Model.Khachhang;
@Controller
public class viewKhachhang {
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
    
}
