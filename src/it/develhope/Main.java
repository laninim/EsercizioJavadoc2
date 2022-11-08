package it.develhope;

import it.develhope.Exception.DivideByZeroException;

/**
 * @author  mauro lanini
 * This class test the arithmetic operation class
 */
public class Main {

    /**
     * The main method
     * @param args console args
     */
    public static void main(String[] args) {

        ArithmeticOperators ao = new ArithmeticOperators();

        System.out.println("Sum operation: " + ao.sum(2,2));
        System.out.println("Sub operation: " + ao.sub(10,4));
        System.out.println("Mul operation:" + ao.mul(5,5));
        try{
            System.out.println("Sub operation: " + ao.div(10,2));
        }catch(DivideByZeroException e){
            System.out.println("Can't divide by 0");
        }


    }
}