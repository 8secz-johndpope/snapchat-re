package defpackage;

import android.content.Context;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.snap.core.db.record.StorySnapModel;

/* renamed from: ihi */
public class ihi {
    private static /* synthetic */ aken[] a = new aken[]{new akdc(akde.a(ihi.class), "context", "getContext()Landroid/content/Context;")};
    private final iim b;
    private final ihh c;

    public ihi(Context context, ihh ihh) {
        akcr.b(ihh, "clock");
        this.c = ihh;
        this.b = new iim(context);
    }

    private final Context a() {
        return (Context) this.b.a(a[0]);
    }

    public final String a(long j, ihj ihj, boolean z) {
        akcr.b(ihj, "format");
        Context a = a();
        if (a == null) {
            return "";
        }
        Object toLowerCase;
        String str;
        j = Math.abs(this.c.a() - j);
        if (j <= TelemetryConstants.FLUSH_DELAY_MS) {
            String str2 = "context.getString(format.justNow)";
            Object string;
            if (z) {
                string = a.getString(ihj.a);
                akcr.a(string, str2);
                if (string != null) {
                    toLowerCase = string.toLowerCase();
                    str = "(this as java.lang.String).toLowerCase()";
                } else {
                    throw new ajxt("null cannot be cast to non-null type java.lang.String");
                }
            }
            string = a.getString(ihj.a);
            akcr.a(string, str2);
            return string;
        } else if (j < 60000) {
            toLowerCase = a.getString(ihj.b, new Object[]{Long.valueOf(j / 1000)});
            str = "context.getString(format…teUtils.SECOND_IN_MILLIS)";
        } else if (j < 3600000) {
            toLowerCase = a.getString(ihj.c, new Object[]{Long.valueOf(j / 60000)});
            str = "context.getString(format…teUtils.MINUTE_IN_MILLIS)";
        } else if (j < 86400000) {
            toLowerCase = a.getString(ihj.d, new Object[]{Long.valueOf(j / 3600000)});
            str = "context.getString(format…DateUtils.HOUR_IN_MILLIS)";
        } else if (j < 604800000) {
            toLowerCase = a.getString(ihj.e, new Object[]{Long.valueOf(j / 86400000)});
            str = "context.getString(format… DateUtils.DAY_IN_MILLIS)";
        } else if (j < 2419200000L) {
            toLowerCase = a.getString(ihj.f, new Object[]{Long.valueOf(j / 604800000)});
            str = "context.getString(format…DateUtils.WEEK_IN_MILLIS)";
        } else if (j < 31449600000L) {
            toLowerCase = a.getString(ihj.g, new Object[]{Long.valueOf(j / 2419200000L)});
            str = "context.getString(format…Millis / MONTH_IN_MILLIS)";
        } else {
            toLowerCase = a.getString(ihj.h, new Object[]{Long.valueOf(j / 31449600000L)});
            str = "context.getString(format…DateUtils.YEAR_IN_MILLIS)";
        }
        akcr.a(toLowerCase, str);
        return toLowerCase;
    }

    public final String a(long j, String str) {
        akcr.b(str, StorySnapModel.CREATIVEKITSOURCEAPPNAME);
        Context a = a();
        if (a == null) {
            return "";
        }
        Object string;
        j = Math.abs(this.c.a() - j);
        String str2 = "context.getString(CREATI…creativeKitSourceAppName)";
        if (j <= TelemetryConstants.FLUSH_DELAY_MS) {
            string = a.getString(ihk.f.a, new Object[]{str});
        } else {
            int i;
            Object[] objArr;
            if (j < 60000) {
                i = ihk.f.b;
                objArr = new Object[]{Long.valueOf(j / 1000), str};
            } else {
                int i2;
                Object[] objArr2;
                if (j < 3600000) {
                    i2 = ihk.f.c;
                    objArr2 = new Object[]{Long.valueOf(j / 60000), str};
                } else if (j < 86400000) {
                    i = ihk.f.d;
                    objArr = new Object[]{Long.valueOf(j / 3600000), str};
                } else if (j < 604800000) {
                    i2 = ihk.f.e;
                    objArr2 = new Object[]{Long.valueOf(j / 86400000), str};
                } else if (j < 2419200000L) {
                    i = ihk.f.f;
                    objArr = new Object[]{Long.valueOf(j / 604800000), str};
                } else if (j < 31449600000L) {
                    i2 = ihk.f.g;
                    objArr2 = new Object[]{Long.valueOf(j / 2419200000L), str};
                } else {
                    i = ihk.f.h;
                    objArr = new Object[]{Long.valueOf(j / 31449600000L), str};
                }
                string = a.getString(i2, objArr2);
            }
            string = a.getString(i, objArr);
        }
        akcr.a(string, str2);
        return string;
    }

    public final String a(long j, boolean z, boolean z2) {
        return a(j, z ? ihk.a : ihk.b, z2);
    }
}
