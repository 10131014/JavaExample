import java.util.LinkedList;

public class TestCollectionLinklist {
    public static void main(String[] args)
    {
        LinkedList<Hero> team1=new LinkedList<Hero>();
        //在最后插入数据
        team1.addLast(new Hero("hero1"));
        team1.addLast(new Hero("hero2"));
        team1.addLast(new Hero("hero3"));
        System.out.println(team1);
        //在最前面插入数据
        team1.addFirst(new Hero("heroX"));
        System.out.println(team1);
        //查看最前面和最后面的数据
        System.out.println(team1.getFirst());
        System.out.println(team1.getLast());
        //查看不会导致数据删除
        System.out.println(team1);
        //取出最前面和最后面的数据
       // System.out.println(team1.removeFirst());
       // System.out.println(team1.removeLast());
        //取出会导致数据被删除
        System.out.println(team1);
        int a=team1.size()-2;
        int b=team1.size();
        for (int i=a;i>=0;i--) {

            team1.addLast(team1.get(i));
        }
        int c=team1.size();
        team1.removeFirst();
        team1.removeFirst();
        team1.removeFirst();
        /**
        for (int i=0;i<c-a;i++) {
            team1.removeFirst();
        }
         **/
        System.out.println(team1);
    }

}
