package org.example;

public class CurrencyConverter {
    enum ConvertCurrency {
        USD_TO_EUR,
        USD_TO_GBP,
        USD_TO_JPY,
    }

    public static double convert(double amount, String currencyFrom, String currencyTo){
        ConvertCurrency enumConvert = ConvertCurrency.valueOf(String.join("_TO_",currencyFrom, currencyTo ).toUpperCase());

        switch (enumConvert){
            case USD_TO_EUR -> {
                return amount * 0.92;
            }
            case USD_TO_GBP -> {
                return amount * 0.79;
            }
            case USD_TO_JPY -> {
                return amount * 147.65;
            }
        }

        return 0;
    }
}
