package defpackage;

import java.util.ArrayDeque;

/* renamed from: bob */
final class bob implements boc {
    private final byte[] a = new byte[8];
    private final ArrayDeque<a> b = new ArrayDeque();
    private final bog c = new bog();
    private bod d;
    private int e;
    private int f;
    private long g;

    /* renamed from: bob$a */
    static final class a {
        final int a;
        final long b;

        private a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        /* synthetic */ a(int i, long j, byte b) {
            this(i, j);
        }
    }

    private long a(bnl bnl, int i) {
        int i2 = 0;
        bnl.b(this.a, 0, i);
        long j = 0;
        while (i2 < i) {
            j = (j << 8) | ((long) (this.a[i2] & 255));
            i2++;
        }
        return j;
    }

    private static String b(bnl bnl, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        bnl.b(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == (byte) 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    public final void a() {
        this.e = 0;
        this.b.clear();
        this.c.a();
    }

    public final void a(bod bod) {
        this.d = bod;
    }

    public final boolean a(bnl bnl) {
        byo.b(this.d != null);
        while (true) {
            if (this.b.isEmpty() || bnl.c() < ((a) this.b.peek()).b) {
                int a;
                if (this.e == 0) {
                    long a2 = this.c.a(bnl, true, false, 4);
                    if (a2 == -2) {
                        int a3;
                        bnl.a();
                        while (true) {
                            bnl.c(this.a, 0, 4);
                            a = bog.a(this.a[0]);
                            if (a != -1 && a <= 4) {
                                a3 = (int) bog.a(this.a, a, false);
                                if (this.d.b(a3)) {
                                    break;
                                }
                            }
                            bnl.b(1);
                        }
                        bnl.b(a);
                        a2 = (long) a3;
                    }
                    if (a2 == -1) {
                        return false;
                    }
                    this.f = (int) a2;
                    this.e = 1;
                }
                if (this.e == 1) {
                    this.g = this.c.a(bnl, false, true, 8);
                    this.e = 2;
                }
                a = this.d.a(this.f);
                long j;
                StringBuilder stringBuilder;
                if (a == 0) {
                    bnl.b((int) this.g);
                    this.e = 0;
                } else if (a == 1) {
                    long c = bnl.c();
                    this.b.push(new a(this.f, this.g + c, (byte) 0));
                    this.d.a(this.f, c, this.g);
                    this.e = 0;
                    return true;
                } else if (a == 2) {
                    j = this.g;
                    if (j <= 8) {
                        this.d.a(this.f, a(bnl, (int) j));
                        this.e = 0;
                        return true;
                    }
                    stringBuilder = new StringBuilder("Invalid integer size: ");
                    stringBuilder.append(this.g);
                    throw new bln(stringBuilder.toString());
                } else if (a == 3) {
                    j = this.g;
                    if (j <= 2147483647L) {
                        this.d.a(this.f, bob.b(bnl, (int) j));
                        this.e = 0;
                        return true;
                    }
                    stringBuilder = new StringBuilder("String element size: ");
                    stringBuilder.append(this.g);
                    throw new bln(stringBuilder.toString());
                } else if (a == 4) {
                    this.d.a(this.f, (int) this.g, bnl);
                    this.e = 0;
                    return true;
                } else if (a == 5) {
                    long j2 = this.g;
                    if (j2 == 4 || j2 == 8) {
                        bod bod = this.d;
                        int i = this.f;
                        int i2 = (int) this.g;
                        j2 = a(bnl, i2);
                        bod.a(i, i2 == 4 ? (double) Float.intBitsToFloat((int) j2) : Double.longBitsToDouble(j2));
                        this.e = 0;
                        return true;
                    }
                    stringBuilder = new StringBuilder("Invalid float size: ");
                    stringBuilder.append(this.g);
                    throw new bln(stringBuilder.toString());
                } else {
                    throw new bln("Invalid element type ".concat(String.valueOf(a)));
                }
            }
            this.d.c(((a) this.b.pop()).a);
            return true;
        }
    }
}
