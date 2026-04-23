package entities;

import java.time.LocalDateTime;

public class CarRental {
    private String carModel;
    private LocalDateTime start;
    private LocalDateTime finish;
    private Double pricePerHour;
    private Double pricePerDay;

    public CarRental(String carModel, LocalDateTime start, LocalDateTime finish, Double pricePerHour, Double pricePerDay) {
        this.carModel = carModel;
        this.start = start;
        this.finish = finish;
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
