package defpackage;

import android.content.Context;
import com.google.common.base.Preconditions;
import com.google.common.net.MediaType;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import defpackage.akpi.a;
import defpackage.rzu.b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.opencv.imgproc.Imgproc;

/* renamed from: rxy */
public final class rxy extends sau {
    final akoy a;
    volatile boolean b = true;
    private final Executor c;
    private final Executor d;
    private final sca e;
    private final ihh f;
    private final saj g;
    private final b h;
    private final int i;
    private final boolean j;
    private final int k;

    /* renamed from: rxy$a */
    public static class a {
        public final defpackage.akoy.a a;
        public final b b;
        public final Executor c;
        public final Executor d;
        public int e = 1073741823;
        public ihh f = new ihl();
        public saj g = sbh.a();
        public int h = 32;
        public int i = Imgproc.FLOODFILL_FIXED_RANGE;
        public boolean j;
        public int k;
        private final int l = 1048576;

        public a(Context context, Executor executor, Executor executor2, whi whi, gcw gcw, ftl ftl, aipn<iha> aipn, b bVar, igc igc) {
            boolean a = ftl.a(rxp.ENABLE_QUIC);
            this.a = (defpackage.akoy.a) new defpackage.akoy.a((Context) Preconditions.checkNotNull(context)).d(a).b().a();
            if (a) {
                a.a(this.a, gcw);
            }
            a(whi, gcw, ftl);
            defpackage.akoy.a aVar = this.a;
            String a2 = new b((iha) aipn.get(), ftl, gcw).a();
            if (a2 != null) {
                aVar.b(a2);
            }
            boolean z = abss.a().l() && ftl.a(rxp.CRONET_LOGGING_ENABLED);
            this.j = z;
            this.k = ftl.f(rxp.CRONET_LOG_JSON_FILE_SIZE_IN_MB) * 1048576;
            this.a.c(((File) igc.a().b()).getAbsolutePath()).a(2, 1048576);
            this.c = (Executor) Preconditions.checkNotNull(executor);
            this.d = (Executor) Preconditions.checkNotNull(executor2);
            this.b = bVar;
        }

        private static void a(defpackage.akoy.a aVar, gcw gcw) {
            for (String b : gcw.d()) {
                aVar.a(b, 443, 443);
            }
        }

        private void a(whi whi, gcw gcw, ftl ftl) {
            if (!ftl.a(wiq.DISABLE_PINNING)) {
                try {
                    Set b = whi.b();
                    if (!b.isEmpty()) {
                        this.a.c();
                        for (String b2 : gcw.c()) {
                            this.a.a(b2, b, true, new Date(Long.MAX_VALUE));
                        }
                    }
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                }
            }
        }
    }

    /* renamed from: rxy$b */
    static class b {
        private iha a;
        private String b;
        private boolean c;
        private Set<String> d;
        private int e;
        private int f;
        private int g;
        private JsonObject h = new JsonObject();

        public b(iha iha, ftl ftl, gcw gcw) {
            this.a = iha;
            this.b = ftl.j(rxp.PROTOCOL_LIST);
            this.c = ftl.a(rxp.CLOSE_SESSION_ON_IP_CHANGE);
            this.e = ftl.f(rxp.MDP_TCP_FAST_OPEN_MUSHROOM);
            this.f = ftl.f(rxp.CRONET_IDLE_SOCKET_USED_TIMEOUT);
            this.g = ftl.f(rxp.CRONET_IDLE_SOCKET_UNUSED_TIMEOUT);
            this.d = gcw.d();
        }

        private void a(String str, String str2, JsonElement jsonElement) {
            JsonElement jsonElement2 = this.h.get(str);
            JsonObject jsonObject = (jsonElement2 == null || !jsonElement2.isJsonObject()) ? new JsonObject() : (JsonObject) jsonElement2;
            jsonObject.add(str2, jsonElement);
            this.h.add(str, jsonObject);
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
        public final java.lang.String a() {
            /*
            r7 = this;
            r0 = r7.b;
            if (r0 == 0) goto L_0x0064;
        L_0x0004:
            r1 = ",";
            r0 = r0.split(r1);
            r1 = r0.length;
            if (r1 <= 0) goto L_0x0064;
        L_0x000d:
            r1 = r0.length;
            r2 = 0;
        L_0x000f:
            if (r2 >= r1) goto L_0x0064;
        L_0x0011:
            r3 = r0[r2];
            r4 = "QUIC";
            r3 = android.text.TextUtils.equals(r3, r4);
            if (r3 == 0) goto L_0x0061;
        L_0x001b:
            r3 = r7.d;
            r3 = r3.isEmpty();
            if (r3 != 0) goto L_0x0051;
        L_0x0023:
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r5 = r7.d;
            r5 = r5.iterator();
        L_0x002e:
            r6 = r5.hasNext();
            if (r6 == 0) goto L_0x0043;
        L_0x0034:
            r6 = r5.next();
            r6 = (java.lang.String) r6;
            r3.append(r6);
            r6 = 44;
            r3.append(r6);
            goto L_0x002e;
        L_0x0043:
            r5 = new com.google.gson.JsonPrimitive;
            r3 = r3.toString();
            r5.<init>(r3);
            r3 = "host_whitelist";
            r7.a(r4, r3, r5);
        L_0x0051:
            r3 = new com.google.gson.JsonPrimitive;
            r5 = r7.c;
            r5 = java.lang.Boolean.valueOf(r5);
            r3.<init>(r5);
            r5 = "close_sessions_on_ip_change";
            r7.a(r4, r5, r3);
        L_0x0061:
            r2 = r2 + 1;
            goto L_0x000f;
        L_0x0064:
            r0 = r7.e;
            r1 = "tcp_fast_open_mode";
            r2 = 1;
            if (r0 == r2) goto L_0x0074;
        L_0x006b:
            r2 = 2;
            if (r0 == r2) goto L_0x006f;
        L_0x006e:
            goto L_0x007b;
        L_0x006f:
            r0 = r7.h;
            r2 = "tcp_fast_open_enabled_for_all";
            goto L_0x0078;
        L_0x0074:
            r0 = r7.h;
            r2 = "tcp_fast_open_enabled_for_ssl_only";
        L_0x0078:
            r0.addProperty(r1, r2);
        L_0x007b:
            r0 = r7.f;
            if (r0 < 0) goto L_0x009b;
        L_0x007f:
            r1 = r7.g;
            if (r1 < 0) goto L_0x009b;
        L_0x0083:
            r1 = r7.h;
            r0 = java.lang.Integer.valueOf(r0);
            r2 = "used_idle_socket_timeout";
            r1.addProperty(r2, r0);
            r0 = r7.h;
            r1 = r7.g;
            r1 = java.lang.Integer.valueOf(r1);
            r2 = "unused_idle_socket_timeout";
            r0.addProperty(r2, r1);
        L_0x009b:
            r0 = r7.h;
            r0 = r0.size();
            if (r0 <= 0) goto L_0x00ac;
        L_0x00a3:
            r0 = r7.a;
            r1 = r7.h;
            r0 = r0.b(r1);
            return r0;
        L_0x00ac:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rxy$b.a():java.lang.String");
        }
    }

    public rxy(ihh ihh, int i, sca sca, saj saj, akoy akoy, Executor executor, Executor executor2, b bVar, boolean z, int i2) {
        this.a = (akoy) Preconditions.checkNotNull(akoy);
        this.c = (Executor) Preconditions.checkNotNull(executor);
        this.d = (Executor) Preconditions.checkNotNull(executor2);
        this.f = ihh;
        this.e = sca;
        this.g = saj;
        this.i = i;
        this.a.a(new a(executor) {
            public final void a(akpi akpi) {
                if (akpi != null) {
                    Collection a = akpi.a();
                    if (a != null) {
                        akpi.b bVar = (akpi.b) Preconditions.checkNotNull(akpi.b());
                        long max = Math.max(sas.a(bVar.a(), bVar.h()), 0);
                        rzz rzz = r4;
                        rzz rzz2 = new rzz(sas.a(bVar.a(), bVar.i()), sas.a(bVar.a(), bVar.b()), sas.a(bVar.b(), bVar.c()), bVar.j(), sas.a(bVar.d(), bVar.e()), sas.a(bVar.f(), bVar.g()), sas.a(bVar.k()) - max, sas.a(bVar.l()) - max, sas.a(bVar.l()));
                        for (Object next : a) {
                            rzz rzz3;
                            if (next instanceof sal) {
                                rzz3 = rzz;
                                ((sal) next).h().onResult(rzz3);
                            } else {
                                rzz3 = rzz;
                            }
                            rzz = rzz3;
                        }
                    }
                }
            }
        });
        this.h = bVar;
        this.j = z;
        this.k = i2;
        a();
    }

    public final void a() {
        this.b = this.j;
        rxu.e().delete();
        if (this.b) {
            this.a.a(rxu.d(), this.k);
        }
    }

    /* renamed from: a */
    public final void b(sak<sai> sak, sab sab) {
        sak sak2 = (sak) Preconditions.checkNotNull(sak);
        sab sab2 = (sab) Preconditions.checkNotNull(sab);
        akoz.a a = this.a.a(sak2.i(), new rxx(this.f, this.i, this.g, sab2, new sce(this.e, sak2.i()), this.d, new rxz(new -$$Lambda$rxy$O52yiAgyKg84J1MihVApX9oiPmo(this, sak2, sab2)), this.h, sak2.o()), this.c);
        for (Entry entry : ((Map) Preconditions.checkNotNull(sak.l())).entrySet()) {
            a.a((String) entry.getKey(), (String) entry.getValue());
        }
        a.a(((sac) Preconditions.checkNotNull(sak.k())).toString());
        final UUID a2 = sab.a().a();
        Executor executor = this.d;
        final b bVar = this.h;
        final b f = sab.a().f();
        sai sai = (sai) sak.n();
        if (sai != null) {
            MediaType b = sai.b();
            if (b != null) {
                a.a("Content-Type", b.toString());
            }
            final -$$Lambda$rxy$t_QdLI_M1EVZoCmXJPe5TT-3AUc -__lambda_rxy_t_qdli_m1evzocmxjpe5tt-3auc = new -$$Lambda$rxy$t_QdLI_M1EVZoCmXJPe5TT-3AUc(sai);
            final long c = sai.c();
            final sak<sai> sak3 = sak;
            a.a(new akpk() {
                private volatile InputStream a = ((InputStream) -__lambda_rxy_t_qdli_m1evzocmxjpe5tt-3auc.get());
                private volatile long b = 0;

                public final long a() {
                    return c;
                }

                public final void a(akpl akpl) {
                    try {
                        aklc.a(this.a);
                        this.a = (InputStream) -__lambda_rxy_t_qdli_m1evzocmxjpe5tt-3auc.get();
                        this.b = 0;
                        akpl.b();
                    } catch (Exception e) {
                        akpl.b(e);
                    }
                }

                public final void a(akpl akpl, ByteBuffer byteBuffer) {
                    try {
                        if (byteBuffer.hasRemaining()) {
                            int i = 0;
                            int remaining = byteBuffer.remaining();
                            while (true) {
                                int i2 = remaining - 1;
                                if (remaining <= 0) {
                                    break;
                                }
                                remaining = this.a.read();
                                if (remaining < 0) {
                                    break;
                                }
                                byteBuffer.put((byte) remaining);
                                i++;
                                remaining = i2;
                            }
                            akpl.a();
                            if (c != -1) {
                                long j = (long) i;
                                this.b += j;
                                f.a(a2, j, this.b, c);
                                bVar.a(a2, j, this.b, c);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("CronetClient passed a buffer with no bytes remaining");
                    } catch (Exception e) {
                        akpl.a(e);
                    }
                }
            }, executor);
        }
        a.a(sab.a());
        akoz a3 = a.a();
        a3.a();
        sab.a().a(new -$$Lambda$rxy$niHTYs41QonEvUhaw9gbD4xf_nE(a3, sak));
    }
}
