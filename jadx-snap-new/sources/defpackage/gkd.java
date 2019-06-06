package defpackage;

import com.google.common.base.Joiner;
import defpackage.akwk.a;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: gkd */
public final class gkd implements akwk<idl, String> {
    private static final String a = Charset.defaultCharset().name();

    /* renamed from: gkd$a */
    static class a extends defpackage.akwk.a {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final akwk<?, String> a(Annotation[] annotationArr) {
            for (Annotation annotation : annotationArr) {
                if (annotation instanceof akxs) {
                    if ("__xsc_local__ui_page".equals(((akxs) annotation).a())) {
                        return new gkd();
                    }
                }
            }
            return null;
        }
    }

    public static a a() {
        return new a();
    }

    private static String a(idl idl) {
        if (idl == null) {
            return null;
        }
        List<String> hierarchy = idl.getHierarchy();
        Iterable arrayList = new ArrayList(hierarchy.size());
        for (String a : hierarchy) {
            arrayList.add(gkd.a(a));
        }
        return Joiner.on(";").join(arrayList);
    }

    private static String a(String str) {
        try {
            return URLEncoder.encode(str, a);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String a(Set<idl> set) {
        if (set == null || set == null || set.isEmpty()) {
            return null;
        }
        Iterable arrayList = new ArrayList(set.size());
        for (idl idl : set) {
            if (gkd.a(idl) != null) {
                arrayList.add(gkd.a(idl));
            }
        }
        return Joiner.on(":").join(arrayList);
    }
}
