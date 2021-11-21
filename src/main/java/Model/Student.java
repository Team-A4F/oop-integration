package Model;

public class Student {

    private int id;
    private String name;
    private String nic;
    private String age;
    private String gender;
    private String phone;
    private String address;
    private String email;

    public Student(String name, String nic, String phone, String age, String email, String gender, String address) {

        this.name = name;
        this.nic = nic;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNic() {
        return nic;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

}
