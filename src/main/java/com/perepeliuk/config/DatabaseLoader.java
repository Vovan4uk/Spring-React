package com.perepeliuk.config;

import com.perepeliuk.entity.User;
import com.perepeliuk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final UserRepository repository;

    @Autowired
    public DatabaseLoader(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new User("Volodymyr Perepeliuk", 30, "vovan4uk", "volodymyr.perepeliuk@gmail.com"));
        this.repository.save(new User("Oleg Dirygin", 35, "olegin", "o.derygin@gmail.com"));
        this.repository.save(new User("Maxym Savka", 22, "savmax", "maxym.savka@gmail.com"));
        this.repository.save(new User("Lidia Miroshnychenko", 28, "mira", "miroshnychenko@gmail.com"));
        this.repository.save(new User("Pavlo Prodav", 29, "versache", "pro.ver@gmail.com"));
    }
}