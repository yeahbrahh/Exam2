//Question 3:
//  Write a method named greenTicket that takes three integer arguments:
//  a, b and c and returns an integer. You have a green lottery ticket, with ints a, b, and c on it.
//  If the numbers are all different from each other, the result is 0.
//  If all of the numbers are the same, the result is 20.
//  If two of the numbers are the same, the result is 10.
//
//
//  Examples:
//        greenTicket(1, 2, 3) → 0
//        greenTicket(2, 2, 2) → 20
//        greenTicket(1, 1, 2) → 10
//
//        Question 4:
//       Write a method named makeChocolate that takes three integer arguments:
//       small, large and goal and returns an integer. The small argument is the number of
//       1 pound chocolate bars we have, large is the number of 5 pound chocolate bars we have,
//       the goal is the total number of pounds we need to sell. The method should return the number
//       of small bars to use, assuming we use as many of the big bars as possible before the small bars.
//       Return -1 if it cannot be done.
//
//
//        Examples:
//        makeChocolate(4, 1, 9) → 4
//        makeChocolate(4, 1, 10) → -1
//        makeChocolate(4, 1, 7) → 2
//        makeChocolate(4, 2, 7) → 2


public class LogicKnowledge {

    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }


    }

    public static int makeChocolate(int small, int large, int goal) {
        int largeBars = goal / 5;
        if (largeBars > large) {
            largeBars = large;
        }
        int remainingGoal = goal - (largeBars * 5);

        if (remainingGoal <= small) {
            return remainingGoal;
        }

        return -1;
    }

    // Question 3
    public static void main(String[] args) {
        System.out.println("Lottery Ticket:");

        int ticketResult1 = greenTicket(1, 2, 3);
        int ticketResult2 = greenTicket(2, 2, 3);
        int ticketResult3 = greenTicket(2, 2, 2);

        System.out.println(ticketResult1);
        System.out.println(ticketResult2);
        System.out.println(ticketResult3);

        System.out.println("\n Chocolate Bars:");

        // Question 4
        int result1 = makeChocolate(4, 1, 9);
        int result2 = makeChocolate(4, 1, 10);
        int result3 = makeChocolate(4, 1, 7);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}