package Enum;

public enum Person {

    STUDENT("student","no access to system"),
    TA("ta","would have temp access to BlackBoard "),
    INSTRUCTOR("instructor","no access to system but access to BlackBoard"),

    PROFESSOR("professor","partial access to BlackBoard "),
    ADMIN("adminPerson","full access");

    public String typeOfPerson;
    public String specification;
    Person(String typeOfPerson,String specification){
    this.typeOfPerson=typeOfPerson;
    this.specification=specification;
    }

    @Override
    public String toString() {
        return "Person{" +
                "typeOfPerson='" + typeOfPerson + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }

    public static void showMembers(){
        for (Person eachPerson:Person.values()) {
            System.out.println(eachPerson);
        }
    }



}
