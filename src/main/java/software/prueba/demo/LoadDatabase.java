package software.prueba.demo;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Juan Perez", "administrador")));
            log.info("Preloading " + repository.save(new Employee("Pepe Rayuela", "secretario")));
        };
    }
}