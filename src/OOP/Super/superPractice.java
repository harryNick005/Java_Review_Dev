package OOP.Super;

public class superPractice {
    Integer id;
    String name;
public void print(){
    System.out.println("Hello World");
}
    public superPractice(){
        this(001,"default User");
        System.out.println("this is default constructor called");

    }
    public superPractice(Integer id,String name){
        this.id=id;
        this.name=name;
        System.out.println("this is parameterized constructor called");
    }
}
