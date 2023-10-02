package by.home.main.dao;

import by.home.main.bean.Comment;
import by.home.main.bean.News;

import java.util.List;

public interface CommentsDAO {

    public void saveComment(Comment theNews);

  //  public Comment getComment(int theId);

    public void deleteComment(int theId);

}
