package cn.Map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author zy
 * @create 2019-11-12 10:39
 */
public class MapTest {
    @Test
    public void Test1(){
       Map map = new HashMap();
       map.put(null, null);
        System.out.println(map);
    }
    @Test
    public void Test2(){
        Map map = new Hashtable();
        map.put(null, null);
        System.out.println(map);
    }
}
