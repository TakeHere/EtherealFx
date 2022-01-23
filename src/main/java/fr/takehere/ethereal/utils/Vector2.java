package fr.takehere.ethereal.utils;

public class Vector2 {

    public double x;
    public double y;

    public static final Vector2 ZERO = new Vector2(0,0);

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public Vector2 normalize(){
        double magnitude = magnitude();
        return new Vector2(x/magnitude, y/magnitude);
    }

    public Vector2 add(Vector2 vector2){
        return new Vector2(this.x + vector2.x, this.y + vector2.y);
    }

    public Vector2 subtract(Vector2 term) {
        return new Vector2(this.x - term.x, this.y - term.y);
    }

    public Vector2 multiply(double factor){
        return new Vector2(this.x * factor, this.y * factor);
    }

    public Vector2 divide(double divisor){
        return new Vector2(this.x / divisor, this.y / divisor);
    }

    public void log(){
        System.out.println("[x: " + x + "] [y: " + y + "] [magnitude: " + magnitude() + "] [normalized: " + normalize().x + "," + normalize().y + "]");
    }
}
