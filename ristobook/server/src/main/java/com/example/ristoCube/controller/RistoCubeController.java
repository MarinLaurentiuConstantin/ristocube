/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ristoCube.controller;

import com.example.ristoCube.model.DtoOrdine;
import com.example.ristoCube.model.Ordine;
import com.example.ristoCube.model.Prodotto;
import com.example.ristoCube.servicee.RistoCubeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marin
 */
@RestController
@CrossOrigin("*")
public class RistoCubeController {
    
    // PRODOTTI
    @Autowired
    RistoCubeService ristoCubeService;
    
    @RequestMapping(value={"/aggiungiProdotto"})
    @ResponseBody
    void aggiungiProdotto(@RequestBody Prodotto prodotto){
         ristoCubeService.aggiungiProdotto(prodotto);  
    }
    
    @RequestMapping(value={"/getProdotti"})
    @ResponseBody
    List<Prodotto>getProdotti(){
        return ristoCubeService.getProdotti();  
    }
    
    @RequestMapping(value={"/rimuoviProdotto"})
    @ResponseBody
    void rimuoviProdotto(@RequestBody Prodotto prodotto){
         ristoCubeService.rimuoviProdotto(prodotto);  
    }
    
    //ORDINI
    
    @RequestMapping(value={"/aggiungiOrdine"})
    @ResponseBody
    void aggiungiOrdine(@RequestBody DtoOrdine dto){
         ristoCubeService.aggiungiOrdine(dto);  
    }
    
    @RequestMapping(value={"/getOrdini"})
    @ResponseBody
    List<Ordine>getOrdini(){
        return ristoCubeService.getOrdini();  
    }
    
    @RequestMapping(value={"/rimuoviOrdine"})
    @ResponseBody
    void rimuoviOrdine(@RequestBody Ordine ordine){
         ristoCubeService.rimuoviOrdine(ordine);  
    }
}
