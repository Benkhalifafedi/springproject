package tn.esprit.twin.projetspringclasse.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "clients")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String identifiant;

    @Temporal(TemporalType.DATE)
    private Date datePremiereVisite;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes = new ArrayList<>();
}
