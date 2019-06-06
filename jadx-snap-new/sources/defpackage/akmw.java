package defpackage;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;

/* renamed from: akmw */
public final class akmw extends Format {
    public static final akmz<akmw> a = new 1();
    public final akmy b;
    private final akmx c;

    /* renamed from: akmw$1 */
    static class 1 extends akmz<akmw> {
        1() {
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Format a(String str, TimeZone timeZone, Locale locale) {
            return new akmw(str, timeZone, locale);
        }
    }

    protected akmw(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, (byte) 0);
    }

    private akmw(String str, TimeZone timeZone, Locale locale, byte b) {
        this.b = new akmy(str, timeZone, locale);
        this.c = new akmx(str, timeZone, locale);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akmw)) {
            return false;
        }
        return this.b.equals(((akmw) obj).b);
    }

    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        akmy akmy = this.b;
        if (obj instanceof Date) {
            return akmy.a((Date) obj, stringBuffer);
        }
        if (obj instanceof Calendar) {
            return akmy.a((Calendar) obj, stringBuffer);
        }
        if (obj instanceof Long) {
            return akmy.a(new Date(((Long) obj).longValue()), stringBuffer);
        }
        StringBuilder stringBuilder = new StringBuilder("Unknown class: ");
        stringBuilder.append(obj == null ? "<null>" : obj.getClass().getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final Object parseObject(String str, ParsePosition parsePosition) {
        akmx akmx = this.c;
        int index = parsePosition.getIndex();
        Matcher matcher = akmx.e.matcher(str.substring(index));
        if (!matcher.lookingAt()) {
            return null;
        }
        Calendar instance = Calendar.getInstance(akmx.a, akmx.b);
        instance.clear();
        int i = 0;
        while (i < akmx.f.length) {
            int i2 = i + 1;
            akmx.f[i].a(akmx, instance, matcher.group(i2));
            i = i2;
        }
        parsePosition.setIndex(index + matcher.end());
        return instance.getTime();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FastDateFormat[");
        stringBuilder.append(this.b.a);
        String str = ppy.b;
        stringBuilder.append(str);
        stringBuilder.append(this.b.c);
        stringBuilder.append(str);
        stringBuilder.append(this.b.b.getID());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
