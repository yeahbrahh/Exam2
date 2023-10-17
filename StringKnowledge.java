//       Question 1:
//
//        Write a method named endOther that takes two strings a and b as arguments
//        and returns a boolean. Given the two strings, return true if either of
//        the strings appears at the very end of the other string, ignoring upper/lower case
//        differences (in other words, the computation should not be "case sensitive").
//        Note: "String".toLowerCase() returns the lowercase version of a string.
//        Examples:
//        endOther("Hiabc", "abc") --> true
//        endOther("AbC", "HiaBc") --> true
//        endOther("abc", "abXabc") --> true
//        endOther("abc", "xyz") --> false
//
//        Question 2:
//
//        Write a method named findRepeats that takes one string argument `toTest`
//        and returns a boolean. If any of the substrings with length greater than or equal to 2
//        within `toTest` appear multiple times, findRepeats will return true, else returning false.
//        By "substrings within", I mean any possible substring within the given string. So for "abc",
//        all of it's substrings are "a", "b", "c", "ab", and "bc". Only "ab" and "bc" have a length
//        greater than or equal to 2, so you would only have to search for them.
//
//        Examples:
//        findRepeats("abba") --> false
//        ("a" and "b" both appear multiple times,but only as single characters)
//        findRepeats("abaaba") --> true ("aba" appears twice)
//        findRepeats("I love hams in the desert. Just love eating a ham")
//        --> true ("ham" and "love" both appear twice, but you could return true as
//        soon as you found a single one)/*

public class StringKnowledge {

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith(b) || b.endsWith(a);
    }

    public static boolean findRepeats(String toTest) {
        for (int i = 0; i < toTest.length(); i++) {
            for (int j = i + 2; j < toTest.length(); j++) {
                String substring = toTest.substring(i, j);
                if (toTest.indexOf(substring, i + 1) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Question 1
        boolean result1 = endOther("abc", "xyzABC");
        boolean result2 = endOther("white", "black");

        System.out.println(result1); // true
        System.out.println(result2); // false

        // Question 2
        boolean testResult1 = findRepeats("abc");
        boolean testResult2 = findRepeats("abbc");
        boolean testResult3 = findRepeats("aabbcc");

        System.out.println(testResult1);  // Output: false
        System.out.println(testResult2);  // Output: true
        System.out.println(testResult3);  // Output: true

    }
}





