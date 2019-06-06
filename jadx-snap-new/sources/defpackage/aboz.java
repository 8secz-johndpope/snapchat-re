package defpackage;

import com.google.common.base.Suppliers;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/* renamed from: aboz */
public final class aboz {
    private final ajwt<LogRecord> a;
    private final ajwl<Boolean> b;
    private final abqo c;
    private final boolean d;
    private final boolean e;

    /* renamed from: aboz$a */
    static class a {
        public static final akmw a = ((akmw) akmw.a.a("EEE MMM dd HH:mm:ss.SSS zzz yyyy", TimeZone.getDefault()));
    }

    /* renamed from: aboz$b */
    static final class b extends Formatter {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final String format(LogRecord logRecord) {
            int i;
            boolean z;
            if (logRecord.getParameters() == null || logRecord.getParameters().length <= 1) {
                i = 0;
                z = false;
            } else {
                i = ((Integer) logRecord.getParameters()[0]).intValue();
                z = ((Boolean) logRecord.getParameters()[1]).booleanValue();
            }
            if (z) {
                return String.format("%s\n", new Object[]{logRecord.getMessage()});
            }
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[5];
            objArr[0] = Integer.valueOf(logRecord.getThreadID());
            long millis = logRecord.getMillis();
            akmy akmy = a.a.b;
            Calendar a = akmy.a();
            a.setTimeInMillis(millis);
            objArr[1] = akmy.a(a, new StringBuffer(akmy.d)).toString();
            objArr[2] = logRecord.getLoggerName();
            objArr[3] = logRecord.getSourceClassName();
            objArr[4] = logRecord.getMessage();
            return akly.a(String.format(locale, "Tid:%d [%s] %s %s: %s\n", objArr), i, ' ');
        }
    }

    static {
        Suppliers.memoize(-$$Lambda$aboz$xTn10SRRBucU60i6cSd_licb9hE.INSTANCE);
    }

    public aboz() {
        this(false, false);
    }

    public aboz(boolean z, boolean z2) {
        this(z, z2, new abqo());
    }

    private aboz(boolean z, boolean z2, abqo abqo) {
        this.a = ajwt.p();
        this.b = new ajwl();
        this.d = z;
        this.e = z2;
        this.c = abqo;
    }

    public static String a() {
        return "";
    }
}
