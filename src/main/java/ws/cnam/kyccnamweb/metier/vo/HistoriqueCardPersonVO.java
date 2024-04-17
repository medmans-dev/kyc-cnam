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
public class HistoriqueCardPersonVO {

	@EqualsAndHashCode.Include
	private Long id;
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
	private LocalDateTime entryDate;

	public HistoriqueCardPersonVO() {
		super();
	}

	
}
