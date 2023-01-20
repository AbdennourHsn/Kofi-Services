package ma.fstt.kofi.Interaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ma.fstt.kofi.Interaction.entity.Like;
import ma.fstt.kofi.Interaction.service.LikeService;

@RestController
@RequestMapping("/interaction/like")
public class LikeController {

	@Autowired LikeService likeService;
	
	@GetMapping (value = "/post/{id}")
	public List<Like> getLikesPost(@PathVariable("id") Long postid){
		return likeService.getLikesPost(postid);
	}
	
	@PostMapping(value="/post/{id}")
	public String saveLike(@PathVariable("id") Long postid) {
		Long user_id=1l,follow=1l;
		Like like=new Like(user_id,follow,postid);
		likeService.saveLike(like);
		return "success";
	}
	
	@PostMapping(value="/remove/{id}")
	public String removeLike(@PathVariable("id") Long id) {
		likeService.removeLike(id);
		return "success";
	}
	
}
