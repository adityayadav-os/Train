package com.adi.Train.service;

import com.adi.Train.entity.Train;
import com.adi.Train.repo.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    private TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository){

        this.trainRepository=trainRepository;
    }

    public List<Train> getAllTrain() {
        return trainRepository.findAll();
    }

    public Train addTrain(Train train) {
        return trainRepository.save(train);
    }
}
