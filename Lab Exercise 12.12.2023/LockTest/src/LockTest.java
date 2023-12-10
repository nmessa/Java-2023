/**
 * @(#)LockTest.java
 *
 * LockTest application
 *
 * @nmessa
 * @version 1.00 2023/12/12
 */
 
public class LockTest {
    
    public static void main(String[] args) {
    	
    	PermutationLock pl = new PermutationLock('A', 'B', 'C');
    	pl.openLock("DEF");   	//does not open lock
    	pl.openLock("ABC");  	//Opens the lock
    	pl.openLock("ABC");		//Lock already open
    }
}
