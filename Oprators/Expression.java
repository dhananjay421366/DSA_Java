// public class OperatorAssignmentQuestions {
//     public static void main(String args[]) {
//         int x = 2, y = 5;
//         int exp1 = (x * y / x);
//         int exp2 = (x * (y / x));

//         System.out.println(exp1 + " , ");
//         System.out.println(exp2);
//     }
// }

// public class Logical_Operator {
//     public static void main(String args[]) {
//         int x = 200, y = 50, z = 100;

//         if (x > y && y > x) { // false
//             System.out.println("Hello");

//         }
//         if (x > y && z < x) {
//             System.out.println("Java");
//         }
//     }
// }

// public class Assignment_Operator {
//     public static void main(String args[]) {
//         int x, y, z;
//         x = y = z = 2;
//         x += y; // 4
//         y -= z; // 0
//         z /= (x + y);

//         System.out.println(x + " " + y + " " + z);

//     }

// }

// public class Expressions_Op {
//     public static void main(String args[]) {
//         int x = 9, y = 12;
//         int a = 2, b = 4, c = 6;
//         int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
//         System.out.println(exp);
//     }
// }

public class Expression {
    public static void main(String args[]) {
        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}