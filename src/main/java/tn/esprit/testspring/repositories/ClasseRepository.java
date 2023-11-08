package tn.esprit.testspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testspring.entities.Classe;

public interface ClasseRepository extends JpaRepository<Classe, Integer> {


}