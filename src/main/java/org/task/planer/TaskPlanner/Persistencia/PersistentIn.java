package org.task.planer.TaskPlanner.Persistencia;
import java.util.*;

import org.apache.catalina.User;
import org.task.planer.TaskPlanner.Entities.Board;
import org.task.planer.TaskPlanner.Entities.Card;
import org.task.planer.TaskPlanner.Entities.Listad;
public interface PersistentIn {
	public List<Board> getAllBoards();
	public List<Listad> getAllListad();
	public List<Card> getAllCards();
	public List<User> getAllUsers();
	public List<User> getAllUser();
	public User	getUserById(Integer id);
	public List<Board> getAllBoardsByUser(Integer id_user);
	public List<Listad> getAllListadByBoard(Integer id_board);
	public List<Card> getAllCardsByListad(Integer id_Listad);
	///CRUD PARA USER
	public void addUser(User n_user);
	
	///CRUD PARA BOARD
	public void addBoardbyUser(Integer id_user,Board n_board);
	public void deleteBoardbyUser(Integer id_user,Integer id_board);
	public void UpdateBoardbyUser(Integer id_user,Integer id_old_board,Board n_board);
	///CRUD PARA LISTAD
	public void addListadbyUserandBoard(Integer user_id,Integer board_id,Listad n_listad);
	public void deleteListadbyUserandBoard(Integer user_id,Integer board_id,Integer id_listad);
	public void updateListadbyUserandBoard(Integer user_id,Integer board_id,Integer id_old_listad,Listad n_listad);
	///CRUD PARA CARD
	public void addCardbyUserandBoardandListad(Integer user_id,Integer board_id,Integer listad_id,Card n_card);
	public void deleteCardbyUserandBoardandListad(Integer user_id,Integer board_id,Integer listad_id,Integer id_card);
	public void updateCardbyUserandBoardandListad(Integer user_id,Integer board_id,Integer listad_id,Integer id_old_card,Card n_card);
	
	
}
