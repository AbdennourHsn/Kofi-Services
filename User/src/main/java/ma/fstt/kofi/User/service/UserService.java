package ma.fstt.kofi.User.service;

import java.util.List;

import ma.fstt.kofi.User.entity.User;


public interface UserService {
	
	public List<User> searchByUsername(String username);
	public User save(User user);
	public User findById(Long id);
	public User findByUsername(String username);
	public List<User> getAll();
	
}
