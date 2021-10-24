/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto_3.servicio;

import Reto_3.modelo.Admin;
import Reto_3.repositorio.RepositorioAdmin;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Edwar
 */
@Service
public class ServiciosAdmin {
    @Autowired
    private RepositorioAdmin repositoryAdmin;
 
    public List<Admin> getAll(){
       return repositoryAdmin.getAll();
    }
    
    public Admin save(Admin admin) {
        if (admin.getIdAdmin() == null) {
            return repositoryAdmin.save(admin);
        } else {
            Optional<Admin> admin1 = repositoryAdmin.getAdmin(admin.getIdAdmin());
            if (admin1.isEmpty()) {
                return repositoryAdmin.save(admin);
            } else {
                return admin;
            }
        }
    }
}
