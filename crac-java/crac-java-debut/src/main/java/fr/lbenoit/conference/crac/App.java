package fr.lbenoit.conference.crac;

import fr.lbenoit.utils.presentation.algo.NombrePremierCalculateur;
import fr.lbenoit.utils.presentation.horodatage.HorodatageUtils;

public class App {
	private NombrePremierCalculateur calculateur;
	
	public void lancer() {
		final long debut = HorodatageUtils.getTime();
		
		calculateur = new NombrePremierCalculateur();
		calculateur.estNombrePremier(25000);
		
		HorodatageUtils.logTime("Durée du premier résultat", debut);
	}
}
