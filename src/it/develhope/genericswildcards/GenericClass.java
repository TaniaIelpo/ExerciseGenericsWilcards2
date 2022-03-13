package it.develhope.genericswildcards;

/**
 * This class represent a generic class
 * @param <T> is a generic type
 *
 * @author Tania Ielpo
 */

public class GenericClass <T>{
    private T t;

    /**
     * This method returns the value of t variable
     * @return the value of t variable
     */

    public T getT(){
        return this.t;
    }

    /**
     * This method sets the t value
     * @param valueToSet is the value to set in t variable
     */

    public void setT(T valueToSet){
        this.t=valueToSet;
    }

    /**
     * This method compares two GenericClass object
     * @param gc1 first GenericClass Object
     * @param gc2 second GenericClass Object
     * @return a boolean: true if the two elements are equals, else false
     */

    public static boolean isEqual(GenericClass gc1, GenericClass gc2){
        return gc1.getT().equals(gc2.getT());
    }
}
