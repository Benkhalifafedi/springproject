package tn.esprit.twin.projetspringclasse.services.Rest;

import org.springframework.stereotype.Service;
import tn.esprit.twin.projetspringclasse.models.Restaurant;
import tn.esprit.twin.projetspringclasse.repository.RestaurantRepo;
import tn.esprit.twin.projetspringclasse.services.Restaurant.IrestS;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantSer implements IrestS {

    private final RestaurantRepo restaurantRepo;

    public RestaurantSer(RestaurantRepo restaurantRepo) {
        this.restaurantRepo = restaurantRepo;
    }

    @Override
    public List<Restaurant> retrieveAllRestaurants() {
        return restaurantRepo.findAll();
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    @Override
    public List<Restaurant> addRestaurants(List<Restaurant> restaurants) {
        List<Restaurant> saved = new ArrayList<>();
        for (Restaurant r : restaurants) {
            saved.add(restaurantRepo.save(r));
        }
        return saved;
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    @Override
    public Restaurant retrieveRestaurant(Long id) {
        return restaurantRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteRestaurant(Long id) {
        restaurantRepo.deleteById(id);
    }
}
