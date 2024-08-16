package tn.esprit.tpfoyer17.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;

    private String nomEt;

    private String prenomEt;

    private long cin;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    private String ecole;

    @ToString.Exclude
    @ManyToMany(mappedBy = "etudiants")
    Set<Reservation> reservations;

}
