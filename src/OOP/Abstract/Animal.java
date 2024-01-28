package OOP.Abstract;

public abstract class Animal {
    // abstract class cannot be instantiated (cannot create object)
   public String animalName;

   public Animal(){};

    public Animal(String animalName){
      this.animalName=animalName;
        System.out.println("animalName is: "+this.animalName);
    }

   // Concrete method
    public String nameOfClass(){
       String className= Animal.class.getName();
        return "Class Name is: "+className;
    }

    public static void staticDemo(){
        System.out.println("this is static method");
    }

    public abstract boolean isShed(boolean shed);

    public abstract String sound(String input);

}
