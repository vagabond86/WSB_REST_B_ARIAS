package wsb.rest.services;

import org.springframework.stereotype.Service;
import wsb.rest.models.Aria;
import wsb.rest.repositories.AriaRepository;

import java.util.List;

@Service
public class AriaService {

    final private AriaRepository ariaRepository;

    public AriaService(AriaRepository ariaRepository) {
        this.ariaRepository = ariaRepository;
    }

    public List<Aria> findAll() {
        return ariaRepository.findAll();
    }

    public Aria find(Long id) {
        return ariaRepository.find(id);
    }

    public Aria create(Aria arias) {
        return ariaRepository.create(arias);
    }

    public Aria update(Long id, Aria aria) {
        return ariaRepository.update(id, aria);
    }

    public void delete(Long id) {
        ariaRepository.delete(id);
    }
}
