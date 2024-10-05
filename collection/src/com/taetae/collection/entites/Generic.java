package com.taetae.collection.entites;

public class Generic<T,U> {
  
	private T t;
    private U u;
    
  

	public Generic(T t) {
		super();
		this.t = t;
	}
	public Generic(U u) {
		super();
		this.u = u;
	}
	public T getT() {
		return t;
	}

	
	public U getU() {
		return u;
	}
	
	
	
}
