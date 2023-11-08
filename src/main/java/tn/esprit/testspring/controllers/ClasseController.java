package tn.esprit.testspring.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.testspring.entities.Classe;
import tn.esprit.testspring.services.IClasseService;

/**
 * @author Skander Ben Fredj
 * @created 06-Nov-23
 * @project TestSpring
 */

@RestController
@AllArgsConstructor
@RequestMapping("/classe")
public class ClasseController {

    private final IClasseService classeService;

    @PostMapping
    public Classe ajouterClasse(@RequestBody Classe c) {
        return classeService.ajouterClasse(c);
    }
}
