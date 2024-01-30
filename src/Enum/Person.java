package Enum;

public enum Person {

    STUDENT("student"),
    INSTRUCTOR("instructor"),
    TA("ta"),
    PROFESSOR("professor"),
    ADMIN("adminPerson");

    public String typeOfPerson;
    Person(String typeOfPerson){
    this.typeOfPerson=typeOfPerson;
    }

    public String toString(){
       return typeOfPerson;
    }

    public static void showMembers(){
        for (Person eachPerson:Person.values()) {
            System.out.println(eachPerson);
        }
    }



}
