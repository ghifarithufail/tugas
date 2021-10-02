/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.tugas1.repositories;

import com.spboot.tugas1.models.Inventories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author husen
 */
@Repository
public interface InventoriesRepository extends JpaRepository<Inventories, Long>{
    
}
