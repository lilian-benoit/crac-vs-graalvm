package fr.lbenoit.conference.crac;

import fr.lbenoit.utils.presentation.utils.algo.NombrePremierCalculateur;
import fr.lbenoit.utils.presentation.utils.horodatage.HorodatageUtils;

public class App {
	private NombrePremierCalculateur calculateur;
	
	public void lancer() {
		final long debut = HorodatageUtils.getTime();
		
		calculateur = new NombrePremierCalculateur();
		calculateur.estNombrePremier(75000);
		
		HorodatageUtils.logTime("Durée du premier résultat", debut);
	}
}
