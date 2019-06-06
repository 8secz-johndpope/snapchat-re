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

/* renamed from: ajaj */
final class ajaj {
    static final ajai[] a;
    static final Map<akkg, Integer> b;

    /* renamed from: ajaj$b */
    static final class b {
        private final akkd a;

        b(akkd akkd) {
            this.a = akkd;
        }

        private void a(int i, int i2) {
            akkd akkd;
            if (i < i2) {
                akkd = this.a;
                i |= 0;
            } else {
                this.a.j(i2 | 0);
                i -= i2;
                while (i >= 128) {
                    this.a.j(128 | (i & 127));
                    i >>>= 7;
                }
                akkd = this.a;
            }
            akkd.j(i);
        }

        private void a(akkg akkg) {
            a(akkg.g(), 127);
            this.a.c(akkg);
        }

        /* Access modifiers changed, original: final */
        public final void a(List<ajai> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                akkg f = ((ajai) list.get(i)).f.f();
                Integer num = (Integer) ajaj.b.get(f);
                if (num != null) {
                    a(num.intValue() + 1, 15);
                } else {
                    this.a.j(0);
                    a(f);
                }
                a(((ajai) list.get(i)).g);
            }
        }
    }

    /* renamed from: ajaj$a */
    static final class a {
        int a = 4096;
        int b = 4096;
        private final List<ajai> c = new ArrayList();
        private final akkf d;
        private ajai[] e = new ajai[8];
        private int f = (this.e.length - 1);
        private int g = 0;
        private int h = 0;

        a(akkv akkv) {
            this.d = akko.a(akkv);
        }

        private int a(int i) {
            int i2 = 0;
            if (i > 0) {
                ajai[] ajaiArr;
                int length = this.e.length;
                while (true) {
                    length--;
                    if (length < this.f || i <= 0) {
                        ajaiArr = this.e;
                        length = this.f;
                        System.arraycopy(ajaiArr, length + 1, ajaiArr, (length + 1) + i2, this.g);
                        this.f += i2;
                    } else {
                        i -= this.e[length].h;
                        this.h -= this.e[length].h;
                        this.g--;
                        i2++;
                    }
                }
                ajaiArr = this.e;
                length = this.f;
                System.arraycopy(ajaiArr, length + 1, ajaiArr, (length + 1) + i2, this.g);
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

        private void a(ajai ajai) {
            this.c.add(ajai);
            int i = ajai.h;
            int i2 = this.b;
            if (i > i2) {
                d();
                return;
            }
            a((this.h + i) - i2);
            i2 = this.g + 1;
            ajai[] ajaiArr = this.e;
            if (i2 > ajaiArr.length) {
                ajai[] ajaiArr2 = new ajai[(ajaiArr.length << 1)];
                System.arraycopy(ajaiArr, 0, ajaiArr2, ajaiArr.length, ajaiArr.length);
                this.f = this.e.length - 1;
                this.e = ajaiArr2;
            }
            i2 = this.f;
            this.f = i2 - 1;
            this.e[i2] = ajai;
            this.g++;
            this.h += i;
        }

        private int b(int i) {
            return (this.f + 1) + i;
        }

        private akkg c(int i) {
            return (a.d(i) ? ajaj.a[i] : this.e[b(i - 61)]).f;
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
            return this.d.g() & 255;
        }

        private akkg f() {
            int e = e();
            Object obj = (e & 128) == 128 ? 1 : null;
            e = a(e, 127);
            return obj != null ? akkg.a(ajal.a.a(this.d.e((long) e))) : this.d.c((long) e);
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            int i = this.b;
            int i2 = this.h;
            if (i < i2) {
                if (i == 0) {
                    d();
                    return;
                }
                a(i2 - i);
            }
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            while (!this.d.d()) {
                int g = this.d.g() & 255;
                if (g == 128) {
                    throw new IOException("index == 0");
                } else if ((g & 128) == 128) {
                    g = a(g, 127) - 1;
                    if (a.d(g)) {
                        this.c.add(ajaj.a[g]);
                    } else {
                        int b = b(g - 61);
                        if (b >= 0) {
                            ajai[] ajaiArr = this.e;
                            if (b <= ajaiArr.length - 1) {
                                this.c.add(ajaiArr[b]);
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder("Header index too large ");
                        stringBuilder.append(g + 1);
                        throw new IOException(stringBuilder.toString());
                    }
                } else {
                    ajai ajai;
                    if (g == 64) {
                        ajai = new ajai(ajaj.a(f()), f());
                    } else if ((g & 64) == 64) {
                        ajai = new ajai(c(a(g, 63) - 1), f());
                    } else if ((g & 32) == 32) {
                        this.b = a(g, 31);
                        g = this.b;
                        if (g < 0 || g > this.a) {
                            StringBuilder stringBuilder2 = new StringBuilder("Invalid dynamic table size update ");
                            stringBuilder2.append(this.b);
                            throw new IOException(stringBuilder2.toString());
                        }
                        a();
                    } else {
                        List list;
                        Object ajai2;
                        akkg a;
                        akkg f;
                        if (g == 16 || g == 0) {
                            a = ajaj.a(f());
                            f = f();
                            list = this.c;
                            ajai2 = new ajai(a, f);
                        } else {
                            a = c(a(g, 15) - 1);
                            f = f();
                            list = this.c;
                            ajai2 = new ajai(a, f);
                        }
                        list.add(ajai2);
                    }
                    a(ajai);
                }
            }
        }

        public final List<ajai> c() {
            ArrayList arrayList = new ArrayList(this.c);
            this.c.clear();
            return arrayList;
        }
    }

    static {
        r1 = new ajai[61];
        String str = "";
        int i = 0;
        r1[0] = new ajai(ajai.e, str);
        r1[1] = new ajai(ajai.b, "GET");
        r1[2] = new ajai(ajai.b, LensTextInputConstants.REQUEST_METHOD);
        r1[3] = new ajai(ajai.c, "/");
        r1[4] = new ajai(ajai.c, "/index.html");
        r1[5] = new ajai(ajai.d, MediaService.DEFAULT_MEDIA_DELIVERY);
        r1[6] = new ajai(ajai.d, "https");
        r1[7] = new ajai(ajai.a, "200");
        r1[8] = new ajai(ajai.a, "204");
        r1[9] = new ajai(ajai.a, "206");
        r1[10] = new ajai(ajai.a, "304");
        r1[11] = new ajai(ajai.a, "400");
        r1[12] = new ajai(ajai.a, "404");
        r1[13] = new ajai(ajai.a, "500");
        r1[14] = new ajai("accept-charset", str);
        r1[15] = new ajai("accept-encoding", "gzip, deflate");
        r1[16] = new ajai("accept-language", str);
        r1[17] = new ajai("accept-ranges", str);
        r1[18] = new ajai("accept", str);
        r1[19] = new ajai("access-control-allow-origin", str);
        r1[20] = new ajai("age", str);
        r1[21] = new ajai("allow", str);
        r1[22] = new ajai("authorization", str);
        r1[23] = new ajai("cache-control", str);
        r1[24] = new ajai("content-disposition", str);
        r1[25] = new ajai("content-encoding", str);
        r1[26] = new ajai("content-language", str);
        r1[27] = new ajai("content-length", str);
        r1[28] = new ajai("content-location", str);
        r1[29] = new ajai("content-range", str);
        r1[30] = new ajai("content-type", str);
        r1[31] = new ajai("cookie", str);
        r1[32] = new ajai("date", str);
        r1[33] = new ajai(ConfigEtagModel.ETAG, str);
        r1[34] = new ajai("expect", str);
        r1[35] = new ajai("expires", str);
        r1[36] = new ajai("from", str);
        r1[37] = new ajai("host", str);
        r1[38] = new ajai("if-match", str);
        r1[39] = new ajai("if-modified-since", str);
        r1[40] = new ajai("if-none-match", str);
        r1[41] = new ajai("if-range", str);
        r1[42] = new ajai("if-unmodified-since", str);
        r1[43] = new ajai("last-modified", str);
        r1[44] = new ajai("link", str);
        r1[45] = new ajai(MapboxEvent.TYPE_LOCATION, str);
        r1[46] = new ajai("max-forwards", str);
        r1[47] = new ajai("proxy-authenticate", str);
        r1[48] = new ajai("proxy-authorization", str);
        r1[49] = new ajai("range", str);
        r1[50] = new ajai("referer", str);
        r1[51] = new ajai("refresh", str);
        r1[52] = new ajai("retry-after", str);
        r1[53] = new ajai(NetworkGatewayInfoModel.SERVER, str);
        r1[54] = new ajai("set-cookie", str);
        r1[55] = new ajai("strict-transport-security", str);
        r1[56] = new ajai("transfer-encoding", str);
        r1[57] = new ajai("user-agent", str);
        r1[58] = new ajai("vary", str);
        r1[59] = new ajai("via", str);
        r1[60] = new ajai("www-authenticate", str);
        a = r1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (i < 61) {
            if (!linkedHashMap.containsKey(a[i].f)) {
                linkedHashMap.put(a[i].f, Integer.valueOf(i));
            }
            i++;
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    static /* synthetic */ akkg a(akkg akkg) {
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
