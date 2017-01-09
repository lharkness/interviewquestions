package com.leeharkness.programmingchallenges;

import java.util.HashMap;
import java.util.Map;

/**
 * Holds methods which lookup first names in a given list and reports the full name
 * This is a rather silly challenge - if you can use a map it just does its thing.
 * If the stipulation is that you can't use Map then you get to implement search
 * and/or sort and I'm not sure how much value that solution provides.
 */
class NameLookup {

    /**
     * The database of names
     */
    private static Map<String, String> names;
    static {
        names = new HashMap<>();
        names.put("Joe", "Smith");
        names.put("Alice", "Hardy");
        names.put("Bob", "Jones");
    }

    /**
     * Returns the full name of the person (First Name + space + Last Name)
     * if the first name doesn't exist in the map then return
     * First Name + space + "null"
     * @param firstName The name to look for
     * @return First Name + space + Last Name (Last Name is null if not found)
     */
    static String lookup(String firstName) {
        return firstName + " " + names.get(firstName);
    }

}
