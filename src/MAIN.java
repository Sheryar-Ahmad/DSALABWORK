import java.util.Arrays;


class Student{
    String studentName;
    String registrationNumber;
    float cgpa;

    Student(String  studentName,String registrationNumber,float cgpa ){
        this.studentName=studentName;
        this.registrationNumber=registrationNumber;
        this.cgpa=cgpa;
    }

    float maximum(Student[] students){
    float max_cgpa=students[0].cgpa;
    for (int i=1;i< students.length;i++){
        if(students[i].cgpa>max_cgpa){
            max_cgpa=students[i].cgpa;
        }
    }
         return max_cgpa;

    }
}

public class MAIN {
    public static void main(String[] args) {

        Student [] students = new Student[5];
        students[0] =new Student("Sheryar","FA24-BSE-002",2.1f);
        students[1] =new Student("Ali","FA24-BSE-001",2.31f);
        students[2] =new Student("Ahmad","FA24-BSE-003",1.41f);
        students[3] =new Student("Khan","FA24-BSE-004",3.61f);
        students[4] =new Student("Muhammad","FA24-BSE-005",4.0f);


        float greater=students[0].maximum(students);

        System.out.println("Student with greater cgpa is: "+greater);

        // Part B
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for (int i=0;i< matrix.length;i++){
            sum+=matrix[i][i];
        }
        System.out.println(sum);
    }
}
