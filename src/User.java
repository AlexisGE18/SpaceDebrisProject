import java.util.Scanner;

public class User extends Main {
   public int age;
   public String name;
   public String userType;

    //Constructor
    public User(){}

    public void getAge(int age){
        this.age = age;

    }
    public void getName(String name){
        this.name = name;
    }

    public int setAge(){
        return this.age;
    }
    public String setName(){
        return this.name;
    }


    public void createUser(int age, String name, String jobType){
        System.out.println("This user is: " + age + name + jobType);

    }
    public void manageUser(int age, String name, String jobType){
        age = this.age;
        name = this.name;
        jobType = this.userType;
        System.out.println("User updated information is: " + age + name + jobType);
    }
    public void deleteUser(int age, String name, String jobType){
        age = 0;
        name = "";
        jobType = "";

        System.out.println("User info successfully deleted" + age + name + jobType);
    }



}
