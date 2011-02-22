// Copyright (c) Martin Ueding <dev@martin-ueding.de>

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	protected void paintComponent (Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.GRAY);
		for (int i = 0; i < Staubsauger.pol.length; i++) {
		
			Staubsauger.pol[i].move();
			
			g.fillRect(Staubsauger.pol[i].x, Staubsauger.pol[i].y, 2, 2);
		}
		
		g.setColor(Color.RED);
		g.fillOval(Staubsauger.px, Staubsauger.py, 5, 5);
		
		g.drawString(Staubsauger.spielpunkte+" "+Spr.get("punkte"), this.getWidth()/3, 20);		
		
	}

}
