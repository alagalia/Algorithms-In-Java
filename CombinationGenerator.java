import java.util.Arrays;
/**
 Print all K-combinations of N-elements
 */
public class CombinationGenerator {
    public static void main(String[] args) {
        int k = 3;

        int startN=1;
        int end=5;
        int[] combinations = new int[k];

        genComb(combinations, 0, startN, end);
    }

    private static void genComb(int[] combinations, int index, int startN, int endN) {
        if (index>=combinations.length){
            System.out.println(Arrays.toString(combinations));
        }
        else {
            for (int i = startN; i <= endN; i++) {
                combinations[index]=i;
                genComb(combinations, index+1, i+1,endN);
            }
        }
    }
}
