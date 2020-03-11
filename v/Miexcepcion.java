package unac.edu.co.v;

public class Miexcepcion extends Exception {
	
	private String message;

    public Miexcepcion(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
