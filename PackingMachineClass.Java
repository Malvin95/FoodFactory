import java.util.Random
/**
*The PackagingMachine class : class responsible for packaging for the food.
*author : David Bosun-Arebuwa
*/

public class PackagingMachine {
static final int PACK_TIME = 10; /** default time to pack food */
public Food food;

/** 
* @param: probablility of a jam happening (double) inherited from super class
* @param : rndm : generates a random item out of queue to begin packing
*/
public PackagingMachine(double probability, Random rndm){
super(probablity, rndm); // the objects are constructed from superclass values 
}





public void packing(){ // main packing method
this.jam(); //checks to see if machine will jam
if (this.type == null && !this.foodQueue.isEmpty(){
this.type = this.foodqueue(); //takes food in queue into the machine
}
if (this.pTime >= PACK_TIME){ //checks if the item has been in the machine for the fixed 10seconds
Food foodreturned = this.type; 
this.nextFood(this.type); // moves to the next item in the queue
this.pTime = 0;
return foodReturned; //packing has ben completed
}

else if (this.type != null){ //holds food till process is completed
this.pTime ++; //increseas time that its held in machine

}
return null





}
