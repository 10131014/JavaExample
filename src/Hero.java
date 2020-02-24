public class Hero {

    public String name;
    public float hp;
    public int damage;
    public Hero() {

    }
    public Hero(String name)
    {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }
}
