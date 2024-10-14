
public class Alarma {
	private int umbral;
	private Sensor sensor;
	private Timbre timbre;
	
	public Alarma() {

	}
	
	public void comprobar() {
		this.sensor.valor=1;
		this.umbral=this.sensor.valor;
		if(umbral>1) {
			this.timbre.activar();
		}else {
			this.timbre.desactivar();
		}
		this.sensor.valor=1;
	}

	public void setvalorsensor(int a) {
	}
	
	
	
}
