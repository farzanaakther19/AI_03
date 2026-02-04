import java.util.Scanner;

public class LibraryChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Library Chatbot!");
        System.out.println("Type 'exit' to end the conversation.\n");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("exit")) {
                System.out.println("Chatbot: Goodbye! Have a great day.");
                break;
            }

            // Greeting
            else if (userInput.contains("hello") || userInput.contains("hi") || userInput.contains("hey")) {
                System.out.println("Chatbot: Hello! How can I help you today?");
            }

            // Library hours
            else if (userInput.contains("timing") || userInput.contains("hours") || userInput.contains("open")) {
                System.out.println("Chatbot: The library is open from 9 AM to 6 PM, Monday to Saturday.");
            }

            // Location
            else if (userInput.contains("where") && userInput.contains("library")) {
                System.out.println("Chatbot: The library is located on the Main Campus, Building A.");
            }

            // Membership
            else if (userInput.contains("membership") || userInput.contains("library card")) {
                System.out.println("Chatbot: You can apply for a library card at the front desk with your student ID.");
            }

            // Book search
            else if (userInput.contains("book") || userInput.contains("find")) {
                System.out.println("Chatbot: Please provide the book title. Currently, we have AI, Data Science, and Literature collections.");
            }

            // Fines
            else if (userInput.contains("fine") || userInput.contains("late")) {
                System.out.println("Chatbot: The fine is ₹10 per day for late returns.");
            }

            // Help
            else if (userInput.contains("help")) {
                System.out.println("Chatbot: You can ask me about timings, location, membership, book availability, or fines.");
            }

            // Default response
            else {
                System.out.println("Chatbot: Sorry, I don’t understand that. Please try asking about library services.");
            }
        }

        scanner.close();
    }
}
