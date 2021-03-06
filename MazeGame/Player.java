import java.awt.*;

public class Player {
    //Variable declarations
    private int x;
    private int y;
    private Color colour;

    //Default constructor
    public Player(){
        x = 0;
        y = 0;
        colour = Color.RED;
    }
    //Customizable constructor
    public Player(int xPos, int yPos, Color c){
        x = xPos;
        y = yPos;
        colour = c;
    }

    //Colliders
    public boolean collideBall(Ball b, int pxX, int pxY, int score){
        if((x*pxX<b.getX()+pxX) && (x*pxX+pxX>b.getX()) && (y*pxY<b.getY()+pxY) && (y*pxY+pxY>b.getY())){
            return(true);
        }
        return(false);
    }

    //Getters
    public int getX(){
        return(x);
    }
    public int getY(){
        return(y);
    }
    public Color getColour(){
        return(colour);
    }
    //Setters
    public void setX(int xPos){
        x = xPos;
    }
    public void setY(int yPos){
        y = yPos;
    }
}
