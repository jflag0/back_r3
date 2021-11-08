/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3.domingo.web;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reto3.domingo.modelo.Nube;
import reto3.domingo.servicios.ServiciosNube;

/**
 *
 * @author Question
 */
@RestController
@RequestMapping("/api/Cloud")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class WebNube {
     @GetMapping("/holaMundo")
    public String saludad(){
    return "Hola Mundo Tutoria";
    }

    
    @Autowired
    private ServiciosNube servicio;
    @GetMapping("all")
    public List <Nube> getNube(){
        return servicio.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Nube> getNube(@PathVariable("id") int idNube) {
        return servicio.getNube(idNube);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Nube save(@RequestBody Nube nube) {
        return servicio.save(nube);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Nube update(@RequestBody Nube nube) {
        return servicio.update(nube);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int nubeId) {
        return servicio.deleteNube(nubeId);
    }
}
