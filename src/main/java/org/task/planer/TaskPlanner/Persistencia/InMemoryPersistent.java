package org.task.planer.TaskPlanner.Persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.task.planer.TaskPlanner.Entities.Board;
import org.task.planer.TaskPlanner.Entities.Card;
import org.task.planer.TaskPlanner.Entities.Listad;
import org.task.planer.TaskPlanner.Entities.User;

@Service("Bean1")
public class InMemoryPersistent implements PersistentIn {

	public List<User> usuarios;

	public InMemoryPersistent() {
		// TODO Auto-generated constructor stub
		User user1 = new User();
		user1.setName("Andres");
		user1.setNickName("anflo.97");
		user1.setId(1);

		Board tablero1_user1 = new Board(1, "data", true);

		Listad lista1 = new Listad(1, "lista 1");

		Card tarjeta1 = new Card(1, "Esta es la tarea numero 1");

		tarjeta1.setWho_do(user1);

		List<Card> tarjetas = new ArrayList<Card>();
		tarjetas.add(tarjeta1);
		lista1.setTarjetas(tarjetas);

		List<Listad> listas = new ArrayList<Listad>();
		tablero1_user1.setListas(listas);

	}

	@Override
	public List<Board> getAllBoards() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Listad> getAllListad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Card> getAllCards() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Board> getAllBoardsByUser(Integer id_user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Listad> getAllListadByBoard(Integer id_board) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Card> getAllCardsByListad(Integer id_Listad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBoardbyUser(Integer id_user, Board n_board) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBoardbyUser(Integer id_user, Integer id_board) {
		// TODO Auto-generated method stub

	}

	@Override
	public void UpdateBoardbyUser(Integer id_user, Integer id_old_board, Board n_board) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addListadbyUserandBoard(Integer user_id, Integer board_id, Listad n_listad) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteListadbyUserandBoard(Integer user_id, Integer board_id, Integer id_listad) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateListadbyUserandBoard(Integer user_id, Integer board_id, Integer id_old_listad, Listad n_listad) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCardbyUserandBoardandListad(Integer user_id, Integer board_id, Integer listad_id, Card n_card) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCardbyUserandBoardandListad(Integer user_id, Integer board_id, Integer listad_id,
			Integer id_card) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCardbyUserandBoardandListad(Integer user_id, Integer board_id, Integer listad_id,
			Integer id_old_card, Card n_card) {
		// TODO Auto-generated method stub

	}

	@Override
	public org.apache.catalina.User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(org.apache.catalina.User n_user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<org.apache.catalina.User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<org.apache.catalina.User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
