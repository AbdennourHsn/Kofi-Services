package ma.fstt.kofi.Interaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fstt.kofi.Interaction.entity.Commentaire;
import ma.fstt.kofi.Interaction.service.CommentaireServiceImpl;

@RestController
@RequestMapping("/interaction/commentaire")
public class CommentaireController {
	@Autowired CommentaireServiceImpl commentaireServiceImpl;
	@PostMapping(value="/save")
	public String save(@RequestBody Commentaire comment) {
		Long userid=1l;
		comment.setUserId(userid);
		System.out.println(comment.getComment()+" : "+comment.getPostId());
		commentaireServiceImpl.saveCommentaire(comment);
		return "success";
	}
	
	@GetMapping(value="/post/{id}")
	public List<Commentaire> getCommentairePost(@PathVariable("id") Long postid){
		return commentaireServiceImpl.getCommentairePost(postid);
	}
}
