package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.List;

/* renamed from: odu */
public interface odu {

    /* renamed from: odu$a */
    public static final class a {
        static {
            a aVar = new a();
        }

        private a() {
        }

        public static List<Integer> a(int i) {
            List arrayList = new ArrayList();
            int i2 = 10000;
            akdw a = akef.a(10000, i);
            akcr.b(a, "receiver$0");
            akee.a(true, Integer.valueOf(10000));
            int i3 = a.a;
            int i4 = a.b;
            if (a.c <= 0) {
                i2 = -10000;
            }
            akdw a2 = defpackage.akdw.a.a(i3, i4, i2);
            int i5 = a2.a;
            i3 = a2.b;
            i2 = a2.c;
            if (i2 <= 0 ? i5 < i3 : i5 > i3) {
                while (true) {
                    if (i5 <= i - 1000) {
                        arrayList.add(Integer.valueOf(i5));
                    }
                    if (i5 == i3) {
                        break;
                    }
                    i5 += i2;
                }
            }
            return arrayList;
        }
    }

    /* renamed from: odu$b */
    public static final class b {
    }

    ajcx a();

    ajcx a(abyi abyi);

    ajcx a(idd idd, String str, abym abym, int i);

    ajdj<abyi> a(Uri uri, idd idd);

    ajdx<Optional<Uri>> a(Uri uri);

    ajdx<odt> a(idd idd);

    ajdx<odt> a(idd idd, abyi abyi);

    ajdx<List<abyi>> a(idd idd, abyi abyi, int i);

    ajdx<List<abyi>> a(idd idd, abyi abyi, List<Integer> list);

    ajdx<odt> a(idd idd, String str);

    ajdx<abyk> a(idd idd, List<abyi> list);

    ajdx<odt> a(idd idd, kaz<jwj> kaz);

    void a(boolean z);

    ajdx<Optional<? extends abyk>> b(idd idd);

    ajdx<List<abyi>> b(idd idd, abyi abyi);

    ajdx<Optional<abyk>> b(idd idd, String str);

    ajdx<abyk> b(idd idd, List<abyi> list);

    ajcx c(idd idd, String str);

    ajdx<odx> c(idd idd, abyi abyi);

    ajdx<abyk> c(idd idd, List<abyi> list);

    ajcx d(idd idd, List<abyi> list);

    void e(idd idd, List<abyi> list);
}
