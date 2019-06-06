package defpackage;

import android.net.Uri;
import com.brightcove.player.event.Event;
import com.snap.core.db.column.FriendSuggestionPlacement;
import defpackage.ahcb.b;
import defpackage.ahcb.c;
import defpackage.ahft.a;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

/* renamed from: ira */
public interface ira {

    /* renamed from: ira$a */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            akcr.b(str, "username");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.ira.a;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.ira.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.c;
            r3 = r3.c;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ira$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("SeenQuickAddData(username=");
            stringBuilder.append(this.a);
            stringBuilder.append(", userId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", suggestionToken=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: ira$b */
    public static final class b<T> {
        public final int a;
        public final T b;
        private final akrk c;
        private final akrk d;

        public b(int i, T t, akrk akrk, akrk akrk2) {
            akcr.b(akrk, Event.START_TIME);
            akcr.b(akrk2, Event.END_TIME);
            this.a = i;
            this.b = t;
            this.c = akrk;
            this.d = akrk2;
        }

        public final long a() {
            Object a = this.d.a(this.c.a);
            akcr.a(a, "endTime.minus(startTime.millis)");
            return a.a;
        }
    }

    ajcx a(isu isu);

    ajcx a(String str, String str2);

    ajcx a(List<String> list, FriendSuggestionPlacement friendSuggestionPlacement, Long l);

    ajcx a(Map<Long, String> map);

    ajcx a(boolean z);

    ajdx<agyk> a(Uri uri);

    ajdx<ahef> a(FriendSuggestionPlacement friendSuggestionPlacement, long j, List<a> list, List<a> list2);

    ajdx<b<agyu>> a(iqp iqp, String str, String str2);

    ajdx<agzs> a(isj isj);

    ajdx<agzs> a(isl isl);

    ajdx<ahef> a(ist ist);

    ajdx<agzs> a(isv isv);

    ajdx<agzs> a(isz isz);

    ajdx<agzs> a(itc itc);

    ajdx<agzs> a(itf itf);

    ajdx<agzs> a(String str);

    ajdx<akxa<aekb>> a(String str, aeka aeka, String str2);

    ajdx<b<ahfv>> a(String str, a aVar);

    ajdx<b<ahcd>> a(String str, String str2, b bVar, c cVar);

    ajdx<b<aheb>> a(String str, String str2, String str3);

    ajdx<b<ahcd>> a(String str, String str2, String str3, b bVar, String str4);

    ajdx<b<ahcd>> a(String str, String str2, String str3, String str4, String str5, b bVar);

    ajdx<iql> a(String str, String str2, String str3, String str4, String str5, String str6, isf isf);

    ajdx<akxa<ahdx>> a(String str, List<Boolean> list, String str2);

    ajdx<aepa> a(GregorianCalendar gregorianCalendar, boolean z);

    ajdx<akxa<Void>> a(List<String> list, List<String> list2, List<String> list3, List<String> list4, Map<String, String> map);

    String a();

    ajcx b();

    ajdx<b<ahdj>> b(String str);

    ajdx<ahao> b(String str, String str2);

    ajdx<ahro> b(String str, String str2, String str3);

    ajdx<akxa<aexn>> b(boolean z);

    ajcx c();

    ajdx<akxa<ahcj>> c(String str);

    ajdx<b<ahfv>> c(String str, String str2);

    ajdx<akxa<aexn>> c(String str, String str2, String str3);

    ajdx<Boolean> c(boolean z);

    ajcx d();

    ajdx<b<aheb>> d(String str);

    ajdx<akxa<aexn>> d(String str, String str2);

    ajdx<ahac> d(String str, String str2, String str3);

    ajcx e();

    ajdx<String> e(String str);

    ajdx<akxa<ahao>> e(String str, String str2, String str3);

    ajcx f();

    ajdx<akxa<ahao>> f(String str);

    ajdx<agxw> g();

    ajdx<ahac> g(String str);

    ajdx<agxw> h();

    ajdx<akxa<aexn>> h(String str);

    ajdx<akxa<aepa>> i();

    ajdx<akxa<agzo>> i(String str);

    ajdx<String> j();

    ajdx<akxa<akhw>> j(String str);

    ajdx<akxa<aexn>> k();

    ajdx<akxa<aexn>> l();

    ajdx<akxa<aexn>> m();

    ajdx<akxa<ahao>> n();

    ajdx<akxa<aexn>> o();

    ajdp<Boolean> p();

    ajdp<Boolean> q();

    ajdx<akxa<aekb>> r();
}
