package extentions;

import java.util.Arrays;
import java.util.List;


public class Extension {
    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        }
        return c;
    }

    int median(List<Integer> pool) {
        return pool.get((pool.size() - 1) / 2);
    }

    boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                String sp = teve.substring(i);
//                teve = String.join(c + "v" + c,/ teve.substring(0,i) +teve.substring(i).split("" + c, 2));
                teve = teve.substring(0, i) + c + "v" + teve.substring(i);
                i += 2;
                length += 2;
            }
            System.out.println(teve);
        }
        return teve;
    }
}

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed

