package tn.esprit.twin.projetspringclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.twin.projetspringclasse.models.Menu;

public interface MenuRepo extends JpaRepository<Menu, Long> {
}
