package defpackage;

import com.snap.core.db.api.column.IntegerEnumColumnAdapter;

/* renamed from: wss */
public abstract class wss<J extends Enum<J>, I extends Enum<I>> implements aina<J, Long> {
    private final IntegerEnumColumnAdapter<I> a = new IntegerEnumColumnAdapter(this.b);
    private final Class<I> b;

    public wss(Class<I> cls) {
        akcr.b(cls, "cls");
        this.b = cls;
    }

    public abstract I a(J j);

    public abstract J b(I i);

    public /* synthetic */ Object decode(Object obj) {
        return b(this.a.decode(Long.valueOf(((Number) obj).longValue())));
    }

    public /* synthetic */ Object encode(Object obj) {
        Enum enumR = (Enum) obj;
        akcr.b(enumR, "value");
        return this.a.encode(a(enumR));
    }
}
