/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reto3.domingo.interfaces;

import org.springframework.data.repository.CrudRepository;
import reto3.domingo.modelo.Categoria;

/**
 *
 * @author Question
 */
public interface InterfaceCategoria extends CrudRepository<Categoria,Integer> {
    
}
