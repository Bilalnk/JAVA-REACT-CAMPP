package kodlamaio.northwind.core.utilites.result;

public class ErrorResult extends Result{

	public ErrorResult(String message) {
		super(false, message);

	}


	public ErrorResult() {
		super(false);
		
	}

	
}
