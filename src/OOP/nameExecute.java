package OOP;

public class nameExecute implements name{

    public String A="Java";
     String B="Python";
    @Override
    public String myName(String input) {
        return "Hello, I am "+input;
    }

    @Override
    public String myAge(int input) {
        return null;
    }

    public static void main(String[] args) {
        nameExecute nameExecute=new nameExecute();
        System.out.println(nameExecute.myName("Nigmat"));
    }
}
