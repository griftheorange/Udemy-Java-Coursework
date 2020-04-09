package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone griffsPhone;
	    griffsPhone = new DeskPhone(1234567);

	    griffsPhone.powerOn();
	    griffsPhone.callPhone(1234567);
	    griffsPhone.answer();
    }
}
