import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection2 {
    public static void main(String[] args)
    {
        List<Hero> heroes=new ArrayList<Hero>();
        for (int i=0;i<5;i++)
        {
            heroes.add(new Hero("hero name"+i));
        }
        System.out.println("迭代器的while写法");
        Iterator<Hero> it=heroes.iterator();
        while (it.hasNext())
        {
            Hero h=it.next();
            System.out.println(h);
        }
        System.out.println("迭代器的for写法");
        for (Iterator<Hero> iterator=heroes.iterator();iterator.hasNext();)
        {
            Hero hero=(Hero)iterator.next();
            System.out.println(hero);
        }
    }
}
