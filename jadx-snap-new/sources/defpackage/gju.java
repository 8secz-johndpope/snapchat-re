package defpackage;

/* renamed from: gju */
final class gju extends gjj<Object, gjr> {
    private final iha a;

    public gju(iha iha) {
        super(Object.class);
        this.a = iha;
    }

    private gjr c(Object obj) {
        if (obj instanceof byte[]) {
            return new gjq((byte[]) obj);
        }
        if (obj instanceof String) {
            return new gjv((String) obj);
        }
        if (gjp.a(obj.getClass())) {
            return new gjv(obj.toString());
        }
        try {
            return new gjv(this.a.b(obj));
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Trouble serializing: Class=");
            stringBuilder.append(obj.getClass().getName());
            stringBuilder.append(", with toString()=");
            stringBuilder.append(obj);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    public final /* synthetic */ Object b(Object obj) {
        return c(obj);
    }
}
