package gge.model;

import java.awt.event.MouseEvent;

public class Pregled extends StanjeAplikacije {

	@Override
	public void mouseEvent(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void minusButtonPressedEvent() {
		this.aplikacija.promeniStanje(new ZoomOut());
	}

	@Override
	public void minusButtonReleasedEvent() {
		return;
	}

	@Override
	public void plusButtonPressedEvent() {
		this.aplikacija.promeniStanje(new ZoomIn());
	}

	@Override
	public void plusButtonReleasedEvent() {
		return;
	}

	@Override
	public void entry() {
		return;
	}

}
