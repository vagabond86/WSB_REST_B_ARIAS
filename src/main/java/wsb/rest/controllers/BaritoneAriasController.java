package wsb.rest.controllers;

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
    BaritoneArias findAria(@PathVariable Long id){
        return baritoneAriasServices.find(id);
    }


}
