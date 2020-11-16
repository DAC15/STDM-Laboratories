package com.company.StructuralDP.Adapter;

import com.company.StructuralDP.Adapter.abstractions.IMovable;

public class WalkingSpeed implements IMovable {

    @Override
    public double getSpeed() {
        return 10;
    }
}
