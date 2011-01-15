import java.util.TimerTask;

public class MyTimer extends TimerTask {
	public void run() {
		Staubsauger.j.repaint();
		
		if (Staubsauger.spielpunkte > 0)
			Staubsauger.spielpunkte--;
			
		if (Staubsauger.pol.length == Particle.outside)
			Staubsauger.gameOver();
	}
}
