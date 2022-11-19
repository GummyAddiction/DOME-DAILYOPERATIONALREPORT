package com.dome.reporttxn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dome.reporttxn.model.FunctionalLocation;
import com.dome.reporttxn.repository.FunctionalLocationRepo;


@Service
public class FunctionalLocationService {

    @Autowired
    private FunctionalLocationRepo functionalLocationRepo;

    public List<FunctionalLocation> findAllFunctionalLocation(){
        return functionalLocationRepo.findAll();
    }
    
}
