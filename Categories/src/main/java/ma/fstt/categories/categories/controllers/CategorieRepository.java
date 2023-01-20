package ma.fstt.categories.categories.controllers;

import ma.fstt.categories.categories.models.Categorie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Long> {

}
