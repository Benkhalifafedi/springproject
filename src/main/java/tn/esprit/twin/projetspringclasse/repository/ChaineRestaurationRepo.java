package tn.esprit.twin.projetspringclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.twin.projetspringclasse.models.ChaineRestauration;

public interface ChaineRestaurationRepo extends JpaRepository<ChaineRestauration, Long> {
}
