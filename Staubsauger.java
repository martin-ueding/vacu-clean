import java.awt.BorderLayout;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Staubsauger {
	public static int px, py;
	static JFrame j;
	static JProgressBar bar;
	static Police[] pol = new Police[700];
	static int punkte = 0;
	public static int fb, fh;
	public static int spielpunkte = 1000;
	
	public static void main(String[] args) {
		fb = 400;
		fh = 400;
		
		for (int i = 0; i < pol.length; i++) {
			pol[i] = new Police();
		}
		
		j = new JFrame(Spr.get("staubsauger"));
		JPanel lay = new JPanel(new BorderLayout());
		
		j.setSize(fb+30, fh+20);
		j.addMouseMotionListener(new MyMML());
		
		bar = new JProgressBar(0, pol.length);
		bar.setOrientation(JProgressBar.VERTICAL);
		bar.setIgnoreRepaint(true);
		
		PPanel p = new PPanel();
		lay.add(p, BorderLayout.CENTER);
		lay.add(bar, BorderLayout.EAST);
		j.add(lay);
		j.setVisible(true);
		
		Timer timer = new Timer();
		timer.schedule(new MyTimer(), 0, 50);
	}
	
	public static void gameOver() {
		JOptionPane.showMessageDialog(null, "gewonnen mit "+spielpunkte+" Punkten.");
		System.exit(0);
	}
}
