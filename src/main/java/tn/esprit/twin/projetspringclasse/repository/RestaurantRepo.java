package tn.esprit.twin.projetspringclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.twin.projetspringclasse.models.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {
}
