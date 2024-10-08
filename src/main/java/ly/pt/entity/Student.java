package ly.pt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import ly.pt.embed.FullName;

@Entity
public class Student {
    @Id
    private int studentId;
    private FullName name;
    private String address;

    public Student(int studentId, FullName name, String address) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name=" + name +
                ", address='" + address + '\'' +
                '}';
    }
}
