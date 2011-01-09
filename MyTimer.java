package de.martin_ueding.spiel.staubsauger;

import java.util.TimerTask;

/**
 * Zeichnet das Hauptfenster neu.
 *
 * Copyright: Martin Ueding ;-)
 */

public class MyTimer extends TimerTask {
	public void run() {
		Staubsauger.j.repaint();
		
		if (Staubsauger.spielpunkte > 0)
			Staubsauger.spielpunkte--;
			
		if (Staubsauger.pol.length == Police.outside)
			Staubsauger.gameOver();
	}
}
