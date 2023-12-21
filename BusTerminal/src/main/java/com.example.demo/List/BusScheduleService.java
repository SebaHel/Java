package com.example.demo.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusScheduleService {
    private final BusScheduleRepository busScheduleRepository;
    @Autowired
    public BusScheduleService(BusScheduleRepository busSchedulRepository) {
        this.busScheduleRepository = busSchedulRepository;
    }
    public List<Bus> getBusList(){
        return busScheduleRepository.findAll();
    }

    public Bus addBus(Bus bus){
        return busScheduleRepository.save(bus);
    }

    public void deleteBusById(Long id){
        busScheduleRepository.deleteById(id);

    }
}
