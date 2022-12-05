package com.casestudy.events.Entity;
import java.util.Date;
import javax.persistence.*;//Java Persistence is the API for the management for persistence and object/relational mapping.
import javax.validation.constraints.NotNull;
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;
    @NotNull(message = "Date shouldn't be null  ")
    private Date date;
   @NotNull(message = "Status  shouldn't be null ")
    private String status;
   @NotNull(message = "Bill shouldn't be null ")
    private long bill;
    private long noOfAttendies;
   public Booking() {
        super();
        // TODO Auto-generated constructor stub
    }



   public Booking(int bookingId, Date date, String status, long bill, long noOfAttendies) {
        super();
        this.bookingId = bookingId;
        this.date = date;
        this.status = status;
        this.bill = bill;
        this.noOfAttendies = noOfAttendies;
    }



   // Getters and setters of the variables



   public int getBookingId() {
        return bookingId;
    }



   public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }



   public Date getDate() {
        return date;
    }



   public void setDate(Date date) {
        this.date = date;
    }



   public String getStatus() {
        return status;
    }



   public void setStatus(String status) {
        this.status = status;
    }



   public long getBill() {
        return bill;
    }



   public void setBill(long bill) {
        this.bill = bill;
    }



   public long getNoOfAttendies() {
        return noOfAttendies;
    }



   public void setNoOfAttendies(long noOfAttendies) {
        this.noOfAttendies = noOfAttendies;
    }



}