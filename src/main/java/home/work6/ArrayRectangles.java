package home.work6;

public class ArrayRectangles {
    private Rectangle[] rectangle_array;

    public ArrayRectangles(int n) {
        rectangle_array = new Rectangle[n];
    }

    public ArrayRectangles(Rectangle... rectangles) {
        this.rectangle_array = rectangles;
    }

    public boolean addRectangle(Rectangle rectangle) {
        if (rectangle_array == null) throw new NullPointerException();
        else {
            for (int i = 0; i < rectangle_array.length; i++) {
                if (rectangle_array[i] == null) {
                    rectangle_array[i] = rectangle;
                    return true;
                } else return false;
            }
        }
        return false;
    }

    public int numberMaxArea() {
        int result = 0;
        int max = (int) rectangle_array[0].area();
        if (rectangle_array == null) throw new NullPointerException();
        else {
            for (int i = 1; i < rectangle_array.length; i++) {
                if (rectangle_array[i] != null && max < rectangle_array[i].area()) {
                    max = (int) rectangle_array[i].area();
                    result = i;
                }
            }
            return result;
        }
    }
    public int numberMinPerimeter(){
        int result = 0;
        double min = rectangle_array[rectangle_array.length].perimeter();
        if (rectangle_array == null) throw new NullPointerException();
        else {
            for (int i = 0; i < rectangle_array.length ; i++) {
                if (rectangle_array[i] != null || min >rectangle_array[i].perimeter()){
                    min = rectangle_array[i].perimeter();
                    result = i;
                }
            }
            return result;
        }
    }
}
