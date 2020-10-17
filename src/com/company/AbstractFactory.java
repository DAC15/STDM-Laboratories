package com.company;

public interface AbstractFactory {
    AnimalBuilder getBuilder(String classType);
}
