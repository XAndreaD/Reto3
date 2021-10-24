/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto_3.crud;

import Reto_3.modelo.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Edwar
 */
public interface InterfaceCategoria extends CrudRepository<Categoria,Integer>{
    
}
