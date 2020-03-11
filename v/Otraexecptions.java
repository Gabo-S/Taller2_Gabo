package unac.edu.co.v;

public class Otraexecptions extends Exception{
	
	private String message;


	

	public Otraexecptions(String message) {
		   this.message = message;
    }
     

    @Override
    public String getMessage() {
        return this.message;
    }

}
