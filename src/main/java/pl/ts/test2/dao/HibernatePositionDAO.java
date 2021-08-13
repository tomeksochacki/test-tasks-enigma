package pl.ts.test2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.ts.test2.model.Position;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HibernatePositionDAO implements IPositionDAO{

    @Autowired
    SessionFactory sessionFactory;

    List<Position> positionList = new ArrayList<>();

    public void savePosition(Position position) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(position);
            tx.commit();
        } catch (Exception e) {
            if (tx != null)
                tx.rollback();
        } finally {
            session.close();
        }
    }
}
