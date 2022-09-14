package Pushpendra.com.MarioGame.entity;

import java.awt.*;

public class Entity {

    public int x,y;
    public int width, height;

    public boolean solid;

    public int velX, velY;

    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public int getVelY() {
        return velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isSolid() {
        return solid;
    }

    public void setSolid(boolean solid) {
        this.solid = solid;
    }

    public Entity(int x, int y, int width, int height, boolean solid){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.solid = solid;

    }
    public void render(Graphics g){

    }
    public void tick(){
        x+=velX;
        y+=velY;
    }
}
