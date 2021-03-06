import java.util.Random
/**
*The ProcessingMachine class : class responsible for processing food.
*author : Nelson Poon
*/

* @param: probablility of a jam happening (double) inherited from super class
* @param : rndm : generates a random item out of queue to begin processing
*/
public class ProcessingMachine {
	static final int Process_Time1 = 20;
	static final int Process_Time2 = 22;
	public Food food;
	
	

public ProcessingMachine(double prob,Random rndm){
	super(prob, rndm);
}

public void processing(){ //main processing method
	this.jam(); //check if machine jam
	if (this.type == null && !this.foodQueue.isEmpty(){
		this.type = this.foodqueue(); //takes food in queue into the machine
		}
	
	if(this.prTime >= PROCESS_TIME){ //main processing method
		Food foodreturned = this.type; 
		this.nextFood(this.type); // moves to the next item in the queue
		this.prTime = 0;
		return foodReturned; //processing has been completed
		}
	
    else if (this.type != null){ //holds food till process is completed
		this.prTime ++; //increseas time that its held in machine

		}
		return null
                }



		}
