package PizzaClient;
class Rectangle implements IShape {
    private double _width;
    private double _height;
    public Rectangle(double w, double h) {
        _width = w;
        _height = h;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "_width=" + _width +
                ", _height=" + _height +
                '}';
    }

    public double getArea() {
        return Math.PI * _width * _height;
    }

}
