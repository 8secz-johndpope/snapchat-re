package defpackage;

import android.content.Context;
import defpackage.akoz.a;
import defpackage.akpm.b;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: akoy */
public abstract class akoy extends akou {

    /* renamed from: akoy$a */
    public static class a extends defpackage.akou.a {
        public a(akpa akpa) {
            super(akpa);
        }

        public a(Context context) {
            super(context);
        }

        public final a b() {
            super.b(true);
            return this;
        }

        /* renamed from: b */
        public final a a(int i, long j) {
            super.a(i, j);
            return this;
        }

        public final a b(String str) {
            this.a.a(str);
            return this;
        }

        /* renamed from: b */
        public final a a(String str, int i, int i2) {
            super.a(str, i, i2);
            return this;
        }

        /* renamed from: b */
        public final a a(String str, Set<byte[]> set, boolean z, Date date) {
            super.a(str, set, z, date);
            return this;
        }

        public final a c() {
            super.c(false);
            return this;
        }

        public final a c(String str) {
            super.a(str);
            return this;
        }

        public final a d(boolean z) {
            super.a(z);
            return this;
        }

        public final akoy d() {
            return this.a.b();
        }
    }

    public abstract a a(String str, b bVar, Executor executor);

    public void a(akpi.a aVar) {
    }

    public void a(String str, int i) {
    }
}
