package ws.cnam.kyccnamweb.metier.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * @author Med.Mansour.GUEYE
 *
 */
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name="HISTORIQUE_CARD_PERSON")
public class HistoriqueCardPerson {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@EqualsAndHashCode.Include
	private Long id;
	@Column(length = 10)
	private String personalNumber;
	private String cardNumber;
	private LocalDateTime datetime;
	private String firstName;
	private String fatherFirstName;
	private String lastName;
	private String sex;
	private LocalDate dateOfBirth;
	private String placeOfBirth;
	private LocalDate expiryDate;
	@Column(name = "card_option")
	private String option;
	private LocalDateTime entryDate;

	public HistoriqueCardPerson() {
		super();
	}

	
}
