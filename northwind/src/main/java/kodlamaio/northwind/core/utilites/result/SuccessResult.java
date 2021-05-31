package kodlamaio.northwind.core.utilites.result;

public class SuccessResult extends Result{

	public SuccessResult(boolean success, String message) {
		super(true, message);
	}


	public SuccessResult() {
		super(true);
	}

	
	
	
}
