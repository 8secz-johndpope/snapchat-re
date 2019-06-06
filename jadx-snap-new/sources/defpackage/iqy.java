package defpackage;

/* renamed from: iqy */
public interface iqy {

    /* renamed from: iqy$a */
    public static final class a {
        public static /* synthetic */ void a(iqy iqy, achb achb, int i, boolean z, ith ith, zjw zjw, int i2) {
            int i3 = (i2 & 2) != 0 ? 0 : i;
            boolean z2 = (i2 & 4) != 0 ? false : z;
            if ((i2 & 16) != 0) {
                zjw = null;
            }
            iqy.a(achb, i3, z2, ith, zjw);
        }
    }

    long a();

    void a(long j);

    void a(long j, boolean z);

    void a(achb<zjm, zjk> achb);

    void a(achb<zjm, zjk> achb, int i, boolean z, ith ith, zjw zjw);

    ajdp<Integer> b();

    long c();

    void d();

    ajdp<Boolean> e();
}
