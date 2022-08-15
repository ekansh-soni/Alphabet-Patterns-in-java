class name {
    int i, j;
    final int x = 10;
    final int y = 2 * x;

    void A() {

        // y = x * 2;
        int fp = y / 2;
        int sp = y / 2;

        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == fp || j == sp || i == x / 2 && j > fp && j < sp && j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

            fp--;
            sp++;

        }
        System.out.println();
    }

    void B() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || j == y || (i == 1 && j % 2 == 0) || (i == x && j % 2 == 0)
                        || (x / 2 == i && j % 2 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void C() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || (i == 1 && j % 2 == 0) || (i == x && j % 2 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void D() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || i == 1 && j % 2 == 0 || i == x && j % 2 == 0 || j == y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void E() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || i == 1 && j % 2 == 0 || x / 2 == i && j % 2 == 0 || i == x && j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    void F() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || (i == 1 && j % 2 == 0) || (x / 2 == i && j % 2 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void G() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || (i == 1 && j % 2 == 0) || (i == x && j % 2 == 0) || (i == 5 && j > x / 2 && j % 2 == 0)
                        || (j == y && i >= x / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    void H() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || j == y || (x / 2 == i && j % 2 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void I() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if ((i == 1 && j % 2 == 0) || (i == x && j % 2 == 0) || j == y / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void J() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if ((i == 1 && j % 2 == 0) || j == y / 2 || (i == x && j <= y / 2 && j % 2 == 0)
                        || (i == x - 1 && j == 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void K() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || j <= 5 && i == y + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    void L() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || i == x && j % 2 == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void M() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || j == y || i == j || y == j + i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void N() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || j == y || i + i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void O() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || j == y || (i == 1 && j % 2 == 0) || (i == x && j % 2 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    void P() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || (i == 1 && j % 2 == 0) || (x / 2 == i && j % 2 == 0) || (i < 5 && j == 20)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void Q() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || j == y || (i == 1 && j % 2 == 0) || (i == x && j % 2 == 0) || i + i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    void R() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || (i == 1 && j % 2 == 0) || (x / 2 == i && j % 2 == 0) || (i < x / 2 && j == y)
                        || i > 5 && i + i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void S() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (i == 1 && j % 2 == 0 || i == x && j % 2 == 0 || i == x / 2 && j % 2 == 0 || i <= x / 2 && j == 1
                        || i >= x / 2 && j == y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void T() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (i == 1 && j % 2 == 0 || y / 2 == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void U() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || j == y || i == x && j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void V() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (i == j || i + j + 1 == y + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void W() {
        int fp = y / 2;
        int sp = y / 2;
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (j == 1 || j == y || j == fp || j == sp) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            fp--;
            sp++;
        }
        System.out.println();

    }

    void X() {
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                if (i + i == j || i + i + j == y + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void Y(){
        for(i = 1 ; i<=x; i ++){
            for(j=1 ; j<=y;j++){
                if((i==j && j<=x/2)|| j==x/2 && i> x/2 || j+i==x+1 && i<=x/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void Z(){
        for(i = 1; i <=x; i ++){
            for (j=1;j<=y;j++){
                if ((i == 1 && j % 2 ==0 ) || (i == x && j % 2 ==0 ) || i+j == y-i ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}

// Driver Code
public class ekansh {
    public static void main(String[] args) {
        name n1 = new name();
        n1.A();
        n1.B();
        n1.C();
        n1.D();
        n1.E();
        n1.F();
        n1.G();
        n1.H();
        n1.I();
        n1.J();
        n1.K();
        n1.L();
        n1.M();
        n1.N();
        n1.O();
        n1.P();
        n1.Q();
        n1.R();
        n1.S();
        n1.T();
        n1.U();
        n1.V();
        n1.W();
        n1.X();
        n1.Y();
        n1.Z();

    }
}

// Written and Compiled By Ekansh