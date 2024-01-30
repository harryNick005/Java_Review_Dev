package Exception;

public class CheckID {
    public static void tamaka(int age)  {

        if(age < 21){
           try{
               throw new customException("go fuck yourself");
           }
           catch (Exception e){
               System.out.println(e);
               e.printStackTrace();
               System.err.println("this is from Exception class");
           }

        }


    }

    public static void main(String[] args)  {
        tamaka(19);
    }
}
