package ma.fstt.kofi.Interaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import ma.fstt.kofi.Interaction.entity.Commentaire;
import ma.fstt.kofi.Interaction.repository.CommentaireRepository;

@Service
@Transactional
public class CommentaireServiceImpl implements CommentaireService{
	@Autowired
	CommentaireRepository commentaireRepository;
	@Override
	public Commentaire saveCommentaire(Commentaire c) {
		return commentaireRepository.save(c);
		
	}

	@Override
	public List<Commentaire> getCommentairePost(Long postid) {
		List<Commentaire> commentaires=commentaireRepository.findByPostId(postid);
		return commentaires;
	}
	
}
