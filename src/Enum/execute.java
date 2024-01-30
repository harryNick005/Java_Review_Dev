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
//            if (prsType.typeOfPerson.equalsIgnoreCase(Arrays.stream(Person.values()).filter(each->each.typeOfPerson.equals("student")).toList().get(0).toString())) {
//                System.out.println("The person Type is: " + Person.STUDENT);
//            }
//            else if (prsType.typeOfPerson.equalsIgnoreCase(Arrays.stream(Person.values()).filter(each->each.typeOfPerson.equals("professor")).toList().get(0).toString())) {
//                System.out.println("The person Type is: " + Person.PROFESSOR);
//            }
//            else if (prsType.typeOfPerson.equalsIgnoreCase(Arrays.stream(Person.values()).filter(each->each.typeOfPerson.equals("ta")).toList().get(0).toString())) {
//                System.out.println("The person Type is: " + Person.TA);
//            }
//            else if (prsType.typeOfPerson.equalsIgnoreCase(Arrays.stream(Person.values()).filter(each->each.typeOfPerson.equals("instructor")).toList().get(0).toString())) {
//                System.out.println("The person Type is: " + Person.INSTRUCTOR);
//            }
//            else if (prsType.typeOfPerson.equalsIgnoreCase(Arrays.stream(Person.values()).filter(each->each.typeOfPerson.equals("adminPerson")).toList().get(0).toString())) {
//                System.out.println("The person Type is: " + Person.ADMIN);
//            }

            switch (prsType){
                case STUDENT:
                    System.out.println("The person Type is: " + Person.STUDENT);
                    break;
                case PROFESSOR:
                    System.out.println("The person Type is: " + Person.PROFESSOR);
                    break;
                case ADMIN:
                    System.out.println("The person Type is: " + Person.ADMIN);
                    break;
                case INSTRUCTOR:
                    System.out.println("The person Type is: " + Person.INSTRUCTOR);
                    break;
                case TA:
                    System.out.println("The person Type is: " + Person.TA);
                    break;
            }

        }
    }
    public static void main(String[] args) {
       Person.showMembers();
    }
}
