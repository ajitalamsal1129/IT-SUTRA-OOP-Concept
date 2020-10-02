package src.OOP.Inheritance;

public class Child  extends Parent {
public void getMessage () {
    System.out.println("This is child class with id: " + getId() +" " +  "name:" +  getName() + " " +
             "address:"   +   getAddress() );
}
}