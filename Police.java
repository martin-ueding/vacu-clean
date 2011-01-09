package de.martin_ueding.spiel.staubsauger;

/**
 * Stellt einen der Staubpartikel dar.
 *
 * Copyright: Martin Ueding
 */

public class Police {
	final boolean guteSicht = true;
	public static int outside = 0;
	
	int x, y;
	
	public Police () {
		respawn();
	}
	
	public void move () {
		
		int abx;
		int aby;
		
		if (guteSicht) {
			abx = Staubsauger.px - x;
			aby = Staubsauger.py - y;
		}
		
		
		double c = (Math.random()*2+5)/Math.pow(Math.sqrt(abx*abx + aby*aby), 1);
		if (c < 0.05)
			c = 0;
		
		x += c*abx;
		y += c*aby;
		
		if (Math.abs(abx) < 10 && Math.abs(aby) < 10) {
			reset();
			Staubsauger.punkte++;
			
			if (Staubsauger.punkte%5==0)
				Staubsauger.bar.setValue(Staubsauger.punkte);
		}
	}
	
	public void respawn () {
			x = (int) (Math.random()*Staubsauger.fb);
			y = (int) (Math.random()*Staubsauger.fh);	
	}
	
	public void reset () {
		x = -10000;
		y = -10000;
		outside++;
	}
}
