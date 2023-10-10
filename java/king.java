public class Person{
  // state of an object
  int age;
  String name;

  // behavior of an object
  public void setValue(int age, String name) {
    this.age = age;
    this.name = name;
  }
  public void getValue() {
    System.out.println("Age is " + age);
    System.out.println("Name is " + name);
  }

  // main method
  public static void main(String [] args) {
    // creates a new Person object
    Person p = new Person(); 

    // changes state through behavior
    p.setValue(20, "Robin");
    p.getValue();
  }
}