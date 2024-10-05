package com.taetae.comparable;

 

public class Customer {
 
	
	private int id;
	private String name;
	private int type;
	public Customer(int id, String name) {
		super();
		id = id;
		name = name;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer customer = (Customer) obj;
        return id == customer.id && name.equals(customer.name);
    } 
	
	   @Override
	    public int hashCode() {
	        int result = Integer.hashCode(id);
	        result = 31 * result + name.hashCode();
	        return result;
	    }

	    @Override
	    public String toString() {
	        return "Customer{" + "id=" + id + ", name='" + name + '\'' + '}';
	    }
}
 