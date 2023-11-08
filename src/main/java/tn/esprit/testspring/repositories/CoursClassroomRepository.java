package tn.esprit.testspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testspring.entities.CoursClassroom;

public interface CoursClassroomRepository extends JpaRepository<CoursClassroom, Integer> {
}