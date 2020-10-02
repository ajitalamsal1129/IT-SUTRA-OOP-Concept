package src.OOP.AccessModifier;

public class Student {//class can be default or public bit not private
    public int id;
    private String name;
    protected String address = "St.louis";
    String email= "ajita@abc.com";

    public Student (int id,String name) {//Define constructor
        this.id= id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    }



