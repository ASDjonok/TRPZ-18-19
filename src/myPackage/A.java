package myPackage;

public class A {
    private int f;

    public A(int f) {
        this.f = f;
    }

    @Override
    public boolean equals(Object obj) {
        A objA = (A) obj;
        return this.f == objA.f;
    }
}
