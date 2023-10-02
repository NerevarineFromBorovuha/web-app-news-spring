package by.home.main.controller;

import by.home.main.bean.News;
import by.home.main.service.CommentService;
import by.home.main.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/news")
public class MainController {

    @Autowired
    private NewsService newsService;
    @Autowired
    private CommentService commentService;

    // В данном методе обрезаем пробелы
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }



    // Показ списка всех новостей
    @RequestMapping("/list")
    public String listNews(Model theModel) {
//        System.out.println("Вошли в метод");
        List<News> listNews = newsService.getListNews();
//        System.out.println("Достали список новостей");
//        for(News n:listNews){
//            System.out.println(n);
//        }
        theModel.addAttribute("listAllNews", listNews);
//        System.out.println("Положили в модель");
        return "layouts/baseLayout";
    }

    //Просмотр одной новости с комментариями
    @RequestMapping("/view")
    public String viewNews(@RequestParam("id") int idNews, Model model) {
        News news = newsService.getNews(idNews);
        model.addAttribute("oneNews", news);
        return "tiles/viewNews";
    }

    //Удаление одной новости
    @RequestMapping("/deleteOne")
    public String deleteNews(@RequestParam("id") int idNews) {
        newsService.deleteNews(idNews);
        return "redirect:/news/list";
    }

    //Удаление одного комментария
    @RequestMapping("/deleteOneComment")
    public String deleteComment(@RequestParam("idComment") int idComment, @RequestParam("idNews") int idNews) {
        commentService.deleteComment(idComment);
        return "redirect:/news/view?id=" + idNews;
    }

    //Переход на страницу редактирования новости
    @RequestMapping("/editForm")
    public String showFormForUpdate(@RequestParam("id") int idNews, Model theModel) {
        News news = newsService.getNews(idNews);
        theModel.addAttribute("oneNews", news);
        return "tiles/editNews";
    }

    //Сохранение или обновление новости
    @RequestMapping("/saveNews")
    public String saveNews(@Valid @ModelAttribute("oneNews") News oneNews, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "tiles/editNews";
        } else {
            newsService.saveNews(oneNews);
            return "redirect:/news/list";
        }


    }


}