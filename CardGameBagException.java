
public class CardGameBagException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public CardGameBagException() {
		this("Bag must contain less items than the card list.");
	}
	
	public CardGameBagException(String message) {
		super(message);
	}

}
