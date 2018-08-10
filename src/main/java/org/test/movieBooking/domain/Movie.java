package org.test.movieBooking.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.Set;

@XmlRootElement
public class Movie {

	private String name;

	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date releaseDate;

	@JsonIgnore
	private Set<Integer> bookedSeat;

	public Movie(String name, Date releaseDate, Set<Integer> bookedSeat) {
		this.name = name;
		this.releaseDate = releaseDate;
		this.bookedSeat = bookedSeat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Set<Integer> getBookedSeat() {
		return bookedSeat;
	}

	public void setBookedSeat(Set<Integer> bookedSeat) {
		this.bookedSeat = bookedSeat;
	}
}
