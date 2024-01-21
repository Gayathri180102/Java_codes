
// import java.util.*;

// add, sub, inc, dec, compare two complex numbers
public class complexnumber {
}

class complex {
    int real, img;

    public complex() {
        real = 0;
        img = 0;
    }
 
    complex(int r, int i) {
        real = r;
        img = i;
    }

    public void show() {
        System.out.println(real + "+" + img + "i");
    }

    public static complex add(complex n1, complex n2) {
        complex res = new complex(0, 0);
        res.real = n1.real + n2.real;
        res.img = n1.img + n2.img;
        return res;
    }

    public static complex sub(complex n1, complex n2) {
        complex res = new complex(0, 0);
        res.real = n1.real - n2.real;
        res.img = n1.img - n2.img;
        return res;
    }

    public static complex inc(complex n1) {
        complex res = new complex(0, 0);
        res.real = ++n1.real;
        res.img = ++n1.img;
        return res;
    }

    public static complex dec(complex n2) {
        complex res = new complex(0, 0);
        res.real = --n2.real;
        res.img = --n2.img;
        return res;
    }

    public static int cmp(complex n1, complex n2) {
        int flag = 0;
        if (n1.real == n2.real && n1.img == n2.img) {
            flag = 1;
        }
        return flag;
    }

    public static void main(String args[]) {
        complex c1 = new complex(4, 5);
        complex c2 = new complex(5, 6);
        complex res = new complex();
        System.out.println("First complex number:");
        c1.show();
        System.out.println("Second complex number:");
        c2.show();

        res = add(c1, c2);
        System.out.println("Sum of two numbers is:");
        res.show();

        res = sub(c1, c2);
        System.out.println("Subtraction of two numbers is:");
        res.show();

        res = inc(c1);
        System.out.println("Increment of the first complex number is:");
        res.show();

        res = dec(c2);
        System.out.println("Decrement of the second complex number is:");
        res.show();
        
        int result;
        result = cmp(c1, c2);
        if (result == 1)
            System.out.println("Two complex numbers are equal!");
        else
            System.out.println("Two complex numbers are not equal");
    }
}
