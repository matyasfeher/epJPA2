package facade;

import entity.Person;
import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

/**
 *
 * @author Acer
 */
public class facade {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");

    public void addPerson(String fname, String lname, Date bd, int age, boolean isMarried) {
        EntityManager em = emf.createEntityManager();
        Person p = new Person(fname, lname, bd, age, isMarried);
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }

}
