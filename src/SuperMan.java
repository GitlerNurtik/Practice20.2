public class SuperMan implements CanFly,CanRun,CanSwim{
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuperMan(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " умеет летать");
    }

    @Override
    public void run() {
        System.out.println(getName()+ " умеет быстро передвигаться");
    }

    @Override
    public void swim() {
        System.out.println(getName()+ "умеет плавать");
    }
}
