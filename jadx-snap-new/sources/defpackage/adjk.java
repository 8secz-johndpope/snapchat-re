package defpackage;

import android.util.Log;
import com.brightcove.player.media.ErrorFields;

/* renamed from: adjk */
public abstract class adjk {
    public final String a;

    /* renamed from: adjk$a */
    public static final class a extends adjk {
        public a(Throwable th) {
            akcr.b(th, "throwable");
            Object stackTraceString = Log.getStackTraceString(th);
            akcr.a(stackTraceString, "Log.getStackTraceString(throwable)");
            super(stackTraceString, (byte) 0);
        }
    }

    /* renamed from: adjk$b */
    public static final class b extends adjk {
        public b(String str) {
            akcr.b(str, ErrorFields.MESSAGE);
            super(str, (byte) 0);
        }

        public b(Throwable th) {
            akcr.b(th, "throwable");
            String stackTraceString = Log.getStackTraceString(th);
            akcr.a((Object) stackTraceString, "Log.getStackTraceString(throwable)");
            this(stackTraceString);
        }
    }

    /* renamed from: adjk$c */
    public static final class c extends adjk {
        public static final c b = new c();

        private c() {
            super("", (byte) 0);
        }
    }

    private adjk(String str) {
        this.a = str;
    }

    public /* synthetic */ adjk(String str, byte b) {
        this(str);
    }
}
