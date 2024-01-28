package OOP;

public class invoke extends oop_Practice {
    public void invokeMethod (){
        System.out.println("This is method from invoke class");
    }
    public static void main(String[] args) {
        invoke invoke=new invoke();
        invoke.invokeMethod();
        invoke.oop_PracticeMethod();
    }
}
