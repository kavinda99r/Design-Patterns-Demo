/*
============================================================
Creational Design Pattern - Singleton
============================================================
 */

public class Singleton {
    private static Singleton instance;

    private String data;

    private Singleton() {
        this.data = "Initial data";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String newData) {
        this.data = newData;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();

        singleton1.setData("Updated data");

        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Data from singleton1: " + singleton1.getData());
        System.out.println("Data from singleton2: " + singleton2.getData());

    }
}

