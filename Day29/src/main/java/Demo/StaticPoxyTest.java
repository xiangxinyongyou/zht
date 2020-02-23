package Demo;


/**
 * @author zy
 * @create 2019-10-25 10:32
 */
interface ClothFactory {
    void proctoryCloth();
}
//代理
class ProxyClothFactory implements ClothFactory{
private ClothFactory factory;

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void proctoryCloth() {
        System.out.println("准备工作");
        factory.proctoryCloth();
        System.out.println("收尾工作");
    }
}
//被代理
 class NikeClothFactory implements ClothFactory{

    @Override
    public void proctoryCloth() {
        System.out.println("生成运动服装");
    }
}
public class StaticPoxyTest {
    public static void main(String[] args) {

        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ClothFactory clothFactory = new ProxyClothFactory(nikeClothFactory);
        clothFactory.proctoryCloth();
    }
}
