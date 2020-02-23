package cn.zy;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * @author zy
 * @create 2020-02-10 17:08
 */
public class Test22 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Object());
        arrayList.add(new Object());
        arrayList.add(new Object());
        arrayList.add(new Object());
        arrayList.add(new Object());
        arrayList.add(new Object());
        arrayList.add(new Object());
        arrayList.add(new Object());
        arrayList.add(new Object());
        arrayList.add(new Object());

        List<Object> objects = arrayList.subList(11, 10);

    }
    @Test
    public  void demo(){
        Calendar calendar = Calendar.getInstance();
       // System.out.println(calendar.toString());
//        calendar.setTime(dateTime);
//        calendar.add(field, date);
        System.out.println("nihoya ");
        System.out.println(calendar.getTime());
        Timestamp timestamp = new Timestamp(calendar.getTime().getTime());
        System.out.println(timestamp);
    }
}
