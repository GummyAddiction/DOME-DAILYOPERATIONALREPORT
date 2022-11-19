package com.dome.reporttxn.controller;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.dome.reporttxn.model.FunctionalLocation;
import com.dome.reporttxn.service.FunctionalLocationService;

@RestController
@RequestMapping("/reporttxn")


public class FunctionalLocationController {

    @Autowired
    FunctionalLocationService functionalLocationService;

    @Autowired
    private HttpServletRequest httpServletRequest;



    @GetMapping("/functionallocations")
    public ResponseEntity<List<FunctionalLocation>> GetAllFunctionalLocation(){
        // API GET untuk ambil semua functionallocation



        List<FunctionalLocation> functionalLocations = functionalLocationService.findAllFunctionalLocation();


        System.out.println("Success masuk GET API functional location");
        System.out.println(httpServletRequest.getRequestURL());

        return new ResponseEntity<>(functionalLocations, HttpStatus.OK);
    }



    public static String makeUrl(HttpServletRequest request)
{
    return request.getRequestURL().toString() + "?" + request.getQueryString();
}
}
