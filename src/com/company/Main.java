package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

public class Fraction {

    private float a;
    private float b;


    public  Fraction(float a,float b){
        this.a = a;
        this.b = b;
    }

    public String toString(){
        return "Fraction : "+a+"/"+b ;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }
}