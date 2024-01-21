package com.example.smartfarmapi.controller;

import com.example.smartfarmapi.model.SensorData;
import com.example.smartfarmapi.repository.SensorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {
    @Autowired
    private SensorRepo sensorRepo;

    @PostMapping("/send")
    public ResponseEntity message(@RequestBody String message){

        System.out.println(message);

        return new ResponseEntity(message, HttpStatus.OK);
    }

    @GetMapping("/data")
    public List<SensorData> getData(){
        List<SensorData> data = sensorRepo.findAll();
        System.out.println();
        return data;
    }
}
