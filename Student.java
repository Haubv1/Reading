public class Student extends Person {
    private String studentCode;
    private double average;
    private String email;
    public Student () {

    }
    public Student(String studentCode, double average, String email) {
        this.studentCode = studentCode;
        this.average = average;
        this.email = email;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.studentCode + " ," + this.email + ", " + this.average + ", " + this.email;
    }

}