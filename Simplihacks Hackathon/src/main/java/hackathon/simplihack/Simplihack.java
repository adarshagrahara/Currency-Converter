package hackathon.simplihack;

import java.util.Formatter;
import java.util.Scanner;
import java.text.DecimalFormat;


class Simplihack {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	public static void main(String[] args) {


		Scanner moneyconverter = new Scanner(System.in);


		int j =4;
		
		double initial = 0;
		double max = 690154939781d;
		while(j <= 4) {
			System.out.println("How many US dollars would you like to convert?");
			initial = moneyconverter.nextDouble();

			if (initial > 0 && initial < max) {

				j = 4;
				j++;
				break;

			} else if(initial < 1) {

				j--;

				System.out.println("Make the value greater than 0");

			} else if(initial > max) {

				j--;

				System.out.println("Make the value less than " + max);

			} else {
				
				j--;
				
				System.out.println("C'mon at least try to put a number");
				
			}

		}

		
		int i = 4;
		boolean testbreak = true;
		while(i <= 4){
			String response;

			System.out.println("What is the ISO 4217 code (aka currency code) of the country?");
			System.out.println("The Currency has to be traded more than 1% globaly per day.");

			if (i == 4){
				response = moneyconverter.nextLine() + moneyconverter.nextLine();

			} else {
				response = moneyconverter.nextLine();

			}
			String uppercaseresponse;
			uppercaseresponse = response.toUpperCase();


			switch(uppercaseresponse){
			case "EUR":
				i = 4;
				i++;
				EUR(initial);
				break;

			case "JPY":
				i = 4;
				i++;
				JPY(initial);
				break;

			case "GBP":
				i = 4;
				i++;
				GBP(initial);
				break;

			case "CAD":
				i = 4;
				i++;
				CAD(initial);
				break;

			case "CHF":
				i = 4;
				i++;
				CHF(initial);
				break;

			case "CNY":
				i = 4;
				i++;
				CNY(initial);
				break;

			case "HKD":
				i = 4;
				i++;
				HKD(initial);
				break;

			case "NZD":
				i = 4;
				i++;
				NZD(initial);
				break;

			case "SEK":
				i = 4;
				i++;
				SEK(initial);
				break;

			case "KRW":
				i = 4;
				i++;
				KRW(initial);
				break;

			case "SGD":
				i = 4;
				i++;
				SGD(initial);
				break;

			case "NOK":
				i = 4;
				i++;
				NOK(initial);
				break;

			case "MXN":
				i = 4;
				i++;
				MXN(initial);
				break;

			case "INR":
				i = 4;
				i++;
				INR(initial);
				break;

			case "RUB":
				i = 4;
				i++;
				RUB(initial);
				break;

			case "ZAR":
				i = 4;
				i++;
				ZAR(initial);
				break;

			case "TRY":
				i = 4;
				i++;
				TRY(initial);
				break;

			case "BRL":
				i = 4;
				i++;
				BRL(initial);
				break;

			case "TWD":
				i = 4;
				i++;
				TWD(initial);
				break;

			case "DKK":
				i = 4;
				i++;
				DKK(initial);
				break;

			case "PLN":
				i = 4;
				i++;
				PLN(initial);
				break;

			case "THB":
				i = 4;
				i++;
				THB(initial);
				break;

			case "IDR":
				i = 4;
				i++;
				IDR(initial);
				break;

			case "HUF":
				i = 4;
				i++;
				HUF(initial);
				break;

			case "CZK":
				i = 4;
				i++;
				CZK(initial);
				break;

			case "ILS":
				i = 4;
				i++;
				ILS(initial);
				break;

			case "CLP":
				i = 4;
				i++;
				CLP(initial);
				break;

			case "PHP":
				i = 4;
				i++;
				PHP(initial);
				break;

			case "AED":
				i = 4;
				i++;
				AED(initial);
				break;

			case "COP":
				i = 4;
				i++;
				COP(initial);
				break;

			case "SAR":
				i = 4;
				i++;
				SAR(initial);
				break;

			case "MYR":
				i = 4;
				i++;
				MYR(initial);
				break;

			case "RON":
				i = 4;
				i++;
				RON(initial);
				break;


			default:
				System.out.println("Invalid code");
				i--;

			}

		}






	}

	private static void RON(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Roman Leu is " + df2.format(initial * 4.15) + " when the American Dollar is $" + initial);

	}

	private static void MYR(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Malaysian Ringgit is " + df2.format(initial * 4.14) + " when the American Dollar is $" + initial);

	}

	private static void SAR(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Saudi Riyal is " + df2.format(initial * 3.75) + " when the American Dollar is $" + initial);

	}

	private static void COP(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Colombian Peso is " + df2.format(initial * 3769.00) + " when the American Dollar is $" + initial);

	}

	private static void AED(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The United Arab Emirates Dirham is " + df2.format(initial * 3.67) + " when the American Dollar is $" + initial);

	}

	private static void PHP(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Philippine peso is " + df2.format(initial * 48.50) + " when the American Dollar is $" + initial);

	}

	private static void CLP(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Chilean Peso is " + df2.format(initial * 748.60) + " when the American Dollar is $" + initial);

	}

	private static void ILS(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Israeli New Shekel is " + df2.format(initial * 3.28) + " when the American Dollar is $" + initial);

	}

	private static void CZK(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Czech Koruna is " + df2.format(initial * 21.56) + " when the American Dollar is $" + initial);

	}

	private static void HUF(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Hungarian Forint is " + df2.format(initial * 299.97) + " when the American Dollar is $" + initial);

	}

	private static void IDR(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Indonesian Rupiah is " + df2.format(initial * 14489.50) + " when the American Dollar is $" + initial);

	}

	private static void THB(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Thai Baht is " + df2.format(initial * 31.44) + " when the American Dollar is $" + initial);

	}

	private static void PLN(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Poland złoty is " + df2.format(initial * 3.84) + " when the American Dollar is $" + initial);

	}

	private static void DKK(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Danish Krone is " + df2.format(initial * 6.27) + " when the American Dollar is $" + initial);

	}

	private static void TWD(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The New Taiwan is " + df2.format(initial * 27.79) + " when the American Dollar is $" + initial);

	}

	private static void BRL(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Brazilian Real is " + df2.format(initial * 5.09) + " when the American Dollar is $" + initial);

	}

	private static void TRY(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Turkish Lira is " + df2.format(initial * 8.74) + " when the American Dollar is $" + initial);

	}

	private static void ZAR(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The South African Rand is " + df2.format(initial * 14.35) + " when the American Dollar is $" + initial);

	}

	private static void RUB(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Russian Ruble is " + df2.format(initial * 72.80) + " when the American Dollar is $" + initial);

	}

	private static void INR(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Indian Rupee is " + df2.format(initial * 74.14) + " when the American Dollar is $" + initial);

	}

	private static void MXN(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Mexican Peso is " + df2.format(initial * 20.67) + " when the American Dollar is $" + initial);

	}

	private static void NOK(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Norwegian Krone is " + df2.format(initial * 8.67) + " when the American Dollar is $" + initial);

	}

	private static void SGD(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Singapore Dollar is " + df2.format(initial * 1.34) + " when the American Dollar is $" + initial);

	}

	private static void KRW(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The South Korean won is " + df2.format(initial * 1135.25) + " when the American Dollar is $" + initial);

	}

	private static void SEK(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Swedish Krona is " + df2.format(initial * 8.61) + " when the American Dollar is $" + initial);

	}

	private static void NZD(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The New Zealand Dollar is " + df2.format(initial * 1.44) + " when the American Dollar is $" + initial);

	}

	private static void HKD(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Hong Kong Dollar is " + df2.format(initial * 7.76) + " when the American Dollar is $" + initial);

	}

	private static void CNY(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Chinese Yuan is " + df2.format(initial * 6.45) + " when the American Dollar is $" + initial);

	}

	private static void CHF(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Swiss Franc is " + df2.format(initial * 0.92) + " when the American Dollar is $" + initial);

	}

	private static void CAD(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Canadian Dollar is " + df2.format(initial * 1.25) + " when the American Dollar is $" + initial);

	}

	private static void GBP(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Pound Sterling is " + df2.format(initial * 0.72) + " when the American Dollar is $" + initial);

	}

	private static void JPY(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Japanese Yen is " + df2.format(initial * 110.24) + " when the American Dollar is $" + initial);

	}

	private static void EUR(double initial) {
		// TODO Auto-generated method stub
		System.out.println("The Euro is " + df2.format(initial * .84) + " when the American Dollar is $" + initial);

	}


}
