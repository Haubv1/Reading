import java.util.Scanner;
import java.util.ArrayList;


public class Test {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Student> students = new ArrayList<Student>();
    public ArrayList<Student> AddStudent() {
        for(int i = 0; i < n; i++) {
            String studentCode = sc.nextLine();
            double average = sc.nextDouble();
            String email = sc.nextLine();
            Student student = new Student(studentCode,average,email); 
            students.add(student);
            //Add a new student into the list.
        }
        return students;
    }
    
    ////Method to short students in ascending order of grade points average 
    public ArrayList<Student> SortByAverageAscending() {
            Student temp = new Student();
            for(int i = 0; i <students.size(); i++) {
                for(int j = i+1;j < students.size(); j++) {
                    Student student1 = students.get(i);
                    Student student2 = students.get(j);
                    if(student1.getAverage() > student2.getAverage()) { //compare students's average points.
                        temp = student1;
                        student1 = student2;
                        student2 = temp;
                        //Swap the positions in the array.
                    }
                }
            }
            
            return students;
    }
    
    //Method to short students in descending order of grade points average 
    public ArrayList<Student> SortByAverageDescending() {
        Student temp = new Student();
        for(int i = 0; i <students.size(); i++) {
            for(int j = i+1;j < students.size(); j++) {
                Student student1 = students.get(i);
                Student student2 = students.get(j);
                if(student1.getAverage() < student2.getAverage()) {     ////compare students's average points.
                    temp = student1;
                    student1 = student2;
                    student2 = temp;
                    //Swap the positions in the array.
                }
            }
        }
        
        return students;
}

    public void checkStudent(ArrayList<Student> students) {
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverage()>8) {       //Get the student's average and compare to 8.
                System.out.println("Được học bổng");
            }
            else
                System.out.println("Cần cố gắng hơn nữa");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String address = sc.nextLine();
        int dateOfBirth = sc.nextInt();
        //Insert infomations.
        Person person = new Person(name, sex, address, dateOfBirth);
        System.out.println(person.toString());
        sc.close();
        
        
    }
    
}
