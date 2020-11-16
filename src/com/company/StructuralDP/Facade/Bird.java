package com.company.StructuralDP.Facade;

import com.company.StructuralDP.Facade.abstractions.Animal;

public class Bird implements Animal {
    @Override
    public void species() {
        System.out.println("Bird");
    }
}
