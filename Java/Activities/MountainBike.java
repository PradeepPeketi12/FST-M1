package activities;

public class MountainBike extends Bicycle{
    int seatHeight;

    public MountainBike(int gears, int speed, int seatHeight){
        super(gears, speed);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int newHeigtValue){
        seatHeight = newHeigtValue;
    }
    public String bicycleDesc() {
        return super.bicycleDesc()+"Seat height is : "+seatHeight;
    }

}
