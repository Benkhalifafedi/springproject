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

    @ManyToOne
    @JoinColumn(name = "idRestaurant")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<Commande> commandes;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<Composant> composants;

    public Long getIdMenu() { return idMenu; }
    public void setIdMenu(Long idMenu) { this.idMenu = idMenu; }

    public String getLibelleMenu() { return libelleMenu; }
    public void setLibelleMenu(String libelleMenu) { this.libelleMenu = libelleMenu; }

    public TypeMenu getTypeMenu() { return typeMenu; }
    public void setTypeMenu(TypeMenu typeMenu) { this.typeMenu = typeMenu; }

    public Float getPrixTotal() { return prixTotal; }
    public void setPrixTotal(Float prixTotal) { this.prixTotal = prixTotal; }

    public Restaurant getRestaurant() { return restaurant; }
    public void setRestaurant(Restaurant restaurant) { this.restaurant = restaurant; }

    public List<Commande> getCommandes() { return commandes; }
    public void setCommandes(List<Commande> commandes) { this.commandes = commandes; }

    public List<Composant> getComposants() { return composants; }
    public void setComposants(List<Composant> composants) { this.composants = composants; }
}
