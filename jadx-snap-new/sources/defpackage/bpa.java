package defpackage;

/* renamed from: bpa */
public final class bpa implements bnk {
    private bnm a;
    private bpf b;
    private boolean c;

    /* renamed from: bpa$1 */
    static class 1 implements bnn {
        1() {
        }

        public final bnk[] a() {
            return new bnk[]{new bpa()};
        }
    }

    static {
        1 1 = new 1();
    }

    private boolean b(bnl bnl) {
        bpc bpc = new bpc();
        if (bpc.a(bnl, true) && (bpc.a & 2) == 2) {
            bpf boz;
            int min = Math.min(bpc.e, 8);
            bzc bzc = new bzc(min);
            bnl.c(bzc.a, 0, min);
            bzc.c(0);
            if (boz.a(bzc)) {
                boz = new boz();
            } else {
                bzc.c(0);
                if (bph.a(bzc)) {
                    boz = new bph();
                } else {
                    bzc.c(0);
                    if (bpe.a(bzc)) {
                        boz = new bpe();
                    }
                }
            }
            this.b = boz;
            return true;
        }
        return false;
    }

    public final int a(bnl bnl, bnr bnr) {
        if (this.b == null) {
            if (b(bnl)) {
                bnl.a();
            } else {
                throw new bln("Failed to determine bitstream type");
            }
        }
        if (!this.c) {
            bnu a = this.a.a(0, 1);
            this.a.a();
            this.b.a(this.a, a);
            this.c = true;
        }
        bpf bpf = this.b;
        int i = bpf.c;
        if (i == 0) {
            return bpf.a(bnl);
        }
        if (i == 1) {
            bnl.b((int) bpf.b);
            bpf.c = 2;
            return 0;
        } else if (i == 2) {
            return bpf.a(bnl, bnr);
        } else {
            throw new IllegalStateException();
        }
    }

    public final void a(long j, long j2) {
        bpf bpf = this.b;
        if (bpf != null) {
            bpf.a(j, j2);
        }
    }

    public final void a(bnm bnm) {
        this.a = bnm;
    }

    public final boolean a(bnl bnl) {
        try {
            return b(bnl);
        } catch (bln unused) {
            return false;
        }
    }
}
