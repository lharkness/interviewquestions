package com.leeharkness.programmingchallenges;

/**
 * Holds methods to determine which quadrant a given angle is in
 */
class QuadrantReporter {
    /**
     * Simply derives the quadrant from the normalized angle
     * @param angle the angle
     * @return the quadrant to which the angle belongs
     */
    static int quadrant(int angle) {
        int effectiveAngle = angle % 360;
        // If this happens to be 360 (or some multiple of) then hard-code
        // the response to quadrant 4
        if (angle == 360) {
            return 4;
        }
        else {
            // Note that the effective angle of a multiple of 360 would be 0
            return (effectiveAngle / 90) + 1;
        }
    }
}
