package src.OOP.Inheritance;

public class Parent {
    private int id=1;
    private int age= 60;
    private String name= "Ajita";
    private String address= "Nepal";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
            }

            public void setAge(int Age) {
                this.age = age;

            }

            public String getName() {
                return name;
            }

            public void setName( String name) {
                this.name = name;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress( String address) {
                this.address = address;
            }
            public Parent() {
                System.out.println("Parent Constructor");
            }
            public void Test() {
                System.out.println("Parent Test");
            }



                }





