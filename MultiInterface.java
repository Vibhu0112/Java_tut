interface Person{
    default void sayHello(){
        System.out.println("Hello");
    }
}
interface Male{
    default void sayHello(){
        System.out.println("Hii");
}
}
class Sam implements Person,Male{
  public void sayHello(){
      Male.super.sayHello();
      Person.super.sayHello();
    }
}
public class MultiInterface {
  public static void main(String[] args) {
      Sam s = new Sam();
      s.sayHello();
  } 
}
