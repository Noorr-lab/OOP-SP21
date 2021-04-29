package com.company;
public class StringTokenizer {
    static int tokenCount = 0;
    StringTokenizer(String token){
        boolean isNum = false;
        if(token.charAt(0) >= '0' && token.charAt(0) <= '5') {
            isNum = true;
        }
        if(!isNum) {
            tokenCount++;
        }
    }
    public int countToken() {
        return tokenCount;
    }
}

