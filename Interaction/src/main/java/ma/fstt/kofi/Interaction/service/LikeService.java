package ma.fstt.kofi.Interaction.service;

import java.util.List;

import ma.fstt.kofi.Interaction.entity.Like;

public interface LikeService {
	public List<Like> getLikesPost(Long postid);
	public Like saveLike(Like like);
	public void removeLike(Long likeid);

	
}

