package defpackage;

import com.brightcove.player.media.MediaService;
import com.looksery.sdk.domain.uriservice.LensTextInputConstants;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.record.ConfigEtagModel;
import com.snap.core.db.record.NetworkGatewayInfoModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: akje */
final class akje {
    static final akjd[] a;
    static final Map<akkg, Integer> b;

    /* renamed from: akje$a */
    static final class a {
        private final List<akjd> a;
        private final akkf b;
        private final int c;
        private int d;
        private akjd[] e;
        private int f;
        private int g;
        private int h;

        a(akkv akkv) {
            this(akkv, (byte) 0);
        }

        private a(akkv akkv, byte b) {
            this.a = new ArrayList();
            this.e = new akjd[8];
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            this.c = 4096;
            this.d = 4096;
            this.b = akko.a(akkv);
        }

        private int a(int i) {
            int i2 = 0;
            if (i > 0) {
                akjd[] akjdArr;
                int length = this.e.length;
                while (true) {
                    length--;
                    if (length < this.f || i <= 0) {
                        akjdArr = this.e;
                        length = this.f;
                        System.arraycopy(akjdArr, length + 1, akjdArr, (length + 1) + i2, this.g);
                        this.f += i2;
                    } else {
                        i -= this.e[length].i;
                        this.h -= this.e[length].i;
                        this.g--;
                        i2++;
                    }
                }
                akjdArr = this.e;
                length = this.f;
                System.arraycopy(akjdArr, length + 1, akjdArr, (length + 1) + i2, this.g);
                this.f += i2;
            }
            return i2;
        }

        private int a(int i, int i2) {
            i &= i2;
            if (i < i2) {
                return i;
            }
            i = 0;
            while (true) {
                int e = e();
                if ((e & 128) == 0) {
                    return i2 + (e << i);
                }
                i2 += (e & 127) << i;
                i += 7;
            }
        }

        private void a(akjd akjd) {
            this.a.add(akjd);
            int i = akjd.i;
            int i2 = this.d;
            if (i > i2) {
                d();
                return;
            }
            a((this.h + i) - i2);
            i2 = this.g + 1;
            akjd[] akjdArr = this.e;
            if (i2 > akjdArr.length) {
                akjd[] akjdArr2 = new akjd[(akjdArr.length << 1)];
                System.arraycopy(akjdArr, 0, akjdArr2, akjdArr.length, akjdArr.length);
                this.f = this.e.length - 1;
                this.e = akjdArr2;
            }
            i2 = this.f;
            this.f = i2 - 1;
            this.e[i2] = akjd;
            this.g++;
            this.h += i;
        }

        private int b(int i) {
            return (this.f + 1) + i;
        }

        private akkg c(int i) {
            return (a.d(i) ? akje.a[i] : this.e[b(i - 61)]).g;
        }

        private void c() {
            int i = this.d;
            int i2 = this.h;
            if (i < i2) {
                if (i == 0) {
                    d();
                    return;
                }
                a(i2 - i);
            }
        }

        private void d() {
            Arrays.fill(this.e, null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private static boolean d(int i) {
            return i >= 0 && i <= 60;
        }

        private int e() {
            return this.b.g() & 255;
        }

        private akkg f() {
            int e = e();
            Object obj = (e & 128) == 128 ? 1 : null;
            e = a(e, 127);
            return obj != null ? akkg.a(akjl.a.a(this.b.e((long) e))) : this.b.c((long) e);
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            while (!this.b.d()) {
                int g = this.b.g() & 255;
                if (g == 128) {
                    throw new IOException("index == 0");
                } else if ((g & 128) == 128) {
                    g = a(g, 127) - 1;
                    if (a.d(g)) {
                        this.a.add(akje.a[g]);
                    } else {
                        int b = b(g - 61);
                        if (b >= 0) {
                            akjd[] akjdArr = this.e;
                            if (b <= akjdArr.length - 1) {
                                this.a.add(akjdArr[b]);
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder("Header index too large ");
                        stringBuilder.append(g + 1);
                        throw new IOException(stringBuilder.toString());
                    }
                } else {
                    akjd akjd;
                    if (g == 64) {
                        akjd = new akjd(akje.a(f()), f());
                    } else if ((g & 64) == 64) {
                        akjd = new akjd(c(a(g, 63) - 1), f());
                    } else if ((g & 32) == 32) {
                        this.d = a(g, 31);
                        g = this.d;
                        if (g < 0 || g > 4096) {
                            StringBuilder stringBuilder2 = new StringBuilder("Invalid dynamic table size update ");
                            stringBuilder2.append(this.d);
                            throw new IOException(stringBuilder2.toString());
                        }
                        c();
                    } else {
                        List list;
                        Object akjd2;
                        akkg a;
                        akkg f;
                        if (g == 16 || g == 0) {
                            a = akje.a(f());
                            f = f();
                            list = this.a;
                            akjd2 = new akjd(a, f);
                        } else {
                            a = c(a(g, 15) - 1);
                            f = f();
                            list = this.a;
                            akjd2 = new akjd(a, f);
                        }
                        list.add(akjd2);
                    }
                    a(akjd);
                }
            }
        }

        public final List<akjd> b() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }
    }

    /* renamed from: akje$b */
    static final class b {
        private final akkd a;
        private final boolean b;
        private int c;
        private boolean d;
        private int e;
        private int f;
        private akjd[] g;
        private int h;
        private int i;
        private int j;

        b(akkd akkd) {
            this(akkd, (byte) 0);
        }

        private b(akkd akkd, byte b) {
            this.c = Integer.MAX_VALUE;
            this.g = new akjd[8];
            this.h = this.g.length - 1;
            this.i = 0;
            this.j = 0;
            this.e = 4096;
            this.f = 4096;
            this.b = true;
            this.a = akkd;
        }

        private void a() {
            Arrays.fill(this.g, null);
            this.h = this.g.length - 1;
            this.i = 0;
            this.j = 0;
        }

        private void a(int i, int i2, int i3) {
            akkd akkd;
            if (i < i2) {
                akkd = this.a;
                i |= i3;
            } else {
                this.a.j(i3 | i2);
                i -= i2;
                while (i >= 128) {
                    this.a.j(128 | (i & 127));
                    i >>>= 7;
                }
                akkd = this.a;
            }
            akkd.j(i);
        }

        private void a(akjd akjd) {
            int i = akjd.i;
            int i2 = this.f;
            if (i > i2) {
                a();
                return;
            }
            b((this.j + i) - i2);
            i2 = this.i + 1;
            akjd[] akjdArr = this.g;
            if (i2 > akjdArr.length) {
                akjd[] akjdArr2 = new akjd[(akjdArr.length << 1)];
                System.arraycopy(akjdArr, 0, akjdArr2, akjdArr.length, akjdArr.length);
                this.h = this.g.length - 1;
                this.g = akjdArr2;
            }
            i2 = this.h;
            this.h = i2 - 1;
            this.g[i2] = akjd;
            this.i++;
            this.j += i;
        }

        private void a(akkg akkg) {
            int g;
            int i;
            if (akjl.a(akkg) < akkg.g()) {
                akkd akkd = new akkd();
                akjl.a(akkg, akkd);
                akkg = akkd.m();
                g = akkg.g();
                i = 128;
            } else {
                g = akkg.g();
                i = 0;
            }
            a(g, 127, i);
            this.a.c(akkg);
        }

        private int b(int i) {
            int i2 = 0;
            if (i > 0) {
                akjd[] akjdArr;
                int length = this.g.length;
                while (true) {
                    length--;
                    if (length < this.h || i <= 0) {
                        akjdArr = this.g;
                        length = this.h;
                        System.arraycopy(akjdArr, length + 1, akjdArr, (length + 1) + i2, this.i);
                        akjdArr = this.g;
                        length = this.h;
                        Arrays.fill(akjdArr, length + 1, (length + 1) + i2, null);
                        this.h += i2;
                    } else {
                        i -= this.g[length].i;
                        this.j -= this.g[length].i;
                        this.i--;
                        i2++;
                    }
                }
                akjdArr = this.g;
                length = this.h;
                System.arraycopy(akjdArr, length + 1, akjdArr, (length + 1) + i2, this.i);
                akjdArr = this.g;
                length = this.h;
                Arrays.fill(akjdArr, length + 1, (length + 1) + i2, null);
                this.h += i2;
            }
            return i2;
        }

        /* Access modifiers changed, original: final */
        public final void a(int i) {
            this.e = i;
            i = Math.min(i, 16384);
            int i2 = this.f;
            if (i2 != i) {
                if (i < i2) {
                    this.c = Math.min(this.c, i);
                }
                this.d = true;
                this.f = i;
                i = this.f;
                i2 = this.j;
                if (i < i2) {
                    if (i == 0) {
                        a();
                        return;
                    }
                    b(i2 - i);
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(List<akjd> list) {
            int i;
            if (this.d) {
                i = this.c;
                if (i < this.f) {
                    a(i, 31, 32);
                }
                this.d = false;
                this.c = Integer.MAX_VALUE;
                a(this.f, 31, 32);
            }
            i = list.size();
            for (int i2 = 0; i2 < i; i2++) {
                int intValue;
                int i3;
                akjd akjd = (akjd) list.get(i2);
                akkg f = akjd.g.f();
                akkg akkg = akjd.h;
                Integer num = (Integer) akje.b.get(f);
                if (num != null) {
                    intValue = num.intValue() + 1;
                    if (intValue > 1 && intValue < 8) {
                        if (akib.a(akje.a[intValue - 1].h, (Object) akkg)) {
                            i3 = intValue;
                        } else if (akib.a(akje.a[intValue].h, (Object) akkg)) {
                            i3 = intValue;
                            intValue++;
                        }
                    }
                    i3 = intValue;
                    intValue = -1;
                } else {
                    intValue = -1;
                    i3 = -1;
                }
                if (intValue == -1) {
                    int length = this.g.length;
                    for (int i4 = this.h + 1; i4 < length; i4++) {
                        if (akib.a(this.g[i4].g, (Object) f)) {
                            if (akib.a(this.g[i4].h, (Object) akkg)) {
                                intValue = (i4 - this.h) + 61;
                                break;
                            } else if (i3 == -1) {
                                i3 = (i4 - this.h) + 61;
                            }
                        }
                    }
                }
                if (intValue != -1) {
                    a(intValue, 127, 128);
                } else {
                    if (i3 == -1) {
                        this.a.j(64);
                        a(f);
                    } else {
                        akkg akkg2 = akjd.a;
                        if (!f.a(0, akkg2, 0, akkg2.g()) || akjd.f.equals(f)) {
                            a(i3, 63, 64);
                        } else {
                            a(i3, 15, 0);
                            a(akkg);
                        }
                    }
                    a(akkg);
                    a(akjd);
                }
            }
        }
    }

    static {
        r1 = new akjd[61];
        String str = "";
        int i = 0;
        r1[0] = new akjd(akjd.f, str);
        r1[1] = new akjd(akjd.c, "GET");
        r1[2] = new akjd(akjd.c, LensTextInputConstants.REQUEST_METHOD);
        r1[3] = new akjd(akjd.d, "/");
        r1[4] = new akjd(akjd.d, "/index.html");
        r1[5] = new akjd(akjd.e, MediaService.DEFAULT_MEDIA_DELIVERY);
        r1[6] = new akjd(akjd.e, "https");
        r1[7] = new akjd(akjd.b, "200");
        r1[8] = new akjd(akjd.b, "204");
        r1[9] = new akjd(akjd.b, "206");
        r1[10] = new akjd(akjd.b, "304");
        r1[11] = new akjd(akjd.b, "400");
        r1[12] = new akjd(akjd.b, "404");
        r1[13] = new akjd(akjd.b, "500");
        r1[14] = new akjd("accept-charset", str);
        r1[15] = new akjd("accept-encoding", "gzip, deflate");
        r1[16] = new akjd("accept-language", str);
        r1[17] = new akjd("accept-ranges", str);
        r1[18] = new akjd("accept", str);
        r1[19] = new akjd("access-control-allow-origin", str);
        r1[20] = new akjd("age", str);
        r1[21] = new akjd("allow", str);
        r1[22] = new akjd("authorization", str);
        r1[23] = new akjd("cache-control", str);
        r1[24] = new akjd("content-disposition", str);
        r1[25] = new akjd("content-encoding", str);
        r1[26] = new akjd("content-language", str);
        r1[27] = new akjd("content-length", str);
        r1[28] = new akjd("content-location", str);
        r1[29] = new akjd("content-range", str);
        r1[30] = new akjd("content-type", str);
        r1[31] = new akjd("cookie", str);
        r1[32] = new akjd("date", str);
        r1[33] = new akjd(ConfigEtagModel.ETAG, str);
        r1[34] = new akjd("expect", str);
        r1[35] = new akjd("expires", str);
        r1[36] = new akjd("from", str);
        r1[37] = new akjd("host", str);
        r1[38] = new akjd("if-match", str);
        r1[39] = new akjd("if-modified-since", str);
        r1[40] = new akjd("if-none-match", str);
        r1[41] = new akjd("if-range", str);
        r1[42] = new akjd("if-unmodified-since", str);
        r1[43] = new akjd("last-modified", str);
        r1[44] = new akjd("link", str);
        r1[45] = new akjd(MapboxEvent.TYPE_LOCATION, str);
        r1[46] = new akjd("max-forwards", str);
        r1[47] = new akjd("proxy-authenticate", str);
        r1[48] = new akjd("proxy-authorization", str);
        r1[49] = new akjd("range", str);
        r1[50] = new akjd("referer", str);
        r1[51] = new akjd("refresh", str);
        r1[52] = new akjd("retry-after", str);
        r1[53] = new akjd(NetworkGatewayInfoModel.SERVER, str);
        r1[54] = new akjd("set-cookie", str);
        r1[55] = new akjd("strict-transport-security", str);
        r1[56] = new akjd("transfer-encoding", str);
        r1[57] = new akjd("user-agent", str);
        r1[58] = new akjd("vary", str);
        r1[59] = new akjd("via", str);
        r1[60] = new akjd("www-authenticate", str);
        a = r1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (i < 61) {
            if (!linkedHashMap.containsKey(a[i].g)) {
                linkedHashMap.put(a[i].g, Integer.valueOf(i));
            }
            i++;
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    static akkg a(akkg akkg) {
        int g = akkg.g();
        int i = 0;
        while (i < g) {
            byte a = akkg.a(i);
            if (a < (byte) 65 || a > (byte) 90) {
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                stringBuilder.append(akkg.a());
                throw new IOException(stringBuilder.toString());
            }
        }
        return akkg;
    }
}
