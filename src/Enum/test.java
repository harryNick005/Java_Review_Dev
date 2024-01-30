package Enum;

public class test {
    public static void main(String[] args) {
        execute admin=new execute();
        admin.getPrsType(Person.STUDENT);
        admin.getPrsType(Person.ADMIN);
        admin.getPrsType(Person.TA);
        admin.getPrsType(Person.PROFESSOR);
        admin.getPrsType(Person.INSTRUCTOR);
    }
}
