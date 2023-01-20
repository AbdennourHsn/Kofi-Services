package ma.fstt.kofi.User.entity;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="username",nullable=false,unique = true)
	private String username;
	
	
	@Column(name="password",nullable=false)
	private String password;
	
	@Column(name="token",nullable=true)
	private String token;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="nom",nullable=false)
	private String nom;
	
	@Column(name="prenom",nullable=false)
	private String prenom;
	
	@Column(name="email",nullable=false,unique = true)
	private String email;
	
	
	
	@Column(name="categorieid",nullable=false)
	private Long categorieid;
	
	@Column(name="typeCompte",nullable=false)
	private String typeCompte;
	
	@Column(name="telephone",nullable=true,unique = true)
	private String telephone;
	
	
	@Column(name="cover_url",nullable=true)
	private String coverUrl;
	
	@Column(name="profile_url",nullable=true)
	private String profileUrl;
	
	@Column(name="about",nullable=true)
	private String about;
	
	@Column(name="fb_url",nullable=true)
	private String fbUrl;
	
	@Column(name="youtube_url",nullable=true)
	private String youtubeUrl;
	
	@Column(name="twiter_url",nullable=true)
	private String twiterUrl;
	
	public User(String username,
				String password,
				String nom,
				String prenom,
				String email,
				String typeCompte,
				Long categorieid
			   ) {
		this.username=username;
		this.password=password;
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
		this.typeCompte=typeCompte;
		this.categorieid=categorieid;
	}
	public User(String username,String password) {
		this.username=username;
		this.password=password;
	}
	
	public User(String toke) {
		this.token=token;
	}
	public User() {}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getEmail() {
		return email;
	}

	public Long getCategorieid() {
		return categorieid;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getCoverUrl() {
		return coverUrl;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public String getAbout() {
		return about;
	}

	public String getFbUrl() {
		return fbUrl;
	}

	public String getYoutubeUrl() {
		return youtubeUrl;
	}

	public String getTwiterUrl() {
		return twiterUrl;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCategorieid(Long categorieid) {
		this.categorieid = categorieid;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public void setFbUrl(String fbUrl) {
		this.fbUrl = fbUrl;
	}

	public void setYoutubeUrl(String youtubeUrl) {
		this.youtubeUrl = youtubeUrl;
	}

	public void setTwiterUrl(String twiterUrl) {
		this.twiterUrl = twiterUrl;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	
	
	
	
	
	
	
}
