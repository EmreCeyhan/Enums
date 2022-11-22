package com.sparta;

public class Main {
    public static void main(String[] args) {
//        DayIndex dayOfWeek;
//        dayOfWeek = DayIndex.SUNDAY;
//
//        if(dayOfWeek == DayIndex.SATURDAY || dayOfWeek == DayIndex.SUNDAY){
//            System.out.println("its the weekend");
//        }
//        else{
//            System.out.println("its a weekday");
//        }

//        Size size = Size.SMALL;
//        System.out.println("size: " + size.getPizzaSize());
//        System.out.println(Size.SMALL.ordinal());
//        System.out.println("Calories: " + size.getPizzaCalories());
//        System.out.println("Energy: " + size.getEnergyInJoules() + " Joules");
//
//        System.out.println("Energy of a medium pizza: " + Size.valueOf("MEDIUM").getEnergyInJoules());
//        System.out.println("Energy of a medium pizza: " + Size.MEDIUM.getEnergyInJoules());

        Planets mercury = Planets.MERCURY;
        Planets venus = Planets.VENUS;
        Planets earth = Planets.EARTH;
        Planets mars = Planets.MARS;
        Planets jupiter = Planets.JUPITER;
        Planets saturn = Planets.SATURN;
        Planets uranus = Planets.URANUS;
        Planets neptune = Planets.NEPTUNE;

        Planets test = mercury;

        System.out.println("Jupiter mass: " + mercury.getMassOfPlanet());

        System.out.println(mercury.getPlanetName().equals("Mercury"));
        System.out.println(mercury == mercury);

        for(Planets planet : Planets.values())
        {
            System.out.println(planet.getPlanetName() + " is " + planet.getPlanetSizeInKM() + "KM away from the sun");
        }



    }
}