package defpackage;

/* renamed from: yo */
public abstract class yo<CHILD extends yo<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    agz<? super TranscodeType> a = agx.b;

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (yo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final CHILD a(agz<? super TranscodeType> agz) {
        this.a = (agz) ahl.a((Object) agz, "Argument must not be null");
        return this;
    }
}
