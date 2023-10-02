package by.home.main.service;

import by.home.main.bean.Comment;
import by.home.main.bean.News;

import java.util.List;

public interface CommentService {


    public void saveComment(Comment theNews);

   // public Comment getNews(int theId);

    public void deleteComment(int theId);
}
