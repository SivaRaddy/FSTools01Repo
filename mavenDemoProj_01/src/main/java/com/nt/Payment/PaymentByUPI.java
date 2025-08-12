package com.nt.Payment;

public class PaymentByUPI {
	
	public String PhonePe(long number,double Amonut) {
		return Amonut+"amount sent by phone pay"+number;
	}

	public String gpay(long number,double Amonut) {
		return Amonut+"amount sent by g pay"+number;
	}

}
