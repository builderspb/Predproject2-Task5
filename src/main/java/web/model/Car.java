package web.model;

import java.util.Objects;

public class Car {
    private String brand;

    private String model;

    private String vinNumber;


    public Car() {
    }

    public Car(String brand, String model, String vinNumber) {
        this.brand = brand;
        this.model = model;
        this.vinNumber = vinNumber;
    }

    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public String getVinNumber() {return vinNumber;}
    public void setVinNumber(String vinNumber) {this.vinNumber = vinNumber;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model == car.model && vinNumber == car.vinNumber && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, vinNumber);
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", vinNumber=" + vinNumber +
                '}';
    }
}

