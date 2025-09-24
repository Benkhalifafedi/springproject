package tn.esprit.twin.projetspringclasse.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChainRestauration;

    private String libelle;
    private LocalDate dateCreation;

    @OneToMany(mappedBy = "chaineRestauration", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Restaurant> restaurants;

    public Long getIdChainRestauration() {
        return idChainRestauration;
    }

    public void setIdChainRestauration(Long idChainRestauration) {
        this.idChainRestauration = idChainRestauration;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
