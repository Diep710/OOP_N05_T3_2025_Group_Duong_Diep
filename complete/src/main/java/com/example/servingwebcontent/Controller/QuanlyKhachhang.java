package com.example.servingwebcontent.Controller;
import com.example.servingwebcontent.Database.KhachhangAiven;
import com.example.servingwebcontent.Model.Khachhang;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;



@Controller
public class QuanlyKhachhang {
    @GetMapping("/khachhanglist")
	public String khachhanglist(Model model) {

		ArrayList<Khachhang> listOfArray = new ArrayList<Khachhang>();
		KhachhangAiven ua = new KhachhangAiven();
		listOfArray = ua.khachhangAivenList();

		model.addAttribute("listOfArray", listOfArray);

		return "khachhanglist";
	}
    @GetMapping("/khachhang/add")
    public String showAddForm(Model model) {
        model.addAttribute("khachhang", new Khachhang());
        return "khachhang_form"; // form HTML thêm khách hàng
    }

    // CREATE - Xử lý thêm khách hàng
    @PostMapping("/khachhang/save")
    public String saveKhachhang(@ModelAttribute("khachhang") Khachhang kh) {
        KhachhangAiven dao = new KhachhangAiven();
        dao.createKhachhang(kh);
        return "redirect:/khachhanglist";
    }

    // UPDATE - Hiển thị form sửa khách hàng
    @GetMapping("/khachhang/edit/{makhachhang}")
    public String showEditForm(@PathVariable("makhachhang") String makhachhang, Model model) {
        KhachhangAiven dao = new KhachhangAiven();
        ArrayList<Khachhang> all = dao.khachhangAivenList();
        for (Khachhang kh : all) {
            if (kh.getMakhachhang().equals(makhachhang)) {
                model.addAttribute("khachhang", kh);
                return "khachhang_form"; // dùng chung form với thêm
            }
        }
        return "redirect:/khachhanglist";
    }

    // UPDATE - Xử lý cập nhật khách hàng
    @PostMapping("/khachhang/update")
    public String updateKhachhang(@ModelAttribute("khachhang") Khachhang kh) {
        KhachhangAiven dao = new KhachhangAiven();
        dao.updateKhachhang(kh);
        return "redirect:/khachhanglist";
    }

    // DELETE - Xóa khách hàng
    @GetMapping("/khachhang/delete/{makhachhang}")
    public String deleteKhachhang(@PathVariable("makhachhang") String makhachhang) {
        KhachhangAiven dao = new KhachhangAiven();
        dao.deleteKhachhang(makhachhang);
        return "redirect:/khachhanglist";
    }

}