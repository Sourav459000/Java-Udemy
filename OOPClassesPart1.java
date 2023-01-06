public class OOPClassesPart1 {
    public static void main(String[] args) {
        
        Car car = new Car();
        car.setModel("Model X");
        car.setColor("White");
        car.setDoors(4);
        car.setCovertible(true);
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        car.describeCar();
    }
}
