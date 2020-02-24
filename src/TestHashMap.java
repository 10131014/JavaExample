import java.util.ArrayList;
import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args)
    {
        ArrayList<Hero> hs=new ArrayList<>();
        System.out.println("初始化开始");
        long t1=System.currentTimeMillis();
        for (int i=0;i<3000000;i++)
        {
            Hero h=new Hero("hero-"+(int)(Math.random()*9000+1000));
            hs.add(h);
        }
        long t2=System.currentTimeMillis();
        System.out.println(t2-t1);
        //创建hashmap对象用map引用
        HashMap<String,ArrayList<Hero>> map=new HashMap<>();
        //遍历hs集合，每个对象为hl（hl.name作为键值，相当于对象的名字，也就是Hero类里面的name作为键值，同一name的对象的集合作为map的值）
        long t3=System.currentTimeMillis();
        for (Hero hl:hs)
        {
            //取得每个键对应的值（value集合）
            ArrayList<Hero> value=map.get(hl.name);
            //如果值不存在，也就是说map里面没有键值为hl.name的键，才会进入if语句创建键值对
            if (value==null)
            {
                //就创建个list集合准备接收重复的hl，始终记住map中每个键值对应的是一个集合，集合里面有多个对象
                value=new ArrayList<>();
                //在map里创建键值对，value初始为[]
                map.put(hl.name,value);
            }
            //每循环一次添加当前hl对象至value集合末端（添加至创建的集合里）
            value.add(hl);
        }
        long t4=System.currentTimeMillis();
        System.out.println(t4-t3);
        System.out.println("初始化结束");
        System.out.println("开始查找");
        forLoop(hs);
        mapLoop(map);
    }
    private static void forLoop(ArrayList<Hero> heroes)
    {
        long start=System.currentTimeMillis();
        ArrayList<Hero> result=new ArrayList<Hero>();
        for (Hero h:heroes)
        {
            if (h.name.equals("hero-6666"))
            {
                result.add(h);
            }
        }
        long end=System.currentTimeMillis();
        System.out.printf("通过for查找，"+"一共找到%d重复个英雄，耗时%d毫秒%n",result.size(),end-start);
    }
    private static void mapLoop(HashMap<String,ArrayList<Hero>>map)
    {
        long start=System.currentTimeMillis();
        ArrayList<Hero> result=map.get("hero-6666");
        long end=System.currentTimeMillis();
        System.out.printf("通过map查找，"+"一共找到%d重复个英雄，耗时%d毫秒%n",result.size(),end-start);
    }
}
