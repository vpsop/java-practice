package functions;

class LocalScope {

    void display() {
        // local variable
        int x = 10;   
        System.out.println(x);
    }

    void show() {
        // System.out.println(x); // Error
    }
}

class GloablScope {

    int x = 10;          // instance variable
    static int y = 20;   // static/class variable

    void display() {
        int z = 30;      // local variable

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}