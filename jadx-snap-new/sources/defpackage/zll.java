package defpackage;

/* renamed from: zll */
public class zll<T> extends zln<T> {
    private T target;

    public void dropTarget() {
        super.dropTarget();
        this.target = null;
    }

    public T getTarget() {
        return this.target;
    }

    public boolean hasTarget() {
        return this.target != null;
    }

    public void takeTarget(T t) {
        super.takeTarget(t);
        this.target = t;
    }
}
