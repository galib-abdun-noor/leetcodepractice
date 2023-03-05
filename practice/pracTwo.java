import java.util.ArrayList;

public class pracTwo {
    public static void main(String[] args) {
        String[] arrOne = {"flower", "flow", "flight"};
        String[] arrTwo = {"dog", "racecar", "car"};
        String[] arrThree = {"ab", "a"};
        String[] arrFour = {"abab","aba",""};
        //System.out.println(longestCommonPrefix(arrOne));
        //System.out.println(longestCommonPrefix(arrTwo));
        System.out.println(longestCommonPrefix(arrThree));
        System.out.println(longestCommonPrefix(arrFour));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        ArrayList<Character> prefArr = new ArrayList<Character>();
        char[] firstWord = strs[0].toCharArray();
        for(int i=0;i< strs.length;i++){

        }
        if(strs.length == 1){
            return strs[0];
        }
        for (int i = 0; i < firstWord.length; i++) {
            for (int j = 1; j < strs.length; j++) {
                String word = strs[j];
                if(j>1) {
                    if (word.isEmpty() || word.length()<=i) {
                        prefArr.remove(i);
                        break;
                    }
                    else if (firstWord[i] == word.charAt(i)) {
                        continue;
                    } else {
                        prefArr.remove(i);
                        break;
                    }
                } else {
                    if (firstWord[i] == word.charAt(i)) {
                        prefArr.add(firstWord[i]);
                        continue;
                    } else {
                        break;
                    }
                }
            }
            if (prefArr.isEmpty() || !prefArr.contains(firstWord[i])) {
                break;
            }
        }
        for(int i=0;i<prefArr.size();i++){
            prefix = prefix+prefArr.get(i);
        }
        return prefix;
    }
}

