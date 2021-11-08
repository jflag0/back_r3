/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3.domingo.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reto3.domingo.interfaces.InterfaceNube;
import reto3.domingo.modelo.Nube;

/**
 *
 * @author Question
 */
@Repository
public class RepositorioNube {
     @Autowired
    private InterfaceNube crud;
    

    public List<Nube> getAll(){
        return (List<Nube>) crud.findAll();       
    }
    
    public Optional <Nube> getNube(int id){
        return crud.findById(id);
    }
    
    public Nube save(Nube nube){
        return crud.save(nube);
    }
      public void delete(Nube nube){
        crud.delete(nube);
    }
    
        
}
