package net.javatatiana.springbootdto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import net.javatatiana.springbootdto.model.Location;
import net.javatatiana.springbootdto.model.User;
import net.javatatiana.springbootdto.repository.LocationRepository;
import net.javatatiana.springbootdto.repository.UserRepository;

@SpringBootApplication
public class SpringbootDtoApplication implements CommandLineRunner {

	

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Location location = new Location();
		location.setPlace("Pune");
		location.setDescription("Pune is great place to live");
		location.setLongitude(40.5);
		location.setLatitude(30.6);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("tatiana");
		user1.setLastName("gomez");
		user1.setEmail("tatiana@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("fernanda");
		user2.setLastName("saldaña");
		user2.setEmail("fer@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);
		
	}

}
