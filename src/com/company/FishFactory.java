package com.company;

public class FishFactory implements AbstractFactory {
    public AnimalBuilder getBuilder(String classType){
        AnimalBuilder animalBuilder = null;

        if(classType.equalsIgnoreCase("Shark")){
            animalBuilder = new SharkBuilder();
        }
        else if(classType.equalsIgnoreCase("Dolphin")){
            animalBuilder = new DolphinBuilder();
        }
        else if (classType.equalsIgnoreCase("Octopus")){
            animalBuilder = new OctopusBuilder();
        }
        else {
            System.out.println("No such fish found");
        }
        return animalBuilder;
    }
}
