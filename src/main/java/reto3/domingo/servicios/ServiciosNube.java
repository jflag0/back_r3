/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3.domingo.servicios;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reto3.domingo.modelo.Nube;
import reto3.domingo.repositorio.RepositorioNube;

/**
 *
 * @author Question
 */
@Service
public class ServiciosNube {
      @Autowired
    private RepositorioNube metodosCrud;
    
    public List<Nube> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Nube> getNube(int idNube){
        return metodosCrud.getNube(idNube);
    }
    
    public Nube save(Nube nube){
        if(nube.getId()==null){
            return metodosCrud.save(nube);
        }else{
            Optional<Nube> evt=metodosCrud.getNube(nube.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(nube);
            }else{
                return nube;
            }
        }
    }
    public Nube update(Nube nube){
        if(nube.getId()!=null){
            Optional<Nube> e=metodosCrud.getNube(nube.getId());
            if(!e.isEmpty()){
                if(nube.getName()!=null){
                    e.get().setName(nube.getName());
                }
                if(nube.getBrand()!=null){
                    e.get().setBrand(nube.getBrand());
                }
                if(nube.getYear()!=null){
                    e.get().setYear(nube.getYear());
                }
                if(nube.getDescription()!=null){
                    e.get().setDescription(nube.getDescription());
                }
                if(nube.getCategory()!=null){
                    e.get().setCategory(nube.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return nube;
            }
        }else{
            return nube;
        }
    }


    public boolean deleteNube(int nubeId) {
        Boolean aBoolean = getNube(nubeId).map(nube -> {
            metodosCrud.delete(nube);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
