package com.company.StructuralDP.Facade;

import com.company.StructuralDP.Facade.abstractions.Animal;

public class Dog implements Animal {
    @Override
    public void species() {
        System.out.println("Dog");
    }
}
