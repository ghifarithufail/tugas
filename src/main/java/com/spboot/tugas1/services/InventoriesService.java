/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.tugas1.services;

import com.spboot.tugas1.models.Inventories;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spboot.tugas1.interfaces.InventoriesInterface;
import com.spboot.tugas1.repositories.InventoriesRepository;

/**
 *
 * @author husen
 */
@Service
public class InventoriesService implements InventoriesInterface {

    @Autowired
    private InventoriesRepository todoRepository;
    
    @Override
    public List<Inventories> getAll() {
        return todoRepository.findAll();
    }

    @Override
    public void store(Inventories todo) {
        this.todoRepository.save(todo);
    }
    @Override
    
public Inventories getById(long id) {
  Optional < Inventories > optional = todoRepository.findById(id);

  if (!optional.isPresent()) {
    throw new RuntimeException(" Todo not found for id :: " + id);
  }

  Inventories todo = optional.get();
  return todo;
}

    @Override
    public void delete(long id) {
    this.todoRepository.deleteById(id);
    }
}
