package by.home.main.service;

import by.home.main.bean.Comment;
import by.home.main.bean.News;
import by.home.main.dao.CommentsDAO;
import by.home.main.dao.NewsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentService {

    @Autowired
    private CommentsDAO commentsDAO;


    @Transactional
    @Override
    public void saveComment(Comment theNews) {

    }

    @Transactional
    @Override
    public void deleteComment(int theId) {
        commentsDAO.deleteComment(theId);
    }
}
