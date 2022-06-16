public class Person {
    private String name ;
    private String sex;
    private String address;
    private int dateOfBirth;
    public Person() {
        
    }
    public Person(String name, String sex, String address, int dateOfBirth) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(int dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public String toString() {
        return this.name + ", " + this.sex + ", " + this.address + ", " + this.dateOfBirth;
    }
}
