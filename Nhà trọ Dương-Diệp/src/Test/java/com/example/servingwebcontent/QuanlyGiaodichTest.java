package com.example.servingwebcontent.Controller;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.servingwebcontent.Database.GiaodichAiven;
import com.example.servingwebcontent.Model.Giaodich;

@WebMvcTest(QuanlyGiaodich.class)
public class QuanlyGiaodichTest {

    @Autowired
    private MockMvc mockMvc;

    // Giả lập (mock) đối tượng GiaodichAiven vì chúng ta không muốn tương tác với database thật
    @MockBean
    private GiaodichAiven giaodichAiven;

    private List<Giaodich> giaodichList;
    private Giaodich giaodich1;
    private Giaodich giaodich2;

    @BeforeEach
    void setUp() {
        giaodichList = new ArrayList<>();
        giaodich1 = new Giaodich();
        giaodich1.setMakhachhang("kh001");
        giaodich1.setTenkhachhang("Nguyen Van A");
        // ... set các trường khác của giaodich1

        giaodich2 = new Giaodich();
        giaodich2.setMakhachhang("kh002");
        giaodich2.setTenkhachhang("Tran Thi B");
        // ... set các trường khác của giaodich2

        giaodichList.add(giaodich1);
        giaodichList.add(giaodich2);
    }

    // Test case cho phương thức @GetMapping("/giaodichlist")
    @Test
    void testGiaodichList() throws Exception {
        // Giả lập hành vi của DAO khi gọi phương thức giaodichAivenList()
        when(giaodichAiven.giaodichAivenList()).thenReturn((ArrayList<Giaodich>) giaodichList);

        // Thực hiện HTTP GET request đến "/giaodichlist"
        mockMvc.perform(get("/giaodichlist"))
            // Kiểm tra HTTP status code là 200 OK
            .andExpect(status().isOk())
            // Kiểm tra view name trả về là "giaodichlist"
            .andExpect(view().name("giaodichlist"))
            // Kiểm tra model attribute có tên "listOfArray" và có kích thước là 2
            .andExpect(model().attributeExists("listOfArray"))
            .andExpect(model().attribute("listOfArray", hasSize(2)));

        // Kiểm tra xem phương thức giaodichAivenList() của mock đã được gọi hay chưa
        verify(giaodichAiven, times(1)).giaodichAivenList();
    }

    // Test case cho phương thức @GetMapping("/giaodich/add")
    @Test
    void testShowAddForm() throws Exception {
        mockMvc.perform(get("/giaodich/add"))
            .andExpect(status().isOk())
            .andExpect(view().name("giaodich_form"))
            .andExpect(model().attributeExists("giaodich"));
    }

    // Test case cho phương thức @PostMapping("/giaodich/save")
    @Test
    void testSaveGiaodich() throws Exception {
        // Giả lập hành vi của DAO khi gọi phương thức createGiaodich()
        doNothing().when(giaodichAiven).createGiaodich(any(Giaodich.class));

        // Thực hiện HTTP POST request đến "/giaodich/save"
        mockMvc.perform(post("/giaodich/save")
                .param("makhachhang", "kh003")
                .param("tenkhachhang", "Vo Van C"))
            .andExpect(status().is3xxRedirection()) // Kiểm tra HTTP status là redirect (3xx)
            .andExpect(redirectedUrl("/giaodichlist")); // Kiểm tra URL redirect

        // Kiểm tra xem phương thức createGiaodich() đã được gọi với một đối tượng Giaodich bất kỳ
        verify(giaodichAiven, times(1)).createGiaodich(any(Giaodich.class));
    }

    // Test case cho phương thức @GetMapping("/giaodich/edit/{makhachhang}")
    @Test
    void testShowEditForm() throws Exception {
        // Giả lập hành vi của DAO khi gọi phương thức giaodichAivenList()
        when(giaodichAiven.giaodichAivenList()).thenReturn((ArrayList<Giaodich>) giaodichList);

        // Thực hiện HTTP GET request đến "/giaodich/edit/kh001"
        mockMvc.perform(get("/giaodich/edit/kh001"))
            .andExpect(status().isOk())
            .andExpect(view().name("giaodich_form"))
            .andExpect(model().attributeExists("giaodich"))
            .andExpect(model().attribute("giaodich", giaodich1)); // Kiểm tra đối tượng Giaodich trong model
    }

    // Test case cho phương thức @PostMapping("/giaodich/update")
    @Test
    void testUpdateGiaodich() throws Exception {
        // Giả lập hành vi của DAO khi gọi phương thức updateGiaodich()
        doNothing().when(giaodichAiven).updateGiaodich(any(Giaodich.class));

        // Thực hiện HTTP POST request đến "/giaodich/update"
        mockMvc.perform(post("/giaodich/update")
                .param("makhachhang", "kh001")
                .param("tenkhachhang", "Nguyen Van A - Updated"))
            .andExpect(status().is3xxRedirection())
            .andExpect(redirectedUrl("/giaodichlist"));

        // Kiểm tra xem phương thức updateGiaodich() đã được gọi
        verify(giaodichAiven, times(1)).updateGiaodich(any(Giaodich.class));
    }

    // Test case cho phương thức @GetMapping("/giaodich/delete/{makhachhang}")
    @Test
    void testDeleteGiaodich() throws Exception {
        // Giả lập hành vi của DAO khi gọi phương thức deleteGiaodich()
        doNothing().when(giaodichAiven).deleteGiaodich(anyString());

        // Thực hiện HTTP GET request đến "/giaodich/delete/kh001"
        mockMvc.perform(get("/giaodich/delete/kh001"))
            .andExpect(status().is3xxRedirection())
            .andExpect(redirectedUrl("/giaodichlist"));

        // Kiểm tra xem phương thức deleteGiaodich() đã được gọi với tham số "kh001"
        verify(giaodichAiven, times(1)).deleteGiaodich("kh001");
    }
}