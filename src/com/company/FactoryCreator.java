package com.company;

public final class FactoryCreator {

    private static FactoryCreator instance = null;

    private FactoryCreator(){}
    public static FactoryCreator getInstance() {
        if (instance == null) {
            instance = new FactoryCreator();
        }
        return instance;
    }

    public AbstractFactory getFactory(String animal) {
        AbstractFactory factory = null;
        if(animal.equalsIgnoreCase("Fish")){
            factory = new FishFactory();
        }
        else if(animal.equalsIgnoreCase("Mammal")){
            factory = new MammalFactory();
        }
        else if(animal.equalsIgnoreCase("Bird")){
            factory = new BirdFactory();
        }
        else
        {
            System.out.println("No such Animal found.");
        }

        return factory;
    }

}
