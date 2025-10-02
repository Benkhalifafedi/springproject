package tn.esprit.twin.projetspringclasse.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;

    private String nom;

    private Long nbPlacesMax;

    @ManyToOne
    @JoinColumn(name = "idChainRestauration")
    private ChaineRestauration chaineRestauration;

    @ManyToMany(mappedBy = "restaurants")
    private List<Menu> menus;

    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getNbPlacesMax() {
        return nbPlacesMax;
    }

    public void setNbPlacesMax(Long nbPlacesMax) {
        this.nbPlacesMax = nbPlacesMax;
    }

    public ChaineRestauration getChaineRestauration() {
        return chaineRestauration;
    }

    public void setChaineRestauration(ChaineRestauration chaineRestauration) {
        this.chaineRestauration = chaineRestauration;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}