package defpackage;

/* renamed from: ajyf */
class ajyf {
    public static final void a(int i, int i2) {
        if (i > i2) {
            StringBuilder stringBuilder = new StringBuilder("toIndex (");
            stringBuilder.append(i);
            stringBuilder.append(") is greater than size (");
            stringBuilder.append(i2);
            stringBuilder.append(").");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }
}
