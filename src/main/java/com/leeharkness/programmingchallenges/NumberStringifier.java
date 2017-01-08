package com.leeharkness.programmingchallenges;

public class NumberStringifier {

    public static String simpleStringify(int number) {
        if (number >= 1000) {
            return "invalid input";
        }

        int units = number % 10;
        int whatsLeft = number / 10;
        int tens = whatsLeft % 10;
        whatsLeft = whatsLeft / 10;
        int hundreds = whatsLeft % 10;

        StringBuilder answer = new StringBuilder();

        if (hundreds != 0) {
            answer.append(makeUnits(hundreds));
            answer.append(" hundred");
        }
        if (tens  != 0) {
            if (hundreds != 0) {
                answer.append(" and ");
            }
            answer.append(makeTens(tens));
        }
        if (units != 0 && (tens == 0 || tens > 1)) {
            answer.append(makeUnits(units));
        }

        return answer.toString();

    }

    private static String makeTens(int value) {
        return null;
    }

    private static String makeUnits(int value) {
        String retVal = null;
        switch (value) {
            case 0:
                retVal = "Zero";
                break;
            case 1:
                retVal = "One";
                break;
            case 2:
                retVal = "Two";
                break;
            case 3:
                retVal = "Three";
                break;
            case 4:
                retVal = "Four";
                break;
            case 5:
                retVal = "Five";
                break;
            case 6:
                retVal = "Six";
                break;
            case 7:
                retVal = "Seven";
                break;
            case 8:
                retVal = "Eight";
                break;
            case 9:
                retVal = "Nine";
                break;
        }

        return retVal;
    }

}
