package tn.esprit.testspring.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testspring.entities.Niveau;
import tn.esprit.testspring.entities.Utilisateur;
import tn.esprit.testspring.services.IUtilisateurService;

/**
 * @author Skander Ben Fredj
 * @created 06-Nov-23
 * @project TestSpring
 */

@RestController
@AllArgsConstructor
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    private final IUtilisateurService utilisateurService;


    @PostMapping
    public Utilisateur ajouterUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.ajouterUtilisateur(utilisateur);
    }

    @PutMapping("/affecter/{idUtilisateur}/{codeClasse}")
    public void affecterUtilisateurClasse(@PathVariable Integer idUtilisateur, @PathVariable Integer codeClasse) {
        utilisateurService.affecterUtilisateurClasse(idUtilisateur, codeClasse);
    }

    @GetMapping("/count/{niveau}")
    public int countNiveau(@PathVariable String niveau) {
        return utilisateurService.nbUtilisateursParNiveau(Niveau.valueOf(niveau));
    }

}
