package it.develhope;

import it.develhope.Exception.DivideByZeroException;

/**
 * @author  Mauro Lanini
 * This class rappresent the base arithmetic operation
 */
public class ArithmeticOperators {



     public int sum(int a, int b) {
         return a + b;
     }

     public int sub(int a, int b){
         return a - b;
     }

     public int mul(int a, int b){
         return a * b;
     }

     public int div(int a, int b) throws DivideByZeroException{
         if(a == 0 || b == 0){
             throw new DivideByZeroException();
         }
         return a / b;
     }
}
