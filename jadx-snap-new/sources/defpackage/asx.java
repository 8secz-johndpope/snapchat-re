package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* renamed from: asx */
final class asx {
    private static final b b = new b();
    asv a;
    private final Context c;
    private final a d;

    /* renamed from: asx$b */
    static final class b implements asv {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final asb a() {
            return null;
        }

        public final void a(long j, String str) {
        }

        public final void b() {
        }

        public final void c() {
        }
    }

    /* renamed from: asx$a */
    public interface a {
        File a();
    }

    asx(Context context, a aVar) {
        this(context, aVar, null);
    }

    private asx(Context context, a aVar, String str) {
        this.c = context;
        this.d = aVar;
        this.a = b;
        a(null);
    }

    private void a(File file) {
        this.a = new atg(file);
    }

    private File b(String str) {
        StringBuilder stringBuilder = new StringBuilder("crashlytics-userlog-");
        stringBuilder.append(str);
        stringBuilder.append(".temp");
        return new File(this.d.a(), stringBuilder.toString());
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        this.a.b();
        this.a = b;
        if (str != null) {
            if (airf.a(this.c, "com.crashlytics.CollectCustomLogs", true)) {
                a(b(str));
            } else {
                aiqj.a().a("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Set<String> set) {
        File[] listFiles = this.d.a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                Object name = file.getName();
                int lastIndexOf = name.lastIndexOf(".temp");
                if (lastIndexOf != -1) {
                    name = name.substring(20, lastIndexOf);
                }
                if (!set.contains(name)) {
                    file.delete();
                }
            }
        }
    }
}
