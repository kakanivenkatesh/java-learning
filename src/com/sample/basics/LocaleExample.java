package com.sample.basics;

import java.util.Locale;

public class LocaleExample {
	
	public static void main(String[] args) {
		Locale locale = new Locale("en");
		Locale locale1 = new Locale("en", "IN");
		Locale locale2 = Locale.getDefault();
		System.out.println(locale);
		System.out.println(locale1);
		System.out.println(locale2);
		System.out.println(locale1.getLanguage());
		System.out.println(locale2.getLanguage());
		System.out.println(locale1.getCountry());
		System.out.println(locale2.getCountry());
		System.out.println(locale1.getDisplayName());
		System.out.println(locale1.getISO3Language());
	}

}
