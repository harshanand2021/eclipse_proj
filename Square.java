class Square {
    static int getVal(int side) {
        int area = side * side;
        return area;
    }
}

class Rectangle extends Square {
    static int getVal(int len, int bd) {
        int area = len * bd;
        return area;
    }
}

class Area extends Rectangle {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();

        // System.out.println("Area = " + s.getVal(4));
        System.out.println("Area = " + r.getVal(4));
    }
}
