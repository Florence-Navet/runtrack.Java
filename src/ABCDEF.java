class A {
    public A() {}
}

class B extends A {
    public B() {
        super();
    }
}

class C extends B {
    public C() {
        super();
    }
}

class D extends A {
    protected int d = 1;

    public D(int x) {
        super();
        d = x;
    }

    public D() {
    }
}

class E extends D {
    public E() {
        super();
    }
}

class F extends D {
    public F() {
        super();
    }
}

public class ABCDEF {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();

        a = b;
        b = (B) a; // cast nécessaire
        a = (A) b;
        a = null;
        // null = a; // ligne invalide, on ne peut pas affecter à null
        a = d;
        // b = d; // D n'est pas un B
        a = e;
        d = e;

        // Remplissage du tableau
        A[] as = new A[10];
        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new E();
        as[4] = new C();
        as[5] = new D(4);
        as[6] = new B();
        as[7] = new F();
        as[8] = new A();
        as[9] = new D(3);

        // Appel des méthodes
        rechercher(as);
        additionner(as);
    }

    private static void rechercher(A[] as) {
        int count = 0;
        for (A obj : as) {
            if (obj != null && obj.getClass() == B.class) {
                count++;
            }
        }
        System.out.println("Nombre d'objets de type exactement B : " + count);
    }

    private static void additionner(A[] as) {
        int somme = 0;
        for (A obj : as) {
            if (obj instanceof D) {
                D d = (D) obj;
                somme += d.d;
            }
        }
        System.out.println("Somme des champs 'd' dans les objets de type D (ou E/F) : " + somme);
    }
}
