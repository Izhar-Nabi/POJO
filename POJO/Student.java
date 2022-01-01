package POJO;

public class Student {
    private String Name;
    private int age;
    private int RollNo;
    Student(){
        //This is a default constructor....
    }
    Student(String Name, int age, int RollNo){
        this.Name=Name;
        this.RollNo=RollNo;
        this.age=age;
    }
    public void setName(String name){
        Name=name;
    }
    public String getName(){
        return Name;
    }
    public void setRollNo(int RollNo){
        this.RollNo=RollNo;
    }

    public int getRollNo() {
        return RollNo;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }
    public void resultMethod(){
        System.out.println(" Name is "+Name +"\n Roll No is "+RollNo +"\n My age is "+age);
    }
    public static void main(String agrs[]){
        Student Result = new Student("XYZ", 21,0000);
        Result.resultMethod();
    }
}
