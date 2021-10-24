/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto_3.controlador;

import Reto_3.modelo.Admin;
import Reto_3.servicio.ServiciosAdmin;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Edwar
 */

@RestController
@RequestMapping("/api/Admin")
@CrossOrigin("*")
public class ControladorAdmin {
    @Autowired
    private ServiciosAdmin serviciosAdmin;
    
    @GetMapping("/all")
    public List<Admin> getAll(){
        return serviciosAdmin.getAll();
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Admin save(@RequestBody Admin category){
        return serviciosAdmin.save(category);
    }
}
