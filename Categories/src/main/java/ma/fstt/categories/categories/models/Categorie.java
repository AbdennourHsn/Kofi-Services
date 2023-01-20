package ma.fstt.categories.categories.models;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categorie
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String path_svg;

    public Categorie(String name, String pathSvg) {
        this.name = name;
        path_svg = pathSvg;
    }

    public Categorie() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPath_svg() {
        return path_svg;
    }

    public void setPath_svg(String path_svg) {
        this.path_svg = path_svg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
