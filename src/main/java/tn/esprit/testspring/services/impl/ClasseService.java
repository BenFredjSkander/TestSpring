package tn.esprit.testspring.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testspring.entities.Classe;
import tn.esprit.testspring.repositories.ClasseRepository;
import tn.esprit.testspring.services.IClasseService;

/**
 * @author Skander Ben Fredj
 * @created 06-Nov-23
 * @project TestSpring
 */
@Service
@AllArgsConstructor
public class ClasseService implements IClasseService {
    private final ClasseRepository classeRepository;

    @Override
    public Classe ajouterClasse(Classe c) {
        return classeRepository.save(c);
    }
}
