package tn.esprit.testspring.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testspring.entities.Classe;
import tn.esprit.testspring.entities.Niveau;
import tn.esprit.testspring.entities.Utilisateur;
import tn.esprit.testspring.repositories.ClasseRepository;
import tn.esprit.testspring.repositories.UtilisateurRepository;
import tn.esprit.testspring.services.IUtilisateurService;

/**
 * @author Skander Ben Fredj
 * @created 06-Nov-23
 * @project TestSpring
 */

@Service
@AllArgsConstructor
public class UtilisateurService implements IUtilisateurService {

    private final UtilisateurRepository utilisateurRepository;
    private final ClasseRepository classeRepository;

    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void affecterUtilisateurClasse(Integer idUtilisateur, Integer codeClasse) {
        Utilisateur user = utilisateurRepository.findById(idUtilisateur).orElseThrow(RuntimeException::new);
        Classe classe = classeRepository.findById(codeClasse).orElseThrow(RuntimeException::new);

        user.setClasse(classe);
        utilisateurRepository.save(user);
    }

    @Override
    public Integer nbUtilisateursParNiveau(Niveau nv) {
//        return utilisateurRepository.countByClasse_Niveau(nv);
        return utilisateurRepository.findByClasseNiveau(nv).size();
    }

}
