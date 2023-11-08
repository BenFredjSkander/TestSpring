package tn.esprit.testspring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cours_classroom")
public class CoursClassroom {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCours;

    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    private String nom;

    private Integer nbHeures;

    private Boolean archive;

    @ManyToOne
    private Classe classe;

}