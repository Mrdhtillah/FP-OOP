package application;

public class Treasure extends Sprite {

    public Treasure(int x, int y) {
        super(x, y);

        initTreasure();
    }

    private void initTreasure() {

        loadImage("src/main/game/images/Treasure.png");
        getImageDimensions();
    }

    public void move() {

        if (x < 0) {
            x = 400;
        }

        x -= 1;
    }
}