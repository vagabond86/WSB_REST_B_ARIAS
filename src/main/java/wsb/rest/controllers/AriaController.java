package wsb.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wsb.rest.models.Aria;
import wsb.rest.services.AriaService;

import java.util.List;

@RestController
@RequestMapping("/arias")
public class AriaController {

    final private AriaService ariaService;

    public AriaController(AriaService ariaService) {
        this.ariaService = ariaService;
    }

    @GetMapping
    List<Aria> findAll() {
        return ariaService.findAll();
    }

    @GetMapping("/{id}")
    ResponseEntity findAria(@PathVariable Long id) {
        Aria aria = ariaService.find(id);
        if (aria != null) {
            return ResponseEntity.ok(aria);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    ResponseEntity<Aria> create(@RequestBody Aria aria) {
        Aria createdAria = ariaService.create(aria);
        if (createdAria != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdAria);
        } else {
            return ResponseEntity.unprocessableEntity().build();
        }
    }

    @PutMapping("/{id}")
    ResponseEntity<Aria> update(@PathVariable Long id, @RequestBody Aria aria) {
        Aria updatedAria = ariaService.update(id, aria);
        if (updatedAria != null) {
            return ResponseEntity.ok(updatedAria);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        ariaService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
