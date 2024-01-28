package OOP;

public class oop_Practice {
    private int id=10001;
    public  int age=20;

    public static double height = 6.2;

    /*
    non-static  ---> instance ==> belong to object
    static      ---> class
     */

    public void setter(int id){
        this.id=id;
    }
    public int getter(){
        return id;
    }

    public void oop_PracticeMethod(){
        System.out.println("This is method from oop_Practice class");
    }

    public static void main(String[] args) {
        //how to create object
        //  new+Constructor ===> Object
        oop_Practice object=new oop_Practice();
//        System.out.println("His age is "+object.age);
//        System.out.println("His age is "+oop_Practice.height);

        System.out.println("The origin value of 'id' was " + object.id);
//        object.setter(10002);
        object.id=10002;
        System.out.println("The current value of 'id' is " +object.id);

    }
}
