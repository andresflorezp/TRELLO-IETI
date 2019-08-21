package org.task.planer.TaskPlanner.Entities;

import java.util.List;

public class User {
	private Integer Id;
	private String Name;
	private String NickName;
	private List<User> friends;
	private List<Board> boards;
	public User() {
	
	}
	
	public User(Integer id, String name, String nickName, List<User> friends, List<Board> boards) {
		super();
		Id = id;
		Name = name;
		NickName = nickName;
		this.friends = friends;
		this.boards = boards;
	}

	public User(String name, String nickName) {
		super();
		Name = name;
		NickName = nickName;
	}
	
	public User(Integer id, String name, String nickName) {
		super();
		Id = id;
		Name = name;
		NickName = nickName;
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNickName() {
		return NickName;
	}
	public List<User> getFriends() {
		return friends;
	}
	public void setFriends(List<User> friends) {
		this.friends = friends;
	}
	public void setNickName(String nickName) {
		NickName = nickName;
	}
	
	public List<Board> getBoards() {
		return boards;
	}
	public void setBoards(List<Board> boards) {
		this.boards = boards;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", NickName=" + NickName + "]";
	}
	
}
