package by.home.main.service;

import by.home.main.bean.News;
import by.home.main.dao.NewsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDAO newsDAO;

    @Transactional
    @Override
    public List<News> getListNews() {
        System.out.println("В сервисе");
        return newsDAO.getListNews();
    }
    @Transactional
    @Override
    public void saveNews(News theNews) {

        String title = theNews.getTitle();
        String text = theNews.getText();
        theNews.setTitle(title);
        theNews.setText(text);

        newsDAO.saveNews(theNews);
    }

    @Transactional
    @Override
    public News getNews(int theId) {

        return newsDAO.getNews(theId);
    }
    @Transactional
    @Override
    public void deleteNews(int theId) {

        newsDAO.deleteNews(theId);
    }
}
