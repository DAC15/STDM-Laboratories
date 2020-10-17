package com.company;

abstract class AnimalBuilder {

    private Animal animal;

    public Animal getAnimal(){
        return animal = new Animal();
    }

    void addClassType(String classType){
        animal.setClassType(classType);
    }

    void addNutritionType(String nutritionType){
        animal.setNutritionType(nutritionType);
    }

    void addHeight(String height){
        animal.setHeight(height);
    }

    public abstract String getInfoAboutClassType();
}

class SharkBuilder extends AnimalBuilder{

    public String getInfoAboutClassType(){
        return "Shark which belongs to Class Chondrichthyes";
    }
}

class OctopusBuilder extends AnimalBuilder{

    public String getInfoAboutClassType(){
        return "Octopus which belongs to Class Cephalopods";
    }
}

class DolphinBuilder extends AnimalBuilder{

    public String getInfoAboutClassType(){
        return "Dolphin which belongs to Class Mammalia";
    }
}

class RodentBuilder extends AnimalBuilder{

    public String getInfoAboutClassType(){
        return "Rodents include mice, rats, squirrels, prairie dogs, chipmunks, chinchillas";
    }
}

class BatBuilder extends AnimalBuilder{

    public String getInfoAboutClassType(){
        return "Bats include flying rodents";
    }
}

class PrimatesBuilder extends AnimalBuilder{

    public String getInfoAboutClassType(){
        return "Primates include monkeys, chimpanzees";
    }
}

class EagleBuilder extends AnimalBuilder{

    public String getInfoAboutClassType(){
        return "Eagle which belongs to Class Aves";
    }
}

class ChickenBuilder extends AnimalBuilder{

    public String getInfoAboutClassType(){
        return "Parrot which belongs to Class Soup-Yummy";
    }
}

class OstrichBuilder extends AnimalBuilder{
    public String getInfoAboutClassType(){
        return "Ostrich which belongs to Class 'I am taller than you'";
    }
}