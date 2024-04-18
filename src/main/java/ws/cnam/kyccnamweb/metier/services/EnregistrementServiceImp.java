package ws.cnam.kyccnamweb.metier.services;

import jakarta.servlet.ServletContext;
import jakarta.transaction.Transactional;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ws.cnam.kyccnamweb.metier.dao.CardPersonRepository;
import ws.cnam.kyccnamweb.metier.dao.HistoriqueCardPersonRepository;
import ws.cnam.kyccnamweb.metier.dao.PersonneRepository;
import ws.cnam.kyccnamweb.metier.entities.CardPerson;
import ws.cnam.kyccnamweb.metier.entities.HistoriqueCardPerson;
import ws.cnam.kyccnamweb.metier.entities.PersonneAssure;
import ws.cnam.kyccnamweb.metier.vo.CardPersonVO;
import ws.cnam.kyccnamweb.metier.vo.PersonneAssureVO;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;

/**
 * 
 * @author Med.Mansour.GUEYE
 *
 */
@Service
public class EnregistrementServiceImp implements EnregistrementService {

	@Autowired
	private PersonneRepository personneRepository;
	@Autowired
	ServletContext context;
	@Autowired
	CardPersonRepository cardPersonRepository;
	@Autowired
	HistoriqueCardPersonRepository historiqueCardPersonRepository;


	@Override
	public String saveImageToStorage(String uploadDirectory, MultipartFile imageFile) {
		try{
			String uniqueFileName = imageFile.getOriginalFilename();

			Path uploadPath = Paths.get(uploadDirectory);
			Path filePath = uploadPath.resolve(uniqueFileName);

			if (!Files.exists(uploadPath)) {
				Files.createDirectories(uploadPath);
			}

			Files.copy(imageFile.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

			return uniqueFileName;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public byte[] getImage(String imageDirectory, String imageName) {
		try {
			Path imagePath = Paths.get(imageDirectory, imageName);

			if (Files.exists(imagePath)) {
				byte[] imageBytes = Files.readAllBytes(imagePath);
				return imageBytes;
			} else {
				return null; // Handle missing images
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PersonneAssureVO getPersonneByNni(String nni) {
		try {
			PersonneAssureVO personneAssureVO = null;
			PersonneAssure personneAssure = this.personneRepository.findByNni(nni);
			if(personneAssure ==null)
				return null;
			personneAssureVO = new DozerBeanMapper().map(personneAssure, PersonneAssureVO.class);

			return personneAssureVO;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	@Override
	public CardPersonVO saveCardPerson(CardPersonVO vo) {
		try{
			CardPerson cardPerson = new CardPerson();
			cardPerson.setCardNumber(vo.getCardNumber());
			cardPerson.setDatetime(vo.getDatetime());
			cardPerson.setExpiryDate(vo.getExpiryDate());
			cardPerson.setPersonalNumber(vo.getPersonalNumber());
			cardPerson.setOption(vo.getOption());
			cardPerson.setSex(vo.getSex());
			cardPerson.setFirstName(vo.getFirstName());
			cardPerson.setLastName(vo.getLastName());
			cardPerson.setDateOfBirth(vo.getDateOfBirth());
			cardPerson.setFatherFirstName(vo.getFatherFirstName());
			cardPerson.setPlaceOfBirth(vo.getPlaceOfBirth());

			cardPerson = this.cardPersonRepository.save(cardPerson);

			HistoriqueCardPerson histo = new HistoriqueCardPerson();
			setHistoriqueCard(histo,cardPerson);
			this.historiqueCardPersonRepository.save(histo);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	private void setHistoriqueCard(HistoriqueCardPerson histo, CardPerson card) {
		histo.setCardNumber(card.getCardNumber());
		histo.setDatetime(card.getDatetime());
		histo.setDateOfBirth(card.getDateOfBirth());
		histo.setEntryDate(LocalDateTime.now());
		histo.setExpiryDate(card.getExpiryDate());
		histo.setFirstName(card.getFirstName());
		histo.setOption(card.getOption());
		histo.setLastName(card.getLastName());
		histo.setFatherFirstName(card.getFatherFirstName());
		histo.setSex(card.getSex());
		histo.setPersonalNumber(card.getPersonalNumber());
		histo.setPlaceOfBirth(card.getPlaceOfBirth());
		histo.setEntryDate(LocalDateTime.now());
	}

	// Delete an image
	public String deleteImage(String imageDirectory, String imageName) throws IOException {
		Path imagePath = Paths.get(imageDirectory, imageName);

		if (Files.exists(imagePath)) {
			Files.delete(imagePath);
			return "Success";
		} else {
			return "Failed"; // Handle missing images
		}
	}


}
