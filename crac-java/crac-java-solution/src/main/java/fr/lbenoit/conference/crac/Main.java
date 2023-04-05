package fr.lbenoit.conference.crac;

import fr.lbenoit.utils.presentation.utils.horodatage.HorodatageUtils;

public class Main {
	public static void main(String[] args) {
		HorodatageUtils.logStartTime();
		
		App app = new App();
		app.lancer();
		
        try {
            while (true) { Thread.sleep(1_000); }
        } catch (InterruptedException e) { }
	}
}
