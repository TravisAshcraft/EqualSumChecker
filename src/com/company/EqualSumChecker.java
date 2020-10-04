/***********************
 * Author: Travis Ashcraft
 *
 * Equal Sum Checker
 *
 * Travisashcraft.github.io
 */

package com.company;

public class EqualSumChecker {

//    public boolean hasEqualSum(int x, int n, int i){
//        if((x + n) == i){
//            System.out.println("The first and second numbers are equal to the third.");
//            return true;
//        }
//        else{
//            System.out.println("The first and second numbers are not equal to the third.");
//            return false;
//        }
//    }

    public static int recursiveMethod(int z, int n){
        if(n==z){
            System.out.println(z);
            return z;
        }
        else if(n>z){
            System.out.println(recursiveMethod(z, n-z));
            return recursiveMethod(z, n-z);
        }
        else{
            System.out.println(recursiveMethod(z-n,n));
            return recursiveMethod(z-n,n);
        }
    }

}
