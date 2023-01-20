package ma.fstt.kofi.Interaction.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "liks")
public class Like {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column (name = "user_id", nullable = false)
    private Long userId;
	
	@Column (name = "follow", nullable = false)
    private Long follow;
	
	@Column (name = "post_id", nullable = false)
    private Long postId;
	
	public Like() {
		
	}
	public Like(Long user_id,Long follow,Long post_id) {
		this.follow=follow;
		this.postId=post_id;
		this.userId=user_id;
	}

	public Long getId() {
		return id;
	}

	public Long getUser_id() {
		return userId;
	}

	public Long getFollow() {
		return follow;
	}

	public Long getPost_id() {
		return postId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUser_id(Long user_id) {
		this.userId = user_id;
	}

	public void setFollow(Long follow) {
		this.follow = follow;
	}

	public void setPost_id(Long post_id) {
		this.postId = post_id;
	}
}
