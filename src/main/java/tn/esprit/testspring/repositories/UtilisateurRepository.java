package tn.esprit.testspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.testspring.entities.Niveau;
import tn.esprit.testspring.entities.Utilisateur;

import java.util.List;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    @Query("select count(u) from Utilisateur u where u.classe.niveau = ?1")
    int countByClasse_Niveau(Niveau niveau);


    @Query("select u from Utilisateur u where u.classe.niveau =: niv")
//    @Query(value = "select * from utilisateur u inner join classe c on u.classe_code_classe=c.code_classe where c.niveau =: niveau", nativeQuery = true)
    List<Utilisateur> retrieveListByNiveau(@Param(value = "niv") Niveau niveau);

    List<Utilisateur> findByClasseNiveau(Niveau classe_niveau);

    int countByClasseNiveau(Niveau classe_niveau);


}