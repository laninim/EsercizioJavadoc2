package it.develhope.Exception;

/**
 * @author  Mauro Lanini
 * Try divide number for 0 raise this exception
 */
public class DivideByZeroException extends Exception{

    public DivideByZeroException(){
        super("Cant' divide by 0") ;
    }
}
