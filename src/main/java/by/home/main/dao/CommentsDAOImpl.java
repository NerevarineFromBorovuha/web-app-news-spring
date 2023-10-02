package by.home.main.dao;

import by.home.main.bean.Comment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentsDAOImpl implements CommentsDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveComment(Comment theNews) {

    }

    @Override
    public void deleteComment(int theId) {

        Session currentSession = sessionFactory.getCurrentSession();
        Query theQuery = currentSession.createQuery("delete from Comment where id=:commentId");
        theQuery.setParameter("commentId", theId);
        theQuery.executeUpdate();

    }
}
