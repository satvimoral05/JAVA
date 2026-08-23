class House {

    private String address;
    private int numberOfRooms;
    private double area;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getRooms() {
        return this.numberOfRooms;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return this.area;
    }

    public double calculatePrice(double pricePerSquareMeter) {
        return area * pricePerSquareMeter;
    }
}

public class HousePrice {

    public static void main(String[] args) {

        House h1 = new House();

        h1.setAddress("Gundawadi street no 26");
        h1.setArea(75.25);
        h1.setRooms(89);

        System.out.println(
            "Address: " + h1.getAddress()
        );

        System.out.println(
            "Area: " + h1.getArea()
        );

        System.out.println(
            "Rooms: " + h1.getRooms()
        );

        double pricePerSquareMeter = 100000;

        System.out.println(
            "Price of House: "
            + h1.calculatePrice(pricePerSquareMeter)
        );
    }
}
