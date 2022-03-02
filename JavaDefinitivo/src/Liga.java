

public class Liga {
	
	private String nombre;
	private Equipo[] equipos;
	private Calendario calendario;
	private Arbitro[] arbitros;
	private Clasificacion clasificacion;
	
public Liga(String nombre,Equipo[]misEquipos,Arbitro[]arbitros) {
		
		this.nombre=nombre;
		this.equipos=equipos;
		this.arbitros=arbitros;
		
		//Generador de Calendario
		calendario=new Calendario(this.equipos,this.arbitros);
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Equipo[] getEquipos() {
		return equipos;
	}
	public void setEquipos(Equipo[] equipos) {
		this.equipos = equipos;
	}
	public Calendario getCalendario() {
		return calendario;
	}
	public void setCalendario(Calendario calendario) {
		this.calendario = calendario;
	}
	public Arbitro[] getArbitros() {
		return arbitros;
	}
	public void setArbitros(Arbitro[] arbitros) {
		this.arbitros = arbitros;
	}
	public Clasificacion getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	
	
	//El nombre de la liga
	
	//•El Calendario de la liga. Solo hay un calendario para cada liga.
	
	//•La clasificación de la liga
	
	
	//•Los equipos que forman la liga
	
	
	//•Los árbitros que están adscritos a la liga.
	
	
}
