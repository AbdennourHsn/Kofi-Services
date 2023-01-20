package ma.fstt.kofi.Interaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import ma.fstt.kofi.Interaction.entity.Like;
import ma.fstt.kofi.Interaction.repository.LikeRepository;

@Service
@Transactional
public class LikeServiceImpl implements LikeService {
	@Autowired
	private LikeRepository likeRepository;
	
	@Override
	public List<Like> getLikesPost(Long postid) {
		List<Like> likes =likeRepository.findByPostId(postid);
		//List<Like> likes =likeRepository.findAll();
		return likes;

	}

	@Override
	public Like saveLike(Like like) {
		return likeRepository.save(like);
	}

	@Override
	public void removeLike(Long likeid) {
		likeRepository.deleteById(likeid);;
	}
	

}
