package wsb.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import wsb.rest.models.BaritoneArias;
import wsb.rest.repositories.BaritoneAriasRepository;
import wsb.rest.services.BaritoneAriasServices;

import java.util.List;

@RestController
public class BaritoneAriasController {

    final private BaritoneAriasServices baritoneAriasServices;

    public BaritoneAriasController(BaritoneAriasServices baritoneAriasServices) {
        this.baritoneAriasServices = baritoneAriasServices;
    }

    @GetMapping("/arias")
    List<BaritoneArias> findAll() {
        return baritoneAriasServices.findAll();
    }
    @GetMapping("/arias/{id}")
    ResponseEntity findAria(@PathVariable Long id){
        BaritoneArias baritoneArias = baritoneAriasServices.find(id);
        if (baritoneArias != null){
            return ResponseEntity.ok(baritoneArias);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


}
