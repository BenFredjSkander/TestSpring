package tn.esprit.testspring.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testspring.entities.Classe;
import tn.esprit.testspring.entities.CoursClassroom;
import tn.esprit.testspring.repositories.ClasseRepository;
import tn.esprit.testspring.repositories.CoursClassroomRepository;
import tn.esprit.testspring.services.ICoursClassroomService;

/**
 * @author Skander Ben Fredj
 * @created 06-Nov-23
 * @project TestSpring
 */
@Service
@AllArgsConstructor
public class CoursClassroomService implements ICoursClassroomService {

    private final CoursClassroomRepository coursClassroomRepository;
    private final ClasseRepository classeRepository;

    @Override
    public CoursClassroom ajouterCoursClassroom(CoursClassroom cc, Integer codeClasse) {
        Classe classe = classeRepository.findById(codeClasse).orElseThrow(() -> new RuntimeException("classe not found"));
        cc.setClasse(classe);

        return coursClassroomRepository.save(cc);
    }

    @Override
    public void desaffecterCoursClassroomClasse(Integer idCours) {

    }
}
