package ma.fstt.kofi.Interaction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.fstt.kofi.Interaction.entity.Commentaire;


public interface CommentaireRepository extends  JpaRepository<Commentaire,Long>{
	public List<Commentaire> findByPostId(Long postid);
}
