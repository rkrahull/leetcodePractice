/*
394. Decode String
TC : O(n)
SC : O(n)
*/
class Solution {
    public String decodeString(String s) {
        Stack<Integer> stIn = new Stack<>();
        Stack<StringBuilder> stSb = new Stack<>();
        StringBuilder str = new StringBuilder();
        int val = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                val = val * 10 + (Integer.parseInt(ch+""));
            }
            else if(ch == '['){
                stIn.push(val);
                stSb.push(str);
                val = 0;
                str = new StringBuilder();
            }
            else if(ch == ']'){
                int count = stIn.pop();
                StringBuilder tmp = stSb.pop();
                while(count > 0){
                    tmp.append(str);
                    count--;
                }
                str = tmp;
            }
            else
                str.append(ch);
        }
        return str.toString();
    }
}