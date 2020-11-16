package com.company.StructuralDP.Facade;

import com.company.StructuralDP.Facade.abstractions.Animal;

public class AnimalMaker {

    private Animal dog;
    private Animal cat;
    private Animal bird;

    public AnimalMaker() {
        dog = new Dog();
        cat = new Cat();
        bird = new Bird();
    }

    public void dogSpecies(){
        dog.species();
    }
    public void catSpecies(){
        cat.species();
    }
    public void birdSpecies(){
        bird.species();
    }
}
