package recursion;

public class Person implements Comparable<Person>{

    private String firstname;


    public Person(String fname){
        this.firstname = fname;
    }


    public int compareTo(Person p) {
        return this.firstname.compareTo(p.firstname);
    }


    public String getFirstName(){
        return this.firstname;
    }
}
