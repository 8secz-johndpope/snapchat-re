package defpackage;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import defpackage.alea.a;
import java.util.Locale;

/* renamed from: adcy */
public final class adcy {
    private static final LoadingCache<Locale, a> a = CacheBuilder.newBuilder().build(new 1());

    /* renamed from: adcy$a */
    static class a {
        final String a;
        final String b;

        private a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        /* synthetic */ a(String str, String str2, byte b) {
            this(str, str2);
        }
    }

    /* renamed from: adcy$1 */
    static class 1 extends CacheLoader<Locale, a> {
        1() {
        }

        public final /* synthetic */ Object load(Object obj) {
            Locale locale = (Locale) obj;
            String toLowerCase = locale.getLanguage().toLowerCase(Locale.US);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(locale.getLanguage());
            stringBuilder.append('-');
            stringBuilder.append(locale.getCountry());
            return new a(toLowerCase, stringBuilder.toString().toLowerCase(Locale.US), (byte) 0);
        }
    }

    public static String a(alea alea) {
        String str = null;
        if (alea == null) {
            return null;
        }
        if (alea.a.length == 0) {
            return alea.b;
        }
        a aVar = (a) a.getUnchecked(Locale.getDefault());
        String str2 = null;
        for (a aVar2 : alea.a) {
            String toLowerCase = aVar2.a.toLowerCase(Locale.US);
            if (aVar.b.equals(toLowerCase)) {
                str = aVar2.b;
                break;
            }
            if (aVar.a.equals(toLowerCase)) {
                str2 = aVar2.b;
            }
        }
        return str != null ? str : str2 != null ? str2 : alea.b;
    }
}
