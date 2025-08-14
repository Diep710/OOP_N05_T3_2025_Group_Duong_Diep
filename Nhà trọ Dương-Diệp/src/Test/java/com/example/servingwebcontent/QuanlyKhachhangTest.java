package com.example.servingwebcontent.Controller;

import com.example.servingwebcontent.Database.KhachhangAiven;
import com.example.servingwebcontent.Model.Khachhang;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Arrays;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(QuanlyKhachhang.class)
public class QuanlyKhachhangTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private KhachhangAiven dao;

    @Test
    void testGetKhachhangList() throws Exception {
        Mockito.when(dao.khachhangAivenList())
               .thenReturn(new ArrayList<>(Arrays.asList(new Khachhang("1", "Nguyen Van A"))));

        mockMvc.perform(get("/khachhanglist"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("listOfArray"))
                .andExpect(view().name("khachhanglist"));
    }

    @Test
    void testShowAddForm() throws Exception {
        mockMvc.perform(get("/khachhang/add"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("khachhang"))
                .andExpect(view().name("khachhang_form"));
    }

    @Test
    void testSaveKhachhang() throws Exception {
        mockMvc.perform(post("/khachhang/save")
                        .param("makhachhang", "1")
                        .param("tenkhachhang", "Nguyen Van B"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/khachhanglist"));
    }

    @Test
    void testShowEditForm() throws Exception {
        Khachhang kh = new Khachhang("1", "Nguyen Van C");
        Mockito.when(dao.khachhangAivenList())
               .thenReturn(new ArrayList<>(Arrays.asList(kh)));

        mockMvc.perform(get("/khachhang/edit/1"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("khachhang"))
                .andExpect(view().name("khachhang_form"));
    }

    @Test
    void testUpdateKhachhang() throws Exception {
        mockMvc.perform(post("/khachhang/update")
                        .param("makhachhang", "1")
                        .param("tenkhachhang", "Nguyen Van D"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/khachhanglist"));
    }

    @Test
    void testDeleteKhachhang() throws Exception {
        mockMvc.perform(get("/khachhang/delete/1"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/khachhanglist"));
    }
}
