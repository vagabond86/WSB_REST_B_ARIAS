package wsb.rest.services;

import org.springframework.stereotype.Service;
import wsb.rest.models.BaritoneArias;
import wsb.rest.repositories.BaritoneAriasRepository;

import java.util.List;

@Service
public class BaritoneAriasServices {

    final private BaritoneAriasRepository baritoneAriasRepository;

    public BaritoneAriasServices(BaritoneAriasRepository baritoneAriasRepository) {
        this.baritoneAriasRepository = baritoneAriasRepository;
    }

    public List<BaritoneArias> findAll(){
        return baritoneAriasRepository.findAll();
    }
}
