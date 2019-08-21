package org.task.planer.TaskPlanner.Entities;
import java.util.*;
public class Listad {
	private Integer Id;
	private String Nombre;
	private List<Card> tarjetas;
	public Listad() {
		// TODO Auto-generated constructor stub
	}
	
	public Listad(Integer id, String nombre) {
		super();
		Id = id;
		Nombre = nombre;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Listad(String nombre) {
		super();
		Nombre = nombre;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	public List<Card> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(List<Card> tarjetas) {
		this.tarjetas = tarjetas;
	}

	@Override
	public String toString() {
		return "List [Id=" + Id + ", Nombre=" + Nombre + "]";
	}
	

}
