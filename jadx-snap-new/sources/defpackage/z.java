package defpackage;

/* renamed from: z */
public final class z implements ad {
    private final String a;
    private final Object[] b;

    public z(String str) {
        this(str, null);
    }

    public z(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    private static void a(ac acVar, int i, Object obj) {
        if (obj == null) {
            acVar.bindNull(i);
        } else if (obj instanceof byte[]) {
            acVar.bindBlob(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            acVar.bindDouble(i, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            acVar.bindDouble(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            acVar.bindLong(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            acVar.bindLong(i, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            acVar.bindLong(i, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            acVar.bindLong(i, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            acVar.bindString(i, (String) obj);
        } else if (obj instanceof Boolean) {
            acVar.bindLong(i, ((Boolean) obj).booleanValue() ? 1 : 0);
        } else {
            StringBuilder stringBuilder = new StringBuilder("Cannot bind ");
            stringBuilder.append(obj);
            stringBuilder.append(" at index ");
            stringBuilder.append(i);
            stringBuilder.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static void a(ac acVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                z.a(acVar, i, obj);
            }
        }
    }

    public final void bindTo(ac acVar) {
        z.a(acVar, this.b);
    }

    public final int getArgCount() {
        Object[] objArr = this.b;
        return objArr == null ? 0 : objArr.length;
    }

    public final String getSql() {
        return this.a;
    }
}
