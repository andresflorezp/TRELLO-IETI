package org.task.planer.TaskPlanner.Entities;

public class Card {
	private Integer Id;
	private String Titulo;
	private User who_do;

	
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public Card(Integer id, String titulo) {
		super();
		Id = id;
		Titulo = titulo;
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Card [Id=" + Id + ", Titulo=" + Titulo + "]";
	}
	public Card(String titulo) {
		super();
		Titulo = titulo;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public User getWho_do() {
		return who_do;
	}
	public void setWho_do(User who_do) {
		this.who_do = who_do;
	}
	
	
	
	

}
