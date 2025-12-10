class college{
    String college_name;
    String college_location;
    college(String college_name,String college_location){
           this.college_name=college_name;
           this.college_location=college_location;
    }
    public void collegeDetails(){
        System.out.println(college_name+" "+college_location);
    }
}
class department extends college{
    String Dept_name;
    String Dept_id;
    department(String Dept_name,String Dept_id,String college_name,String college_location){
     super(college_name,college_location);
     this.Dept_name=Dept_name;
     this.Dept_id=Dept_id;
    }
    public void departmentDetails(){
        System.out.println(college_name+" "+college_location+""+Dept_name+""+Dept_id);
    }
}
class student extends department{
    String Stu_name;int Stu_id;
    student(String Stu_name,int Stu_id,String Dept_name,String Dept_id,String college_name,String college_location){
         super(Dept_name,Dept_id,college_name,college_location);
         this.Stu_name=Stu_name;
         this.Stu_id=Stu_id;
    }
    public void studentDetails(){
        System.out.println("\nStu_name:-"+Stu_name+"\nStu_id:-"+Stu_id+"\ncollege_name:-"+college_name+"\ncollege_location:-"+college_location+"\nDept_name:-"+Dept_name+"\nDept_id:-"+Dept_id);
    }
}
public class multilevel2 {
    public static void main(String[] args) {
        student obj=new student("AdarshNaidu",20174,"ComputerScienceEngineering","SOC","VeltechUniversity","chennai");
        obj.studentDetails();
    }
}
