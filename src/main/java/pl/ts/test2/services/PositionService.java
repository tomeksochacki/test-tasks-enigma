package pl.ts.test2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ts.test2.dao.HibernatePositionDAO;
import pl.ts.test2.model.Position;

@Service
public class PositionService implements IPositionService {

    @Autowired
    HibernatePositionDAO hibernatePositionDAO;

    @Override
    public boolean addPosition(Position position) {
        this.hibernatePositionDAO.savePosition(position);
        return true;
    }
}
