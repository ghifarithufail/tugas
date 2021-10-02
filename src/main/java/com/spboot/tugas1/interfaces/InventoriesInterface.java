/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.tugas1.interfaces;

import com.spboot.tugas1.models.Inventories;
import java.util.List;

/**
 *
 * @author husen
 */
public interface InventoriesInterface {
    List<Inventories> getAll();
    void store(Inventories todo);
    Inventories getById(long id);
    void delete(long id);
}
