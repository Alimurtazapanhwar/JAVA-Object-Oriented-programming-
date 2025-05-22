class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class VotingSystem {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }
}

public class Custom_ExceptionHandling {
    public static void main(String[] args) {
        try {
            VotingSystem.checkAge(19);
        } catch (InvalidAgeException e) {
            System.out.println("Caught InvalidAgeException: " + e.getMessage());
        }
    }
}