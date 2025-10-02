// Composant.java
package tn.esprit.twin.projetspringclasse.models;

import jakarta.persistence.*;

@Entity
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;

    private String nomComposant;
    private Float prix;

    @ManyToOne
    @JoinColumn(name = "idMenu")
    private Menu menu;

    @OneToOne
    @JoinColumn(name = "idDetailComposant")
    private DetailComposant detailComposant;

    public Long getIdComposant() {
        return idComposant;
    }

    public void setIdComposant(Long idComposant) {
        this.idComposant = idComposant;
    }

    public String getNomComposant() {
        return nomComposant;
    }

    public void setNomComposant(String nomComposant) {
        this.nomComposant = nomComposant;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public DetailComposant getDetailComposant() {
        return detailComposant;
    }

    public void setDetailComposant(DetailComposant detailComposant) {
        this.detailComposant = detailComposant;
    }
}