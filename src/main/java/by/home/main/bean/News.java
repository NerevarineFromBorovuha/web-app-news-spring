package by.home.main.bean;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    @NotNull(message = "this field should not be empty")
    @Size(min=1, max = 150, message = "maximum of 150 characters")
    private String title;
    @Column(name = "text")
    @NotNull(message = "this field should not be empty")
    @Size(min=1, max = 2000, message = "maximum of 2000 characters")
    private String text;
    @Column(name = "creationDate")
    private String creationDate;
    @Column(name = "lastEditDate")
    private String lastEditDate;
    @Column(name = "insertedById")
    private int insertedById; // SpringSecurity
    @Column(name = "updatedById")
    private int updatedById; // SpringSecurity

    @OneToMany(fetch = FetchType.LAZY,cascade =CascadeType.ALL, mappedBy = "news")
    private List<Comment> comments;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(int updatedById) {
        this.updatedById = updatedById;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", lastEditDate='" + lastEditDate + '\'' +
                ", insertedById=" + insertedById +
                ", updatedById=" + updatedById +
                ", comments=" + comments +
                '}';
    }
}
