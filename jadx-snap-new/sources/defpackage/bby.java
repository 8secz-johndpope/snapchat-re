package defpackage;

import android.os.Looper;

/* renamed from: bby */
public interface bby {

    /* renamed from: bby$a */
    public interface a {
        void a(int i, Object obj);
    }

    /* renamed from: bby$b */
    public interface b {
        void onPlayWhenReadyCommitted();

        void onPlayerError(bbx bbx);

        void onPlayerStateChanged(boolean z, int i);
    }

    int a(int i);

    Looper a();

    bci a(int i, int i2);

    void a(long j);

    void a(a aVar, Object obj);

    void a(b bVar);

    void a(boolean z);

    void a(bcq... bcqArr);

    int b();

    int b(int i);

    void b(int i, int i2);

    void b(a aVar, Object obj);

    void b(b bVar);

    boolean c();

    void d();

    void e();

    long f();

    long g();

    long h();

    int i();
}
