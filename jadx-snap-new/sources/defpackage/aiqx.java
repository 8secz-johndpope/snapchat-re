package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: aiqx */
public abstract class aiqx {
    private static final Pattern c = Pattern.compile("http(s?)://[^\\/]+", 2);
    protected final String a;
    protected final aiqo b;
    private final aisx d;
    private final int e;
    private final String f;

    public aiqx(aiqo aiqo, String str, String str2, aisx aisx, int i) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (aisx != null) {
            this.b = aiqo;
            this.f = str;
            if (!airf.a(this.f)) {
                str2 = c.matcher(str2).replaceFirst(this.f);
            }
            this.a = str2;
            this.d = aisx;
            this.e = i;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final aisw a() {
        return a(Collections.emptyMap());
    }

    /* Access modifiers changed, original: protected|final */
    public final aisw a(Map<String, String> map) {
        aisw d = this.d.a(this.e, this.a, map).e().d();
        StringBuilder stringBuilder = new StringBuilder("Crashlytics Android SDK/");
        stringBuilder.append(this.b.a());
        return d.a("User-Agent", stringBuilder.toString()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }
}
