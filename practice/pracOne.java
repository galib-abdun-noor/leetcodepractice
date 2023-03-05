import java.sql.SQLOutput;
import java.util.HashMap;

public class pracOne {
    public static void main(String[] args){
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        int num = 0;
        char[] chArr = s.toCharArray();

        int i=0;
        while(i<chArr.length){
            if(i<(chArr.length-1)){
                if(map.get(String.valueOf(chArr[i]))<map.get(String.valueOf(chArr[i+1]))) {
                    if (chArr[i] == 'I') {
                        if (chArr[i + 1] == 'V') {
                            num = num + 4;
                            i += 2;
                            continue;
                        } else {
                            num = num + 9;
                            i += 2;
                            continue;
                        }
                    } else if (chArr[i] == 'X') {
                        if (chArr[i + 1] == 'L') {
                            num = num + 40;
                            i += 2;
                            continue;
                        } else {
                            num = num + 90;
                            i += 2;
                            continue;
                        }
                    } else {
                        if (chArr[i + 1] == 'D') {
                            num = num + 400;
                            i += 2;
                            continue;
                        } else {
                            num = num + 900;
                            i += 2;
                            continue;
                        }
                    }
                }
            }
            num = num + map.get(String.valueOf(chArr[i]));
            i+=1;

        }

        return num;
    }
}
