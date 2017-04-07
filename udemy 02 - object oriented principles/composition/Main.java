public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC myPC = new PC(theCase, theMonitor, theMotherboard);

        //  Can access deep methods using getters to return the instance of the object it is within
        myPC.getMonitor().drawPixelAt(1500, 1200, "red");
        myPC.getMotherboard().loadProgram("Windows 1.0");
        myPC.getTheCase().pressPowerButton();

    }
}
