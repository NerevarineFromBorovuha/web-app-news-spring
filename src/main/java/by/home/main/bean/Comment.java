package by.home.main.bean;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "text")
    @NotNull(message = "this field should not be empty")
    @Size(min=1, max = 300, message = "maximum of 300 characters")
    private String text;
    @Column(name = "creationDate")
    private String creationDate;
    @Column(name = "lastEditDate")
    private String lastEditDate;
    @Column(name = "insertedById")
    private int insertedById; // SpringSecurity

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="idNews")
    private News news;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(String lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public int getInsertedById() {
        return insertedById;
    }

    public void setInsertedById(int insertedById) {
        this.insertedById = insertedById;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", lastEditDate='" + lastEditDate + '\'' +
                ", insertedById=" + insertedById +
                ", news=" + news +
                '}';
    }
}
