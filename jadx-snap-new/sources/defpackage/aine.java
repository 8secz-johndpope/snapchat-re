package defpackage;

import java.util.List;

/* renamed from: aine */
final class aine<RowType> extends ainb<RowType> {
    private final int a;
    private final aino b;
    private final String c;

    public aine(int i, List<ainb<?>> list, aino aino, String str, akbl<? super ainn, ? extends RowType> akbl) {
        akcr.b(list, "queries");
        akcr.b(aino, "driver");
        akcr.b(str, "query");
        akcr.b(akbl, "mapper");
        super(list, akbl);
        this.a = i;
        this.b = aino;
        this.c = str;
    }

    public final ainn a() {
        return this.b.executeQuery(Integer.valueOf(this.a), this.c, 0, null);
    }
}
