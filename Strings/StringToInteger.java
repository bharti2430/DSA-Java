public int myAtoi(String s) {
    int index = 0;
    int length = s.length();
    int result = 0;
    int sign = 1;

    // Step 1: Ignore leading whitespace
    while (index < length && s.charAt(index) == ' ') {
        index++;
    }

    // Step 2: Check for the sign
    if (index < length && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
        sign = (s.charAt(index) == '-') ? -1 : 1;
        index++;
    }

    // Step 3: Read digits and convert to integer
    while (index < length && Character.isDigit(s.charAt(index))) {
        int digit = s.charAt(index) - '0';

        // Step 4: Handle overflow and underflow
        if (result > (Integer.MAX_VALUE - digit) / 10) {
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        result = result * 10 + digit;
        index++;
    }

    return result * sign;
}

Input: s = "42"
Output: 42
Input: s = " -042"
Output: -42
Input: s = "1337c0d3"
Output: 1337

// using recursion
public int myAtoi(String s) {
        return myAtoiHelper(s.trim(), 0, 0, 1);
    }
    private int myAtoiHelper(String s, int index, int result, int sign) {
        if (index >= s.length()) return result * sign;  // Base case: end of string
        
        char currentChar = s.charAt(index);
        
        // Handle sign at the beginning of the string
        if (index == 0 && (currentChar == '-' || currentChar == '+')) {
            sign = (currentChar == '-') ? -1 : 1;
            return myAtoiHelper(s, index + 1, result, sign);
        }
        
        // Handle digit conversion
        if (Character.isDigit(currentChar)) {
            int digit = currentChar - '0';
            
            // Handle overflow and underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            return myAtoiHelper(s, index + 1, result, sign);
        }
        
        // If non-digit character is encountered, return the current result
        return result * sign;
    }
