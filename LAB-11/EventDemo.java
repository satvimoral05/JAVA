interface EventListener {
    void performEvent();
}

interface MouseListener extends EventListener {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

interface KeyListener extends EventListener {
    void keyPressed();
    void keyReleased();
}

public class EventDemo implements MouseListener, KeyListener {

    @Override
    public void performEvent() {
        System.out.println("Event performed.");
    }

    @Override
    public void mouseClicked() {
        System.out.println("Mouse clicked.");
    }

    @Override
    public void mousePressed() {
        System.out.println("Mouse pressed.");
    }

    @Override
    public void mouseReleased() {
        System.out.println("Mouse released.");
    }

    @Override
    public void mouseMoved() {
        System.out.println("Mouse moved.");
    }

    @Override
    public void mouseDragged() {
        System.out.println("Mouse dragged.");
    }

    @Override
    public void keyPressed() {
        System.out.println("Key pressed.");
    }

    @Override
    public void keyReleased() {
        System.out.println("Key released.");
    }

    public static void main(String[] args) {

        EventDemo demo = new EventDemo();

        demo.performEvent();

        demo.mouseClicked();
        demo.mousePressed();
        demo.mouseReleased();
        demo.mouseMoved();
        demo.mouseDragged();

        demo.keyPressed();
        demo.keyReleased();
    }
}
