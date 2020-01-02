package com.alora.demo.service;

import com.alora.demo.entity.MenuEntity;
import com.alora.demo.repo.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    MenuRepo menuRepo;

    public void addToMenu(MenuEntity product){
    menuRepo.save(product);
    }

    public List<MenuEntity> showMenu(){
    return menuRepo.findAll();
    }
}
