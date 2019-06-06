package defpackage;

/* renamed from: akri */
public final class akri extends IllegalArgumentException {
    public String a;
    private final akra b;
    private final akrg c;
    private final String d;
    private final Number e;
    private final String f;
    private final Number g;
    private final Number h;

    public akri(akra akra, Number number, Number number2, Number number3) {
        super(akri.a(akra.x, number, number2, number3, null));
        this.b = akra;
        this.c = null;
        this.d = akra.x;
        this.e = number;
        this.f = null;
        this.g = number2;
        this.h = number3;
        this.a = super.getMessage();
    }

    public akri(akra akra, Number number, String str) {
        super(akri.a(akra.x, number, null, null, str));
        this.b = akra;
        this.c = null;
        this.d = akra.x;
        this.e = number;
        this.f = null;
        this.g = null;
        this.h = null;
        this.a = super.getMessage();
    }

    public akri(akra akra, String str) {
        String str2 = akra.x;
        StringBuffer stringBuffer = new StringBuffer("Value ");
        if (str == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append('\"');
            stringBuffer.append(str);
            stringBuffer.append('\"');
        }
        stringBuffer.append(" for ");
        stringBuffer.append(str2);
        stringBuffer.append(' ');
        stringBuffer.append("is not supported");
        super(stringBuffer.toString());
        this.b = akra;
        this.c = null;
        this.d = akra.x;
        this.f = str;
        this.e = null;
        this.g = null;
        this.h = null;
        this.a = super.getMessage();
    }

    private static String a(String str, Number number, Number number2, Number number3, String str2) {
        StringBuilder stringBuilder = new StringBuilder("Value ");
        stringBuilder.append(number);
        stringBuilder.append(" for ");
        stringBuilder.append(str);
        stringBuilder.append(' ');
        if (number2 == null) {
            if (number3 == null) {
                stringBuilder.append("is not supported");
            } else {
                stringBuilder.append("must not be larger than ");
                stringBuilder.append(number3);
            }
        } else if (number3 == null) {
            stringBuilder.append("must not be smaller than ");
            stringBuilder.append(number2);
        } else {
            stringBuilder.append("must be in the range [");
            stringBuilder.append(number2);
            stringBuilder.append(',');
            stringBuilder.append(number3);
            stringBuilder.append(']');
        }
        if (str2 != null) {
            stringBuilder.append(": ");
            stringBuilder.append(str2);
        }
        return stringBuilder.toString();
    }

    public final String getMessage() {
        return this.a;
    }
}
