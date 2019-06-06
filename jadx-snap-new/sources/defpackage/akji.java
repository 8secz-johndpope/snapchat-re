package defpackage;

import defpackage.akje.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: akji */
final class akji implements Closeable {
    static final Logger a = Logger.getLogger(akjf.class.getName());
    final akkf b;
    final boolean c;
    private final a d = new a(this.b);
    private a e = new a(this.d);

    /* renamed from: akji$b */
    interface b {
        void a(int i);

        void a(int i, long j);

        void a(int i, akjc akjc);

        void a(int i, List<akjd> list);

        void a(akjo akjo);

        void a(boolean z, int i, int i2);

        void a(boolean z, int i, akkf akkf, int i2);

        void a(boolean z, int i, List<akjd> list);
    }

    /* renamed from: akji$a */
    static final class a implements akkv {
        int a;
        byte b;
        int c;
        int d;
        short e;
        private final akkf f;

        a(akkf akkf) {
            this.f = akkf;
        }

        public final long a(akkd akkd, long j) {
            while (true) {
                int i = this.d;
                if (i == 0) {
                    this.f.f((long) this.e);
                    this.e = (short) 0;
                    if ((this.b & 4) != 0) {
                        return -1;
                    }
                    int i2 = this.c;
                    int a = akji.a(this.f);
                    this.d = a;
                    this.a = a;
                    byte g = (byte) this.f.g();
                    this.b = (byte) this.f.g();
                    if (akji.a.isLoggable(Level.FINE)) {
                        akji.a.fine(akjf.a(true, this.c, this.a, g, this.b));
                    }
                    this.c = this.f.i() & Integer.MAX_VALUE;
                    if (g != (byte) 9) {
                        throw akjf.b("%s != TYPE_CONTINUATION", Byte.valueOf(g));
                    } else if (this.c != i2) {
                        throw akjf.b("TYPE_CONTINUATION streamId changed", new Object[0]);
                    }
                } else {
                    long a2 = this.f.a(akkd, Math.min(j, (long) i));
                    if (a2 == -1) {
                        return -1;
                    }
                    this.d = (int) (((long) this.d) - a2);
                    return a2;
                }
            }
        }

        public final akkw a() {
            return this.f.a();
        }

        public final void close() {
        }
    }

    akji(akkf akkf, boolean z) {
        this.b = akkf;
        this.c = z;
    }

    private static int a(int i, byte b, short s) {
        short i2;
        if ((b & 8) != 0) {
            i2 = i2 - 1;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        throw akjf.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
    }

    static int a(akkf akkf) {
        return (akkf.g() & 255) | (((akkf.g() & 255) << 16) | ((akkf.g() & 255) << 8));
    }

    private List<akjd> a(int i, short s, byte b, int i2) {
        a aVar = this.d;
        aVar.d = i;
        aVar.a = i;
        aVar.e = s;
        aVar.b = b;
        aVar.c = i2;
        this.e.a();
        return this.e.b();
    }

    private void a() {
        this.b.i();
        this.b.g();
    }

    public final boolean a(boolean z, b bVar) {
        short s = (short) 0;
        try {
            this.b.a(9);
            int a = akji.a(this.b);
            if (a < 0 || a > 16384) {
                throw akjf.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
            }
            byte g = (byte) this.b.g();
            if (!z || g == (byte) 4) {
                akkf akkf;
                long j;
                byte g2 = (byte) this.b.g();
                int i = this.b.i() & Integer.MAX_VALUE;
                if (a.isLoggable(Level.FINE)) {
                    a.fine(akjf.a(true, i, a, g, g2));
                }
                boolean z2;
                int i2;
                switch (g) {
                    case (byte) 0:
                        if (i != 0) {
                            z2 = (g2 & 1) != 0;
                            if (((g2 & 32) != 0 ? 1 : null) == null) {
                                if ((g2 & 8) != 0) {
                                    s = (short) (this.b.g() & 255);
                                }
                                bVar.a(z2, i, this.b, akji.a(a, g2, s));
                                akkf = this.b;
                                j = (long) s;
                                break;
                            }
                            throw akjf.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        }
                        throw akjf.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                    case (byte) 1:
                        if (i != 0) {
                            z2 = (g2 & 1) != 0;
                            if ((g2 & 8) != 0) {
                                s = (short) (this.b.g() & 255);
                            }
                            if ((g2 & 32) != 0) {
                                a();
                                a -= 5;
                            }
                            bVar.a(z2, i, a(akji.a(a, g2, s), s, g2, i));
                            break;
                        }
                        throw akjf.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    case (byte) 2:
                        if (a != 5) {
                            throw akjf.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a));
                        } else if (i != 0) {
                            a();
                            break;
                        } else {
                            throw akjf.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                        }
                    case (byte) 3:
                        if (a != 4) {
                            throw akjf.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a));
                        } else if (i != 0) {
                            akjc a2 = akjc.a(this.b.i());
                            if (a2 != null) {
                                bVar.a(i, a2);
                                break;
                            }
                            throw akjf.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i2));
                        } else {
                            throw akjf.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        }
                    case (byte) 4:
                        if (i != 0) {
                            throw akjf.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        } else if ((g2 & 1) != 0) {
                            if (a != 0) {
                                throw akjf.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            }
                        } else if (a % 6 == 0) {
                            akjo akjo = new akjo();
                            for (int i3 = 0; i3 < a; i3 += 6) {
                                i = this.b.h();
                                int i4 = this.b.i();
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i == 3) {
                                            i = 4;
                                        } else if (i == 4) {
                                            i = 7;
                                            if (i4 < 0) {
                                                throw akjf.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                            }
                                        } else if (i == 5 && (i4 < 16384 || i4 > 16777215)) {
                                            throw akjf.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i4));
                                        }
                                    } else if (!(i4 == 0 || i4 == 1)) {
                                        throw akjf.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    }
                                }
                                akjo.a(i, i4);
                            }
                            bVar.a(akjo);
                            break;
                        } else {
                            throw akjf.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a));
                        }
                        break;
                    case (byte) 5:
                        if (i != 0) {
                            if ((g2 & 8) != 0) {
                                s = (short) (this.b.g() & 255);
                            }
                            bVar.a(this.b.i() & Integer.MAX_VALUE, a(akji.a(a - 4, g2, s), s, g2, i));
                            break;
                        }
                        throw akjf.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    case (byte) 6:
                        if (a != 8) {
                            throw akjf.b("TYPE_PING length != 8: %s", Integer.valueOf(a));
                        } else if (i == 0) {
                            boolean z3;
                            a = this.b.i();
                            int i5 = this.b.i();
                            if ((g2 & 1) != 0) {
                                z3 = true;
                            }
                            bVar.a(z3, a, i5);
                            break;
                        } else {
                            throw akjf.b("TYPE_PING streamId != 0", new Object[0]);
                        }
                    case (byte) 7:
                        if (a < 8) {
                            throw akjf.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a));
                        } else if (i == 0) {
                            i2 = this.b.i();
                            a -= 8;
                            if (akjc.a(this.b.i()) != null) {
                                if (a > 0) {
                                    this.b.c((long) a);
                                }
                                bVar.a(i2);
                                break;
                            }
                            throw akjf.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(this.b.i()));
                        } else {
                            throw akjf.b("TYPE_GOAWAY streamId != 0", new Object[0]);
                        }
                    case (byte) 8:
                        if (a == 4) {
                            long i6 = ((long) this.b.i()) & 2147483647L;
                            if (i6 != 0) {
                                bVar.a(i, i6);
                                break;
                            }
                            throw akjf.b("windowSizeIncrement was 0", Long.valueOf(i6));
                        }
                        throw akjf.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a));
                    default:
                        akkf = this.b;
                        j = (long) a;
                        break;
                }
                akkf.f(j);
                return true;
            }
            throw akjf.b("Expected a SETTINGS frame but was %s", Byte.valueOf(g));
        } catch (IOException unused) {
            return false;
        }
    }

    public final void close() {
        this.b.close();
    }
}
