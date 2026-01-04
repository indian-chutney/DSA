import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    public static String encode (ArrayList<String> strs){
        String out = "";
        String delimiter = "#";
        for(String str: strs){
            out += str.length() + delimiter + str;
        }
        
        return out;
    }

    public static ArrayList<String> decode(String str){
        int len = str.length();
        if(len == 0)   return new ArrayList<String>();
        ArrayList<String> out = new ArrayList<String>();

        for(int i = 0; i < len - 1; i++){
            int j = i;
            while(str.charAt(j) != '#'){
                // check : for check if the string itself has a delimiter
                j++;
            }
            int val = Integer.parseInt(str.substring(i, j));
            out.add(str.substring(j + 1, j + 1 + val));
            i = j + val;
        }

        return out;
    }   
    public static void main(String [] argS){
        ArrayList<String> strs = new ArrayList<>(List.of("hello", "world", "java", "coool"));
        
        String encoded_str = encode(strs);
        ArrayList<String> out = decode(encoded_str);

        System.out.print('{');

        for(String ans: out){
            System.out.print(ans + " ,");
        }

        System.out.println('}');

    }
}
