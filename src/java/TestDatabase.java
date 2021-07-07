
import model.Doctor;
import model.Patient;
import model.User;
import org.hibernate.Session;
import util.NewHibernateUtil;

public class TestDatabase { 
    public static void main(String[] args) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Doctor doctor = new Doctor();
            doctor.setName("mohamesd");
            doctor.setEmail("msoh");
            session.save(doctor);
            session.getTransaction().commit();
        } catch (Exception e) {
        }
    }
}
