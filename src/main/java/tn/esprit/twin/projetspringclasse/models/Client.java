package tn.esprit.twin.projetspringclasse.models;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "clients")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Client {
    @Id
    private long id;
    private String idantifiant ;
    private LocalDate  datePremiereVisite;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
