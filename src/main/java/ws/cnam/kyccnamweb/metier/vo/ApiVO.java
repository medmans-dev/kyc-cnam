package ws.cnam.kyccnamweb.metier.vo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ApiVO {
	private String statut;
	private String message = "Aucune valeur trouvée. Veuillez réessayer";
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
	private String photo;
	private String entiteSante;
	private String  serviceMedical;
	private LocalDateTime dateEnregistrement;
	private LocalDateTime dateEnvoi;

}
