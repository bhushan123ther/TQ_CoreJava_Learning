package com.synchronization;

class BookTheaterSeat1 {
	int total_seat = 10;

	void bookSeat(int seat) {
		System.out.println("" + Thread.currentThread().getName());
		System.out.println("" + Thread.currentThread().getName());
		System.out.println("" + Thread.currentThread().getName());
		System.out.println("" + Thread.currentThread().getName());
		System.out.println("" + Thread.currentThread().getName());

		synchronized (this) {
			if (total_seat >= seat) {
				System.out.println(seat + " seats are booked successfully !!");
				total_seat = total_seat - seat;
				System.out.println("Left seats are : " + total_seat);
			} else {
				System.out.println("Sorry we can not booked seat ");
				System.out.println("Left seats only  : " + total_seat);
			}
		}

		System.out.println("" + Thread.currentThread().getName());
		System.out.println("" + Thread.currentThread().getName());
		System.out.println("" + Thread.currentThread().getName());
		System.out.println("" + Thread.currentThread().getName());
		System.out.println("" + Thread.currentThread().getName());
	}
}

public class MovieBookApp1 extends Thread {

	static BookTheaterSeat1 b;
	int seat;

	public void run() {
		b.bookSeat(seat);
	}

	public static void main(String[] args) {

		b = new BookTheaterSeat1();

		MovieBookApp1 b = new MovieBookApp1();
		b.seat = 5;
		b.start();

		MovieBookApp1 c = new MovieBookApp1();
		c.seat = 8;
		c.start();

	}

}
