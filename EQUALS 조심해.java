class Solution {
    boolean solution(String s) {
        boolean answer;
        int numP = 0;
        int numY = 0;
        s = s.toLowerCase();
        for(int i = 0; i<s.length(); i++){
            String[] arr = new String[s.length()];
            arr = s.split("");
            if(arr[i].equals("p")){   //맨날 여기에서 equlas("p") 안 쓰고, arr[i] == "p" 로 하는 매번 실수.
                numP++;
            }else if(arr[i].equals("y")){
                numY++;
            }
        }
        if(numP == numY){
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }
}
