package by.home.main.service;

import by.home.main.bean.News;

import java.util.List;

public interface NewsService {

    public List<News> getListNews();

    public void saveNews(News theNews);

    public News getNews(int theId);

    public void deleteNews(int theId);
}
