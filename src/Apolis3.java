import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Apolis3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input = scanner.nextLine();
        System.out.println(findFirstNorRepChar(input));
    }

    private static Character findFirstNorRepChar(String str) {
        Map<Character,Integer> cntMap = new LinkedHashMap<>();
        for(char ch: str.toCharArray()){
            cntMap.put(ch, cntMap.getOrDefault(ch,0)+1);
        }
        //Finding the char whose frequency is 1
        for(char ch:str.toCharArray()){
            if(cntMap.get(ch)==1){
                return ch;
            }
        }
        return ' ';

    }

    //O(2n)

}
