package com.lidp.fare.controller;

import com.lidp.fare.domain.Fare;
import com.lidp.fare.service.FareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(path = "/fares")
public class FareController {

    private final FareService fareService;
    @Autowired
    public FareController(FareService fareService) {
        this.fareService = fareService;
    }

    @GetMapping(path = "/test")
    public @ResponseBody String testFunction() throws IOException {
        return fareService.test();
    }

    @GetMapping(path = "/allfares")
    public @ResponseBody Iterable<Fare> getAllFares() throws IOException {
        return fareService.getFares();
    }


}
