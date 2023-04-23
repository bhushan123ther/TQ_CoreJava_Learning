package com.synchronization;

class BookTheaterSeat {
	int total_seat = 10;

	synchronized void bookSeat(int seat) {
		if (total_seat >= seat) {
			System.out.println(seat + " Seats book successfully !! ");
			total_seat = total_seat - seat;
			System.out.println("Seats left : " + total_seat);
		} else {
			System.out.println("Soryy seats con not be booked..!!");
			System.out.println("Seats left : " + total_seat);
		}
	}
}

public class MovieBookApp extends Thread {

	static BookTheaterSeat b;
	int seat;

	public void run() {
		b.bookSeat(seat);
	}

	public static void main(String[] args) {

		b = new BookTheaterSeat();

		MovieBookApp bhushan = new MovieBookApp();
		bhushan.seat = 8;
		bhushan.start();

		MovieBookApp neha = new MovieBookApp();
		neha.seat = 4;
		neha.start();
	}
}
