package hometasks.task4;

public class Main {

    public static void main(String[] args) {

        Device device = new Device("Samsung", 300, "DFFDFDFd");
        Monitor monitor = new Monitor("Samsung", 300, "DHHHFD", 1280, 1024);

        System.out.println(device);
        System.out.println(monitor);

        System.out.println();
        System.out.println("Идентичны = " + device.equals(monitor));
        System.out.println("Идентичны = " + monitor.equals(device));

        System.out.println();
        System.out.println("Хеш-код = " + device.hashCode());
        System.out.println("Хеш-код = " + monitor.hashCode());

    }

}
