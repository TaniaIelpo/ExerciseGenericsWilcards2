package it.develhope.genericswildcards;

/**
 * This Class is a Tester
 *
 * @author Tania Ielpo
 */

public class Tester {

    public static void main(String[] args) {

        //Creation of first two GenericClass element of type Integer
        GenericClass<Integer> firstElement = new GenericClass<>();
        GenericClass<Integer> secondElement=new GenericClass<>();

        //Creation of second two GenericClass element of type String
        GenericClass<String> thirdElement=new GenericClass<>();
        GenericClass<String> fourthElement=new GenericClass<>();

        //Using the setT method to set the t value
        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("This is a string");
        fourthElement.setT("This is a string");

        //comparison of elements using the static GenericClass method isEqual(obj1,obj2)
        System.out.println("First element is equal to second element? "+GenericClass.isEqual(firstElement,secondElement));
        System.out.println("Third element is equal to fourth element? "+GenericClass.isEqual(thirdElement,fourthElement));


    }
}
