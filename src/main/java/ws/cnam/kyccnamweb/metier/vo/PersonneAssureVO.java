package ws.cnam.kyccnamweb.metier.vo;

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
public class PersonneAssureVO {
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
	private String telephone;
	private String sexe;
	private String etat;
	private String statut;
	private String photo;
	private byte[] photoArray;
	private PersonneAssureVO pere;
	private EntiteSanteVO entiteSante;
	private ServiceMedicalVO serviceMedical;
	private LocalDateTime dateEnregistrement;
	private LocalDateTime dateEnvoi;

	public PersonneAssureVO() {
		super();
	}
	public PersonneAssureVO(String nni) {
		super();
		this.nni = nni;
	}
	
}
