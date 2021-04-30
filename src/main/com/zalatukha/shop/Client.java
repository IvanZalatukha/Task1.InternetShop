package main.com.zalatukha.shop;

public class Client {
    private String name;
    private int id;
    InternetShop shop;

    public Client(String name, int id, InternetShop shop) {
        this.name = name;
        this.id = id;
        this.shop = shop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void makeAnOrder() {
        shop.makeAnOrder();
    }

    public void makeThePayment() {
        shop.payment();
    }

    public void takeOrder() {
        shop.sendVehicle();
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
