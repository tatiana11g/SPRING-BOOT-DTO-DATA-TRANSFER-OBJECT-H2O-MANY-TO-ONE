package net.javatatiana.springbootdto.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javatatiana.springbootdto.dto.UserLocationDTO;
import net.javatatiana.springbootdto.model.User;
import net.javatatiana.springbootdto.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public List<UserLocationDTO> getAllUsersLocation(){
        return userRepository.findAll()
        		//convertir la lista en Dto
                .stream()
                //convertEntityToDto almacena toda la informacion
                .map(this::convertEntityToDto)//llamada al metodo pasandolo como map
                .collect(Collectors.toList());//recopilar los datos en una  lista

    }

    //recopila la informacion
   private UserLocationDTO convertEntityToDto(User user){
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        //asignar a los datos de userLocationDTO lo que obtenemos de user
        userLocationDTO.setUserId(user.getId());// de la entidad User
        userLocationDTO.setEmail(user.getEmail());
       userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());//con el dato objeto (Location) se trae datos  de la entidad Location
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
       return userLocationDTO;
   }

    /**
 

    private User convertDtoToEntity(UserLocationDTO userLocationDTO){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        User user = new User();
        user = modelMapper.map(userLocationDTO, User.class);
        return user;
    }
    
    **/
}