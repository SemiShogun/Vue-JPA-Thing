package jl.corona.controller;

import jl.corona.entity.Continent;
import jl.corona.entity.Infected;
import jl.corona.repository.ContinentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/continent")
public class ContinentController {

    ContinentRepository continentRepository = new ContinentRepository();

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Continent> getAllContinents() {
        return continentRepository.getAllContinent();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createInfected(@RequestBody Continent continent) {
        continentRepository.createContinent(continent);
    }


}
