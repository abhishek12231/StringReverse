import java.util.Stack;

// defined a class named StringReversal
public class wordReverse {

    // defined a method named reverseWords that takes a string parameter
    public static String reverseWords(String sentence) {

        // create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // create a StringBuilder to build the reversed sentence
        StringBuilder sBuild = new StringBuilder();

        // iterate through each character in the input sentence
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            // check if the character is not a space or any comma or a period
            if (c != ' ' && c != ',' && c != '.') {
                // if not push the character onto the stack
                stack.push(c);
            } else {
                // if the character is a space or comma, or period
                // pop characters from the stack and append to the StringBuilder until the stack is empty
                while (!stack.isEmpty()) {
                    sBuild.append(stack.pop());
                }

                // append the space or comma or period to the StringBuilder
                sBuild.append(c);
            }
        }

        // process the last word by popping characters from the stack
        // and than appending to the StringBuilder
        while (!stack.isEmpty()) {
            sBuild.append(stack.pop());
        }

        // return the reversed sentence as a string
        return sBuild.toString();
    }
    // reversewords method takes a string sentence as input and reverses the order of words in it
    // stack is used to store characters of each word temporarily
    // string builder is used to construct the reversed sentence
    // method iterates through each character in the input sentence
    // if the character is not a space comma or period, it is pushed onto the stack
    // if the character is a space comma or period
    // the characters on the stack are popped and appended to the string builder
    // and then the space, comma, or period is appended
    // after processing the entire sentence the method handles the last word by popping characters from the stack and appending them to the string bhuilder
    // the final reversed sentence is returned as a string

}
