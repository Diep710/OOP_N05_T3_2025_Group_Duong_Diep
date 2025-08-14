package com.example.servingwebcontent.Controller;
import com.example.servingwebcontent.Database.GiaodichAiven;
import com.example.servingwebcontent.Model.Giaodich;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;



@Controller
public class QuanlyGiaodich {
    @GetMapping("/giaodichlist")
	public String giaodichlist(Model model) {

		ArrayList<Giaodich> listOfArray = new ArrayList<Giaodich>();
		GiaodichAiven ua = new GiaodichAiven();
		listOfArray = ua.giaodichAivenList();

		model.addAttribute("listOfArray", listOfArray);

		return "giaodichlist";
	}
    @GetMapping("/giaodich/add")
    public String showAddForm(Model model) {
        model.addAttribute("giaodich", new Giaodich());
        return "giaodich_form"; // form HTML thêm khách hàng
    }

    // CREATE - Xử lý thêm khách hàng
    @PostMapping("/giaodich/save")
    public String saveGiaodich(@ModelAttribute("giaodich") Giaodich kh) {
        GiaodichAiven dao = new GiaodichAiven();
        dao.createGiaodich(kh);
        return "redirect:/giaodichlist";
    }

    // UPDATE - Hiển thị form sửa khách hàng
    @GetMapping("/giaodich/edit/{makhachhang}")
    public String showEditForm(@PathVariable("makhachhang") String makhachhang, Model model) {
        GiaodichAiven dao = new GiaodichAiven();
        ArrayList<Giaodich> all = dao.giaodichAivenList();
        for (Giaodich gd : all) {
            if (gd.getMakhachhang().equals(makhachhang)) {
                model.addAttribute("giaodich", gd);
                return "giaodich_form"; // dùng chung form với thêm
            }
        }
        return "redirect:/giaodichlist";
    }

    // UPDATE - Xử lý cập nhật giao dịch
    @PostMapping("/giaodich/update")
    public String updateGiaodich(@ModelAttribute("giaodich") Giaodich gd) {
        GiaodichAiven dao = new GiaodichAiven();
        dao.updateGiaodich(gd);
        return "redirect:/giaodichlist";
    }

    // DELETE - Xóa giao dịch
    @GetMapping("/giaodich/delete/{makhachhang}")
    public String deleteGiaodich(@PathVariable("makhachhang") String makhachhang) {
        GiaodichAiven dao = new GiaodichAiven();
        dao.deleteGiaodich(makhachhang);
        return "redirect:/giaodichlist";
    }

}