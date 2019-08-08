/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ristoCube.service.impl;

import com.example.ristoCube.model.DtoOrdine;
import com.example.ristoCube.model.Ordine;
import com.example.ristoCube.model.Prodotto;
import com.example.ristoCube.repository.RistoCubeOrdineRepository;
import com.example.ristoCube.servicee.RistoCubeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ristoCube.repository.RistoCubeProdottoRepository;
import java.util.Set;


/**
 *
 * @author marin
 */
@Service
public class RistoCubeServiceImpl implements RistoCubeService{
    @Autowired
    RistoCubeProdottoRepository ristoCubeProdottoRepository;
    
    @Autowired
    RistoCubeOrdineRepository ristoCubeOrdineRepository;
    
    @Override
    public void aggiungiProdotto(Prodotto prodotto) {
        ristoCubeProdottoRepository.save(prodotto);    
    }

    @Override
    public void rimuoviProdotto(Prodotto prodotto) {
        ristoCubeProdottoRepository.delete(prodotto);    
    }
    
    @Override
    public List<Prodotto> getProdotti() {
        return ristoCubeProdottoRepository.getProdotti();
    }

    @Override
    public List<Ordine> getOrdini() {
        //return ristoCubeOrdineRepository.getOrdini();
        return ristoCubeOrdineRepository.findAll();
    }

    @Override
    public void aggiungiOrdine(DtoOrdine dto) {
        
        double totale=0;
        Ordine ordine=new Ordine();
        ordine.setTavolo(dto.getOrdine().getTavolo());
        
        for(Prodotto p:dto.getProdotti()){
            totale+=p.getPrezzo();
        }
        ordine.setTotale(totale);
        for(Prodotto p:dto.getProdotti()){
            
            ordine.getProdotti().add(p);
            p.getOrdine().add(ordine);
        }
        
        
        ristoCubeOrdineRepository.save(ordine);
    }

    @Override
    public void rimuoviOrdine(Ordine ordine) {
        ristoCubeOrdineRepository.delete(ordine);
    }
    
}
