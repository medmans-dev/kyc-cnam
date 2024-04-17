package ws.cnam.kyccnamweb.metier.vo;

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

public class CardPersonVO {

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
	private String option;

	public CardPersonVO() {
		super();
	}
	public CardPersonVO(String nni) {
		super();
		this.personalNumber = nni;
	}
	
}
