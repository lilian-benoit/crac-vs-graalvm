package fr.lbenoit.conference.crac;

import fr.lbenoit.utils.presentation.NombrePremierCalculateur;
import fr.lbenoit.utils.presentation.horodatage.HorodatageUtils;
import jdk.crac.*;

public class App implements Resource {
	private NombrePremierCalculateur calculateur;
	
	public App() {
		Core.getGlobalContext().register(this);
	}
	
	public void lancer() {
		final long debut = HorodatageUtils.getTime();
		
		calculateur = new NombrePremierCalculateur();
		calculateur.estNombrePremier(25000);
		
		HorodatageUtils.logTime("Durée du premier résultat", debut);
	}

	@Override
	public void beforeCheckpoint(Context<? extends Resource> context) throws Exception {
		System.out.println("beforeCheckpoint() dans App");
	}

	@Override
	public void afterRestore(Context<? extends Resource> context) throws Exception {
		System.out.println("afterRestore() dans App");

		final long debut = HorodatageUtils.getTime();
		calculateur.estNombrePremier(25000);
		HorodatageUtils.logTime("Durée du premier résultat", debut);

	}
}
