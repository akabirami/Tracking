import java.util.*;

public class Table {
	String Elements = "START END STATUS TRANSFER";

	Record[] recordList;

	public Table() {
		
	}

	public void createRecord(int start, int end, String status, int transfer) {

	}

}

/*
 * Types of splits a record can have!
 * 
 * 1. Double Split:
 *  	<1 100 A 1> 
 *  	<50 100 B 1>
 *  --------------------
 *  	<1 49 A 1>
 *  	<50 100 B 1>
 *  
 * 2. Triple Split:
 * 		<1 100 A 1>
 * 		<40 50 B 1>
 * --------------------
 * 		<1 39 A 1>
 * 		<40 50 B 1>
 * 		<51 100 A 1>
 * 
 * 3. Back - Extension Split:
 *		<1 100 A 1>
 *		<90 110 B 1>
 *---------------------
 *		<1 89 A 1>
 *		<90 110 B 1>
 *
 * 4. Front - Extension Split:
 * 		<100 200 A 1>
 *		<90 110 B 1>
 *---------------------
 *		<90 110 B 1>
 *		<111 200 A 1>
 * 
 */
