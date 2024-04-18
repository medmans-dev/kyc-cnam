package ws.cnam.kyccnamweb.metier.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


/**
 * @author Med.Mansour.GUEYE
 *
 */
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name="PERSONNE")
public class PersonneAssure {
	
	@Id
	@EqualsAndHashCode.Include
	private String nni;
	private String nom;
	private String prenom;
	private String perePrenom;
	private String nomAr;
	private String prenomAr;
	private String perePrenomAr;
	private String dateNaissance;
	private String lieuNaissance;
	private String matriculeCnam;
	@ManyToOne
	private EntiteSante entiteSante;
	@ManyToOne
	private ServiceMedical serviceMedical;
	private String telephone;
	private String sexe;
	private String etat;
	private String statut;
	private String photo;
	private byte[] photoArray;
	@ManyToOne
	private PersonneAssure pere;
	private LocalDateTime dateEnregistrement;
	private LocalDateTime dateEnvoi;
	
	
	public PersonneAssure() {
		super();
	}
	public PersonneAssure(String nni) {
		super();
		this.nni = nni;
	}
	
}
