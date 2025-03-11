package com.example.Project_Web_Spring.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.Project_Web_Spring.entity.User;
import com.example.Project_Web_Spring.repository.UserRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    UserRepository userRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // Verificando se a lista de usuários está vazia
        List<User> users = userRepository.findAll();

        if (users.isEmpty()) {
            createdUser("Ryan", "RyanHideoOugaske@gmail.com");
            createdUser("Kleber", "JoaoKleber@gmail.com");
            createdUser("Maria", "MariaMaria@gmail.com");
        }

        //pegar o resgistro kleber
        //User user = userRepository.getOne(2L);
        //
        //deletar um usuario
        //userRepository.deleteById(2L);
        //
        //alterar um registro
        //User user = userRepository.getOne(1L);
        //user.setName("Ryan Hideo");
        //userRepository.save(user);
    }

    public void createdUser(String name, String email) {
        User user = new User(name, email);

        userRepository.save(user);
    }
}
