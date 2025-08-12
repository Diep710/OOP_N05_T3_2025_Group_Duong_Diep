package com.example.servingwebcontent.Controller;

import com.example.servingwebcontent.Database.PhongtroAiven;
import com.example.servingwebcontent.Model.Phongtro;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(QuanlyPhongtro.class)
public class QuanlyPhongtroTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PhongtroAiven dao;

    @Test
    void testGetPhongtroList() throws Exception {
        Mockito.when(dao.phongtroAivenList())
               .thenReturn(new ArrayList<>(Arrays.asList(new Phongtro("P001", "Phòng 1"))));

        mockMvc.perform(get("/phongtrolist"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("listOfArray"))
                .andExpect(view().name("phongtrolist"));
    }

    @Test
    void testSavePhongtro() throws Exception {
        mockMvc.perform(post("/phongtro/save")
                        .param("maphong", "P002")
                        .param("tenphong", "Phòng 2"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/phongtrolist"));
    }

    @Test
    void testShowEditForm() throws Exception {
        Phongtro pt = new Phongtro("P003", "Phòng 3");
        Mockito.when(dao.phongtroAivenList())
               .thenReturn(new ArrayList<>(Arrays.asList(pt)));

        mockMvc.perform(get("/phongtro/edit/P003"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("phongtro"))
                .andExpect(view().name("phongtro_form"));
    }

    @Test
    void testUpdatePhongtro() throws Exception {
        mockMvc.perform(post("/phongtro/update")
                        .param("maphong", "P004")
                        .param("tenphong", "Phòng 4"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/phongtrolist"));
    }

    @Test
    void testDeletePhongtro() throws Exception {
        mockMvc.perform(get("/phongtro/delete/P005"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/phongtrolist"));
    }
}
