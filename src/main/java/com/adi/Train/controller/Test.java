package com.adi.Train.controller;

import com.adi.Train.entity.Station;
import com.adi.Train.entity.Train;
import com.adi.Train.entity.TrainSchedule;
import com.adi.Train.repo.StationRepository;
import com.adi.Train.repo.TrainRepository;
import com.adi.Train.repo.TrainScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")

    public class Test {

        @Autowired
        StationRepository stationRepository;


        @Autowired
        TrainRepository tarinRepository;


        @Autowired
        TrainScheduleRepository trainScheduleRepository;

        @GetMapping
        public void test(){

            Station delhi=new Station(null,"New Delhi","NDLS");
            Station mumbai=new Station(null,"Mumbai Central","CST");
            Station kolkata=new Station(null,"Kolkata","KOAA");
            Station chennai=new Station(null,"Chennai","MAS");


            stationRepository.saveAll(List.of(delhi,mumbai,kolkata,chennai));


            Train rajdhani=new Train(null,"Rajdhani Express","123456",null);
            Train duranto=new Train(null,"Duranto Express","12260",null);
            Train shatabdi=new Train(null,"Shatabdi Express","12446",null);

            tarinRepository.saveAll(List.of(rajdhani,duranto,shatabdi));

            TrainSchedule sc1=new TrainSchedule(null,rajdhani,delhi,mumbai,"06:00","14:00");
            TrainSchedule sc2=new TrainSchedule(null,duranto,mumbai,kolkata,"10:00","23:40");
            TrainSchedule sc3=new TrainSchedule(null,rajdhani,kolkata,chennai,"02:00","17:00");

            trainScheduleRepository.saveAll(List.of(sc1,sc2,sc3));

            System.out.println("data inserted in database");
        }
    }

