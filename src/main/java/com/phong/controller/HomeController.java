/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phong.controller;

import com.phong.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
public class HomeController {
    @Autowired
    private CategoryServices cateService;
    
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("categories", this.cateService.getCates());
        return "index";
    }
    @RequestMapping("/hello")
    public String index2(){
        return "index";
    }
}
