public class Square implements Shape {

    private double size;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return size*size;
    }
    
}
