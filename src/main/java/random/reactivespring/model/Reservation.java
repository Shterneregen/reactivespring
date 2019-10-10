package random.reactivespring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Document
public class Reservation {

    private Long roomNumber;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkin;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkout;
    private Integer price;

    @Id
    private String id;

    public Reservation() {
    }

    public Reservation(Long roomNumber, LocalDate checkin, LocalDate checkout, Integer price) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
        this.price = price;
    }

    public Long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }
}
