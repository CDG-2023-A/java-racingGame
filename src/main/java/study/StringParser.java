package study;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringParser {
    //문자열을 파싱하는 책임

    public ArrayList<Object> parse(String input) {
        StringTokenizer st = new StringTokenizer(input, " ");
        ArrayList<Object> tokens = new ArrayList();

        insertTokens(st,tokens);

        return tokens;

    }

    private static void insertTokens(StringTokenizer st, ArrayList tokens) {
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            classifyToken(tokens, token);   // 타입에 따라 token 분류
        }

    }

    private static void classifyToken(ArrayList tokens, String token) {
        if (isNumeric(token)) {
            tokens.add(Integer.parseInt(token));  // 숫자인 경우 int로 변환하여 추가
        } else {
            tokens.add(token);  // 문자열인 경우 그대로 추가
        }
    }

    private static boolean isNumeric(String str) { // 숫자인지 판단
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


