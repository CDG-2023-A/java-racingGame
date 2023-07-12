package calculator;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringParser {

    private List<String> parsingResult = new ArrayList<>();

    private String insert;
    
    public List<String> parse() throws IOException {
        
        insertString();

        parseString();

        isOperatorStructure();

        return parsingResult;
    }

    private void isOperatorStructure() {
        try {
            checkOperatorStructure();
        } catch (IllegalArgumentException e) {
            System.out.println("파싱 결과는 올바른 연산자 구조를 가지고 있지 않습니다: " + e.getMessage());
            throw e;
        }
    }


    private void checkOperatorStructure() {
        if (parsingResult.size() % 2 != 1) {
            throw new IllegalArgumentException("파싱 결과는 올바른 연산자 구조를 가지고 있지 않습니다.");
        }
        for (int i = 0; i < parsingResult.size() - 1; i += 2) {
            if (!isNumeric(parsingResult.get(i)) || !isOperator(parsingResult.get(i + 1))) {
                throw new IllegalArgumentException("파싱 결과는 올바른 연산자 구조를 가지고 있지 않습니다.");
            }
        }
    }

    public boolean isOperator(String str) {
        return str.matches("[+\\-*/]");  // 연산자인지 확인
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  // 숫자인지 확인
    }

    private void parseString() {

        StringTokenizer st = new StringTokenizer(insert, " ");

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            parsingResult.add(token);
        }
    }

    public void insertString() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        insert = br.readLine();

    }

    public List<String> getParsingResult() {
        return parsingResult;
    }

    public String getInsert() {
        return insert;
    }
}
