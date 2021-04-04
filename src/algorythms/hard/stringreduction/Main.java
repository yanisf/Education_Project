package algorythms.hard.stringreduction;

public class Main {

    public static void main(String[] args) {
        String input = "ababab"; //ba должны замениться первыми
        //input = "bababa"; //ab должны замениться первыми
        input = "abcabc";
        stringReduction(input);
        System.out.println(stringReduction(input));
    }

    //https://stackoverflow.com/questions/8033553/stumped-on-a-java-interview-need-some-hints/8715230#8715230
    public static long stringReduction(String input) {
        long countA = input.chars().filter(ch -> ch == 'a').count();
        long countB = input.chars().filter(ch -> ch == 'b').count();
        long countC = input.chars().filter(ch -> ch == 'b').count();
        if ((countA == 0 && countB == 0) || (countA == 0 && countC == 0)
                || (countB == 0 && countC == 0)) {
            return input.length();
        } else if (countA % 2 == 0 && countB % 2 == 0 && countC == 0) {
            return 2;
        }
        return 1;
    }
}
