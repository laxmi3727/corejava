package com.taetae.comparable;

		import java.util.Iterator;
		import java.util.LinkedList;
		import java.util.Queue;

		public class MainCustomer {

		    public static void main(String[] args) {
		        Queue<Customer> customerQueue = new LinkedList<>();

		        // Adding customers to the queue
		        customerQueue.add(new Customer(1, "Alice", 0)); // Normal
		        customerQueue.add(new Customer(2, "Bob", 1));   // Classic
		        customerQueue.add(new Customer(3, "Charlie", 2)); // Premium
		        customerQueue.add(new Customer(4, "Diana", 1));  // Classic
		        customerQueue.add(new Customer(5, "Eve", 0));   // Normal

		        // Categorizing customers using Iterator
		        Queue<Customer> normalCustomers = new LinkedList<>();
		        Queue<Customer> classicCustomers = new LinkedList<>();
		        Queue<Customer> premiumCustomers = new LinkedList<>();

		        Iterator<Customer> iterator = customerQueue.iterator();
		        while (iterator.hasNext()) {
		            Customer customer = iterator.next();
		            switch (customer.getType()) {
		                case 0:
		                    normalCustomers.add(customer);
		                    break;
		                case 1:
		                    classicCustomers.add(customer);
		                    break;
		                case 2:
		                    premiumCustomers.add(customer);
		                    break;
		                default:
		                    System.out.println("Unknown customer type for customer: " + customer);
		            }
		        }

		        // Display categorized customers
		        System.out.println("Normal Customers: " + normalCustomers);
		        System.out.println("Classic Customers: " + classicCustomers);
		        System.out.println("Premium Customers: " + premiumCustomers);
		    }
		}

		
	}
	
}
