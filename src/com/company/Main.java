package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Gcd mygcd=new Gcd();
      double my= mygcd.gcd(60,24);
        //mygcd.lcm(20,60);
        System.out.println( mygcd.lcm(60,24));

        System.out.println(my);

    }
}
