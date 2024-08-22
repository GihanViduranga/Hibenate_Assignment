package ly.pt;

import ly.pt.config.FactoryConfigeration;
import ly.pt.embed.FullName;
import ly.pt.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfigeration.getInstance().getSession();
        FullName fullName = new FullName("Nipun","Prabushitha");


        Student student = new Student();
        student.setStudentId(3);
        student.setName(fullName);
        student.setAddress("Gampaha");

        Transaction transaction = session.beginTransaction();

        //session.save(student);
        /*session.update(student);*/
        /*session.delete("1", student);*/
        Student student1 = (Student) session.get(Student.class, "2");
        transaction.commit();
        System.out.println(student1);

        session.close();
    }
}