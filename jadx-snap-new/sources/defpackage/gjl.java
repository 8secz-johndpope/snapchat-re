package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: gjl */
public class gjl<T> implements akwk<T, akhu> {
    static final akho a;
    private static akho d;
    final gjk b;
    protected final gdd c;
    private iha e;

    /* renamed from: gjl$a */
    static class a extends akhu implements gjo {
        private Map<String, String> a;
        private akhu b;

        a(Map<String, String> map, akhu akhu) {
            this.a = map;
            this.b = akhu;
        }

        public final Map<String, String> a() {
            return this.a;
        }

        public final long contentLength() {
            return this.b.contentLength();
        }

        public final akho contentType() {
            return this.b.contentType();
        }

        public final void writeTo(akke akke) {
            this.b.writeTo(akke);
        }
    }

    static {
        String str = "application/x-www-form-urlencoded; charset=UTF-8";
        a = whm.a(str, true);
        d = whm.a(str, false);
    }

    public gjl(iha iha, gdd gdd) {
        this.e = iha;
        this.b = new gjk(iha);
        this.c = gdd;
    }

    static String a(Map<String, String> map) {
        String str = "UTF-8";
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append('&');
            }
            try {
                stringBuilder.append(URLEncoder.encode((String) entry.getKey(), str));
                stringBuilder.append('=');
                stringBuilder.append(entry.getValue() == null ? "" : URLEncoder.encode((String) entry.getValue(), str));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public akhu a(T t) {
        if (t instanceof aedh) {
            aedh aedh = (aedh) t;
            if (aedh.D == null) {
                this.c.a(aedh);
            }
        }
        Map a = this.b.a((Object) t);
        String a2 = gjl.a(a);
        Object obj = (!(t instanceof aedh) || TextUtils.isEmpty(((aedh) t).D)) ? null : 1;
        return new a(a, akhu.create(obj != null ? a : d, a2));
    }
}
