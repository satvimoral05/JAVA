interface Playable {
    void play();
}

class Football implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Football.");
    }
}

class Volleyball implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Volleyball.");
    }
}

class Basketball implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Basketball.");
    }
}

public class PlayableDemo {

    public static void main(String[] args) {

        Playable p1 = new Football();
        Playable p2 = new Volleyball();
        Playable p3 = new Basketball();

        p1.play();
        p2.play();
        p3.play();
    }
}
