package com.company;

public class BirdFactory implements AbstractFactory {
    public AnimalBuilder getBuilder(String classType){
        AnimalBuilder animalBuilder = null;

        if(classType.equalsIgnoreCase("Eagle")){
            animalBuilder = new EagleBuilder();
        }
        else if(classType.equalsIgnoreCase("Chicken")){
            animalBuilder = new ChickenBuilder();
        }
        else if (classType.equalsIgnoreCase("Ostrich")){
            animalBuilder = new OstrichBuilder();
        }
        else {
            System.out.println("No such bird found");
        }
        return animalBuilder;
    }
}
