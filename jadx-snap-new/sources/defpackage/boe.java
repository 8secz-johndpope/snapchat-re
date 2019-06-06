package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.SparseArray;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.snap.core.db.SnapDbSchemaVersionControllerKt;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.bns.b;
import defpackage.bnu.a;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import org.opencv.imgproc.Imgproc;

/* renamed from: boe */
public final class boe implements bnk {
    private static final byte[] H = new byte[]{(byte) 49, (byte) 10, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 32, (byte) 45, (byte) 45, (byte) 62, (byte) 32, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 10};
    private static final byte[] I = new byte[]{(byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32};
    private static final byte[] J = new byte[]{(byte) 68, (byte) 105, (byte) 97, (byte) 108, (byte) 111, (byte) 103, (byte) 117, (byte) 101, (byte) 58, (byte) 32, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44};
    private static final byte[] K = new byte[]{(byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32};
    static final byte[] a = bzo.b("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    static final UUID b = new UUID(72057594037932032L, -9223371306706625679L);
    int A;
    int[] B;
    int C;
    int D;
    int E;
    boolean F;
    bnm G;
    private final boc L;
    private final bzc M;
    private final bzc N;
    private final bzc O;
    private final bzc P;
    private final bzc Q;
    private final bzc R;
    private final bzc S;
    private ByteBuffer T;
    private long U;
    private int V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private byte aa;
    private int ab;
    private int ac;
    private int ad;
    private boolean ae;
    final bog c;
    final SparseArray<b> d;
    final boolean e;
    final bzc f;
    final bzc g;
    long h;
    long i;
    long j;
    long k;
    long l;
    b m;
    boolean n;
    int o;
    long p;
    boolean q;
    long r;
    long s;
    byx t;
    byx u;
    boolean v;
    int w;
    long x;
    long y;
    int z;

    /* renamed from: boe$a */
    final class a implements bod {
        private a() {
        }

        /* synthetic */ a(boe boe, byte b) {
            this();
        }

        public final int a(int i) {
            switch (i) {
                case Imgproc.COLOR_RGB2YUV_YV12 /*131*/:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 241:
                case 251:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 22186:
                case 22203:
                case 25188:
                case 2352003:
                case 2807729:
                    return 2;
                case Imgproc.COLOR_BGRA2YUV_YV12 /*134*/:
                case 17026:
                case 2274716:
                    return 3;
                case 160:
                case 174:
                case 183:
                case 187:
                case 224:
                case SnapDbSchemaVersionControllerKt.SNAP_DB_CURRENT_VERSION /*225*/:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    return 1;
                case 161:
                case 163:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    return 4;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                    return 5;
                default:
                    return 0;
            }
        }

        public final void a(int i, double d) {
            boe boe = boe.this;
            if (i == 181) {
                boe.m.I = (int) d;
            } else if (i != 17545) {
                switch (i) {
                    case 21969:
                        boe.m.w = (float) d;
                        return;
                    case 21970:
                        boe.m.x = (float) d;
                        return;
                    case 21971:
                        boe.m.y = (float) d;
                        return;
                    case 21972:
                        boe.m.z = (float) d;
                        return;
                    case 21973:
                        boe.m.A = (float) d;
                        return;
                    case 21974:
                        boe.m.B = (float) d;
                        return;
                    case 21975:
                        boe.m.C = (float) d;
                        return;
                    case 21976:
                        boe.m.D = (float) d;
                        return;
                    case 21977:
                        boe.m.E = (float) d;
                        return;
                    case 21978:
                        boe.m.F = (float) d;
                        break;
                }
            } else {
                boe.k = (long) d;
            }
        }

        public final void a(int i, int i2, bnl bnl) {
            int i3 = i;
            int i4 = i2;
            bnl bnl2 = bnl;
            boe boe = boe.this;
            int i5 = 4;
            int i6 = 0;
            int i7 = 1;
            if (i3 == 161 || i3 == 163) {
                if (boe.w == 0) {
                    boe.C = (int) boe.c.a(bnl2, false, true, 8);
                    boe.D = boe.c.a;
                    boe.y = -9223372036854775807L;
                    boe.w = 1;
                    boe.f.a();
                }
                b bVar = (b) boe.d.get(boe.C);
                if (bVar == null) {
                    bnl2.b(i4 - boe.D);
                    boe.w = 0;
                    return;
                }
                if (boe.w == 1) {
                    int i8;
                    boe.a(bnl2, 3);
                    int i9 = (boe.f.a[2] & 6) >> 1;
                    if (i9 == 0) {
                        boe.A = 1;
                        boe.B = boe.a(boe.B, 1);
                        boe.B[0] = (i4 - boe.D) - 3;
                    } else if (i3 == 163) {
                        boe.a(bnl2, 4);
                        boe.A = (boe.f.a[3] & 255) + 1;
                        boe.B = boe.a(boe.B, boe.A);
                        int i10;
                        if (i9 == 2) {
                            Arrays.fill(boe.B, 0, boe.A, ((i4 - boe.D) - 4) / boe.A);
                        } else if (i9 == 1) {
                            i10 = 0;
                            for (i8 = 0; i8 < boe.A - 1; i8++) {
                                boe.B[i8] = 0;
                                do {
                                    i5++;
                                    boe.a(bnl2, i5);
                                    i9 = boe.f.a[i5 - 1] & 255;
                                    int[] iArr = boe.B;
                                    iArr[i8] = iArr[i8] + i9;
                                } while (i9 == 255);
                                i10 += boe.B[i8];
                            }
                            boe.B[boe.A - 1] = ((i4 - boe.D) - i5) - i10;
                        } else if (i9 == 3) {
                            i8 = 0;
                            i10 = 0;
                            while (i8 < boe.A - i7) {
                                boe.B[i8] = i6;
                                i5++;
                                boe.a(bnl2, i5);
                                int i11 = i5 - 1;
                                if (boe.f.a[i11] != (byte) 0) {
                                    long j;
                                    long j2 = 0;
                                    i9 = 0;
                                    while (i9 < 8) {
                                        int i12 = i7 << (7 - i9);
                                        if ((boe.f.a[i11] & i12) != 0) {
                                            i5 += i9;
                                            boe.a(bnl2, i5);
                                            j2 = (long) ((boe.f.a[i11] & 255) & (i12 ^ -1));
                                            for (i6 = i11 + 1; i6 < i5; i6++) {
                                                j2 = (j2 << 8) | ((long) (boe.f.a[i6] & 255));
                                            }
                                            if (i8 > 0) {
                                                j2 -= (1 << ((i9 * 7) + 6)) - 1;
                                            }
                                            i7 = i5;
                                            j = j2;
                                            if (j >= -2147483648L || j > 2147483647L) {
                                                throw new bln("EBML lacing sample size out of range.");
                                            }
                                            i6 = (int) j;
                                            int[] iArr2 = boe.B;
                                            if (i8 != 0) {
                                                i6 += boe.B[i8 - 1];
                                            }
                                            iArr2[i8] = i6;
                                            i10 += boe.B[i8];
                                            i8++;
                                            i5 = i7;
                                            i6 = 0;
                                            i7 = 1;
                                        } else {
                                            i9++;
                                            i7 = 1;
                                        }
                                    }
                                    i7 = i5;
                                    j = j2;
                                    if (j >= -2147483648L) {
                                    }
                                    throw new bln("EBML lacing sample size out of range.");
                                }
                                throw new bln("No valid varint length mask found");
                            }
                            boe.B[boe.A - 1] = ((i4 - boe.D) - i5) - i10;
                        } else {
                            throw new bln("Unexpected lacing value: ".concat(String.valueOf(i9)));
                        }
                    } else {
                        throw new bln("Lacing only supported in SimpleBlocks.");
                    }
                    boe.x = boe.s + boe.a((long) ((boe.f.a[0] << 8) | (boe.f.a[1] & 255)));
                    Object obj = (boe.f.a[2] & 8) == 8 ? 1 : null;
                    i8 = (bVar.c == 2 || (i3 == 163 && (boe.f.a[2] & 128) == 128)) ? 1 : 0;
                    boe.E = i8 | (obj != null ? Integer.MIN_VALUE : 0);
                    boe.w = 2;
                    boe.z = 0;
                }
                if (i3 == 163) {
                    while (boe.z < boe.A) {
                        boe.a(bnl2, bVar, boe.B[boe.z]);
                        boe.a(bVar, boe.x + ((long) ((boe.z * bVar.d) / MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL)));
                        boe.z++;
                    }
                    boe.w = 0;
                    return;
                }
                boe.a(bnl2, bVar, boe.B[0]);
            } else if (i3 == 16981) {
                boe.m.f = new byte[i4];
                bnl2.b(boe.m.f, 0, i4);
            } else if (i3 == 18402) {
                byte[] bArr = new byte[i4];
                bnl2.b(bArr, 0, i4);
                boe.m.g = new defpackage.bnu.a(1, bArr, 0, 0);
            } else if (i3 == 21419) {
                Arrays.fill(boe.g.a, (byte) 0);
                bnl2.b(boe.g.a, 4 - i4, i4);
                boe.g.c(0);
                boe.o = (int) boe.g.h();
            } else if (i3 == 25506) {
                boe.m.h = new byte[i4];
                bnl2.b(boe.m.h, 0, i4);
            } else if (i3 == 30322) {
                boe.m.o = new byte[i4];
                bnl2.b(boe.m.o, 0, i4);
            } else {
                throw new bln("Unexpected id: ".concat(String.valueOf(i)));
            }
        }

        public final void a(int i, long j) {
            boe boe = boe.this;
            String str = " not supported";
            StringBuilder stringBuilder;
            if (i != 20529) {
                if (i != 20530) {
                    boolean z = false;
                    b bVar;
                    switch (i) {
                        case Imgproc.COLOR_RGB2YUV_YV12 /*131*/:
                            boe.m.c = (int) j;
                            return;
                        case 136:
                            bVar = boe.m;
                            if (j == 1) {
                                z = true;
                            }
                            bVar.N = z;
                            return;
                        case 155:
                            boe.y = boe.a(j);
                            return;
                        case 159:
                            boe.m.G = (int) j;
                            return;
                        case 176:
                            boe.m.j = (int) j;
                            return;
                        case 179:
                            boe.t.a(boe.a(j));
                            return;
                        case 186:
                            boe.m.k = (int) j;
                            return;
                        case 215:
                            boe.m.b = (int) j;
                            return;
                        case 231:
                            boe.s = boe.a(j);
                            return;
                        case 241:
                            if (!boe.v) {
                                boe.u.a(j);
                                boe.v = true;
                                return;
                            }
                            break;
                        case 251:
                            boe.F = true;
                            return;
                        case 16980:
                            if (j != 3) {
                                stringBuilder = new StringBuilder("ContentCompAlgo ");
                                stringBuilder.append(j);
                                stringBuilder.append(str);
                                throw new bln(stringBuilder.toString());
                            }
                            break;
                        case 17029:
                            if (j < 1 || j > 2) {
                                stringBuilder = new StringBuilder("DocTypeReadVersion ");
                                stringBuilder.append(j);
                                stringBuilder.append(str);
                                throw new bln(stringBuilder.toString());
                            }
                        case 17143:
                            if (j != 1) {
                                stringBuilder = new StringBuilder("EBMLReadVersion ");
                                stringBuilder.append(j);
                                stringBuilder.append(str);
                                throw new bln(stringBuilder.toString());
                            }
                            break;
                        case 18401:
                            if (j != 5) {
                                stringBuilder = new StringBuilder("ContentEncAlgo ");
                                stringBuilder.append(j);
                                stringBuilder.append(str);
                                throw new bln(stringBuilder.toString());
                            }
                            break;
                        case 18408:
                            if (j != 1) {
                                stringBuilder = new StringBuilder("AESSettingsCipherMode ");
                                stringBuilder.append(j);
                                stringBuilder.append(str);
                                throw new bln(stringBuilder.toString());
                            }
                            break;
                        case 21420:
                            boe.p = j + boe.i;
                            return;
                        case 21432:
                            i = (int) j;
                            if (i == 0) {
                                boe.m.p = 0;
                                return;
                            } else if (i == 1) {
                                boe.m.p = 2;
                                return;
                            } else if (i == 3) {
                                boe.m.p = 1;
                                return;
                            } else if (i == 15) {
                                boe.m.p = 3;
                                return;
                            } else {
                                return;
                            }
                        case 21680:
                            boe.m.l = (int) j;
                            return;
                        case 21682:
                            boe.m.n = (int) j;
                            return;
                        case 21690:
                            boe.m.m = (int) j;
                            return;
                        case 21930:
                            bVar = boe.m;
                            if (j == 1) {
                                z = true;
                            }
                            bVar.M = z;
                            return;
                        case 22186:
                            boe.m.J = j;
                            return;
                        case 22203:
                            boe.m.K = j;
                            return;
                        case 25188:
                            boe.m.H = (int) j;
                            return;
                        case 2352003:
                            boe.m.d = (int) j;
                            return;
                        case 2807729:
                            boe.j = j;
                            return;
                        default:
                            switch (i) {
                                case 21945:
                                    i = (int) j;
                                    if (i == 1) {
                                        boe.m.t = 2;
                                        return;
                                    } else if (i == 2) {
                                        boe.m.t = 1;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21946:
                                    i = (int) j;
                                    if (i != 1) {
                                        if (i == 16) {
                                            boe.m.s = 6;
                                            return;
                                        } else if (i == 18) {
                                            boe.m.s = 7;
                                            return;
                                        } else if (!(i == 6 || i == 7)) {
                                            return;
                                        }
                                    }
                                    boe.m.s = 3;
                                    return;
                                case 21947:
                                    boe.m.q = true;
                                    i = (int) j;
                                    if (i == 1) {
                                        boe.m.r = 1;
                                        return;
                                    } else if (i == 9) {
                                        boe.m.r = 6;
                                        return;
                                    } else if (i == 4 || i == 5 || i == 6 || i == 7) {
                                        boe.m.r = 2;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21948:
                                    boe.m.u = (int) j;
                                    return;
                                case 21949:
                                    boe.m.v = (int) j;
                                    break;
                            }
                            break;
                    }
                } else if (j != 1) {
                    stringBuilder = new StringBuilder("ContentEncodingScope ");
                    stringBuilder.append(j);
                    stringBuilder.append(str);
                    throw new bln(stringBuilder.toString());
                }
            } else if (j != 0) {
                stringBuilder = new StringBuilder("ContentEncodingOrder ");
                stringBuilder.append(j);
                stringBuilder.append(str);
                throw new bln(stringBuilder.toString());
            }
        }

        public final void a(int i, long j, long j2) {
            boe boe = boe.this;
            if (i == 160) {
                boe.F = false;
            } else if (i == 174) {
                boe.m = new b();
            } else if (i == 187) {
                boe.v = false;
            } else if (i == 19899) {
                boe.o = -1;
                boe.p = -1;
            } else if (i != 20533) {
                if (i != 21968) {
                    if (i != 25152) {
                        if (i != 408125543) {
                            if (i == 475249515) {
                                boe.t = new byx();
                                boe.u = new byx();
                                return;
                            } else if (i == 524531317 && !boe.n) {
                                if (!boe.e || boe.r == -1) {
                                    boe.G.a(new b(boe.l));
                                    boe.n = true;
                                    return;
                                }
                                boe.q = true;
                                return;
                            }
                        } else if (boe.i == -1 || boe.i == j) {
                            boe.i = j;
                            boe.h = j2;
                        } else {
                            throw new bln("Multiple Segment elements not supported");
                        }
                    }
                    return;
                }
                boe.m.q = true;
            } else {
                boe.m.e = true;
            }
        }

        public final void a(int i, String str) {
            boe boe = boe.this;
            if (i != Imgproc.COLOR_BGRA2YUV_YV12) {
                if (i != 17026) {
                    if (i == 2274716) {
                        boe.m.O = str;
                    }
                } else if (!("webm".equals(str) || "matroska".equals(str))) {
                    StringBuilder stringBuilder = new StringBuilder("DocType ");
                    stringBuilder.append(str);
                    stringBuilder.append(" not supported");
                    throw new bln(stringBuilder.toString());
                }
                return;
            }
            boe.m.a = str;
        }

        public final boolean b(int i) {
            return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
        }

        /* JADX WARNING: Missing block: B:238:0x0406, code skipped:
            r3.append(r1.H);
            r3.append(". Setting mimeType to ");
            r3.append(r12);
            r3 = r3.toString();
     */
        /* JADX WARNING: Missing block: B:239:0x0418, code skipped:
            r20 = r3;
            r3 = null;
            r14 = "audio/raw";
            r17 = -1;
     */
        /* JADX WARNING: Missing block: B:246:0x0445, code skipped:
            android.util.Log.w(r11, r3);
     */
        /* JADX WARNING: Missing block: B:255:0x0478, code skipped:
            r3 = null;
            r14 = r12;
            r17 = 4096;
     */
        /* JADX WARNING: Missing block: B:263:0x051b, code skipped:
            r3 = r11;
     */
        /* JADX WARNING: Missing block: B:272:0x0534, code skipped:
            r3 = null;
     */
        /* JADX WARNING: Missing block: B:273:0x0535, code skipped:
            r14 = r12;
            r17 = -1;
     */
        /* JADX WARNING: Missing block: B:274:0x0538, code skipped:
            r20 = -1;
     */
        /* JADX WARNING: Missing block: B:275:0x053a, code skipped:
            r11 = r1.N | 0;
     */
        /* JADX WARNING: Missing block: B:276:0x053f, code skipped:
            if (r1.M == false) goto L_0x0543;
     */
        /* JADX WARNING: Missing block: B:277:0x0541, code skipped:
            r12 = 2;
     */
        /* JADX WARNING: Missing block: B:278:0x0543, code skipped:
            r12 = 0;
     */
        /* JADX WARNING: Missing block: B:279:0x0544, code skipped:
            r11 = r11 | r12;
     */
        /* JADX WARNING: Missing block: B:280:0x0549, code skipped:
            if (defpackage.byz.a(r14) == false) goto L_0x056d;
     */
        /* JADX WARNING: Missing block: B:281:0x054b, code skipped:
            r3 = defpackage.blg.a(java.lang.Integer.toString(r10), r14, null, -1, r17, r1.G, r1.I, r20, r3, r1.i, r11, r1.O);
            r4 = 1;
     */
        /* JADX WARNING: Missing block: B:283:0x0571, code skipped:
            if (defpackage.byz.b(r14) == false) goto L_0x0696;
     */
        /* JADX WARNING: Missing block: B:285:0x0575, code skipped:
            if (r1.n != 0) goto L_0x058d;
     */
        /* JADX WARNING: Missing block: B:287:0x0579, code skipped:
            if (r1.l != -1) goto L_0x057e;
     */
        /* JADX WARNING: Missing block: B:288:0x057b, code skipped:
            r6 = r1.j;
     */
        /* JADX WARNING: Missing block: B:289:0x057e, code skipped:
            r6 = r1.l;
     */
        /* JADX WARNING: Missing block: B:290:0x0580, code skipped:
            r1.l = r6;
     */
        /* JADX WARNING: Missing block: B:291:0x0584, code skipped:
            if (r1.m != -1) goto L_0x0589;
     */
        /* JADX WARNING: Missing block: B:292:0x0586, code skipped:
            r6 = r1.k;
     */
        /* JADX WARNING: Missing block: B:293:0x0589, code skipped:
            r6 = r1.m;
     */
        /* JADX WARNING: Missing block: B:294:0x058b, code skipped:
            r1.m = r6;
     */
        /* JADX WARNING: Missing block: B:296:0x0591, code skipped:
            if (r1.l == -1) goto L_0x05a7;
     */
        /* JADX WARNING: Missing block: B:298:0x0595, code skipped:
            if (r1.m == -1) goto L_0x05a7;
     */
        /* JADX WARNING: Missing block: B:299:0x0597, code skipped:
            r23 = ((float) (r1.k * r1.l)) / ((float) (r1.j * r1.m));
     */
        /* JADX WARNING: Missing block: B:300:0x05a7, code skipped:
            r23 = -1.0f;
     */
        /* JADX WARNING: Missing block: B:302:0x05ab, code skipped:
            if (r1.q == false) goto L_0x066e;
     */
        /* JADX WARNING: Missing block: B:304:0x05b1, code skipped:
            if (r1.w == -1.0f) goto L_0x065f;
     */
        /* JADX WARNING: Missing block: B:306:0x05b7, code skipped:
            if (r1.x == -1.0f) goto L_0x065f;
     */
        /* JADX WARNING: Missing block: B:308:0x05bd, code skipped:
            if (r1.y == -1.0f) goto L_0x065f;
     */
        /* JADX WARNING: Missing block: B:310:0x05c3, code skipped:
            if (r1.z == -1.0f) goto L_0x065f;
     */
        /* JADX WARNING: Missing block: B:312:0x05c9, code skipped:
            if (r1.A == -1.0f) goto L_0x065f;
     */
        /* JADX WARNING: Missing block: B:314:0x05cf, code skipped:
            if (r1.B == -1.0f) goto L_0x065f;
     */
        /* JADX WARNING: Missing block: B:316:0x05d5, code skipped:
            if (r1.C == -1.0f) goto L_0x065f;
     */
        /* JADX WARNING: Missing block: B:318:0x05db, code skipped:
            if (r1.D == -1.0f) goto L_0x065f;
     */
        /* JADX WARNING: Missing block: B:320:0x05e1, code skipped:
            if (r1.E == -1.0f) goto L_0x065f;
     */
        /* JADX WARNING: Missing block: B:322:0x05e7, code skipped:
            if (r1.F != -1.0f) goto L_0x05ea;
     */
        /* JADX WARNING: Missing block: B:323:0x05ea, code skipped:
            r6 = new byte[25];
            r8 = java.nio.ByteBuffer.wrap(r6);
            r8.put((byte) 0);
            r8.putShort((short) ((int) ((r1.w * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.x * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.y * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.z * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.A * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.B * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.C * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.D * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) (r1.E + 0.5f)));
            r8.putShort((short) ((int) (r1.F + 0.5f)));
            r8.putShort((short) r1.u);
            r8.putShort((short) r1.v);
     */
        /* JADX WARNING: Missing block: B:324:0x065f, code skipped:
            r6 = null;
     */
        /* JADX WARNING: Missing block: B:325:0x0660, code skipped:
            r26 = new defpackage.bzr(r1.r, r1.t, r1.s, r6);
     */
        /* JADX WARNING: Missing block: B:326:0x066e, code skipped:
            r26 = null;
     */
        /* JADX WARNING: Missing block: B:327:0x0670, code skipped:
            r3 = defpackage.blg.a(java.lang.Integer.toString(r10), r14, null, -1, r17, r1.j, r1.k, -1.0f, r3, -1, r23, r1.o, r1.p, r26, r1.i);
     */
        /* JADX WARNING: Missing block: B:329:0x069c, code skipped:
            if ("application/x-subrip".equals(r14) == false) goto L_0x06ac;
     */
        /* JADX WARNING: Missing block: B:330:0x069e, code skipped:
            r3 = defpackage.blg.a(java.lang.Integer.toString(r10), r14, r11, r1.O, r1.i);
     */
        /* JADX WARNING: Missing block: B:331:0x06aa, code skipped:
            r4 = 3;
     */
        /* JADX WARNING: Missing block: B:333:0x06b2, code skipped:
            if ("text/x-ssa".equals(r14) == false) goto L_0x06de;
     */
        /* JADX WARNING: Missing block: B:334:0x06b4, code skipped:
            r3 = new java.util.ArrayList(2);
            r3.add(defpackage.boe.a);
            r3.add(r1.h);
            r3 = defpackage.blg.a(java.lang.Integer.toString(r10), r14, r11, r1.O, -1, r1.i, Long.MAX_VALUE, (java.util.List) r3);
     */
        /* JADX WARNING: Missing block: B:336:0x06e4, code skipped:
            if ("application/vobsub".equals(r14) != false) goto L_0x06ff;
     */
        /* JADX WARNING: Missing block: B:338:0x06ec, code skipped:
            if ("application/pgs".equals(r14) != false) goto L_0x06ff;
     */
        /* JADX WARNING: Missing block: B:340:0x06f4, code skipped:
            if ("application/dvbsubs".equals(r14) == false) goto L_0x06f7;
     */
        /* JADX WARNING: Missing block: B:342:0x06fe, code skipped:
            throw new defpackage.bln("Unexpected MIME type.");
     */
        /* JADX WARNING: Missing block: B:343:0x06ff, code skipped:
            r3 = defpackage.blg.a(java.lang.Integer.toString(r10), r14, r11, r3, r1.O, r1.i);
     */
        /* JADX WARNING: Missing block: B:344:0x0713, code skipped:
            r1.P = r9.a(r1.b, r4);
            r1.P.a(r3);
            r2.d.put(r2.m.b, r2.m);
     */
        public final void c(int r29) {
            /*
            r28 = this;
            r0 = r28;
            r1 = r29;
            r2 = defpackage.boe.this;
            r3 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
            r4 = 2;
            r5 = 0;
            r6 = 1;
            if (r1 == r3) goto L_0x072e;
        L_0x000d:
            r3 = 174; // 0xae float:2.44E-43 double:8.6E-322;
            r7 = 0;
            r8 = -1;
            if (r1 == r3) goto L_0x0160;
        L_0x0013:
            r3 = 19899; // 0x4dbb float:2.7884E-41 double:9.8314E-320;
            r4 = 475249515; // 0x1c53bb6b float:7.0056276E-22 double:2.348044586E-315;
            if (r1 == r3) goto L_0x0143;
        L_0x001a:
            r3 = 25152; // 0x6240 float:3.5245E-41 double:1.24267E-319;
            if (r1 == r3) goto L_0x0112;
        L_0x001e:
            r3 = 28032; // 0x6d80 float:3.9281E-41 double:1.38496E-319;
            if (r1 == r3) goto L_0x00fc;
        L_0x0022:
            r3 = 357149030; // 0x1549a966 float:4.072526E-26 double:1.76455066E-315;
            r8 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
            if (r1 == r3) goto L_0x00e2;
        L_0x002c:
            r3 = 374648427; // 0x1654ae6b float:1.718026E-25 double:1.85100917E-315;
            if (r1 == r3) goto L_0x00cb;
        L_0x0031:
            if (r1 == r4) goto L_0x0035;
        L_0x0033:
            goto L_0x074c;
        L_0x0035:
            r1 = r2.n;
            if (r1 != 0) goto L_0x074c;
        L_0x0039:
            r1 = r2.G;
            r3 = r2.i;
            r10 = -1;
            r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1));
            if (r12 == 0) goto L_0x00ba;
        L_0x0043:
            r3 = r2.l;
            r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
            if (r10 == 0) goto L_0x00ba;
        L_0x0049:
            r3 = r2.t;
            if (r3 == 0) goto L_0x00ba;
        L_0x004d:
            r3 = r2.t;
            r3 = r3.a;
            if (r3 == 0) goto L_0x00ba;
        L_0x0053:
            r3 = r2.u;
            if (r3 == 0) goto L_0x00ba;
        L_0x0057:
            r3 = r2.u;
            r3 = r3.a;
            r4 = r2.t;
            r4 = r4.a;
            if (r3 == r4) goto L_0x0062;
        L_0x0061:
            goto L_0x00ba;
        L_0x0062:
            r3 = r2.t;
            r3 = r3.a;
            r4 = new int[r3];
            r8 = new long[r3];
            r9 = new long[r3];
            r10 = new long[r3];
            r11 = 0;
        L_0x006f:
            if (r11 >= r3) goto L_0x0087;
        L_0x0071:
            r12 = r2.t;
            r12 = r12.a(r11);
            r10[r11] = r12;
            r12 = r2.i;
            r14 = r2.u;
            r14 = r14.a(r11);
            r12 = r12 + r14;
            r8[r11] = r12;
            r11 = r11 + 1;
            goto L_0x006f;
        L_0x0087:
            r11 = r3 + -1;
            if (r5 >= r11) goto L_0x009e;
        L_0x008b:
            r11 = r5 + 1;
            r12 = r8[r11];
            r14 = r8[r5];
            r12 = r12 - r14;
            r13 = (int) r12;
            r4[r5] = r13;
            r12 = r10[r11];
            r14 = r10[r5];
            r12 = r12 - r14;
            r9[r5] = r12;
            r5 = r11;
            goto L_0x0087;
        L_0x009e:
            r12 = r2.i;
            r14 = r2.h;
            r12 = r12 + r14;
            r14 = r8[r11];
            r12 = r12 - r14;
            r3 = (int) r12;
            r4[r11] = r3;
            r12 = r2.l;
            r14 = r10[r11];
            r12 = r12 - r14;
            r9[r11] = r12;
            r2.t = r7;
            r2.u = r7;
            r3 = new bng;
            r3.<init>(r4, r8, r9, r10);
            goto L_0x00c5;
        L_0x00ba:
            r2.t = r7;
            r2.u = r7;
            r3 = new bns$b;
            r4 = r2.l;
            r3.<init>(r4);
        L_0x00c5:
            r1.a(r3);
            r2.n = r6;
            return;
        L_0x00cb:
            r1 = r2.d;
            r1 = r1.size();
            if (r1 == 0) goto L_0x00da;
        L_0x00d3:
            r1 = r2.G;
            r1.a();
            goto L_0x074c;
        L_0x00da:
            r1 = new bln;
            r2 = "No valid tracks were found";
            r1.<init>(r2);
            throw r1;
        L_0x00e2:
            r3 = r2.j;
            r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
            if (r1 != 0) goto L_0x00ed;
        L_0x00e8:
            r3 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
            r2.j = r3;
        L_0x00ed:
            r3 = r2.k;
            r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
            if (r1 == 0) goto L_0x074c;
        L_0x00f3:
            r3 = r2.k;
            r3 = r2.a(r3);
            r2.l = r3;
            return;
        L_0x00fc:
            r1 = r2.m;
            r1 = r1.e;
            if (r1 == 0) goto L_0x074c;
        L_0x0102:
            r1 = r2.m;
            r1 = r1.f;
            if (r1 != 0) goto L_0x010a;
        L_0x0108:
            goto L_0x074c;
        L_0x010a:
            r1 = new bln;
            r2 = "Combining encryption and compression is not supported";
            r1.<init>(r2);
            throw r1;
        L_0x0112:
            r1 = r2.m;
            r1 = r1.e;
            if (r1 == 0) goto L_0x074c;
        L_0x0118:
            r1 = r2.m;
            r1 = r1.g;
            if (r1 == 0) goto L_0x013b;
        L_0x011e:
            r1 = r2.m;
            r3 = new bnb;
            r4 = new defpackage.bnb.a[r6];
            r6 = new bnb$a;
            r7 = defpackage.bkw.b;
            r2 = r2.m;
            r2 = r2.g;
            r2 = r2.b;
            r8 = "video/webm";
            r6.<init>(r7, r8, r2);
            r4[r5] = r6;
            r3.<init>(r4);
            r1.i = r3;
            return;
        L_0x013b:
            r1 = new bln;
            r2 = "Encrypted Track found but ContentEncKeyID was not found";
            r1.<init>(r2);
            throw r1;
        L_0x0143:
            r1 = r2.o;
            if (r1 == r8) goto L_0x0158;
        L_0x0147:
            r5 = r2.p;
            r7 = -1;
            r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r1 == 0) goto L_0x0158;
        L_0x014f:
            r1 = r2.o;
            if (r1 != r4) goto L_0x074c;
        L_0x0153:
            r3 = r2.p;
            r2.r = r3;
            return;
        L_0x0158:
            r1 = new bln;
            r2 = "Mandatory element SeekID or SeekPosition not found";
            r1.<init>(r2);
            throw r1;
        L_0x0160:
            r1 = r2.m;
            r1 = r1.a;
            r3 = "V_VP8";
            r9 = r3.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x016c:
            r9 = "V_VP9";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x0174:
            r9 = "V_MPEG2";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x017c:
            r9 = "V_MPEG4/ISO/SP";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x0184:
            r9 = "V_MPEG4/ISO/ASP";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x018c:
            r9 = "V_MPEG4/ISO/AP";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x0194:
            r9 = "V_MPEG4/ISO/AVC";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x019c:
            r9 = "V_MPEGH/ISO/HEVC";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x01a4:
            r9 = "V_MS/VFW/FOURCC";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x01ac:
            r9 = "V_THEORA";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x01b4:
            r9 = "A_OPUS";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x01bc:
            r9 = "A_VORBIS";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x01c4:
            r9 = "A_AAC";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x01cc:
            r9 = "A_MPEG/L2";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x01d4:
            r9 = "A_MPEG/L3";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x01dc:
            r9 = "A_AC3";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x01e4:
            r9 = "A_EAC3";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x01ec:
            r9 = "A_TRUEHD";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x01f4:
            r9 = "A_DTS";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x01fc:
            r9 = "A_DTS/EXPRESS";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x0204:
            r9 = "A_DTS/LOSSLESS";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x020c:
            r9 = "A_FLAC";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x0214:
            r9 = "A_MS/ACM";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x021c:
            r9 = "A_PCM/INT/LIT";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x0224:
            r9 = "S_TEXT/UTF8";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x022c:
            r9 = "S_TEXT/ASS";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x0234:
            r9 = "S_VOBSUB";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x023c:
            r9 = "S_HDMV/PGS";
            r9 = r9.equals(r1);
            if (r9 != 0) goto L_0x024f;
        L_0x0244:
            r9 = "S_DVBSUB";
            r1 = r9.equals(r1);
            if (r1 == 0) goto L_0x024d;
        L_0x024c:
            goto L_0x024f;
        L_0x024d:
            r1 = 0;
            goto L_0x0250;
        L_0x024f:
            r1 = 1;
        L_0x0250:
            if (r1 == 0) goto L_0x072b;
        L_0x0252:
            r1 = r2.m;
            r9 = r2.G;
            r10 = r2.m;
            r10 = r10.b;
            r11 = r1.a;
            r12 = r11.hashCode();
            r13 = 8;
            r14 = 3;
            switch(r12) {
                case -2095576542: goto L_0x03a4;
                case -2095575984: goto L_0x039a;
                case -1985379776: goto L_0x038f;
                case -1784763192: goto L_0x0384;
                case -1730367663: goto L_0x0379;
                case -1482641358: goto L_0x036e;
                case -1482641357: goto L_0x0363;
                case -1373388978: goto L_0x0358;
                case -933872740: goto L_0x034d;
                case -538363189: goto L_0x0343;
                case -538363109: goto L_0x0339;
                case -425012669: goto L_0x032e;
                case -356037306: goto L_0x0322;
                case 62923557: goto L_0x0316;
                case 62923603: goto L_0x030a;
                case 62927045: goto L_0x02fe;
                case 82338133: goto L_0x02f5;
                case 82338134: goto L_0x02ea;
                case 99146302: goto L_0x02de;
                case 444813526: goto L_0x02d2;
                case 542569478: goto L_0x02c6;
                case 725957860: goto L_0x02ba;
                case 738597099: goto L_0x02ae;
                case 855502857: goto L_0x02a3;
                case 1422270023: goto L_0x0297;
                case 1809237540: goto L_0x028c;
                case 1950749482: goto L_0x0280;
                case 1950789798: goto L_0x0274;
                case 1951062397: goto L_0x0268;
                default: goto L_0x0266;
            };
        L_0x0266:
            goto L_0x03ae;
        L_0x0268:
            r3 = "A_OPUS";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x0270:
            r3 = 11;
            goto L_0x03af;
        L_0x0274:
            r3 = "A_FLAC";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x027c:
            r3 = 21;
            goto L_0x03af;
        L_0x0280:
            r3 = "A_EAC3";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x0288:
            r3 = 16;
            goto L_0x03af;
        L_0x028c:
            r3 = "V_MPEG2";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x0294:
            r3 = 2;
            goto L_0x03af;
        L_0x0297:
            r3 = "S_TEXT/UTF8";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x029f:
            r3 = 24;
            goto L_0x03af;
        L_0x02a3:
            r3 = "V_MPEGH/ISO/HEVC";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x02ab:
            r3 = 7;
            goto L_0x03af;
        L_0x02ae:
            r3 = "S_TEXT/ASS";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x02b6:
            r3 = 25;
            goto L_0x03af;
        L_0x02ba:
            r3 = "A_PCM/INT/LIT";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x02c2:
            r3 = 23;
            goto L_0x03af;
        L_0x02c6:
            r3 = "A_DTS/EXPRESS";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x02ce:
            r3 = 19;
            goto L_0x03af;
        L_0x02d2:
            r3 = "V_THEORA";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x02da:
            r3 = 9;
            goto L_0x03af;
        L_0x02de:
            r3 = "S_HDMV/PGS";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x02e6:
            r3 = 27;
            goto L_0x03af;
        L_0x02ea:
            r3 = "V_VP9";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x02f2:
            r3 = 1;
            goto L_0x03af;
        L_0x02f5:
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x02fb:
            r3 = 0;
            goto L_0x03af;
        L_0x02fe:
            r3 = "A_DTS";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x0306:
            r3 = 18;
            goto L_0x03af;
        L_0x030a:
            r3 = "A_AC3";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x0312:
            r3 = 15;
            goto L_0x03af;
        L_0x0316:
            r3 = "A_AAC";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x031e:
            r3 = 12;
            goto L_0x03af;
        L_0x0322:
            r3 = "A_DTS/LOSSLESS";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x032a:
            r3 = 20;
            goto L_0x03af;
        L_0x032e:
            r3 = "S_VOBSUB";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x0336:
            r3 = 26;
            goto L_0x03af;
        L_0x0339:
            r3 = "V_MPEG4/ISO/AVC";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x0341:
            r3 = 6;
            goto L_0x03af;
        L_0x0343:
            r3 = "V_MPEG4/ISO/ASP";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x034b:
            r3 = 4;
            goto L_0x03af;
        L_0x034d:
            r3 = "S_DVBSUB";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x0355:
            r3 = 28;
            goto L_0x03af;
        L_0x0358:
            r3 = "V_MS/VFW/FOURCC";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x0360:
            r3 = 8;
            goto L_0x03af;
        L_0x0363:
            r3 = "A_MPEG/L3";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x036b:
            r3 = 14;
            goto L_0x03af;
        L_0x036e:
            r3 = "A_MPEG/L2";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x0376:
            r3 = 13;
            goto L_0x03af;
        L_0x0379:
            r3 = "A_VORBIS";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x0381:
            r3 = 10;
            goto L_0x03af;
        L_0x0384:
            r3 = "A_TRUEHD";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x038c:
            r3 = 17;
            goto L_0x03af;
        L_0x038f:
            r3 = "A_MS/ACM";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x0397:
            r3 = 22;
            goto L_0x03af;
        L_0x039a:
            r3 = "V_MPEG4/ISO/SP";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x03a2:
            r3 = 3;
            goto L_0x03af;
        L_0x03a4:
            r3 = "V_MPEG4/ISO/AP";
            r3 = r11.equals(r3);
            if (r3 == 0) goto L_0x03ae;
        L_0x03ac:
            r3 = 5;
            goto L_0x03af;
        L_0x03ae:
            r3 = -1;
        L_0x03af:
            r11 = "MatroskaExtractor";
            r12 = "audio/x-unknown";
            switch(r3) {
                case 0: goto L_0x0532;
                case 1: goto L_0x052f;
                case 2: goto L_0x052c;
                case 3: goto L_0x051d;
                case 4: goto L_0x051d;
                case 5: goto L_0x051d;
                case 6: goto L_0x0508;
                case 7: goto L_0x04f4;
                case 8: goto L_0x04df;
                case 9: goto L_0x04dc;
                case 10: goto L_0x04cd;
                case 11: goto L_0x0488;
                case 12: goto L_0x047e;
                case 13: goto L_0x0474;
                case 14: goto L_0x046f;
                case 15: goto L_0x046b;
                case 16: goto L_0x0467;
                case 17: goto L_0x045c;
                case 18: goto L_0x0458;
                case 19: goto L_0x0458;
                case 20: goto L_0x0454;
                case 21: goto L_0x044a;
                case 22: goto L_0x0422;
                case 23: goto L_0x03f7;
                case 24: goto L_0x03f3;
                case 25: goto L_0x03ef;
                case 26: goto L_0x03e5;
                case 27: goto L_0x03e1;
                case 28: goto L_0x03be;
                default: goto L_0x03b6;
            };
        L_0x03b6:
            r1 = new bln;
            r2 = "Unrecognized codec identifier.";
            r1.<init>(r2);
            throw r1;
        L_0x03be:
            r3 = 4;
            r3 = new byte[r3];
            r11 = r1.h;
            r11 = r11[r5];
            r3[r5] = r11;
            r11 = r1.h;
            r11 = r11[r6];
            r3[r6] = r11;
            r11 = r1.h;
            r11 = r11[r4];
            r3[r4] = r11;
            r11 = r1.h;
            r11 = r11[r14];
            r3[r14] = r11;
            r3 = java.util.Collections.singletonList(r3);
            r12 = "application/dvbsubs";
            goto L_0x0535;
        L_0x03e1:
            r12 = "application/pgs";
            goto L_0x0534;
        L_0x03e5:
            r3 = r1.h;
            r3 = java.util.Collections.singletonList(r3);
            r12 = "application/vobsub";
            goto L_0x0535;
        L_0x03ef:
            r12 = "text/x-ssa";
            goto L_0x0534;
        L_0x03f3:
            r12 = "application/x-subrip";
            goto L_0x0534;
        L_0x03f7:
            r3 = r1.H;
            r3 = defpackage.bzo.b(r3);
            if (r3 != 0) goto L_0x0418;
        L_0x03ff:
            r3 = new java.lang.StringBuilder;
            r13 = "Unsupported PCM bit depth: ";
            r3.<init>(r13);
        L_0x0406:
            r13 = r1.H;
            r3.append(r13);
            r13 = ". Setting mimeType to ";
            r3.append(r13);
            r3.append(r12);
            r3 = r3.toString();
            goto L_0x0445;
        L_0x0418:
            r12 = "audio/raw";
            r20 = r3;
            r3 = r7;
            r14 = r12;
            r17 = -1;
            goto L_0x053a;
        L_0x0422:
            r3 = new bzc;
            r13 = r1.h;
            r3.<init>(r13);
            r3 = defpackage.boe.b.b(r3);
            if (r3 == 0) goto L_0x043f;
        L_0x042f:
            r3 = r1.H;
            r3 = defpackage.bzo.b(r3);
            if (r3 != 0) goto L_0x0418;
        L_0x0437:
            r3 = new java.lang.StringBuilder;
            r13 = "Unsupported PCM bit depth: ";
            r3.<init>(r13);
            goto L_0x0406;
        L_0x043f:
            r3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to ";
            r3 = r3.concat(r12);
        L_0x0445:
            android.util.Log.w(r11, r3);
            goto L_0x0534;
        L_0x044a:
            r3 = r1.h;
            r3 = java.util.Collections.singletonList(r3);
            r12 = "audio/flac";
            goto L_0x0535;
        L_0x0454:
            r12 = "audio/vnd.dts.hd";
            goto L_0x0534;
        L_0x0458:
            r12 = "audio/vnd.dts";
            goto L_0x0534;
        L_0x045c:
            r3 = new boe$c;
            r3.<init>();
            r1.L = r3;
            r12 = "audio/true-hd";
            goto L_0x0534;
        L_0x0467:
            r12 = "audio/eac3";
            goto L_0x0534;
        L_0x046b:
            r12 = "audio/ac3";
            goto L_0x0534;
        L_0x046f:
            r3 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
            r12 = "audio/mpeg";
            goto L_0x0478;
        L_0x0474:
            r3 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
            r12 = "audio/mpeg-L2";
        L_0x0478:
            r3 = r7;
            r14 = r12;
            r17 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
            goto L_0x0538;
        L_0x047e:
            r3 = r1.h;
            r3 = java.util.Collections.singletonList(r3);
            r12 = "audio/mp4a-latm";
            goto L_0x0535;
        L_0x0488:
            r3 = 5760; // 0x1680 float:8.071E-42 double:2.846E-320;
            r11 = new java.util.ArrayList;
            r11.<init>(r14);
            r12 = r1.h;
            r11.add(r12);
            r12 = java.nio.ByteBuffer.allocate(r13);
            r15 = java.nio.ByteOrder.nativeOrder();
            r12 = r12.order(r15);
            r14 = r1.J;
            r12 = r12.putLong(r14);
            r12 = r12.array();
            r11.add(r12);
            r12 = java.nio.ByteBuffer.allocate(r13);
            r13 = java.nio.ByteOrder.nativeOrder();
            r12 = r12.order(r13);
            r13 = r1.K;
            r12 = r12.putLong(r13);
            r12 = r12.array();
            r11.add(r12);
            r12 = "audio/opus";
            r3 = r11;
            r14 = r12;
            r17 = 5760; // 0x1680 float:8.071E-42 double:2.846E-320;
            goto L_0x0538;
        L_0x04cd:
            r3 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
            r11 = r1.h;
            r11 = defpackage.boe.b.a(r11);
            r12 = "audio/vorbis";
            r3 = r11;
            r14 = r12;
            r17 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
            goto L_0x0538;
        L_0x04dc:
            r12 = "video/x-unknown";
            goto L_0x0534;
        L_0x04df:
            r3 = new bzc;
            r11 = r1.h;
            r3.<init>(r11);
            r3 = defpackage.boe.b.a(r3);
            r11 = r3.first;
            r12 = r11;
            r12 = (java.lang.String) r12;
            r3 = r3.second;
            r3 = (java.util.List) r3;
            goto L_0x0535;
        L_0x04f4:
            r3 = new bzc;
            r11 = r1.h;
            r3.<init>(r11);
            r3 = defpackage.bzt.a(r3);
            r11 = r3.a;
            r3 = r3.b;
            r1.Q = r3;
            r12 = "video/hevc";
            goto L_0x051b;
        L_0x0508:
            r3 = new bzc;
            r11 = r1.h;
            r3.<init>(r11);
            r3 = defpackage.bzq.a(r3);
            r11 = r3.a;
            r3 = r3.b;
            r1.Q = r3;
            r12 = "video/avc";
        L_0x051b:
            r3 = r11;
            goto L_0x0535;
        L_0x051d:
            r3 = r1.h;
            if (r3 != 0) goto L_0x0523;
        L_0x0521:
            r3 = r7;
            goto L_0x0529;
        L_0x0523:
            r3 = r1.h;
            r3 = java.util.Collections.singletonList(r3);
        L_0x0529:
            r12 = "video/mp4v-es";
            goto L_0x0535;
        L_0x052c:
            r12 = "video/mpeg2";
            goto L_0x0534;
        L_0x052f:
            r12 = "video/x-vnd.on2.vp9";
            goto L_0x0534;
        L_0x0532:
            r12 = "video/x-vnd.on2.vp8";
        L_0x0534:
            r3 = r7;
        L_0x0535:
            r14 = r12;
            r17 = -1;
        L_0x0538:
            r20 = -1;
        L_0x053a:
            r11 = r1.N;
            r11 = r11 | r5;
            r12 = r1.M;
            if (r12 == 0) goto L_0x0543;
        L_0x0541:
            r12 = 2;
            goto L_0x0544;
        L_0x0543:
            r12 = 0;
        L_0x0544:
            r11 = r11 | r12;
            r12 = defpackage.byz.a(r14);
            if (r12 == 0) goto L_0x056d;
        L_0x054b:
            r13 = java.lang.Integer.toString(r10);
            r15 = 0;
            r16 = -1;
            r4 = r1.G;
            r5 = r1.I;
            r8 = r1.i;
            r10 = r1.O;
            r18 = r4;
            r19 = r5;
            r21 = r3;
            r22 = r8;
            r23 = r11;
            r24 = r10;
            r3 = defpackage.blg.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
            r4 = 1;
            goto L_0x0713;
        L_0x056d:
            r6 = defpackage.byz.b(r14);
            if (r6 == 0) goto L_0x0696;
        L_0x0573:
            r6 = r1.n;
            if (r6 != 0) goto L_0x058d;
        L_0x0577:
            r6 = r1.l;
            if (r6 != r8) goto L_0x057e;
        L_0x057b:
            r6 = r1.j;
            goto L_0x0580;
        L_0x057e:
            r6 = r1.l;
        L_0x0580:
            r1.l = r6;
            r6 = r1.m;
            if (r6 != r8) goto L_0x0589;
        L_0x0586:
            r6 = r1.k;
            goto L_0x058b;
        L_0x0589:
            r6 = r1.m;
        L_0x058b:
            r1.m = r6;
        L_0x058d:
            r6 = r1.l;
            r11 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            if (r6 == r8) goto L_0x05a7;
        L_0x0593:
            r6 = r1.m;
            if (r6 == r8) goto L_0x05a7;
        L_0x0597:
            r6 = r1.k;
            r8 = r1.l;
            r6 = r6 * r8;
            r6 = (float) r6;
            r8 = r1.j;
            r12 = r1.m;
            r8 = r8 * r12;
            r8 = (float) r8;
            r6 = r6 / r8;
            r23 = r6;
            goto L_0x05a9;
        L_0x05a7:
            r23 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        L_0x05a9:
            r6 = r1.q;
            if (r6 == 0) goto L_0x066e;
        L_0x05ad:
            r6 = r1.w;
            r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
            if (r6 == 0) goto L_0x065f;
        L_0x05b3:
            r6 = r1.x;
            r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
            if (r6 == 0) goto L_0x065f;
        L_0x05b9:
            r6 = r1.y;
            r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
            if (r6 == 0) goto L_0x065f;
        L_0x05bf:
            r6 = r1.z;
            r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
            if (r6 == 0) goto L_0x065f;
        L_0x05c5:
            r6 = r1.A;
            r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
            if (r6 == 0) goto L_0x065f;
        L_0x05cb:
            r6 = r1.B;
            r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
            if (r6 == 0) goto L_0x065f;
        L_0x05d1:
            r6 = r1.C;
            r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
            if (r6 == 0) goto L_0x065f;
        L_0x05d7:
            r6 = r1.D;
            r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
            if (r6 == 0) goto L_0x065f;
        L_0x05dd:
            r6 = r1.E;
            r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
            if (r6 == 0) goto L_0x065f;
        L_0x05e3:
            r6 = r1.F;
            r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
            if (r6 != 0) goto L_0x05ea;
        L_0x05e9:
            goto L_0x065f;
        L_0x05ea:
            r6 = 25;
            r6 = new byte[r6];
            r8 = java.nio.ByteBuffer.wrap(r6);
            r8.put(r5);
            r5 = r1.w;
            r11 = 1195593728; // 0x47435000 float:50000.0 double:5.907017874E-315;
            r5 = r5 * r11;
            r12 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
            r5 = r5 + r12;
            r5 = (int) r5;
            r5 = (short) r5;
            r8.putShort(r5);
            r5 = r1.x;
            r5 = r5 * r11;
            r5 = r5 + r12;
            r5 = (int) r5;
            r5 = (short) r5;
            r8.putShort(r5);
            r5 = r1.y;
            r5 = r5 * r11;
            r5 = r5 + r12;
            r5 = (int) r5;
            r5 = (short) r5;
            r8.putShort(r5);
            r5 = r1.z;
            r5 = r5 * r11;
            r5 = r5 + r12;
            r5 = (int) r5;
            r5 = (short) r5;
            r8.putShort(r5);
            r5 = r1.A;
            r5 = r5 * r11;
            r5 = r5 + r12;
            r5 = (int) r5;
            r5 = (short) r5;
            r8.putShort(r5);
            r5 = r1.B;
            r5 = r5 * r11;
            r5 = r5 + r12;
            r5 = (int) r5;
            r5 = (short) r5;
            r8.putShort(r5);
            r5 = r1.C;
            r5 = r5 * r11;
            r5 = r5 + r12;
            r5 = (int) r5;
            r5 = (short) r5;
            r8.putShort(r5);
            r5 = r1.D;
            r5 = r5 * r11;
            r5 = r5 + r12;
            r5 = (int) r5;
            r5 = (short) r5;
            r8.putShort(r5);
            r5 = r1.E;
            r5 = r5 + r12;
            r5 = (int) r5;
            r5 = (short) r5;
            r8.putShort(r5);
            r5 = r1.F;
            r5 = r5 + r12;
            r5 = (int) r5;
            r5 = (short) r5;
            r8.putShort(r5);
            r5 = r1.u;
            r5 = (short) r5;
            r8.putShort(r5);
            r5 = r1.v;
            r5 = (short) r5;
            r8.putShort(r5);
            goto L_0x0660;
        L_0x065f:
            r6 = r7;
        L_0x0660:
            r5 = new bzr;
            r8 = r1.r;
            r11 = r1.t;
            r12 = r1.s;
            r5.<init>(r8, r11, r12, r6);
            r26 = r5;
            goto L_0x0670;
        L_0x066e:
            r26 = r7;
        L_0x0670:
            r13 = java.lang.Integer.toString(r10);
            r15 = 0;
            r16 = -1;
            r5 = r1.j;
            r6 = r1.k;
            r20 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r22 = -1;
            r8 = r1.o;
            r10 = r1.p;
            r11 = r1.i;
            r18 = r5;
            r19 = r6;
            r21 = r3;
            r24 = r8;
            r25 = r10;
            r27 = r11;
            r3 = defpackage.blg.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27);
            goto L_0x0713;
        L_0x0696:
            r5 = "application/x-subrip";
            r5 = r5.equals(r14);
            if (r5 == 0) goto L_0x06ac;
        L_0x069e:
            r3 = java.lang.Integer.toString(r10);
            r4 = r1.O;
            r5 = r1.i;
            r3 = defpackage.blg.a(r3, r14, r11, r4, r5);
        L_0x06aa:
            r4 = 3;
            goto L_0x0713;
        L_0x06ac:
            r5 = "text/x-ssa";
            r5 = r5.equals(r14);
            if (r5 == 0) goto L_0x06de;
        L_0x06b4:
            r3 = new java.util.ArrayList;
            r3.<init>(r4);
            r4 = defpackage.boe.a;
            r3.add(r4);
            r4 = r1.h;
            r3.add(r4);
            r13 = java.lang.Integer.toString(r10);
            r4 = r1.O;
            r17 = -1;
            r5 = r1.i;
            r19 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r15 = r11;
            r16 = r4;
            r18 = r5;
            r21 = r3;
            r3 = defpackage.blg.a(r13, r14, r15, r16, r17, r18, r19, r21);
            goto L_0x06aa;
        L_0x06de:
            r4 = "application/vobsub";
            r4 = r4.equals(r14);
            if (r4 != 0) goto L_0x06ff;
        L_0x06e6:
            r4 = "application/pgs";
            r4 = r4.equals(r14);
            if (r4 != 0) goto L_0x06ff;
        L_0x06ee:
            r4 = "application/dvbsubs";
            r4 = r4.equals(r14);
            if (r4 == 0) goto L_0x06f7;
        L_0x06f6:
            goto L_0x06ff;
        L_0x06f7:
            r1 = new bln;
            r2 = "Unexpected MIME type.";
            r1.<init>(r2);
            throw r1;
        L_0x06ff:
            r13 = java.lang.Integer.toString(r10);
            r4 = r1.O;
            r5 = r1.i;
            r15 = r11;
            r16 = r3;
            r17 = r4;
            r18 = r5;
            r3 = defpackage.blg.a(r13, r14, r15, r16, r17, r18);
            goto L_0x06aa;
        L_0x0713:
            r5 = r1.b;
            r4 = r9.a(r5, r4);
            r1.P = r4;
            r1 = r1.P;
            r1.a(r3);
            r1 = r2.d;
            r3 = r2.m;
            r3 = r3.b;
            r4 = r2.m;
            r1.put(r3, r4);
        L_0x072b:
            r2.m = r7;
            return;
        L_0x072e:
            r1 = r2.w;
            if (r1 != r4) goto L_0x074c;
        L_0x0732:
            r1 = r2.F;
            if (r1 != 0) goto L_0x073b;
        L_0x0736:
            r1 = r2.E;
            r1 = r1 | r6;
            r2.E = r1;
        L_0x073b:
            r1 = r2.d;
            r3 = r2.C;
            r1 = r1.get(r3);
            r1 = (defpackage.boe.b) r1;
            r3 = r2.x;
            r2.a(r1, r3);
            r2.w = r5;
        L_0x074c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.boe$a.c(int):void");
        }
    }

    /* renamed from: boe$1 */
    static class 1 implements bnn {
        1() {
        }

        public final bnk[] a() {
            return new bnk[]{new boe()};
        }
    }

    /* renamed from: boe$b */
    static final class b {
        public float A;
        public float B;
        public float C;
        public float D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public long J;
        public long K;
        public c L;
        public boolean M;
        public boolean N;
        String O;
        public bnu P;
        public int Q;
        public String a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        public byte[] f;
        public a g;
        public byte[] h;
        public bnb i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public byte[] o;
        public int p;
        public boolean q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public float w;
        public float x;
        public float y;
        public float z;

        private b() {
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = null;
            this.p = -1;
            this.q = false;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
            this.v = Callback.DEFAULT_DRAG_ANIMATION_DURATION;
            this.w = -1.0f;
            this.x = -1.0f;
            this.y = -1.0f;
            this.z = -1.0f;
            this.A = -1.0f;
            this.B = -1.0f;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 1;
            this.H = -1;
            this.I = 8000;
            this.J = 0;
            this.K = 0;
            this.N = true;
            this.O = "eng";
        }

        /* synthetic */ b(byte b) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x0077 in {5, 20, 21, 23, 25, 28} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        static android.util.Pair<java.lang.String, java.util.List<byte[]>> a(defpackage.bzc r6) {
            /*
            r0 = 16;
            r6.d(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r0 = r6.i();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r2 = 1482049860; // 0x58564944 float:9.4244065E14 double:7.322299212E-315;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r4 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            if (r5 != 0) goto L_0x0019;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r6 = new android.util.Pair;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r0 = "video/3gpp";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r6.<init>(r0, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            return r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r2 = 826496599; // 0x31435657 float:2.8425313E-9 double:4.08343576E-315;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            if (r5 != 0) goto L_0x0060;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r0 = r6.b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r0 = r0 + 20;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r6 = r6.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r1 = r6.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r1 = r1 + -4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            if (r0 >= r1) goto L_0x0058;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r1 = r6[r0];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            if (r1 != 0) goto L_0x0055;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r1 = r0 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r1 = r6[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            if (r1 != 0) goto L_0x0055;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r1 = r0 + 2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r1 = r6[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r2 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            if (r1 != r2) goto L_0x0055;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r1 = r0 + 3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r1 = r6[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r2 = 15;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            if (r1 != r2) goto L_0x0055;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r1 = r6.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r6 = java.util.Arrays.copyOfRange(r6, r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r0 = new android.util.Pair;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r1 = "video/wvc1";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r6 = java.util.Collections.singletonList(r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r0.<init>(r1, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            return r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r0 = r0 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            goto L_0x0026;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r6 = new bln;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r0 = "Failed to find FourCC VC1 initialization data";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r6.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            throw r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006f }
            r6 = "MatroskaExtractor";
            r0 = "Unknown FourCC. Setting mimeType to video/x-unknown";
            android.util.Log.w(r6, r0);
            r6 = new android.util.Pair;
            r0 = "video/x-unknown";
            r6.<init>(r0, r4);
            return r6;
            r6 = new bln;
            r0 = "Error parsing FourCC private data";
            r6.<init>(r0);
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.boe$b.a(bzc):android.util.Pair");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x0071 in {7, 11, 19, 21, 23, 25, 27, 30} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        static java.util.List<byte[]> a(byte[] r9) {
            /*
            r0 = "Error parsing vorbis codec private";
            r1 = 0;
            r2 = r9[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r3 = 2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            if (r2 != r3) goto L_0x0065;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r2 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r4 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r5 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r6 = r9[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r7 = -1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            if (r6 != r7) goto L_0x0015;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r5 = r5 + 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r4 = r4 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            goto L_0x000b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r6 = r4 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r4 = r9[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r5 = r5 + r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r4 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r8 = r9[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            if (r8 != r7) goto L_0x0024;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r4 = r4 + 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r6 = r6 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            goto L_0x001b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r7 = r6 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r6 = r9[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r4 = r4 + r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r6 = r9[r7];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            if (r6 != r2) goto L_0x005f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r2 = new byte[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            java.lang.System.arraycopy(r9, r7, r2, r1, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r7 = r7 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r5 = r9[r7];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r6 = 3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            if (r5 != r6) goto L_0x0059;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r7 = r7 + r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r4 = r9[r7];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r5 = 5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            if (r4 != r5) goto L_0x0053;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r4 = r9.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r4 = r4 - r7;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r4 = new byte[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r5 = r9.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r5 = r5 - r7;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            java.lang.System.arraycopy(r9, r7, r4, r1, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r9 = new java.util.ArrayList;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r9.<init>(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r9.add(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r9.add(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            return r9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r9 = new bln;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r9.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            throw r9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r9 = new bln;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r9.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            throw r9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r9 = new bln;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r9.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            throw r9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r9 = new bln;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r9.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            throw r9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x006b }
            r9 = new bln;
            r9.<init>(r0);
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.boe$b.a(byte[]):java.util.List");
        }

        static boolean b(bzc bzc) {
            try {
                int f = bzc.f();
                if (f == 1) {
                    return true;
                }
                if (f == 65534) {
                    bzc.c(24);
                    return bzc.l() == boe.b.getMostSignificantBits() && bzc.l() == boe.b.getLeastSignificantBits();
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new bln("Error parsing MS/ACM codec private");
            }
        }
    }

    /* renamed from: boe$c */
    static final class c {
        final byte[] a = new byte[10];
        boolean b;
        int c;
        int d;
        long e;
        int f;
    }

    static {
        1 1 = new 1();
    }

    public boe() {
        this(0);
    }

    public boe(int i) {
        this(new bob(), i);
    }

    private boe(boc boc, int i) {
        this.i = -1;
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.r = -1;
        this.U = -1;
        this.s = -9223372036854775807L;
        this.L = boc;
        this.L.a(new a(this, (byte) 0));
        boolean z = true;
        if ((i & 1) != 0) {
            z = false;
        }
        this.e = z;
        this.c = new bog();
        this.d = new SparseArray();
        this.f = new bzc(4);
        this.O = new bzc(ByteBuffer.allocate(4).putInt(-1).array());
        this.g = new bzc(4);
        this.M = new bzc(bza.a);
        this.N = new bzc(4);
        this.P = new bzc();
        this.Q = new bzc();
        this.R = new bzc(8);
        this.S = new bzc();
    }

    private int a(bnl bnl, bnu bnu, int i) {
        int min;
        int b = this.P.b();
        if (b > 0) {
            min = Math.min(i, b);
            bnu.a(this.P, min);
        } else {
            min = bnu.a(bnl, i, false);
        }
        this.V += min;
        this.ad += min;
        return min;
    }

    private void a() {
        this.V = 0;
        this.ad = 0;
        this.ac = 0;
        this.W = false;
        this.X = false;
        this.Z = false;
        this.ab = 0;
        this.aa = (byte) 0;
        this.Y = false;
        this.P.a();
    }

    private void a(bnl bnl, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.Q.c() < length) {
            this.Q.a = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, this.Q.a, 0, bArr.length);
        }
        bnl.b(this.Q.a, bArr.length, i);
        this.Q.a(length);
    }

    private void a(b bVar, String str, int i, long j, byte[] bArr) {
        boe.a(this.Q.a, this.y, str, i, j, bArr);
        bnu bnu = bVar.P;
        bzc bzc = this.Q;
        bnu.a(bzc, bzc.c);
        this.ad += this.Q.c;
    }

    private static void a(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        Object obj;
        Object obj2;
        int i2;
        if (j == -9223372036854775807L) {
            obj = bArr2;
            obj2 = obj;
        } else {
            long j3 = j - (((long) (((int) (j / 3600000000L)) * 3600)) * 1000000);
            j3 -= ((long) (((int) (j3 / 60000000)) * 60)) * 1000000;
            i2 = (int) ((j3 - (((long) ((int) (j3 / 1000000))) * 1000000)) / j2);
            Object[] objArr = new Object[]{Integer.valueOf(r2), Integer.valueOf(r1), Integer.valueOf(r8), Integer.valueOf(i2)};
            String str2 = str;
            obj2 = bzo.b(String.format(Locale.US, str, objArr));
            obj = bArr2;
        }
        byte[] bArr3 = bArr;
        i2 = i;
        System.arraycopy(obj2, 0, bArr, i, obj.length);
    }

    static int[] a(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length << 1, i)];
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0005 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0039 A:{SYNTHETIC} */
    public final int a(defpackage.bnl r11, defpackage.bnr r12) {
        /*
        r10 = this;
        r0 = 0;
        r10.ae = r0;
        r1 = 1;
        r2 = 1;
    L_0x0005:
        if (r2 == 0) goto L_0x003a;
    L_0x0007:
        r3 = r10.ae;
        if (r3 != 0) goto L_0x003a;
    L_0x000b:
        r2 = r10.L;
        r2 = r2.a(r11);
        if (r2 == 0) goto L_0x0005;
    L_0x0013:
        r3 = r11.c();
        r5 = r10.q;
        if (r5 == 0) goto L_0x0025;
    L_0x001b:
        r10.U = r3;
        r3 = r10.r;
        r12.a = r3;
        r10.q = r0;
    L_0x0023:
        r3 = 1;
        goto L_0x0037;
    L_0x0025:
        r3 = r10.n;
        if (r3 == 0) goto L_0x0036;
    L_0x0029:
        r3 = r10.U;
        r5 = -1;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x0036;
    L_0x0031:
        r12.a = r3;
        r10.U = r5;
        goto L_0x0023;
    L_0x0036:
        r3 = 0;
    L_0x0037:
        if (r3 == 0) goto L_0x0005;
    L_0x0039:
        return r1;
    L_0x003a:
        if (r2 != 0) goto L_0x0070;
    L_0x003c:
        r11 = 0;
    L_0x003d:
        r12 = r10.d;
        r12 = r12.size();
        if (r11 >= r12) goto L_0x006e;
    L_0x0045:
        r12 = r10.d;
        r12 = r12.valueAt(r11);
        r12 = (defpackage.boe.b) r12;
        r1 = r12.L;
        if (r1 == 0) goto L_0x006b;
    L_0x0051:
        r1 = r12.L;
        r2 = r1.b;
        if (r2 == 0) goto L_0x006b;
    L_0x0057:
        r2 = r1.c;
        if (r2 <= 0) goto L_0x006b;
    L_0x005b:
        r3 = r12.P;
        r4 = r1.e;
        r6 = r1.f;
        r7 = r1.d;
        r8 = 0;
        r9 = r12.g;
        r3.a(r4, r6, r7, r8, r9);
        r1.c = r0;
    L_0x006b:
        r11 = r11 + 1;
        goto L_0x003d;
    L_0x006e:
        r11 = -1;
        return r11;
    L_0x0070:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boe.a(bnl, bnr):int");
    }

    /* Access modifiers changed, original: final */
    public final long a(long j) {
        long j2 = this.j;
        if (j2 != -9223372036854775807L) {
            return bzo.b(j, j2, 1000);
        }
        throw new bln("Can't scale timecode prior to timecodeScale being set.");
    }

    public final void a(long j, long j2) {
        this.s = -9223372036854775807L;
        this.w = 0;
        this.L.a();
        this.c.a();
        a();
        for (int i = 0; i < this.d.size(); i++) {
            b bVar = (b) this.d.valueAt(i);
            if (bVar.L != null) {
                bVar.L.b = false;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bnl bnl, int i) {
        if (this.f.c < i) {
            if (this.f.c() < i) {
                bzc bzc = this.f;
                bzc.a(Arrays.copyOf(bzc.a, Math.max(this.f.a.length << 1, i)), this.f.c);
            }
            bnl.b(this.f.a, this.f.c, i - this.f.c);
            this.f.b(i);
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0268  */
    public final void a(defpackage.bnl r12, defpackage.boe.b r13, int r14) {
        /*
        r11 = this;
        r0 = r13.a;
        r1 = "S_TEXT/UTF8";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0010;
    L_0x000a:
        r13 = H;
    L_0x000c:
        r11.a(r12, r13, r14);
        return;
    L_0x0010:
        r0 = r13.a;
        r1 = "S_TEXT/ASS";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x001d;
    L_0x001a:
        r13 = J;
        goto L_0x000c;
    L_0x001d:
        r0 = r13.P;
        r1 = r11.W;
        r2 = 8;
        r3 = 2;
        r4 = 1;
        r5 = 0;
        if (r1 != 0) goto L_0x0171;
    L_0x0028:
        r1 = r13.e;
        if (r1 == 0) goto L_0x0161;
    L_0x002c:
        r1 = r11.E;
        r6 = -1073741825; // 0xffffffffbfffffff float:-1.9999999 double:NaN;
        r1 = r1 & r6;
        r11.E = r1;
        r1 = r11.X;
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 != 0) goto L_0x0062;
    L_0x003a:
        r1 = r11.f;
        r1 = r1.a;
        r12.b(r1, r5, r4);
        r1 = r11.V;
        r1 = r1 + r4;
        r11.V = r1;
        r1 = r11.f;
        r1 = r1.a;
        r1 = r1[r5];
        r1 = r1 & r6;
        if (r1 == r6) goto L_0x005a;
    L_0x004f:
        r1 = r11.f;
        r1 = r1.a;
        r1 = r1[r5];
        r11.aa = r1;
        r11.X = r4;
        goto L_0x0062;
    L_0x005a:
        r12 = new bln;
        r13 = "Extension bit is set in signal byte";
        r12.<init>(r13);
        throw r12;
    L_0x0062:
        r1 = r11.aa;
        r1 = r1 & r4;
        if (r1 != r4) goto L_0x0069;
    L_0x0067:
        r1 = 1;
        goto L_0x006a;
    L_0x0069:
        r1 = 0;
    L_0x006a:
        if (r1 == 0) goto L_0x016f;
    L_0x006c:
        r1 = r11.aa;
        r1 = r1 & r3;
        if (r1 != r3) goto L_0x0073;
    L_0x0071:
        r1 = 1;
        goto L_0x0074;
    L_0x0073:
        r1 = 0;
    L_0x0074:
        r7 = r11.E;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r7 | r8;
        r11.E = r7;
        r7 = r11.Y;
        if (r7 != 0) goto L_0x00b7;
    L_0x007f:
        r7 = r11.R;
        r7 = r7.a;
        r12.b(r7, r5, r2);
        r7 = r11.V;
        r7 = r7 + r2;
        r11.V = r7;
        r11.Y = r4;
        r7 = r11.f;
        r7 = r7.a;
        if (r1 == 0) goto L_0x0094;
    L_0x0093:
        goto L_0x0095;
    L_0x0094:
        r6 = 0;
    L_0x0095:
        r6 = r6 | r2;
        r6 = (byte) r6;
        r7[r5] = r6;
        r6 = r11.f;
        r6.c(r5);
        r6 = r11.f;
        r0.a(r6, r4);
        r6 = r11.ad;
        r6 = r6 + r4;
        r11.ad = r6;
        r6 = r11.R;
        r6.c(r5);
        r6 = r11.R;
        r0.a(r6, r2);
        r6 = r11.ad;
        r6 = r6 + r2;
        r11.ad = r6;
    L_0x00b7:
        if (r1 == 0) goto L_0x016f;
    L_0x00b9:
        r1 = r11.Z;
        if (r1 != 0) goto L_0x00d8;
    L_0x00bd:
        r1 = r11.f;
        r1 = r1.a;
        r12.b(r1, r5, r4);
        r1 = r11.V;
        r1 = r1 + r4;
        r11.V = r1;
        r1 = r11.f;
        r1.c(r5);
        r1 = r11.f;
        r1 = r1.d();
        r11.ab = r1;
        r11.Z = r4;
    L_0x00d8:
        r1 = r11.ab;
        r1 = r1 << r3;
        r6 = r11.f;
        r6.a(r1);
        r6 = r11.f;
        r6 = r6.a;
        r12.b(r6, r5, r1);
        r6 = r11.V;
        r6 = r6 + r1;
        r11.V = r6;
        r1 = r11.ab;
        r1 = r1 / r3;
        r1 = r1 + r4;
        r1 = (short) r1;
        r6 = r1 * 6;
        r6 = r6 + r3;
        r7 = r11.T;
        if (r7 == 0) goto L_0x00fe;
    L_0x00f8:
        r7 = r7.capacity();
        if (r7 >= r6) goto L_0x0104;
    L_0x00fe:
        r7 = java.nio.ByteBuffer.allocate(r6);
        r11.T = r7;
    L_0x0104:
        r7 = r11.T;
        r7.position(r5);
        r7 = r11.T;
        r7.putShort(r1);
        r1 = 0;
        r7 = 0;
    L_0x0110:
        r8 = r11.ab;
        if (r1 >= r8) goto L_0x0132;
    L_0x0114:
        r8 = r11.f;
        r8 = r8.o();
        r9 = r1 % 2;
        if (r9 != 0) goto L_0x0127;
    L_0x011e:
        r9 = r11.T;
        r7 = r8 - r7;
        r7 = (short) r7;
        r9.putShort(r7);
        goto L_0x012e;
    L_0x0127:
        r9 = r11.T;
        r7 = r8 - r7;
        r9.putInt(r7);
    L_0x012e:
        r1 = r1 + 1;
        r7 = r8;
        goto L_0x0110;
    L_0x0132:
        r1 = r11.V;
        r1 = r14 - r1;
        r1 = r1 - r7;
        r8 = r8 % r3;
        if (r8 != r4) goto L_0x0140;
    L_0x013a:
        r7 = r11.T;
        r7.putInt(r1);
        goto L_0x014b;
    L_0x0140:
        r7 = r11.T;
        r1 = (short) r1;
        r7.putShort(r1);
        r1 = r11.T;
        r1.putInt(r5);
    L_0x014b:
        r1 = r11.S;
        r7 = r11.T;
        r7 = r7.array();
        r1.a(r7, r6);
        r1 = r11.S;
        r0.a(r1, r6);
        r1 = r11.ad;
        r1 = r1 + r6;
        r11.ad = r1;
        goto L_0x016f;
    L_0x0161:
        r1 = r13.f;
        if (r1 == 0) goto L_0x016f;
    L_0x0165:
        r1 = r11.P;
        r6 = r13.f;
        r7 = r13.f;
        r7 = r7.length;
        r1.a(r6, r7);
    L_0x016f:
        r11.W = r4;
    L_0x0171:
        r1 = r11.P;
        r1 = r1.c;
        r14 = r14 + r1;
        r1 = r13.a;
        r6 = "V_MPEG4/ISO/AVC";
        r1 = r6.equals(r1);
        r6 = 4;
        if (r1 != 0) goto L_0x0204;
    L_0x0181:
        r1 = r13.a;
        r7 = "V_MPEGH/ISO/HEVC";
        r1 = r7.equals(r1);
        if (r1 == 0) goto L_0x018c;
    L_0x018b:
        goto L_0x0204;
    L_0x018c:
        r1 = r13.L;
        if (r1 == 0) goto L_0x01fa;
    L_0x0190:
        r1 = r11.P;
        r1 = r1.c;
        if (r1 != 0) goto L_0x0198;
    L_0x0196:
        r1 = 1;
        goto L_0x0199;
    L_0x0198:
        r1 = 0;
    L_0x0199:
        defpackage.byo.b(r1);
        r1 = r13.L;
        r3 = r11.E;
        r7 = r1.b;
        if (r7 != 0) goto L_0x01ed;
    L_0x01a4:
        r7 = r1.a;
        r8 = 10;
        r12.c(r7, r5, r8);
        r12.a();
        r7 = r1.a;
        r8 = r7[r6];
        r9 = -8;
        if (r8 != r9) goto L_0x01e5;
    L_0x01b5:
        r8 = 5;
        r8 = r7[r8];
        r9 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        if (r8 != r9) goto L_0x01e5;
    L_0x01bc:
        r8 = 6;
        r8 = r7[r8];
        r9 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        if (r8 != r9) goto L_0x01e5;
    L_0x01c3:
        r8 = 7;
        r9 = r7[r8];
        r9 = r9 & 254;
        r10 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        if (r9 == r10) goto L_0x01cd;
    L_0x01cc:
        goto L_0x01e5;
    L_0x01cd:
        r9 = r7[r8];
        r9 = r9 & 255;
        r10 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        if (r9 != r10) goto L_0x01d7;
    L_0x01d5:
        r9 = 1;
        goto L_0x01d8;
    L_0x01d7:
        r9 = 0;
    L_0x01d8:
        r10 = 40;
        if (r9 == 0) goto L_0x01de;
    L_0x01dc:
        r2 = 9;
    L_0x01de:
        r2 = r7[r2];
        r2 = r2 >> r6;
        r2 = r2 & r8;
        r2 = r10 << r2;
        goto L_0x01e6;
    L_0x01e5:
        r2 = 0;
    L_0x01e6:
        r7 = -1;
        if (r2 == r7) goto L_0x01fa;
    L_0x01e9:
        r1.b = r4;
        r1.c = r5;
    L_0x01ed:
        r2 = r1.c;
        if (r2 != 0) goto L_0x01f5;
    L_0x01f1:
        r1.f = r3;
        r1.d = r5;
    L_0x01f5:
        r2 = r1.d;
        r2 = r2 + r14;
        r1.d = r2;
    L_0x01fa:
        r1 = r11.V;
        if (r1 >= r14) goto L_0x025e;
    L_0x01fe:
        r1 = r14 - r1;
        r11.a(r12, r0, r1);
        goto L_0x01fa;
    L_0x0204:
        r1 = r11.N;
        r1 = r1.a;
        r1[r5] = r5;
        r1[r4] = r5;
        r1[r3] = r5;
        r2 = r13.Q;
        r3 = r13.Q;
        r3 = 4 - r3;
    L_0x0214:
        r4 = r11.V;
        if (r4 >= r14) goto L_0x025e;
    L_0x0218:
        r4 = r11.ac;
        if (r4 != 0) goto L_0x0256;
    L_0x021c:
        r4 = r11.P;
        r4 = r4.b();
        r4 = java.lang.Math.min(r2, r4);
        r7 = r3 + r4;
        r8 = r2 - r4;
        r12.b(r1, r7, r8);
        if (r4 <= 0) goto L_0x0234;
    L_0x022f:
        r7 = r11.P;
        r7.a(r1, r3, r4);
    L_0x0234:
        r4 = r11.V;
        r4 = r4 + r2;
        r11.V = r4;
        r4 = r11.N;
        r4.c(r5);
        r4 = r11.N;
        r4 = r4.o();
        r11.ac = r4;
        r4 = r11.M;
        r4.c(r5);
        r4 = r11.M;
        r0.a(r4, r6);
        r4 = r11.ad;
        r4 = r4 + r6;
        r11.ad = r4;
        goto L_0x0214;
    L_0x0256:
        r7 = r11.a(r12, r0, r4);
        r4 = r4 - r7;
        r11.ac = r4;
        goto L_0x0214;
    L_0x025e:
        r12 = r13.a;
        r13 = "A_VORBIS";
        r12 = r13.equals(r12);
        if (r12 == 0) goto L_0x0277;
    L_0x0268:
        r12 = r11.O;
        r12.c(r5);
        r12 = r11.O;
        r0.a(r12, r6);
        r12 = r11.ad;
        r12 = r12 + r6;
        r11.ad = r12;
    L_0x0277:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boe.a(bnl, boe$b, int):void");
    }

    public final void a(bnm bnm) {
        this.G = bnm;
    }

    /* Access modifiers changed, original: final */
    public final void a(b bVar, long j) {
        b bVar2 = bVar;
        if (bVar2.L != null) {
            c cVar = bVar2.L;
            if (cVar.b) {
                int i = cVar.c;
                cVar.c = i + 1;
                if (i == 0) {
                    cVar.e = j;
                }
                if (cVar.c >= 16) {
                    bVar2.P.a(cVar.e, cVar.f, cVar.d, 0, bVar2.g);
                    cVar.c = 0;
                }
            }
        } else {
            int i2;
            long j2;
            byte[] bArr;
            String str;
            long j3 = j;
            if ("S_TEXT/UTF8".equals(bVar2.a)) {
                i2 = 19;
                j2 = 1000;
                bArr = I;
                str = "%02d:%02d:%02d,%03d";
            } else {
                if ("S_TEXT/ASS".equals(bVar2.a)) {
                    i2 = 21;
                    j2 = TelemetryConstants.FLUSH_DELAY_MS;
                    bArr = K;
                    str = "%01d:%02d:%02d:%02d";
                }
                bVar2.P.a(j, this.E, this.ad, 0, bVar2.g);
            }
            a(bVar, str, i2, j2, bArr);
            bVar2.P.a(j, this.E, this.ad, 0, bVar2.g);
        }
        this.ae = true;
        a();
    }

    public final boolean a(bnl bnl) {
        long h;
        bnl bnl2 = bnl;
        bof bof = new bof();
        long d = bnl.d();
        long j = 1024;
        if (d != -1 && d <= 1024) {
            j = d;
        }
        int i = (int) j;
        bnl2.c(bof.a.a, 0, 4);
        bof.b = 4;
        for (h = bof.a.h(); h != 440786851; h = ((h << 8) & -256) | ((long) (bof.a.a[0] & 255))) {
            int i2 = bof.b + 1;
            bof.b = i2;
            if (i2 == i) {
                break;
            }
            bnl2.c(bof.a.a, 0, 1);
        }
        h = bof.a(bnl2);
        long j2 = (long) bof.b;
        if (h != Long.MIN_VALUE && (d == -1 || j2 + h < d)) {
            while (true) {
                long j3 = j2 + h;
                if (((long) bof.b) < j3) {
                    if (bof.a(bnl2) == Long.MIN_VALUE) {
                        break;
                    }
                    d = bof.a(bnl2);
                    if (d < 0 || d > 2147483647L) {
                        return false;
                    }
                    if (d != 0) {
                        int i3 = (int) d;
                        bnl2.c(i3);
                        bof.b += i3;
                    }
                } else if (((long) bof.b) == j3) {
                    return true;
                }
            }
        }
        return false;
    }
}
