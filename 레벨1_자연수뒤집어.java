/*
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]
*/

class Solution {
    public int[] solution(long n) {

        String str = Long.toString(n);
        String[] arr = new String[str.length()];
        arr = str.split(""); 
        // 거꾸로 배열
        int[] answer = new int[str.length()];
        // 원본배열(arr)의 마지막 인덱스(int i = arr.length - 1)부터 탐색하여
        // 거꾸로 배열(reverseArr)에 순서대로 값을 세팅한다.
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            answer[j] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
