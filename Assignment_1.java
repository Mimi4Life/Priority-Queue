/*
 *(Perform set operations on hash sets) Create two linked hash sets 
 *{"George", "Jim", "John", "Blake", "Kevin", "Michael"} and …"George", "Katie", "Kevin", "Michelle", "Ryan"… and find their union, difference, and intersection.
 *(You can clone the sets to preserve the original sets from being changed by these set methods.)
 */
package Java3;
import java.util.*;
/**
 *
 * @author Miriam Ekiye
 */
public class Assignment_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Make two priority Queues
		PriorityQueue<String> firstQueue = new PriorityQueue<>(Arrays.asList(
			" George ", " Jim ", " John ", " Blake ", " Kevin ", " Michael "));

		PriorityQueue<String> secondQueue = new PriorityQueue<>(Arrays.asList(
			" George ", " Katie ", " Kevin ", " Michelle ", " Ryan "));

		// Show the two sets and union, difference, and intersection
		System.out.println("The first set: " + firstQueue);
		System.out.println("The second set: " + secondQueue);
		System.out.println("The union of sets: " + union(firstQueue, secondQueue));
		System.out.println("The difference of sets: " + difference(firstQueue, secondQueue));
		System.out.println("The intersection of sets: " + intersection(firstQueue, secondQueue));
	}

	// This method will return the union of two sets 
	private static <T> PriorityQueue<T> union(
			PriorityQueue<T> set1, PriorityQueue<T> set2) {
		PriorityQueue<T> union = new PriorityQueue<>(set1);
		union.addAll(set2); 
		return union;
	} 

	// This method returns the difference of two sets 
	private static <T> PriorityQueue<T> difference(
			PriorityQueue<T> set1, PriorityQueue<T> set2) {
		PriorityQueue<T> difference = new PriorityQueue<>(set1);
		difference.removeAll(set2);
		return difference;
	}

	//This method will return the intersection of the two sets
	private static <T> PriorityQueue<T> intersection(
			PriorityQueue<T> set1, PriorityQueue<T> set2) {
		PriorityQueue<T> intersection = new PriorityQueue<>(set1);
		intersection.retainAll(set2);
		return intersection;
	}
    
}
    
