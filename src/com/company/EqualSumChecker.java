/***********************
 * Author: Travis Ashcraft
 *
 * Equal Sum Checker
 *
 * Travisashcraft.github.io
 */

package com.company;

public class EqualSumChecker {
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
