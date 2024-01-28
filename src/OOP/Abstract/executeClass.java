package OOP.Abstract;

public class executeClass extends Animal{
    // Only extend to instance field (variables and methods) methodName plus .
    // All subclass (childClass) must contain/have constructor of superClass(parentClass)


    public executeClass(String animalName) {
        super(animalName);
    }


    @Override
    public  boolean isShed(boolean shed){
        return shed;
    }

    @Override
    public String sound( String input){
        return "this is how "+this.animalName+" bark: "+input;
    }

    // write a method fetching name of superClass
    public void nameOfClasses(){
        System.out.println(super.nameOfClass());
        System.out.println(executeClass.class.getName());
    }


    public static void main(String[] args) {

        executeClass executeClass=new executeClass("dog");

//        executeClass.animalName="dog";
        System.out.println(executeClass.nameOfClass());
        System.out.println(executeClass.isShed(true));
        System.out.println(executeClass.sound("ow ow ow"));
        System.out.println("=======================================================================");
        Animal.staticDemo();
        System.out.println("=======================================================================");
        executeClass.nameOfClasses();

    }

}
