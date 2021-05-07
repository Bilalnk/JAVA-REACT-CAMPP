package entities;

public class Game {
	
	
	private int Id;
	private String gameName;
	private int price;
	
	public Game() {
	
	}
	
	
	public Game(int id, String gameName, int price) {
		super();
		Id = id;
		this.gameName = gameName;
		this.price = price;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
