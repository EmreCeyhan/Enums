package com.sparta;

public enum Planets {
    MERCURY("Mercury", 58, 3.3e+23),
    VENUS("Venus", 108, 4.8e+24),
    EARTH("Earth", 149, 5.9e+24),
    MARS("Mars", 227, 6.4e+23),
    JUPITER("Jupiter", 778, 1.8e+27),
    SATURN("Saturn", 1434, 5.6e+26),
    URANUS("Uranus", 2871, 8.6e+25),
    NEPTUNE("Neptune", 4495, 10e+25);

    private final String planetName;
    private final int planetDistanceInKM;
    private final double massOfPlanet;
    private Planets(String planetName, int planetSizeInKM, double massOfPlanet)
    {
        this.planetName = planetName;
        this. planetDistanceInKM = planetSizeInKM;
        this.massOfPlanet = massOfPlanet;
    }
    public String getPlanetName() {
        return planetName;
    }

    public int getPlanetSizeInKM() {
        return planetDistanceInKM;
    }

    public double getMassOfPlanet() {
        return massOfPlanet;
    }



}
