package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        while(true){
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nEnter the type");
            String type = input.readLine();
            if (type.length() == 0)
                break;
            System.out.println("\nEnter the height");
            String height = input.readLine();
            System.out.println("\nEnter the nutritionType");
            String nutritionType = input.readLine();
            System.out.println("\nEnter the classType");
            String classType = input.readLine();

            FactoryCreator creator = FactoryCreator.getInstance();
            AbstractFactory AnimalFactory = creator.getFactory(type);
            AnimalBuilder builder = AnimalFactory.getBuilder(classType);
            builder.addHeight(height);
            builder.addNutritionType(nutritionType);
            builder.addClassType(classType);
            builder.getInfoAboutClassType();
        }

    }
}
