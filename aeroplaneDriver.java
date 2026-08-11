public class aeroplaneDriver {
    public static void main(String[] args) {
        aeroplane driver = new aeroplane();
        driver.price = 100000;
        driver.name = "INDIA";
        driver.isAffordable = true;
        driver.grade = 'A';
        driver.fuelInLitre = 50.50;

        System.out.println("Price of your plane is : " + driver.price);
        System.out.println("Name of your plane is : " + driver.name);
        System.out.println("Is your plane is affordable : " + driver.isAffordable);
        System.out.println("Grade of your plane is :" + driver.grade);
        System.out.println("Fuel in your plane is :" + driver.fuelInLitre);
    }
}
