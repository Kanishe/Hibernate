import org.hibernate.Session;

public class Start {


    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        HibernateUtil.getSessionFactory().close(); // close fabric, if we did close program stay open


    }

}
