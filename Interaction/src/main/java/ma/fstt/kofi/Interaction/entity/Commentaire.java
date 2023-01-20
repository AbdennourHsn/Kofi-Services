package ma.fstt.kofi.Interaction.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "commentaire")
public class Commentaire {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column (name = "post_id", nullable = false)
    private Long postId;
	
	@Column (name = "user_id", nullable = false)
    private Long userId;
	
	@Column (name = "comment", nullable = false)
    private String comment;
	
	public Commentaire(String comment,Long postId) {
		this.comment=comment;
		this.postId=postId;
	}
	
	public Long getId() {
		return id;
	}

	public Long getPostId() {
		return postId;
	}

	public Long getUserId() {
		return userId;
	}

	public String getComment() {
		return comment;
	}

	public java.sql.Date getCreateOn() {
		return createOn;
	}

	public java.sql.Timestamp getUpdateOn() {
		return updateOn;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setCreateOn(java.sql.Date createOn) {
		this.createOn = createOn;
	}

	public void setUpdateOn(java.sql.Timestamp updateOn) {
		this.updateOn = updateOn;
	}

	@Column(name = "create_on")
	private java.sql.Date createOn;
	         
	@Column(name = "update_on")
	private java.sql.Timestamp updateOn;
	
	public Commentaire() {}
	
}
