public class Rectangle {
    private int width;
    private int height;
    public Rectangle(){

    }
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getWidth(){
        return  this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getArea(){
        return this.width*this.height;
    }
    public int getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "width: "+ this.width+" height: "+this.height;
    }
}

