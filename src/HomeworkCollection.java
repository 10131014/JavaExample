import java.util.ArrayList;
import java.util.List;

//首先初始化一个Hero集合，里面放100个Hero对象，名称分别是从
//hero 0
//hero 1
//hero 2
//...
//hero 99.
//通过遍历的手段，删除掉名字编号是8的倍数的对象
public class HomeworkCollection {
    public static void main(String[] args)
    {
        List<Hero> heroes2 =new ArrayList<Hero>();
        for (int i=0;i<100;i++)
        {
            heroes2.add(new Hero("heroes"+i));
        }
        for (int j=96;j>=0;j=j-8)
        {
            heroes2.remove(j);

        }
        for (Hero h2:heroes2)
        {
            System.out.println(h2);
        }


    }
}
