import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CombinationSort {

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("d34");
        inputList.add("g54");
        inputList.add("d12");
        inputList.add("b87");
        inputList.add("g1");
        inputList.add("c65");
        inputList.add("g40");
        inputList.add("g5");
        inputList.add("d77");

        List<String> L1 = new ArrayList<>(inputList);
        Collections.sort(L1, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.charAt(0) - s2.charAt(0);
            }
        });

        List<String> L2 = new ArrayList<>(L1);
        Collections.sort(L2, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int num1 = Integer.parseInt(s1.substring(1));
                int num2 = Integer.parseInt(s2.substring(1));
                return s1.charAt(0) == s2.charAt(0) ? num2 - num1 : 0;
            }
        });

        System.out.println("L1: " + L1);
        System.out.println("L2: " + L2);
    }
}
