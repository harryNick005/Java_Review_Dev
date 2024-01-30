package Enum;
import Exception.customException;

import java.util.Arrays;
import java.util.stream.Collectors;

public class execute  {


    public void getPrsType(Person prsType)  {

        if (prsType.getClass().getName()!=Person.class.getName()) {
            try {
                throw new customException("the personType must be used from Person Enum, if you don't have personType you want to search, please feel free to add it to Person Enum");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (prsType.typeOfPerson.equalsIgnoreCase("student")) {
                System.out.println("The person Type is: " + Person.STUDENT);
            } else if (prsType.typeOfPerson.equalsIgnoreCase("professor")) {
                System.out.println("The person Type is: " + Person.PROFESSOR);
            } else if (prsType.typeOfPerson.equalsIgnoreCase("ta")) {
                System.out.println("The person Type is: " + Person.TA);
            } else if (prsType.typeOfPerson.equalsIgnoreCase("Instructor")) {
                System.out.println("The person Type is: " + Person.INSTRUCTOR);
            } else if (prsType.typeOfPerson.equalsIgnoreCase("admin")) {
                System.out.println("The person Type is: " + Person.ADMIN);
            }

        }
    }
    public static void main(String[] args) {
       Person.showMembers();
    }
}
