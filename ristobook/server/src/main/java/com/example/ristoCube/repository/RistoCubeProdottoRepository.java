/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ristoCube.repository;


import com.example.ristoCube.model.Prodotto;
import java.util.List;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author marin
 */
@Repository
public interface RistoCubeProdottoRepository extends JpaRepository<Prodotto,Long>{
   @Query("SELECT p FROM Prodotto p")
   List<Prodotto>getProdotti();
}
