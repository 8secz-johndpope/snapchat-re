package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.snapchat.client.shims.LogContext;
import com.snapchat.client.shims.LogLevel;
import com.snapchat.client.shims.Logger;
import java.util.HashMap;

/* renamed from: exv */
public final class exv extends Logger {
    private final Object[] a = new Object[0];

    /* renamed from: exv$a */
    static final class a extends akcq implements akca<String, String, Object[], ajxw> {
        public static final a a = new a();

        a() {
            super(3);
        }

        public final String getName() {
            return "c";
        }

        public final akej getOwner() {
            return akde.a(abpe.class);
        }

        public final String getSignature() {
            return "c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ajxw.a;
        }
    }

    /* renamed from: exv$b */
    static final class b extends akcq implements akca<String, String, Object[], ajxw> {
        public static final b a = new b();

        b() {
            super(3);
        }

        public final String getName() {
            return "d";
        }

        public final akej getOwner() {
            return akde.a(abpe.class);
        }

        public final String getSignature() {
            return "d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ajxw.a;
        }
    }

    /* renamed from: exv$c */
    static final class c extends akcq implements akca<String, String, Object[], ajxw> {
        public static final c a = new c();

        c() {
            super(3);
        }

        public final String getName() {
            return "v";
        }

        public final akej getOwner() {
            return akde.a(abpe.class);
        }

        public final String getSignature() {
            return "v(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ajxw.a;
        }
    }

    /* renamed from: exv$d */
    static final class d extends akcq implements akca<String, String, Object[], ajxw> {
        public static final d a = new d();

        d() {
            super(3);
        }

        public final String getName() {
            return "i";
        }

        public final akej getOwner() {
            return akde.a(abpe.class);
        }

        public final String getSignature() {
            return "i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ajxw.a;
        }
    }

    /* renamed from: exv$e */
    static final class e extends akcq implements akca<String, String, Object[], ajxw> {
        public static final e a = new e();

        e() {
            super(3);
        }

        public final String getName() {
            return "w";
        }

        public final akej getOwner() {
            return akde.a(abpe.class);
        }

        public final String getSignature() {
            return "w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ajxw.a;
        }
    }

    /* renamed from: exv$f */
    static final class f extends akcq implements akca<String, String, Object[], ajxw> {
        public static final f a = new f();

        f() {
            super(3);
        }

        public final String getName() {
            return "e";
        }

        public final akej getOwner() {
            return akde.a(abpe.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ajxw.a;
        }
    }

    /* renamed from: exv$g */
    static final class g extends akcq implements akca<String, String, Object[], ajxw> {
        g(exv exv) {
            super(3, exv);
        }

        public final String getName() {
            return "noopLog";
        }

        public final akej getOwner() {
            return akde.a(exv.class);
        }

        public final String getSignature() {
            return "noopLog(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj2;
            Object[] objArr = (Object[]) obj3;
            akcr.b((String) obj, "p1");
            akcr.b(str, "p2");
            akcr.b(objArr, "p3");
            return ajxw.a;
        }
    }

    public final void log(LogLevel logLevel, LogContext logContext, String str, String str2) {
        g gVar;
        akcr.b(logLevel, "level");
        akcr.b(logContext, "context");
        akcr.b(str, "tag");
        akcr.b(str2, ErrorFields.MESSAGE);
        int i = exw.b[logContext.ordinal()];
        if (i == 1) {
            gVar = a.a;
        } else if (i == 2) {
            switch (exw.a[logLevel.ordinal()]) {
                case 1:
                    gVar = b.a;
                    break;
                case 2:
                    gVar = c.a;
                    break;
                case 3:
                    gVar = d.a;
                    break;
                case 4:
                    gVar = e.a;
                    break;
                case 5:
                    gVar = f.a;
                    break;
                case 6:
                    gVar = new g(this);
                    break;
                default:
                    throw new ajxk();
            }
        } else {
            throw new ajxk();
        }
        gVar.invoke(str, str2, this.a);
    }

    public final void logTimedEvent(String str, long j, HashMap<String, String> hashMap) {
        akcr.b(str, "name");
        akcr.b(hashMap, "params");
    }
}
