package com.florian.chatbot.model;

import org.springframework.stereotype.Service;

@Service
public class ConversionService {

    public double convertDistance(double value, String fromUnit, String toUnit) {
        // Metros, Kilómetros, Millas, Pies, Yardas
        double inMeters = switch (fromUnit.toLowerCase()) {
            case "m" -> value;
            case "km" -> value * 1000;
            case "mi" -> value * 1609.34;
            case "ft" -> value * 0.3048;
            case "yd" -> value * 0.9144;
            default -> throw new IllegalArgumentException("Unidad de distancia no reconocida");
        };

        return switch (toUnit.toLowerCase()) {
            case "m" -> inMeters;
            case "km" -> inMeters / 1000;
            case "mi" -> inMeters / 1609.34;
            case "ft" -> inMeters / 0.3048;
            case "yd" -> inMeters / 0.9144;
            default -> throw new IllegalArgumentException("Unidad de distancia no reconocida");
        };
    }

    public double convertWeight(double value, String fromUnit, String toUnit) {
        // Gramos, Kilogramos, Libras, Onzas, Toneladas
        double inGrams = switch (fromUnit.toLowerCase()) {
            case "g" -> value;
            case "kg" -> value * 1000;
            case "lb" -> value * 453.592;
            case "oz" -> value * 28.3495;
            case "ton" -> value * 907185;
            default -> throw new IllegalArgumentException("Unidad de peso no reconocida");
        };

        return switch (toUnit.toLowerCase()) {
            case "g" -> inGrams;
            case "kg" -> inGrams / 1000;
            case "lb" -> inGrams / 453.592;
            case "oz" -> inGrams / 28.3495;
            case "ton" -> inGrams / 907185;
            default -> throw new IllegalArgumentException("Unidad de peso no reconocida");
        };
    }

    public double convertVolume(double value, String fromUnit, String toUnit) {
        // Litros, Mililitros, Galones, Pintas, Barriles
        double inLiters = switch (fromUnit.toLowerCase()) {
            case "l" -> value;
            case "ml" -> value / 1000;
            case "gal" -> value * 3.78541;
            case "pt" -> value * 0.473176;
            case "bbl" -> value * 158.987;
            default -> throw new IllegalArgumentException("Unidad de volumen no reconocida");
        };

        return switch (toUnit.toLowerCase()) {
            case "l" -> inLiters;
            case "ml" -> inLiters * 1000;
            case "gal" -> inLiters / 3.78541;
            case "pt" -> inLiters / 0.473176;
            case "bbl" -> inLiters / 158.987;
            default -> throw new IllegalArgumentException("Unidad de volumen no reconocida");
        };
    }

    public double convertTemperature(double value, String fromUnit, String toUnit) {
        // Celsius, Fahrenheit, Kelvin, Rankine, Réaumur
        double inCelsius = switch (fromUnit.toLowerCase()) {
            case "c" -> value;
            case "f" -> (value - 32) * 5 / 9;
            case "k" -> value - 273.15;
            case "r" -> (value - 491.67) * 5 / 9;
            case "re" -> value * 1.25;
            default -> throw new IllegalArgumentException("Unidad de temperatura no reconocida");
        };

        return switch (toUnit.toLowerCase()) {
            case "c" -> inCelsius;
            case "f" -> (inCelsius * 9 / 5) + 32;
            case "k" -> inCelsius + 273.15;
            case "r" -> (inCelsius + 273.15) * 9 / 5;
            case "re" -> inCelsius * 0.8;
            default -> throw new IllegalArgumentException("Unidad de temperatura no reconocida");
        };
    }
}
