package ly.pt;

import ly.pt.config.FactoryConfigeration;
import ly.pt.embed.FullName;
import ly.pt.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfigeration.getInstance().getSession();
        FullName fullName = new FullName();
        fullName.setFirstName("Gihan");
        fullName.setLastName("Viduranga");

        Student student = new Student();
        student.setStudentId(1);
        student.setName(fullName);
        student.setAddress("Wadduwa");

        Transaction transaction = session.beginTransaction();

        session.save(student);
        transaction.commit();

        session.close();
    }
}