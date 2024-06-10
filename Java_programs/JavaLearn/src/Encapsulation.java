import java.util.Objects;

/*
Task 3:
Create a Java program that demonstrates the concept of encapsulation.
Define a class called Person with private attributes such as name, age, and email.
 Provide public methods to set and get these attributes. Then, in the main method,
 create an instance of the Person class,
set its attributes using the public methods, and display the values of these attributes using the getter methods.
 */
class Person{
    private String name;
    private int age;
    private String email;

    //getting name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    //getting age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0) {
            this.age = age;
        }
    }

    //getting email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        if(email!=null && email!=""){
            this.email=email;
        }
        in:
        System.err.println("INVALID EMAIL!");

    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Person p1=new Person();
        p1.setName("vikram");
        p1.setAge(21);
        p1.setEmail("");
        //val enhanced that mean join and store tha val in single variable
        String val="Name : "+p1.getName()+
                " \n"+"Age: "+p1.getAge()+" "
                + "\n"+"Email: "+p1.getEmail();
        System.out.println(val);
    }
}
