package Day6;

public abstract class Female {
    public void speak() {
        System.out.println("I am female");
    }

    public abstract void gossip();

    public void slap(Female female) {
        female.slap(this);
        // this.slap(female);
    }
}
