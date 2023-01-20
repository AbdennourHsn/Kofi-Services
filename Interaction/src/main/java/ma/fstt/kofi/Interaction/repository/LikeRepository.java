package ma.fstt.kofi.Interaction.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import ma.fstt.kofi.Interaction.entity.Like;

public interface LikeRepository extends JpaRepository<Like,Long> {
	List<Like> findByPostId(Long postid);

	 
	 
	
}
