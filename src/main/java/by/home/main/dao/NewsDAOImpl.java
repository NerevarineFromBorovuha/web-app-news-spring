package by.home.main.dao;

import by.home.main.bean.News;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class NewsDAOImpl implements NewsDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<News> getListNews() {
        System.out.println("В дао");

        Session currentSession = sessionFactory.getCurrentSession();
        System.out.println("Соединение");
        Query<News> theQuery = currentSession.createQuery(" FROM News ",
                News.class);
        System.out.println("Получили query");
        List<News> finalList = theQuery.getResultList();
        System.out.println("Получили лист");
        return finalList;
    }

    @Override
    public void saveNews(News theNews) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theNews);
    }

    @Override
    public News getNews(int theId) {

        Session currentSession = sessionFactory.getCurrentSession();
        News currentNews = currentSession.get(News.class, theId);
        return currentNews;
    }

    @Override
    public void deleteNews(int theId) {

        Session currentSession = sessionFactory.getCurrentSession();
       // Query theQuery = currentSession.createQuery("delete from News where id=:newsId");
      //  theQuery.setParameter("newsId", theId);
      //  theQuery.executeUpdate();
        currentSession.delete(currentSession.get(News.class,theId));

    }
}
