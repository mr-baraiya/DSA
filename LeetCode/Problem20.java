class Solution {
    public boolean isValid(String s) {
        char stack[] = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack[++top] = ')';
            } else if (ch == '{') {
                stack[++top] = '}';
            } else if (ch == '[') {
                stack[++top] = ']';
            } else {
                if (top == -1 || stack[top] != ch) {
                    return false;
                }
                top--;
            }
        }

        return top == -1; // If stack is empty, all brackets matched correctly
    }
}
