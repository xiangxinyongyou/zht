package cn.zy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zy
 * @create 2020-02-07 17:41
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("=============niha ");
        Map<String, String> map = new HashMap<String, String>();
        map.put("b", "4");
        map.put("a", "5");
        map.put("c", "3");
        map.put("d", "5");
       // System.out.println(map);
       Set<String> key = map.keySet();
//        for (String keyq : map.keySet()) {
//            String value = map.get(keyq);
//            System.out.println(keyq + "  " + value);
//        }
        try {
            System.out.println(key);
            for (String s : key) {
                if ("a".equals(s)){
                    String s1 = map.get(s);
                    System.out.println(s);
                    System.out.println(s1);
                }
            }
        }catch (Exception e){
            System.out.println("空的");
        }
       //
    }
}
