package day31;
import java.util.Queue;
import java.util.LinkedList;

public class JavaQueue {
	public static void main(String[] args) {
		// Queue in Java represents a data structure to have elements
		// inserted at the end of the queue and removed from the beginning
		// FIFO - First In First Out
		
		// Queue has two impl
		// 1. LinedList
		// 2. PriorityQueue
		
		// What's the Queue?
		// It's FIFO data structure - First In, First Out
		
		Queue<String> queueInStore = new LinkedList<>();
		queueInStore.add("Alex");
		queueInStore.add("Misha");
		queueInStore.add("Boris");
		queueInStore.add("John");
		
		System.out.println(queueInStore);
		
		// getting element - poll() method get element and remove it from queue
		String currentCustomer = queueInStore.poll();
		System.out.println("Working with cutomer: " + currentCustomer);
		System.out.println("Customers in line: " + queueInStore);
		System.out.println("-------------");
		
		currentCustomer = queueInStore.poll();
		System.out.println("Working with customer: " + currentCustomer);
		System.out.println("Customers in line: " + queueInStore);
		System.out.println("-------------");
		
		currentCustomer = queueInStore.poll();
		System.out.println("Working with customer: " + currentCustomer);
		System.out.println("Customers in line: " + queueInStore);
		System.out.println("-------------");
		
		currentCustomer = queueInStore.poll();
		System.out.println("Working with customer: " + currentCustomer);
		System.out.println("Customers in line: " + queueInStore);
		System.out.println("-------------");
		
		currentCustomer = queueInStore.poll();
		System.out.println("Working with customer: " + currentCustomer);
		System.out.println("Customers in line: " + queueInStore);
		System.out.println("-------------");
	}
}


