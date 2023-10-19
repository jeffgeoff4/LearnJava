class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    // Method overriding
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

public class Edwin {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Polymorphic assignment
        animal.makeSound(); // Calls the makeSound method of Dog
    }
}

// Recursion
/*
 * Recursion is a programming technique in
 * which a function calls itself to solve a problem
 * Recursion breaks a problem into smaller subproblems, solve the sub problems,
 * and combines their results to solve the originak problem.
 * Recursion is widel used used in various algorthims and is
 * especially well suited for ssolving problems that have a recursive
 * mathematival structure.
 */

// Key characteristics of recursive functions in Programming
/*
 * 1. Base Case: Every recursive function must have one or more
 * base cases that specify when the recursion should stop.
 * 2. Recursive Case: The function calls itself with modifed arguments
 * to solve a smaller or simpler subproblem.
 * 3. Function Parameters: The recursive function often take parameters that
 * represent the problem to be solved. the goal is to reduce the problem
 * towards the base case.
 * 4. Function Return: Recursive functions return a result. in each
 * recursive call. the function may return a value that is part of the solution
 * of the problem.
 */
