import java.util.regex.Pattern;

public class ParserTest {

    public static void main(String[] args) {
        String text = "pow(1,3)";
        text = text.replaceAll("\\s", "");
        int maxDegree = getMaxDegree(text);
        consolePrint(maxDegree+"");
    }

    private static int getMaxDegree(String function){
        String[] powSplit = function.split("pow");
        int maxDegree = 0;
        if(function.contains("x")) maxDegree = 1;
        for(int index = 1; index < powSplit.length; index++){
            String powElement = getParenthesisElement(powSplit[index]);
            if(powElement.split(",")[0].contains("x")) {
                int degree = getPowDegree(powElement);
                if (maxDegree < degree) maxDegree = degree;
            }
        }

        return maxDegree;
    }

    private static String getParenthesisElement(String element){
        int openParenthesis = 1;
        char[] charElements = element.toCharArray();
        for(int index = 1; index < charElements.length; index++){
            if(charElements[index] == '(') openParenthesis++;
            if(charElements[index] == ')') openParenthesis--;
            if(openParenthesis==0) return element.substring(1, index);
        }
        return "";
    }

    private static int getPowDegree(String powElements){
        return Integer.parseInt(powElements.split(",")[1]);
    }

    private static void consolePrint(String str){
        System.out.println(str);
    }
}
