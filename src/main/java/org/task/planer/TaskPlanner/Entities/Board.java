package org.task.planer.TaskPlanner.Entities;
import java.util.*;

public class Board {
	private Integer Id;
	private String Titulo;
	private Boolean IsPublic;
	private List<Listad> listas;

	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(String titulo, Boolean isPublic) {
		super();
		Titulo = titulo;
		IsPublic = isPublic;
	}
		
	public Board(Integer id, String titulo, Boolean isPublic) {
		super();
		Id = id;
		Titulo = titulo;
		IsPublic = isPublic;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public Boolean getIsPublic() {
		return IsPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		IsPublic = isPublic;
	}
	

	public List<Listad> getListas() {
		return listas;
	}

	public void setListas(List<Listad> listas) {
		this.listas = listas;
	}

	@Override
	public String toString() {
		return "Board [Id=" + Id + ", Titulo=" + Titulo + ", IsPublic=" + IsPublic + "]";
	}
	

}
