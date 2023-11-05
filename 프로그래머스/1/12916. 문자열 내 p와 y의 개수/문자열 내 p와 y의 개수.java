class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] str = s.split("");
        int p = 0;
        int y = 0;
        
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("p") || str[i].equals("P")) {
                p++;
            }
            else if(str[i].equals("y") || str[i].equals("Y")) {
                y++;
            }
        }

        if(p == y) answer = true;
        else if(p != y) answer = false;
        
        return answer;
    }
}