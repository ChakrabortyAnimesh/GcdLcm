package com.company;

public class Gcd {
  // public double fgcd;
    double gcd;

    public double gcd(double num1, double num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
                gcd=num1;
            } else {
                num2 = num2 - num1;
                gcd=num2;
            }
        }
        // num1 = fgcd;
       // System.out.println("Gcd =" + num2);
        return gcd;
    }
    public double lcm(double x ,double y){
       double mlcm=(x*y)/gcd;
        return mlcm;
    }

}
