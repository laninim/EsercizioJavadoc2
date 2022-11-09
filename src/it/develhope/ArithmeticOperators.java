package it.develhope;

import it.develhope.Exception.DivideByZeroException;

/**
 * @author  Mauro Lanini
 * This class rappresent the base arithmetic operation
 */
public class ArithmeticOperators {


    /**
     * Sum two number a + b
     * @param a the first number
     * @param b the second number
     * @return the results of operation
     */
     public int sum(int a, int b) {
         return a + b;
     }

    /**
     * Sub b number from a number
     * @param a the first number
     * @param b the second number
     * @return the results of operation
     */
     public int sub(int a, int b){
         return a - b;
     }

    /**
     * Moltiply the a value for the b value
     * @param a the first number
     * @param b the second number
     * @return the results of operations
     */
     public int mul(int a, int b){
         return a * b;
     }

    /**
     * divides the first number by the second
     * @param a the first number
     * @param b the second number
     * @return the results of operation
     * @throws DivideByZeroException if one of the number is 0
     */
     public int div(int a, int b) throws DivideByZeroException{
         if(a == 0 || b == 0){
             throw new DivideByZeroException();
         }
         return a / b;
     }
}
