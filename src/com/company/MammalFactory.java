package com.company;

public class MammalFactory implements AbstractFactory{
    public AnimalBuilder getBuilder(String classType){
        AnimalBuilder animalBuilder = null;

        if(classType.equalsIgnoreCase("Bat")){
            animalBuilder = new BatBuilder();
        }
        else if(classType.equalsIgnoreCase("Primate")){
            animalBuilder = new PrimatesBuilder();
        }
        else if (classType.equalsIgnoreCase("Rodent")){
            animalBuilder = new RodentBuilder();
        }
        else {
            System.out.println("No such mammal found");
        }
        return animalBuilder;
    }
}
