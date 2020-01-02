package com.alora.demo.controller;

import com.alora.demo.entity.MenuEntity;
import com.alora.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @GetMapping("/show")
    public List<MenuEntity> showMenu(){
        return menuService.showMenu();
    }
}
