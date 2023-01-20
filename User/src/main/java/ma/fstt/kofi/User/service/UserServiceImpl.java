package ma.fstt.kofi.User.service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.kofi.User.entity.User;
import ma.fstt.kofi.User.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService {
	@Autowired UserRepository userRepository;
	@Override
	public List<User> searchByUsername(String username) {
		return userRepository.searchByUsername(username);
	}
	
	 

	@Override
	public User save(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		java.util.Optional<User> userOptional= userRepository.findById(id);
		if(!userOptional.isEmpty()) return userOptional.get();
		return null;
	}
	
	public List<User> getAll(){
		return userRepository.findAll();
	}



	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

}
