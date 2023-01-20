package ma.fstt.post.post.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long idClient;
    private String title;
    private String content;
    private String path_media;
    private String type_post;
    private String audience;


    public Post(long idClient,String title, String content, String pathMedia, String typePost, String audience) {
        this.title = title;
        this.idClient = idClient;
        this.content = content;
        path_media = pathMedia;
        type_post = typePost;
        this.audience = audience;
    }

    public Post() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPath_media() {
        return path_media;
    }

    public void setPath_media(String path_media) {
        this.path_media = path_media;
    }

    public String getType_post() {
        return type_post;
    }

    public void setType_post(String type_post) {
        this.type_post = type_post;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }
}
