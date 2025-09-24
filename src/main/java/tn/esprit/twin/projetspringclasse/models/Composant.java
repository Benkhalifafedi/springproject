package tn.esprit.twin.projetspringclasse.models;


import jakarta.persistence.*;

import java.util.List;

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

    @OneToMany(mappedBy = "composant")
    private List<DetailComposant> details;


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
}
