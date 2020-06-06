import entity.Author;
import org.hibernate.Session;

public class Start {


    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        for (Author author:new AuthorHelper().getAuthorList()
             ) {
            System.out.println("author = " + author.getName());

        }


        HibernateUtil.getSessionFactory().close(); // закрываем фабрику, иначе программа останется в "зависнутом состоянии"


    }

}
