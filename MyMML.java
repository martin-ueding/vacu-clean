import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyMML implements MouseMotionListener {
	public void mouseDragged(MouseEvent arg0) {}

	public void mouseMoved(MouseEvent arg0) {
		Staubsauger.px = arg0.getX();
		Staubsauger.py = arg0.getY()-20;
	}
}
