package com.mst.model;

import com.mst.model.interfaces.DetailsPrintable;

public enum Language implements DetailsPrintable {
    Java, CSharp, CPP, Python, JavaScript;

    private Language () {

    }

    @Override
    public void printDetails() {
        System.out.println("Developed Using: " + toString());
    }

    @Override
    public String toString() {
        return "{" + name() + "}";
    }
}