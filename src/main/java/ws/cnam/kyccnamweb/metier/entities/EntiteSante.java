package ws.cnam.kyccnamweb.metier.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 
 * @author Med.Mansour
 *
 */
@Getter
@Setter
@Entity
public class EntiteSante implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 6997562731395812952L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;

}
