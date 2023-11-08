package tn.esprit.testspring.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testspring.entities.CoursClassroom;
import tn.esprit.testspring.services.ICoursClassroomService;

/**
 * @author Skander Ben Fredj
 * @created 06-Nov-23
 * @project TestSpring
 */

@RestController
@AllArgsConstructor
@RequestMapping("/coursclasse")
public class CoursClassroomController {
    private final ICoursClassroomService coursClassroomService;

    @PutMapping("/affecter/{codeClasse}")
    public CoursClassroom ajouterCoursClassroom(@RequestBody CoursClassroom cc, @PathVariable Integer codeClasse) {
        return coursClassroomService.ajouterCoursClassroom(cc, codeClasse);
    }

    @DeleteMapping("desaffecter/{idCours}")
    public void desaffecterCoursClassroomClasse(@PathVariable Integer idCours) {

    }
}
