package com.company.StructuralDP.Facade;

import com.company.StructuralDP.Facade.abstractions.Animal;

public class Cat implements Animal {

    @Override
    public void species() {
        System.out.println("Cat");
    }
}
