public class Rectangle {
    private int width;
    private int height;
    int width1;
    int height1;

    private Rectangle(int width,int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return this.width*this.height;
    }
    public int getPerimeter(){
        return 2*(this.width+this.height);
    }
    public static Rectangle getRectangle(int width,int height){
        Rectangle rectangle = new Rectangle(width,height);
        return rectangle;
    }
    public static Rectangle getSquare(int side){
        Rectangle rectangle = new Rectangle(side,side);
        return rectangle;
    }
}
