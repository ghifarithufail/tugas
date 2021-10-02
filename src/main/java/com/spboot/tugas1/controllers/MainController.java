/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.tugas1.controllers;

import com.spboot.tugas1.models.Inventories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.spboot.tugas1.interfaces.InventoriesInterface;

/**
 *
 * @author husen
 */
@Controller
public class MainController {

    @Autowired
    private InventoriesInterface inventoriesInterface;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("list", inventoriesInterface.getAll());
        return "index";
    }

    @GetMapping("/inventories/create")
    public String create(Model model) {
        
        Inventories inventories = new Inventories();
        model.addAttribute("inventories", inventories);
        
        return "create";
    }

    @PostMapping("/inventories/store")
    public String store(@ModelAttribute("inventories") Inventories inventories) {
        inventoriesInterface.store(inventories);
        return "redirect:/";
    }
    @GetMapping("/inventories/{id}/edit")
    public String edit(@PathVariable(value = "id") long id, Model model) {
    Inventories inventories = inventoriesInterface.getById(id);

    model.addAttribute("inventories", inventories);
    return "edit";
    }

    @PostMapping("/inventories/{id}/delete")
    public String delete(@PathVariable(value = "id") long id) {
    inventoriesInterface.delete(id);
    return "redirect:/";
    }
    }
