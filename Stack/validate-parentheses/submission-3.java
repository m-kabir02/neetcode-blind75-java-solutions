class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> closeToOpen = new HashMap<>();

        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');

    for(char c: s.toCharArray()) {
        if(!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
            stack.pop();
        } else {
        stack.push(c);
        }
    }
        return stack.isEmpty();
    }
}
//Time complexity: O(n)