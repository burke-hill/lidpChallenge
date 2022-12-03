package com.lidp.fare.controller;

import com.lidp.fare.domain.Fare;
import com.lidp.fare.service.FareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.time.Instant;

@RestController
@RequestMapping(path = "/fares")
public class FareController {

    // declare fareService and link to controller
    private final FareService fareService;
    @Autowired
    public FareController(FareService fareService) {
        this.fareService = fareService;
    }

    // testing http functionality
    @GetMapping(path = "/test")
    public @ResponseBody String testFunction() throws IOException {
        return fareService.test();
    }

    // return list of all fares in response body
    @GetMapping(path = "/allfares")
    public @ResponseBody Iterable<Fare> getAllFares() throws IOException {
        return fareService.getFares();
    }

    // return cost of queried fare or creates new fare and returns cost
    @GetMapping(path = "/fare")
    public @ResponseBody double getFare(@RequestParam Instant departureTime, @RequestParam double distanceMi, @RequestParam int seatRow) throws IOException {
        return fareService.getFare(departureTime,distanceMi,seatRow);
    }


}
