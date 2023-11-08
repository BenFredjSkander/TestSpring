package tn.esprit.testspring.services;

import tn.esprit.testspring.entities.CoursClassroom;

/**
 * @author Skander Ben Fredj
 * @created 06-Nov-23
 * @project TestSpring
 */

public interface ICoursClassroomService {

    CoursClassroom ajouterCoursClassroom(CoursClassroom cc, Integer codeClasse);

    void desaffecterCoursClassroomClasse(Integer idCours);
}
