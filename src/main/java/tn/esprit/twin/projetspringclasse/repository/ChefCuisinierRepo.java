package tn.esprit.twin.projetspringclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.twin.projetspringclasse.models.ChefCuisinier;

public interface ChefCuisinierRepo extends JpaRepository<ChefCuisinier,Long> {
}
