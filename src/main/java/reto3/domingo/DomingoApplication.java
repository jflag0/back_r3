//Categoria, Mensaje, Reservacion, cliente, nube
//1.Modelo o entidad
//2.Interfaces
//3.Repositorio
//4.Servicios
//5.Controlador o web




package reto3.domingo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"reto3.domingo.modelo"})
public class DomingoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomingoApplication.class, args);
	}

}
