package ws.cnam.kyccnamweb.metier.vo;

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
public class EntiteSanteVO implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 6997562731395812952L;

	private Long id;
	private String nom;

}
