package com.company.StructuralDP.Proxy;

import com.company.StructuralDP.Proxy.abstractions.IVaccine;

public class AnimalVaccineProxy implements IVaccine {

    private boolean isScheduled;
    private AnimalVaccine animalVaccine;

    public AnimalVaccineProxy(){
        this.isScheduled = false;
        this.animalVaccine = new AnimalVaccine();
    }

    public boolean isScheduled(){
        return isScheduled;
    }

    @Override
    public void vaccinate() {
        if(this.isScheduled){
            this.animalVaccine.vaccinate();
        }
    }
}
