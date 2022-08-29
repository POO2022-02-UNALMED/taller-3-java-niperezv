package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	//Get_Set_marca
	public Marca getMarca() {
		return marca;
	}
	//¿que pasa si no se le pasa paramatro?
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	//Get_Set_precio
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	//Get_Set_Volumen
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	//Get_Set_Canal
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if(estado==true && (canal>=1 && canal<=120)) {
			this.canal=canal;
		}
	}
	//Get_NumTV
	public int getNumTV() {
		return numTV;
	}
	//Get_Set_control
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	//turnOn_turnOff
	void turnOn (boolean estado) {
		if(estado == false)
			estado=true;
	}
	void turnOff (boolean estado) {
		if(estado == true)
			estado =false;
	}
	//Get_Estado
	public boolean getEstado() {
		return estado;
	}
	public static void setnumTV(int numTV) {
		TV.numTV=numTV;
	}
	public static int getnumTV() {
		return numTV;
	}
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	public void canalUp() {
		if(estado==true && canal<120) {
			canal++;
		}
	}
	public void canalDown() {
		if(estado==true && canal>1) {
			canal--;
		}
	}
	public void volumenUp() {
		if(estado==true && volumen<7) {
			volumen++;
		}
	}
	public void volumenDown() {
		if(estado==true && volumen>0) {
			volumen--;
		}
	}

}
