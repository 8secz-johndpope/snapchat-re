package defpackage;

/* renamed from: akfs */
final class akfs {
    public static final akfr a;

    static {
        akfs akfs = new akfs();
        String str = "(\\p{Digit}+)";
        String concat = "[eE][+-]?".concat(str);
        StringBuilder stringBuilder = new StringBuilder("(0[xX]");
        String str2 = "(\\p{XDigit}+)";
        stringBuilder.append(str2);
        stringBuilder.append("(\\.)?)|(0[xX]");
        stringBuilder.append(str2);
        stringBuilder.append("?(\\.)");
        stringBuilder.append(str2);
        stringBuilder.append(')');
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder("(");
        stringBuilder3.append(str);
        stringBuilder3.append("(\\.)?(");
        stringBuilder3.append(str);
        stringBuilder3.append("?)(");
        stringBuilder3.append(concat);
        stringBuilder3.append(")?)|(\\.(");
        stringBuilder3.append(str);
        stringBuilder3.append(")(");
        stringBuilder3.append(concat);
        stringBuilder3.append(")?)|((");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(")[pP][+-]?");
        stringBuilder3.append(str);
        stringBuilder3.append(')');
        str = stringBuilder3.toString();
        StringBuilder stringBuilder4 = new StringBuilder("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        stringBuilder4.append(str);
        stringBuilder4.append(")[fFdD]?))[\\x00-\\x20]*");
        a = new akfr(stringBuilder4.toString());
    }

    private akfs() {
    }
}
