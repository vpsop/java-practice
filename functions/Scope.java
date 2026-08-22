package functions;

class LocalScope {

    void display() {
        // local variable
        int x = 10;   
        System.out.println(x);
    }

    void show() {
        // Error
        // System.out.println(x); 
    }
}

class GloablScope {

    // instance variable
    int x = 10;

    // static or class variable
    static int y = 20;

    void display() {
        // local variable
        int z = 30;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}