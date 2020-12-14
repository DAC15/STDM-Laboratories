package com.company.BehavioralDP;

import com.company.BehavioralDP.abstractions.IChangingFurBySeason;

public class ChangeSummerFur implements IChangingFurBySeason {
    @Override
    public void changeFur() {
        System.out.println("If it is summer, change the fur to a thinner fur");
    }
}
