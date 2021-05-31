package kodlamaio.northwind.core.utilites.result;

public class DataResult<T> extends Result {

	private T data;
	
	public DataResult(T data, boolean success, String message) {
		super(success, message);
		this.data = data;
	}

	
	public DataResult(T data, boolean success ) {
		super(success);
		this.data = data;
	}

	//get küçük harfle başlamalı yoksa veriler dönmez
	public T getData() {
		return this.data;
	}
	
	
	
	

}
