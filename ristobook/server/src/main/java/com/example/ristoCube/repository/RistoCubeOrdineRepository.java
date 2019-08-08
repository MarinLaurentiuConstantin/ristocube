/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ristoCube.repository;

import com.example.ristoCube.model.Ordine;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author marin
 */
@Repository
public interface RistoCubeOrdineRepository extends JpaRepository<Ordine,Long>{
    @Query("SELECT o FROM Ordine o")
   List<Ordine>getOrdini();
}
