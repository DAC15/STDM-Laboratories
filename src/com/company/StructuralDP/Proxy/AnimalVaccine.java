package com.company.StructuralDP.Proxy;

import com.company.StructuralDP.Proxy.abstractions.IVaccine;

public class AnimalVaccine implements IVaccine {
    @Override
    public void vaccinate() {
        System.out.println("Vaccination completed");
    }
}
