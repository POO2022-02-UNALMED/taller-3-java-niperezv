package taller3.televisores;

public class Control {
	private TV tv;
	//turnOn_turnOff
	void turnOn() {
		tv.turnOn();
	}
	void turnOff() {
		tv.turnOff();
	}
	
	void canalUp() {
		tv.canalUp();
	}
	
	void canalDown() {
		tv.canalDown();
	}
	
	void volumenUp() {
		tv.volumenUp();
	}
	
	void volumenDown() {
		tv.volumenDown();
	}
	//setCanal
	void setCanal(int canal) {
		tv.setCanal(canal);;
	}
	//Enlazar
	void enlazar(TV tv) {
		setTV(tv);
		tv.setControl(this);
	}
	
	//get_set TV
	public TV getTV() {
		return tv;
	}
	public void setTV(TV tv) {
		this.tv = tv;
	}
}
