package defpackage;

import android.text.TextUtils;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.gson.annotations.SerializedName;
import defpackage.agqn.a;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acan */
public class acan {
    @SerializedName(alternate = {"a"}, value = "stickerDataList")
    public final List<acam> a;

    public acan(List<acam> list) {
        this.a = (List) Preconditions.checkNotNull(list);
    }

    public static boolean a(acam acam) {
        return acan.c(acam) && acam.p == null;
    }

    public static boolean b(acam acam) {
        return acam.e;
    }

    private static boolean c(acam acam) {
        return acam.a == a.CHAT.ordinal() || acam.a == a.GEOSTICKER.ordinal();
    }

    public final int a(a aVar) {
        int i = 0;
        for (acam acam : this.a) {
            if (acam.a == aVar.ordinal()) {
                i++;
            }
        }
        return i;
    }

    public final List<acam> a() {
        return this.a;
    }

    public final int b(a aVar) {
        int i = 0;
        for (acam acam : this.a) {
            if (acam.a == aVar.ordinal() && acam.e) {
                i++;
            }
        }
        return i;
    }

    public final boolean b() {
        for (acam acam : this.a) {
            if (acam.n) {
                return true;
            }
        }
        return false;
    }

    public final int c(a aVar) {
        int i = 0;
        for (acam acam : this.a) {
            if (acam.a == aVar.ordinal() && acam.b) {
                i++;
            }
        }
        return i;
    }

    public final boolean c() {
        for (acam acam : this.a) {
            if (acam.s) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        int i = 0;
        for (acam acam : this.a) {
            if (acam.s) {
                i++;
            }
        }
        return i;
    }

    public final int d(a aVar) {
        int i = 0;
        for (acam acam : this.a) {
            if (acam.a == aVar.ordinal() && acam.e && acam.b) {
                i++;
            }
        }
        return i;
    }

    public final int e() {
        return this.a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return new akmc().a(this.a, ((acan) obj).a).a;
    }

    public final boolean f() {
        return this.a.isEmpty();
    }

    public final long g() {
        int i = 0;
        for (acam acam : this.a) {
            if (acam.e) {
                i++;
            }
        }
        return (long) i;
    }

    public final long h() {
        int i = 0;
        for (acam acam : this.a) {
            if (acam.e) {
                i++;
            }
        }
        return (long) i;
    }

    public int hashCode() {
        return new akmd().a(this.a).a;
    }

    public final int i() {
        int i = 0;
        for (acam a : this.a) {
            if (acan.a(a)) {
                i++;
            }
        }
        return i;
    }

    public final long j() {
        int i = 0;
        for (acam acam : this.a) {
            if (acam.r) {
                i++;
            }
        }
        return (long) i;
    }

    public final List<acam> k() {
        ArrayList arrayList = new ArrayList();
        for (acam acam : this.a) {
            if (!TextUtils.isEmpty(acam.u)) {
                arrayList.add(acam);
            }
        }
        return arrayList;
    }

    public final int l() {
        int i = 0;
        for (acam acam : this.a) {
            if (acam.n) {
                i++;
            }
        }
        return i;
    }

    public final long m() {
        int i = 0;
        for (acam acam : this.a) {
            if (acam.c) {
                i++;
            }
        }
        return (long) i;
    }

    public final long n() {
        int i = 0;
        for (acam acam : this.a) {
            if (acam.d) {
                i++;
            }
        }
        return (long) i;
    }

    public final long o() {
        int i = 0;
        for (acam acam : this.a) {
            if (!TextUtils.isEmpty(acam.p)) {
                i++;
            }
        }
        return (long) i;
    }

    public final String p() {
        StringBuilder stringBuilder = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        for (acam acam : this.a) {
            double d = acam.i.a + (acam.l / 2.0d);
            double d2 = acam.i.b + (acam.m / 2.0d);
            stringBuilder.append('[');
            stringBuilder.append(decimalFormat.format(d));
            stringBuilder.append(',');
            stringBuilder.append(decimalFormat.format(d2));
            stringBuilder.append("], ");
        }
        return stringBuilder.length() > 1 ? stringBuilder.substring(0, stringBuilder.length() - 2) : null;
    }

    public final boolean q() {
        for (acam acam : this.a) {
            if (!TextUtils.isEmpty(acam.p) && acam.p != null && acam.p.equals(acal.VENUE.name())) {
                return true;
            }
        }
        return false;
    }

    public final String r() {
        for (acam acam : this.a) {
            if (!TextUtils.isEmpty(acam.p) && acam.p != null && acam.p.equals(acal.VENUE.name()) && acam.q != null) {
                return acam.q.e.a.a;
            }
        }
        return "";
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("stickerdatalist", this.a).toString();
    }
}
