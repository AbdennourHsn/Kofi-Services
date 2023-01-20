package ma.fstt.kofi.Interaction.service;

import java.util.List;

import ma.fstt.kofi.Interaction.entity.Commentaire;

public interface CommentaireService {
	public Commentaire saveCommentaire(Commentaire c);
	public List<Commentaire> getCommentairePost(Long postid);
}
