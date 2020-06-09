import entity.Author;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

public class Start {
    private static final Logger log = LogManager.getLogger(Start.class);


    public static void main(String[] args) {
//        log.info("TEST LOG");
//        Session session = HibernateUtil.getSessionFactory().openSession();
//
//        for (Author author:new AuthorHelper().getAuthorList()
//             ) {
//            log.warn(author.getName());
//        }
    Author author = new Author("new");
    new AuthorHelper ().addAuthor(author);



//        HibernateUtil.getSessionFactory().close(); // закрываем фабрику, иначе программа останется в "зависнутом состоянии"


    }

}
