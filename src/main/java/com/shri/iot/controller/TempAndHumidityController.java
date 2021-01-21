package com.shri.iot.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shri.iot.model.TempAndHumidity;
import com.shri.iot.repository.TempAndHumidityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tempandhumidity")
public class TempAndHumidityController {

    @Autowired
    TempAndHumidityRepository tempAndHumidityRepository;

    @GetMapping
    public List<TempAndHumidity> list(){
        return tempAndHumidityRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public TempAndHumidity get(@PathVariable Long id) {
        return tempAndHumidityRepository.getOne(id);
    }

    //CREATE
    @PostMapping
    public TempAndHumidity create(@RequestBody final TempAndHumidity tempAndHumidity){
        return tempAndHumidityRepository.saveAndFlush(tempAndHumidity);
    }


}
