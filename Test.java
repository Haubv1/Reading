import java.util.Scanner;
import java.util.ArrayList;


public class Test {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Student> students = new ArrayList<Student>();
    public ArrayList<Student> addStudent() {
        for(int i = 0; i < n; i++) {
            String studentCode = sc.nextLine();
            double average = sc.nextDouble();
            String email = sc.nextLine();
            Student student = new Student(studentCode,average,email); 
            students.add(student);
        }
        return students;
    }
    public ArrayList<Student> SortByAverageA() {
            Student temp = new Student();
            for(int i = 0; i <students.size(); i++) {
                for(int j = i+1;j < students.size(); j++) {
                    Student student1 = students.get(i);
                    Student student2 = students.get(j);
                    if(student1.getAverage() > student2.getAverage()) {
                        temp = student1;
                        student1 = student2;
                        student2 = temp;

                    }
                }
            }
            
            return students;
    }
    public ArrayList<Student> SortByAverageD() {
        Student temp = new Student();
        for(int i = 0; i <students.size(); i++) {
            for(int j = i+1;j < students.size(); j++) {
                Student student1 = students.get(i);
                Student student2 = students.get(j);
                if(student1.getAverage() < student2.getAverage()) {
                    temp = student1;
                    student1 = student2;
                    student2 = temp;

                }
            }
        }
        
        return students;
}

    public void checkStudent(ArrayList<Student> students) {
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverage()>8) {
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
        Person person = new Person(name, sex, address, dateOfBirth);
        System.out.println(person.toString());
        sc.close();
        
        
    }
    
}
