package tn.esprit.testspring.services;

import tn.esprit.testspring.entities.Niveau;
import tn.esprit.testspring.entities.Utilisateur;

/**
 * @author Skander Ben Fredj
 * @created 06-Nov-23
 * @project TestSpring
 */

public interface IUtilisateurService {
    Utilisateur ajouterUtilisateur(Utilisateur utilisateur);

    void affecterUtilisateurClasse(Integer idUtilisateur, Integer codeClasse);

    Integer nbUtilisateursParNiveau(Niveau nv);
}
