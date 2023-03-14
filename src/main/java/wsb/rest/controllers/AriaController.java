package wsb.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wsb.rest.models.Aria;
import wsb.rest.services.AriaServices;

import java.util.List;

@RestController
public class AriaController {

    final private AriaServices ariaServices;

    public AriaController(AriaServices ariaServices) {
        this.ariaServices = ariaServices;
    }

    @GetMapping("/arias")
    List<Aria> findAll() {
        return ariaServices.findAll();
    }

    @GetMapping("/arias/{id}")
    ResponseEntity findAria(@PathVariable Long id) {
        Aria aria = ariaServices.find(id);
        if (aria != null) {
            return ResponseEntity.ok(aria);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/arias")
    ResponseEntity<Aria> create(@RequestBody Aria aria) {
        Aria createdAria = ariaServices.create(aria);
        if (createdAria != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdAria);
        } else {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
        }
    }


}
