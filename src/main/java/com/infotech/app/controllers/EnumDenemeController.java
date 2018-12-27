package com.infotech.app.controllers;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import com.infotech.app.entities.EnumDeneme;
import com.infotech.app.entities.eklenecek;
import com.infotech.app.enums.EnumDegerleri1;
import com.infotech.app.repository.EnumDenemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnumDenemeController {
    @Autowired
    private EnumDenemeRepository er;

    @GetMapping("/salilistele")
    public List<EnumDeneme>getSali(){
        List<EnumDeneme> a=er.findAll();
        List<EnumDeneme> b=new ArrayList<>();
        for(int i=0;i<a.size();i++){
            if(a.get(i).getEnumDegeri()== EnumDegerleri1.gunler.sali)
            b.add(a.get(i));
        }
            return b;
        }

      @PostMapping("/gunekle")
        public EnumDeneme gunEkle(@Valid @RequestBody eklenecek ek){

            EnumDeneme a=new EnumDeneme();
            a.setEnumDegeri(EnumDegerleri1.gunler.values()[ek.getDeger()]);
            return er.save(a);

      }

}
