package tn.esprit.twin.projetspringclasse.services.Restaurant;

import tn.esprit.twin.projetspringclasse.models.Restaurant;
import java.util.List;

public interface IrestS {

    List<Restaurant> retrieveAllRestaurants();

    Restaurant addRestaurant(Restaurant restaurant);

    List<Restaurant> addRestaurants(List<Restaurant> restaurants);

    Restaurant updateRestaurant(Restaurant restaurant);

    Restaurant retrieveRestaurant(Long id);

    void deleteRestaurant(Long id);
}
