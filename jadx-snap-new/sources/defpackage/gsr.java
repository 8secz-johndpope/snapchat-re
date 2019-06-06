package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.common.base.Optional;
import com.snap.core.db.record.ConnectedAppsModel;

/* renamed from: gsr */
public final class gsr implements gqx {
    final Context a;
    final Optional<String> b;
    private final int c = 2;
    private final ajwy<abss> d;
    private final ajwy<ftl> e;

    /* renamed from: gsr$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: gsr$b */
    static final class b<T, R> implements ajfc<Boolean, ajdb> {
        final /* synthetic */ gsr a;
        final /* synthetic */ Thread b;
        final /* synthetic */ Throwable c;

        /* renamed from: gsr$b$1 */
        static final class 1 implements ajev {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final void run() {
                gsr gsr = this.a.a;
                Thread thread = this.a.b;
                String stackTraceString = Log.getStackTraceString(this.a.c);
                if (stackTraceString.length() > 262144) {
                    akcr.a((Object) stackTraceString, "crashText");
                    if (stackTraceString != null) {
                        stackTraceString = stackTraceString.substring(0, 262144);
                        akcr.a((Object) stackTraceString, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new ajxt("null cannot be cast to non-null type java.lang.String");
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(stackTraceString);
                stringBuilder.append("\n\nThread Name: ");
                stringBuilder.append(thread.getName());
                stringBuilder.append("\n\nUser Agent: ");
                stringBuilder.append(abqv.a());
                if (gsr.b.isPresent()) {
                    stringBuilder.append("\n\nApp name: ");
                    stringBuilder.append((String) gsr.b.get());
                }
                stringBuilder.append("\n");
                Intent intent = new Intent("snap.intent.action.VIEW_CRASH");
                intent.setFlags(268468224);
                intent.putExtra("android.intent.extra.SUBJECT", "[Android Internal Crash] New Crash Report");
                intent.putExtra("android.intent.extra.TEXT", stringBuilder.toString());
                try {
                    intent.setPackage(gsr.a.getPackageName());
                    gsr.a.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    intent.setPackage(null);
                    intent.setType("plain/text");
                    intent.setAction("android.intent.action.SEND");
                    gsr.a.startActivity(intent);
                }
            }
        }

        b(gsr gsr, Thread thread, Throwable th) {
            this.a = gsr;
            this.b = thread;
            this.c = th;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            return bool.booleanValue() ? ajcx.a((ajev) new 1(this)) : ajvo.a(ajhn.a);
        }
    }

    static {
        a aVar = new a();
    }

    public gsr(Context context, Optional<String> optional, ajwy<abss> ajwy, ajwy<ftl> ajwy2) {
        akcr.b(context, "context");
        akcr.b(optional, ConnectedAppsModel.APPNAME);
        akcr.b(ajwy, "releaseManager");
        akcr.b(ajwy2, "configProvider");
        this.a = context;
        this.b = optional;
        this.d = ajwy;
        this.e = ajwy2;
    }

    public final int a() {
        return this.c;
    }

    public final ajcx a(Thread thread, Throwable th) {
        Object e;
        String str;
        akcr.b(thread, "thread");
        akcr.b(th, "throwable");
        if (((abss) this.d.get()).b()) {
            e = ((ftl) this.e.get()).b((fth) gse.CRASH_VIEWER_ENABLED).e((ajfc) new b(this, thread, th));
            str = "configProvider.get().get…  }\n                    }";
        } else {
            e = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        }
        akcr.a(e, str);
        return e;
    }
}
