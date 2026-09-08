class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); 
        Map<Character, Character> map = new HashMap<>(); 

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
         
        // for every char in s: 
        // check if map contains that key (i.e is it a closing one)
        // if no: push onto stack 
        // if yes: 
            // check that the stack is not empty (otherwise we have a mismatch already )
            // and that the most recent element in the stack (opening) == the corresponding closed value from the map

        for (char c : s.toCharArray())
        {
            if (map.containsKey(c))
            {
                if (!stack.isEmpty() && stack.peek() == map.get(c))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                stack.push(c);
            }
        }

        return stack.isEmpty(); 
    }
}
