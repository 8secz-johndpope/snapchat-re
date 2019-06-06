package defpackage;

import com.google.common.base.Preconditions;
import defpackage.aiuh.a;
import java.util.Arrays;
import java.util.List;

/* renamed from: aiuj */
public final class aiuj {

    /* renamed from: aiuj$1 */
    class 1 extends aiuh<Object, Object> {
        1() {
        }

        public final void a() {
        }

        public final void a(int i) {
        }

        public final void a(a<Object> aVar, aivl aivl) {
        }

        public final void a(Object obj) {
        }

        public final void a(String str, Throwable th) {
        }
    }

    /* renamed from: aiuj$a */
    static class a extends aiug {
        private final aiug a;
        private final aiui b;

        private a(aiug aiug, aiui aiui) {
            this.a = aiug;
            this.b = (aiui) Preconditions.checkNotNull(aiui, "interceptor");
        }

        /* synthetic */ a(aiug aiug, aiui aiui, byte b) {
            this(aiug, aiui);
        }

        public final <ReqT, RespT> aiuh<ReqT, RespT> a(aivm<ReqT, RespT> aivm, aiuf aiuf) {
            return this.b.a(aivm, aiuf, this.a);
        }

        public final String a() {
            return this.a.a();
        }
    }

    static {
        1 1 = new 1();
    }

    public static aiug a(aiug aiug, List<? extends aiui> list) {
        Preconditions.checkNotNull(aiug, "channel");
        for (aiui aVar : list) {
            aiug = new a(aiug, aVar, (byte) 0);
        }
        return aiug;
    }

    public static aiug a(aiug aiug, aiui... aiuiArr) {
        return aiuj.a(aiug, Arrays.asList(aiuiArr));
    }
}
