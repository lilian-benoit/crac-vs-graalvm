package fr.lbenoit.conference.crac;

import fr.lbenoit.utils.presentation.horodatage.HorodatageUtils;

public class Main {
	
	static ServeurManager serveurManager;
	 
	public static void main(String[] args) throws Exception {
		HorodatageUtils.logStartTime();
		
		serveurManager = new ServeurManager(8080, new App());
	}
}
