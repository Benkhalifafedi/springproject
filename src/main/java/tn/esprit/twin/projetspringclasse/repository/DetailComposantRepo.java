package tn.esprit.twin.projetspringclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.twin.projetspringclasse.models.DetailComposant;

public interface DetailComposantRepo extends JpaRepository<DetailComposant, Long> {
}
