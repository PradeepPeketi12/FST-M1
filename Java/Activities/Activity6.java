package activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("John");
        plane.onboard("Roy");
        plane.onboard("Stokes");
        plane.onboard("Kane");
        System.out.println("Take off time"+plane.takeOff());
        System.out.println("List of passengers"+plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Landed time"+plane.getLastTimeLanded());
    }
}
