package com.company.BehavioralDP;

import java.util.Scanner;

public class BehavioralClient {
    public void behavioral(){
    ChangeSummerFur summerFur = new ChangeSummerFur();
    ChangeWinterFur winterFur = new ChangeWinterFur();
        System.out.println("Enter the current season: ");

        Scanner scanner = new Scanner(System.in);

        String season = scanner.next();
        if ("Summer".equalsIgnoreCase(season)) {
            summerFur.changeFur();
        }else if("Winter".equalsIgnoreCase(season)) {
            winterFur.changeFur();
        }else{
            System.out.println("Chose only between Summer and Winter");
        }
    }
}
