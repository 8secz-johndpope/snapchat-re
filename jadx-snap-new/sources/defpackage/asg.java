package defpackage;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.concurrent.CountDownLatch;

/* renamed from: asg */
final class asg {
    final b a;
    final Builder b;

    /* renamed from: asg$1 */
    static class 1 implements OnClickListener {
        private /* synthetic */ b a;

        1(b bVar) {
            this.a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.a.a(true);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: asg$2 */
    static class 2 implements OnClickListener {
        private /* synthetic */ b a;

        2(b bVar) {
            this.a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.a.a(false);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: asg$3 */
    static class 3 implements OnClickListener {
        private /* synthetic */ a a;
        private /* synthetic */ b b;

        3(a aVar, b bVar) {
            this.a = aVar;
            this.b = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.a.a();
            this.b.a(true);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: asg$a */
    interface a {
        void a();
    }

    /* renamed from: asg$b */
    static class b {
        boolean a;
        final CountDownLatch b;

        private b() {
            this.a = false;
            this.b = new CountDownLatch(1);
        }

        /* synthetic */ b(byte b) {
            this();
        }

        /* Access modifiers changed, original: final */
        public final void a(boolean z) {
            this.a = z;
            this.b.countDown();
        }
    }

    asg(Builder builder, b bVar) {
        this.a = bVar;
        this.b = builder;
    }
}
