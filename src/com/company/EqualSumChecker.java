package com.company;

public class EqualSumChecker {

    public boolean hasEqualSum(int x, int n, int i){
        if((x + n) == i){
            System.out.println("The first and second numbers are equal to the third.");
            return true;
        }
        else{
            System.out.println("The first and second numbers are not equal to the third.");
            return false;
        }
    }

}
