package com.florian.chatbot.rest;

import com.florian.chatbot.model.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/conversion")
public class ConversionController {

    @Autowired
    private ConversionService conversionService;

    @GetMapping("/distance/{value}/{fromUnit}/{toUnit}")
    public double convertDistance(@PathVariable double value, @PathVariable String fromUnit, @PathVariable String toUnit) {
        return conversionService.convertDistance(value, fromUnit, toUnit);
    }

    @GetMapping("/weight/{value}/{fromUnit}/{toUnit}")
    public double convertWeight(@PathVariable double value, @PathVariable String fromUnit, @PathVariable String toUnit) {
        return conversionService.convertWeight(value, fromUnit, toUnit);
    }

    @GetMapping("/volume/{value}/{fromUnit}/{toUnit}")
    public double convertVolume(@PathVariable double value, @PathVariable String fromUnit, @PathVariable String toUnit) {
        return conversionService.convertVolume(value, fromUnit, toUnit);
    }

    @GetMapping("/temperature/{value}/{fromUnit}/{toUnit}")
    public double convertTemperature(@PathVariable double value, @PathVariable String fromUnit, @PathVariable String toUnit) {
        return conversionService.convertTemperature(value, fromUnit, toUnit);
    }
}
