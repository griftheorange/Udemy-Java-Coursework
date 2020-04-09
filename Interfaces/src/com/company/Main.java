package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone griffsPhone;
	    griffsPhone = new DeskPhone(1234567);

	    griffsPhone.powerOn();
	    griffsPhone.callPhone(1234567);
	    griffsPhone.answer();

	    griffsPhone = new MobilePhone(23456);
	    griffsPhone.callPhone(23456);
		griffsPhone.answer();

	    griffsPhone.powerOn();
		griffsPhone.callPhone(23456);
		griffsPhone.answer();
    }
}
