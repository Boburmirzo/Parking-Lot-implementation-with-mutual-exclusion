import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * The Exit class represents the exit gates of the parking lot. These gates will notify the
 * parking lot of any cars that may be exiting.
 *
 */
/*
 * Author by Boburmirzo Umurzakov
 */

public class Exit {

	private String exitID;
	private Lot parkingLot;
	final Lock lock = new ReentrantLock();
	/**
	 * Exit object constructor
	 * @param id, parkingLot
	 */
	public Exit(String id, Lot parkingLot){
		this.exitID = id;
		this.parkingLot = parkingLot;
		
	}
	
	/**
	 * Signals the parking lot of a car exiting the lot
	 */
	public void notifyLotOfExitingCar(){
		lock.lock();	
		parkingLot.checkForCarsExiting();
		lock.unlock();
	}
	
}
