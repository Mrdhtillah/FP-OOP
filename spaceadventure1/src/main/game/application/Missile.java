package application;

public class Missile extends Sprite {

    public Missile(int x, int y) {
        super(x, y);

        initMissile();
    }

    private void initMissile() {

        loadImage("src/main/game/images/missile.png");
        getImageDimensions();
    }

    public void move() {

        int MISSILE_SPEED = 2;
        x += MISSILE_SPEED;

        int BOARD_WIDTH = 390;
        if (x > BOARD_WIDTH)
            visible = false;
    }
}