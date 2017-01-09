package com.leeharkness.programmingchallenges;

/**
 * Holds methods which will print a rectangle with given dimensions
 */
class RectanglePrint {
    static String generateRectangle(int width, int height) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1) {
                    sb.append("*");
                }
                else {
                    if (i == 0 || i == height - 1) {
                        sb.append("*");
                    } else {
                        sb.append(" ");
                    }
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
