package web.model;

public class Car {
    private String carBrand;
    private String country;
    private int number;

    public Car(String carBrand, String country, int number) {
        this.carBrand = carBrand;
        this.country = country;
        this.number = number;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
