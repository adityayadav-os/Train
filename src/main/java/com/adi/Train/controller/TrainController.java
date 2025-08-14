package com.adi.Train.controller;


import com.adi.Train.entity.Train;
import com.adi.Train.service.TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {

    private TrainService trainService;

    public TrainController(TrainService trainservice){
        this.trainService=trainservice;
    }
    @GetMapping
    public List<Train>getAllTrain(){

        return trainService.getAllTrain();
    }

    @PostMapping
    public Train addTrain(@RequestBody Train train){

        return trainService.addTrain(train);
    }


}
