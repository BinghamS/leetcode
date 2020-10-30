package xiecheng;

import java.util.*;

public class test33 {
    static int validateArrayUsages(String[] lines) {
        int arr_size = 0;
        for (int i = 0; i < lines.length; i++) {
            if (i == 0){
                String arr_size_str = "";
                Boolean flag = false;
                for (int j = 0; j < lines[0].length(); j++) {
                    if (lines[0].charAt(j) == '['){
                        flag = true;
                    }
                    if(lines[0].charAt(j) == ']'){
                        flag = false;
                    }
                    if (flag == true){
                        arr_size_str = arr_size_str + lines[0].charAt(j);
                    }
                }
                int length1 = arr_size_str.length();
                arr_size_str = arr_size_str.substring(1,length1);
                arr_size = Integer.parseInt(arr_size_str);
            }else{
                String num_str = "";
                Boolean flag = false;
                for (int j = 0; j < lines[i].length(); j++) {
                    if (lines[i].charAt(j) == '['){
                        flag = true;
                    }
                    if(lines[i].charAt(j) == ']'){
                        flag = false;
                        int length1 = num_str.length();
                        num_str = num_str.substring(1,length1);
                        int arr_size_cur = Integer.parseInt(num_str);
                        if (arr_size_cur <= 0 || arr_size_cur > arr_size){
                            return i+1;
                        }
                        num_str = "";
                    }
                    if (flag == true){
                        num_str = num_str + lines[i].charAt(j);
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _lines_size = 0;
        _lines_size = Integer.parseInt(in.nextLine().trim());
        String[] _lines = new String[_lines_size];
        String _lines_item;
        for(int _lines_i = 0; _lines_i < _lines_size; _lines_i++) {
            try {
                _lines_item = in.nextLine();
            } catch (Exception e) {
                _lines_item = null;
            }
            _lines[_lines_i] = _lines_item;
        }
        res = validateArrayUsages(_lines);
        System.out.println(String.valueOf(res));
    }
}
