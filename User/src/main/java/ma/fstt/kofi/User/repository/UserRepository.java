package ma.fstt.kofi.User.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import ma.fstt.kofi.User.entity.User;



public interface UserRepository extends JpaRepository<User,Long>{
	@Modifying
	@Query("Select u From User u where u.username like ?1% ")
	public List<User> searchByUsername(String name);
	
	public User findByUsername(String username);

}
