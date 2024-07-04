package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;






@Controller

public class CarreraController {
    
    @Autowired

    
    // Muestra Carreras
    @GetMapping("/listado")
    public String getCarrreras() {
       
        return "listaDeCarreras";
    }
    
   @GetMapping("/nuevo")
    public String getVistaNuevaCarrera() {
      
       
    return "formCarrera";
    }
    
}
