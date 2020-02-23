package cn.zy;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author zy
 * @create 2019-11-11 9:39
 */
public class IoTest1 {
    @Test
    /*
     * 对于文件的读取
     *
     * 对于异常的处理    最好不要使用throws IOException
     * 原因：  设计到对于流的一个关闭，要是不关闭就会造成资源的浪费
     *        需要使用try () catch() finally()
     * 关闭流也有一个异常  try () catch()
     * */
    public void Test1() {
        FileReader fileReader = null;
        try {
            //实例化对象
            File file = new File("hello.txt");
            //提供具体的流
            fileReader = new FileReader(file);
            //数据的读入   返回读入的一个字符  如果读到文件的末尾就会返回-1

            // 方式一：
      /*  int date = fileReader.read();
        while (date!=-1){
            System.out.print((char) date);
            date= fileReader.read();
        }*/

            //方式一的优化代码
            int date;
            while ((date = fileReader.read()) != -1) {
                System.out.print((char) date);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //对于流的关闭
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    /*
     * 方式二  对read的一个升级
     * */
    public void Test2()  {
        FileReader fileReader = null;
        try {
            File file = new File("hello.txt");
            fileReader = new FileReader(file);
            char[] cbuf = new char[6];
            int date;
            while ((date = fileReader.read(cbuf)) != -1) {
             /*   //方式一：
                for (int i = 0; i < date; i++) {
                    System.out.print(cbuf[i]);
                }*/
             /*  //这种写法是错误的  位数不够时只替换一部分， 不是只读取已经存在的文件内容
                for (int i = 0; i < cbuf.length; i++) {
                    System.out.print(cbuf[i]);
                }*/

//             方式二：
                //错误  参考上面的错误
//                String s = new String(cbuf);
//                System.out.print(s);
                //正确
                String s = new String(cbuf, 0, date);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
