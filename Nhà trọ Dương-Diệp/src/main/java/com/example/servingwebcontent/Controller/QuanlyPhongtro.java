package com.example.servingwebcontent.Controller;
import com.example.servingwebcontent.Database.PhongtroAiven;
import com.example.servingwebcontent.Model.Phongtro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;



@Controller
public class QuanlyPhongtro {

	@GetMapping("/phongtrolist")
	public String phongtrolist(Model model) {

		ArrayList<Phongtro> listOfArray = new ArrayList<Phongtro>();
		PhongtroAiven ua = new PhongtroAiven();
		listOfArray = ua.phongtroAivenList();

		model.addAttribute("listOfArray", listOfArray);

		return "phongtrolist";
	}
    @GetMapping("/phongtro/add")
    public String showAddForm(Model model) {
        model.addAttribute("phongtro", new Phongtro());
        return "phongtro_form"; // form HTML thêm khách hàng
    }

	// CREATE - Xử lý thêm phòng trọ
    @PostMapping("/phongtro/save")
    public String savePhongtro(@ModelAttribute("phongtro") Phongtro pt) {
        PhongtroAiven dao = new PhongtroAiven();
        dao.createPhongtro(pt);
        return "redirect:/phongtrolist";
    }

    // UPDATE - Hiển thị form sửa phòng trọ
    @GetMapping("/phongtro/edit/{phongtro}")
    public String showEditForm(@PathVariable("maphong") String maphong, Model model) {
        PhongtroAiven dao = new PhongtroAiven();
        ArrayList<Phongtro> all = dao.phongtroAivenList();
        for (Phongtro pt : all) {
            if (pt.getMaphong().equals(maphong)) {
                model.addAttribute("phongtro", pt);
                return "phongtro_form"; // dùng chung form với thêm
            }
        }
        return "redirect:/phongtrolist";
    }

    // UPDATE - Xử lý cập nhật phòng trọ
    @PostMapping("/phongtro/update")
    public String updatePhongtro(@ModelAttribute("phongtro") Phongtro pt) {
        PhongtroAiven dao = new PhongtroAiven();
        dao.updatePhongtro(pt);
        return "redirect:/phongtrolist";
    }

    // DELETE - Xóa phòng trọ
    @GetMapping("/phongtro/delete/{maphong}")
    public String deletePhongtro(@PathVariable("maphong") String maphong) {
        PhongtroAiven dao = new PhongtroAiven();
        dao.deletePhongtro(maphong);
        return "redirect:/phongtrolist";
    }
 
}