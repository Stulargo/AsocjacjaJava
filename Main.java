public class Main {
    public static void main(String[] args) {
        Dom house1 = new Dom();
        Dom house2 = new Dom();

        house1.createBathrooms(1);
        house1.createDoors(1);
        house1.createWindows(4);
        house1.createKitchens(1);
        house1.createRooms(2);

        house2.createBathrooms(2);
        house2.createDoors(1);
        house2.createWindows(20);
        house2.createKitchens(1);
        house2.createRooms(15);

        Lazienka bath1 = new Lazienka();
        Lazienka bath2 = new Lazienka();

        bath1.createShowers(1);
        bath1.createBathtubs(1);
        bath1.createSinks(1);
        bath1.createWashingMachines(1);
        bath1.createClosets(1);

        bath2.createShowers(1);
        bath2.createBathtubs(1);
        bath2.createSinks(1);
        bath2.createWashingMachines(1);
        bath2.createClosets(1);

        bath1.openDoors();
        bath2.openDoors();
        house1.openDoors();
        house2.openDoors();
    }
}
