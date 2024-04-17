package ws.cnam.kyccnamweb.metier.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Entity(name="CARD_PERSON")
public class CardPerson {

	@Id
	@EqualsAndHashCode.Include
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

	public CardPerson() {
		super();
	}
	public CardPerson(String nni) {
		super();
		this.personalNumber = nni;
	}
	
}
