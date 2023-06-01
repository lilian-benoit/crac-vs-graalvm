package fr.lbenoit.conference.crac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.lbenoit.utils.presentation.utils.algo.NombrePremierCalculateur;

@RestController
public class HelloController {
	private NombrePremierCalculateur calculateur = null; 

	@GetMapping("/{nb}")
	public String index(@PathVariable("nb") int nb) {
		
		return (nb +" est un nombre premier : " + estNombrePremier(nb));
	}
	
	private boolean estNombrePremier(int nb) {
		if (calculateur == null) {
			calculateur = new NombrePremierCalculateur();
		}
		return calculateur.estNombrePremier(nb);
	}

}
