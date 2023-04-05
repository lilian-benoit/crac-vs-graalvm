package fr.lbenoit.utils.presentation.utils.algo;

import java.util.HashMap;
import java.util.Map;

public class NombrePremierCalculateur {
    private static final Map<Long, Boolean> cache = new HashMap<>();

    public NombrePremierCalculateur() {
        for (int i = 1 ; i < 50_000 ; i++) {
            estNombrePremier(i);
        }
	}
    
    public boolean estNombrePremier(final long param) {
        if (param < 1) {
        	return false; 
        }
        if (cache.containsKey(param)) { 
        	return cache.get(param); 
        }
        boolean estNbPremier = true;
        for (long n = param ; n > 0 ; n--) {
            if (n != param && n != 1 && param % n == 0) {
                estNbPremier = false;
                break;
            }
        }
        cache.put(param, estNbPremier);
        return estNbPremier;
    }

}
