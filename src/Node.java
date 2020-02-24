import java.util.ArrayList;
import java.util.List;

public class Node {
    public Node leftNode;
    public Node rightNode;
    public Object value;
    public void add(Object v)
    {
        if (null==value)
        {
            value=v;
        }
        else {
            if ((Integer)v<=(Integer)value)
            {
                if (null==leftNode)
                    leftNode=new Node();
                leftNode.add(v);
            }
            else {
                if (null==rightNode)
                    rightNode=new Node();
                rightNode.add(v);
            }
        }
    }
    public List<Object> values()
    {
        List<Object> values=new ArrayList<>();
        if (null!=leftNode)
        values.addAll(leftNode.values());
        values.add(value);
        if (null!=rightNode)
            values.addAll(rightNode.values());
        return values;
    }
    public static void main(String[] args)
    {
        int randoms[]=new int[]{67,45,78,56,22,10,12,14,1,0};
        Node roots=new Node();
        for (int number:randoms)
        {
            roots.add(number);
        }
        System.out.println(roots.values());
    }
}
