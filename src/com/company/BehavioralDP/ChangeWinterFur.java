package com.company.BehavioralDP;

import com.company.BehavioralDP.abstractions.IChangingFurBySeason;

public class ChangeWinterFur implements IChangingFurBySeason {
    @Override
    public void changeFur() {
        System.out.println("If it is winter, change the fur to a thicker one");
    }
}
