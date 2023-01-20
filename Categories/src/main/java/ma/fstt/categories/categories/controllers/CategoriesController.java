package ma.fstt.categories.categories.controllers;

import ma.fstt.categories.categories.models.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categorie")
public class CategoriesController {

    @Autowired
    private CategorieRepository categorieRepository;

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public List<Categorie> findAllCategories() {
        return (List<Categorie>) categorieRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categorie> findCategorieById(@PathVariable(value = "id") long id) {
        Optional<Categorie> categorie = categorieRepository.findById(id);
        if(categorie.isPresent()) {
            return ResponseEntity.ok().body(categorie.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(name = "/", method = RequestMethod.POST)
    public Categorie saveCategorie(Categorie categorie) throws IOException {
        return categorieRepository.save(categorie);
    }

}
