import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    Integer getList(int o) {
    

    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(3);
    list.add(5);
    list.add(7);

        List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
        Integer secondLowest = sorted.get(1);
        return o;
    }

    public static Set<Integer> getTreeSet(){
    int a[] = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};
    Set<Integer> k = new HashSet<Integer>();
      try {
        for(int i = 0; i < 5; i++) {
            k.add(a[i]);
        }
       System.out.println(k);
        TreeSet sorted = new TreeSet<Integer>(k);
        System.out.println("Sorted list = ");
        System.out.println(sorted);
    }
      catch(Exception e) {}
        return k;
    }

    public static String twoTheSameLettersFromAllWords(String str) {
        String input = "The world is better places";

        input.chars().mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 2)
                .forEach((k) -> System.out.println(k));

        return str;
    }
    public static String RepeadedLettersInWord(String str){
            String input = "Japan is here";

            input.chars().mapToObj(i -> (char) i)
                    .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                    .forEach((k,v) -> System.out.println(k+ " -> "+v));
            return input;
        }
    public static int Calculator(int a, int b){
            for (int i = 1; i <= 10; i++ ){
                for (int j = 1; j <= 10; j++){
                    if (i % 2 != 0)
                    continue;
                    System.out.print(i * j + " ");
                }
                System.out.println();
            }
            return a*b;
        }
    public static String LongestWord(String str){

        String input = "The world is better placeeea";
        int count = 0, temp = 0;
        String[] wordList = input.split(" ");
        String word = wordList[0];

        for(int i = 0; i < wordList.length; i++) {
            for(int j = 0; j < wordList[i].length(); j++) {
                temp = 0;
                for(int k = 0; k < wordList[i].length(); k++) {
                    if(wordList[i].charAt(j) == wordList[i].charAt(k)) {
                        temp++;
                    }
                }
                if(count < temp) {
                    count = temp;
                    word = wordList[i];
                    temp = 0;
                }
            }
        }
        if(count == 1){
            return "-1";
        }
        str = word;
        return str;

    }


    public static void main(String[] args) {


        System.out.println(twoTheSameLettersFromAllWords(""));
        System.out.println(LongestWord(""));
        System.out.println(RepeadedLettersInWord(""));
        System.out.println(Calculator(1,1));
        System.out.println(getTreeSet());
    }
}