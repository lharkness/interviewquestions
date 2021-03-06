package com.leeharkness.programmingchallenges;

/**
 * Holds methods which support converting decimal numbers
 * to their String format (e.g. 1 = One, 24 = "Twenty Four".
 */
class NumberStringifier {

    /**
     * Handles numbers below 1000.  It pulls out units,
     * tens and hundreds and builds of the String representation
     * based on those values.
     * @param number The number to convert
     * @return the String format of number
     */
    static String simpleStringify(int number) {
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
            answer.append(" Hundred");
        }
        if (tens != 0) {
            if (hundreds != 0) {
                answer.append(" And ");
            }
            answer.append(makeTens(tens, units));
        }
        if (tens == 0 || tens > 1) {
            if (tens != 0) {
                answer.append(" ");
            }
            if (hundreds != 0 && tens == 0 && units != 0) {
                answer.append(" And ");
            }

            if (units != 0) {
                answer.append(makeUnits(units));
            }
            else {
                if (hundreds == 0 && tens == 0) {
                    answer.append("Zero");
                }
            }
        }

        return answer.toString();

    }

    /**
     * Handles converting tens to their String format
     * e.g. 10 = Ten, 20 = Twenty, 14 = Fourteen
     * @param value The value to convert
     * @param units the units value (needed for teens)
     * @return The String format of value
     */
    private static String makeTens(int value, int units) {
        String retVal = null;
          if (value > 1) {
              switch(value) {
                  case 2:
                      retVal = "Twenty";
                      break;
                  case 3:
                      retVal = "Thirty";
                      break;
                  case 4:
                      retVal = "Forty";
                      break;
                  case 5:
                      retVal = "Fifty";
                      break;
                  case 6:
                      retVal = "Sixty";
                      break;
                  case 7:
                      retVal = "Seventy";
                      break;
                  case 8:
                      retVal = "Eighty";
                      break;
                  case 9:
                      retVal = "Ninety";
                      break;
              }
          }
          else {
              switch(units) {
                  case 0:
                      retVal = "Ten";
                      break;
                  case 1:
                      retVal = "Eleven";
                      break;
                  case 2:
                      retVal = "Twelve";
                      break;
                  case 3:
                      retVal = "Thirteen";
                      break;
                  case 4:
                      retVal = "Fourteen";
                      break;
                  case 5:
                      retVal = "Fifteen";
                      break;
                  case 6:
                      retVal = "Sixteen";
                      break;
                  case 7:
                      retVal = "Seventeen";
                      break;
                  case 8:
                      retVal = "Eighteen";
                      break;
                  case 9:
                      retVal = "Nineteen";
                      break;
              }

              return retVal;
          }
          return retVal;
    }

    /**
     * Handles converting units to String format
     * e.g. 1 = One, 9 = Nine
     * @param value the value to convert to String representation
     * @return The string representation of value
     */
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
