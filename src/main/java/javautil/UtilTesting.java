package javautil;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public abstract class UtilTesting {

    private Person[] people1;
    private Person[] people2;

    public Boolean equals(Person[] array1,Person[] array2){
        return Arrays.equals(array1,array2);
    }

    public Person[] fill(Integer size, Person p){
        Person[] people = new Person[size];
        Arrays.fill(people,p);
        return people;
    }

    public void arrayToString(Person[] people){

        var string_people = Arrays.toString(people);

        System.out.println(string_people);

    }

    /***
     * I don't know how to add to an array after it's been intialized. I guess arrays are fixed length but does that mean they are immutable? I would
     * figure you could insert into one as long as you don't go past their capacity.
     * @param range
     * @return
     */
    public Integer[] generateRandomNumbers(Integer range){
        Integer[] integers = new Integer[range];
        Integer cur = 1;
        Integer a = 2;
        Integer b = 3;
        Integer n = 4;


        var next = (a * cur + b) % n;
        var start = 0;

        while(start < integers.length){
            //

        }
        return integers;


    }
}
