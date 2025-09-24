package tn.esprit.twin.projetspringclasse.models;

import jakarta.persistence.*;

@Entity
public class ChefCuisinier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idChefCuisinier;

    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;

    @ManyToOne
    @JoinColumn(name = "idMenu")
    private Menu menu;



    public Long getIdChefCuisinier() {
        return idChefCuisinier;
    }

    public void setIdChefCuisinier(Long idChefCuisinier) {
        this.idChefCuisinier = idChefCuisinier;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public TypeChef getTypeChef() {
        return typeChef;
    }

    public void setTypeChef(TypeChef typeChef) {
        this.typeChef = typeChef;
    }
}
