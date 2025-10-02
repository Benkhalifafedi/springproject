package tn.esprit.twin.projetspringclasse.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;

    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    private Float prixTotal;

    @ManyToMany
    @JoinTable(
            name = "restaurant_menu",
            joinColumns = @JoinColumn(name = "idMenu"),
            inverseJoinColumns = @JoinColumn(name = "idRestaurant")
    )
    private List<Restaurant> restaurants;

    @ManyToMany(mappedBy = "menus")
    private List<ChefCuisinier> chefsCuisiniers;

    @OneToMany(mappedBy = "menu")
    private List<Commande> commandes;

    @OneToMany(mappedBy = "menu")
    private List<Composant> composants;

    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public String getLibelleMenu() {
        return libelleMenu;
    }

    public void setLibelleMenu(String libelleMenu) {
        this.libelleMenu = libelleMenu;
    }

    public TypeMenu getTypeMenu() {
        return typeMenu;
    }

    public void setTypeMenu(TypeMenu typeMenu) {
        this.typeMenu = typeMenu;
    }

    public Float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(Float prixTotal) {
        this.prixTotal = prixTotal;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public List<ChefCuisinier> getChefsCuisiniers() {
        return chefsCuisiniers;
    }

    public void setChefsCuisiniers(List<ChefCuisinier> chefsCuisiniers) {
        this.chefsCuisiniers = chefsCuisiniers;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }


}