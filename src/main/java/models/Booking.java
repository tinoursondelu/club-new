package models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private int id;
    private LocalDateTime dateBooking;
    @ManyToOne
    private Team bookingTeam;
    
    //**************** CONSTRUCTORS *****************

  	public Booking() {
  		super();
  	}

  	//************  GETTERS & SETTERS ***************

  	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDateBooking() {
		return dateBooking;
	}

	public void setDateBooking(LocalDateTime dateBooking) {
		this.dateBooking = dateBooking;
	}

	public Team getBookingTeam() {
		return bookingTeam;
	}

	public void setBookingTeam(Team bookingTeam) {
		this.bookingTeam = bookingTeam;
	}
  	
}
