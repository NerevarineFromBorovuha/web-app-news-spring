package by.home.main.dao;

import by.home.main.bean.News;

import java.util.List;

public interface NewsDAO {

    public List<News> getListNews();

    public void saveNews(News theNews);

    public News getNews(int theId);

    public void deleteNews(int theId);

}
