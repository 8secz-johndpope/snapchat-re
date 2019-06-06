package defpackage;

import android.text.TextUtils;
import com.snap.core.db.AllUpdatesProcessor;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.framework.channel.ChannelInfoStore;
import defpackage.jig.e;
import defpackage.jig.f;
import defpackage.tnj.a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;

/* renamed from: jij */
public final class jij implements ajej, AllUpdatesProcessor, its {
    private final ixj a;
    private final ixl b;
    private final Set<itr> c;
    private final ixk d;
    private final tnj e;
    private final gpb f;
    private final iqy g;
    private final ajwy<ftl> h;
    private final ajei i = new ajei();
    private final ajdx<ira> j;
    private final ajwy<sah> k;
    private final ird l;
    private final idd m;
    private final zfw n;
    private final jig o;
    private final isa p;
    private final abna q;
    private final iqm r;
    private final ajwy<ChannelInfoStore> s;

    public jij(ixj ixj, ixl ixl, Set<itr> set, ixk ixk, tnj tnj, gpb gpb, iqy iqy, ajwy<ftl> ajwy, ajdx<ira> ajdx, ajwy<sah> ajwy2, ird ird, jig jig, isa isa, abna abna, iqm iqm, ajwy<ChannelInfoStore> ajwy3) {
        this.a = ixj;
        this.b = ixl;
        this.c = set;
        this.d = ixk;
        this.f = gpb;
        this.e = tnj;
        this.g = iqy;
        this.h = ajwy;
        this.j = ajdx;
        this.k = ajwy2;
        this.l = ird;
        this.m = irc.t.callsite("IdentityProcessor");
        this.n = zgb.a(this.m);
        this.o = jig;
        this.p = isa;
        this.q = abna;
        this.r = iqm;
        this.s = ajwy3;
    }

    private static Long a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Long.valueOf(new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime());
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    private /* synthetic */ void a() {
        if (this.l.j()) {
            this.i.a(this.j.a(new -$$Lambda$jij$kVALpHa-jzP-Sd-ZJdqeMNuLkqg(this)).a(-$$Lambda$jij$2H98EpK3g5K_5q7DyFQnZzVANTY.INSTANCE, -$$Lambda$jij$hWTiOpXPyPsQw0R8v0MBzQdFugA.INSTANCE));
            this.l.a(false);
        }
    }

    private void a(aecy aecy) {
        a b = this.e.b();
        String str = "";
        if (aecy.a != null) {
            if (TextUtils.isEmpty(aecy.a.b)) {
                b.a(jic.ALL_UPDATES_CHECKSUM, str);
            } else {
                b.a(jic.ALL_UPDATES_CHECKSUM, aecy.a.b);
            }
        }
        afeq afeq = aecy.c;
        if (afeq != null) {
            b.a(jic.IS_SMS_TFA_ENABLED, afeq.bf);
            b.a(jic.IS_OTP_TFA_ENABLED, afeq.bg);
            b.b(jic.TFA_VERIFIED_DEVICES, afeq.bj);
            b.a(jic.IS_SEARCHABLE_BY_PHONE_NUMBER, afeq.ab);
            b.a(jic.INAPP_COUNTRY_CODE, afeq.cq);
            this.g.a(afeq.X.longValue(), false);
            b.a(jic.SNAP_SCORE, afeq.S);
            b.a(jic.NUM_SNAPS_SENT, afeq.Q);
            b.a(jic.NUM_SNAPS_RECEIVED, afeq.R);
            b.a(jic.USER_QR_PATH, afeq.as);
        }
        aham aham = aecy.k;
        if (aham != null) {
            b.a(jic.PENDING_EMAIL, aham.b);
            b.a(jic.IS_EMAIL_VERIFIED, aham.a);
            b.a(jic.IS_CONTACT_SYNC_ENABLED, aham.u);
            b.a(jic.SHOW_QUICK_ADD_UNIT, aham.t);
            Object obj = 1;
            if (((ftl) this.h.get()).h(jic.SUGGESTED_FRIEND_SYNC_VERSION) >= abpp.a(aham.e)) {
                if (System.currentTimeMillis() - Long.valueOf(((ftl) this.h.get()).h(jic.SUGGESTED_FRIEND_FIND_TIMESTAMPS)).longValue() <= ((long) aham.f.intValue()) * 3600000) {
                    obj = null;
                }
            }
            if (obj != null) {
                b.a(jic.SUGGESTED_FRIEND_SYNC_VERSION, aham.e);
                this.i.a(ign.a(this.j.b(-$$Lambda$jij$lv40_Z4u_gdrr1Wm0D11Dm4RyJU.INSTANCE).e(-$$Lambda$JN4raD-1mnGzfQCptHtpCYVFNNg.INSTANCE).a(Boolean.TRUE), ((sah) this.k.get()).a(this.m, 0, 6)).b((ajdw) this.n.g()).a(-$$Lambda$jij$vcT1bqM_kP62jEZS6EP2z5cYzN0.INSTANCE, -$$Lambda$jij$9ebXMeL1aw1Q3g3_ThA9MaeQBM8.INSTANCE));
            }
            this.p.a(aham.k);
        }
        b.b();
        if (afeq != null) {
            String str2;
            String str3 = "sharedPreferences.doOnSu…        }.ignoreElement()";
            String str4 = "userAuthStore.get()";
            if (afeq.af != null) {
                String str5 = "tos_version_7_accepted";
                String str6 = (String) afeq.af.get(str5);
                if (str6 != null) {
                    ajei ajei = this.i;
                    jig jig = this.o;
                    boolean parseBoolean = Boolean.parseBoolean(str6);
                    Object obj2 = jig.c.get();
                    akcr.a(obj2, str4);
                    str2 = ((gpb) obj2).e().a.a;
                    if (str2 == null) {
                        str2 = str;
                    }
                    Object e = jig.a.c((ajfb) new f(jig.a(str2, str5), parseBoolean)).e();
                    akcr.a(e, str3);
                    ajei.a(e.e());
                }
            }
            if (afeq.bS != null) {
                aekm aekm = null;
                aekm aekm2 = null;
                for (aekm aekm3 : afeq.bS) {
                    if (aekm3.a != null) {
                        str2 = "seen_privacy_policy_gdpr";
                        if (aekm3.a.equals(str2)) {
                            aekm = aekm3;
                        }
                        String str7 = "show_privacy_policy_gdpr";
                        if (aekm3.a.equals(str7)) {
                            aekm2 = aekm3;
                        }
                        if (!(aekm == null || aekm2 == null)) {
                            ajei ajei2 = this.i;
                            jig jig2 = this.o;
                            boolean parseBoolean2 = Boolean.parseBoolean(aekm.b);
                            boolean parseBoolean3 = Boolean.parseBoolean(aekm2.b);
                            Object obj3 = jig2.c.get();
                            akcr.a(obj3, str4);
                            str4 = ((gpb) obj3).e().a.a;
                            if (str4 != null) {
                                str = str4;
                            }
                            Object e2 = jig2.a.c((ajfb) new e(jig.a(str, str2), parseBoolean2, jig.a(str, str7), parseBoolean3)).e();
                            akcr.a(e2, str3);
                            ajei2.a(e2.e());
                        }
                    }
                }
            }
        }
        this.i.a(((ftl) this.h.get()).b(jic.FULL_CONTACT_SYNC_REPEATEDLY).a(-$$Lambda$jij$0SrBHzHPRiGAZ-TigVy6ieDJF8s.INSTANCE).a(new -$$Lambda$jij$htLb1aqzt8GYReQFw5bIb2QrAUw(this)).a(-$$Lambda$jij$a4uTZXl3nKOj481fwTMr4AcRYWs.INSTANCE, -$$Lambda$jij$BRjPG_OLD77Fuz3NbQ7g94BNvjU.INSTANCE));
    }

    private void a(aemz aemz, SnapDb snapDb, DbTransaction dbTransaction) {
        if (aemz != null) {
            this.b.a(aemz, snapDb, dbTransaction);
        }
    }

    private static /* synthetic */ void b() {
    }

    private static /* synthetic */ void d(Throwable th) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x003b in {9, 10, 12} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void a(defpackage.aelz r3, com.snap.core.db.api.SnapDb r4, com.snap.core.db.api.DbTransaction r5) {
        /*
        r2 = this;
        r0 = r3.a;	 Catch:{ all -> 0x0039 }
        if (r0 == 0) goto L_0x0038;	 Catch:{ all -> 0x0039 }
        r0 = r3.a;	 Catch:{ all -> 0x0039 }
        r0 = r0.d;	 Catch:{ all -> 0x0039 }
        if (r0 == 0) goto L_0x0038;	 Catch:{ all -> 0x0039 }
        r0 = r3.a;	 Catch:{ all -> 0x0039 }
        r0 = r0.d;	 Catch:{ all -> 0x0039 }
        r2.a(r0, r4, r5);	 Catch:{ all -> 0x0039 }
        r0 = r2.a;	 Catch:{ all -> 0x0039 }
        r1 = r3.a;	 Catch:{ all -> 0x0039 }
        r1 = r1.d;	 Catch:{ all -> 0x0039 }
        r0.a(r1, r4, r5);	 Catch:{ all -> 0x0039 }
        r4 = r2.c;	 Catch:{ all -> 0x0039 }
        r4 = r4.iterator();	 Catch:{ all -> 0x0039 }
        r5 = r4.hasNext();	 Catch:{ all -> 0x0039 }
        if (r5 == 0) goto L_0x0038;	 Catch:{ all -> 0x0039 }
        r5 = r4.next();	 Catch:{ all -> 0x0039 }
        r5 = (defpackage.itr) r5;	 Catch:{ all -> 0x0039 }
        r0 = r3.a;	 Catch:{ all -> 0x0039 }
        r0 = r0.d;	 Catch:{ all -> 0x0039 }
        r0 = r0.a;	 Catch:{ all -> 0x0039 }
        r1 = "friend_feeds_updates";	 Catch:{ all -> 0x0039 }
        r5.a(r0, r1);	 Catch:{ all -> 0x0039 }
        goto L_0x0020;
        return;
        r3 = move-exception;
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jij.a(aelz, com.snap.core.db.api.SnapDb, com.snap.core.db.api.DbTransaction):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:58:0x0143 in {6, 9, 15, 18, 19, 25, 27, 39, 44, 47, 49, 51, 53, 55, 56, 57} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void applyUpdates(defpackage.aecy r27, com.snap.core.db.api.SnapDb r28, com.snap.core.db.api.DbTransaction r29) {
        /*
        r26 = this;
        r1 = r26;
        r0 = r27;
        r2 = r28;
        r3 = r29;
        r4 = r0.c;	 Catch:{ all -> 0x0141 }
        if (r4 == 0) goto L_0x00e6;	 Catch:{ all -> 0x0141 }
        r4 = r0.c;	 Catch:{ all -> 0x0141 }
        r5 = r1.b;	 Catch:{ all -> 0x0141 }
        r6 = r0.c;	 Catch:{ all -> 0x0141 }
        r7 = "updatesResponse";	 Catch:{ all -> 0x0141 }
        defpackage.akcr.b(r6, r7);	 Catch:{ all -> 0x0141 }
        r7 = "snapDb";	 Catch:{ all -> 0x0141 }
        defpackage.akcr.b(r2, r7);	 Catch:{ all -> 0x0141 }
        r7 = "tx";	 Catch:{ all -> 0x0141 }
        defpackage.akcr.b(r3, r7);	 Catch:{ all -> 0x0141 }
        r7 = r6.bk;	 Catch:{ all -> 0x0141 }
        if (r7 == 0) goto L_0x002a;	 Catch:{ all -> 0x0141 }
        r8 = com.snap.core.db.column.FriendmojiType.MUTABLE;	 Catch:{ all -> 0x0141 }
        r5.a(r7, r8, r2, r3);	 Catch:{ all -> 0x0141 }
        r7 = r6.bl;	 Catch:{ all -> 0x0141 }
        if (r7 == 0) goto L_0x0033;	 Catch:{ all -> 0x0141 }
        r8 = com.snap.core.db.column.FriendmojiType.READ_ONLY;	 Catch:{ all -> 0x0141 }
        r5.a(r7, r8, r2, r3);	 Catch:{ all -> 0x0141 }
        r6 = r6.bV;	 Catch:{ all -> 0x0141 }
        if (r6 == 0) goto L_0x0065;	 Catch:{ all -> 0x0141 }
        r28.throwIfNotDbScheduler();	 Catch:{ all -> 0x0141 }
        r6 = (java.lang.Iterable) r6;	 Catch:{ all -> 0x0141 }
        r7 = new java.util.ArrayList;	 Catch:{ all -> 0x0141 }
        r8 = 10;	 Catch:{ all -> 0x0141 }
        r8 = defpackage.ajyn.a(r6, r8);	 Catch:{ all -> 0x0141 }
        r7.<init>(r8);	 Catch:{ all -> 0x0141 }
        r7 = (java.util.Collection) r7;	 Catch:{ all -> 0x0141 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0141 }
        r8 = r6.hasNext();	 Catch:{ all -> 0x0141 }
        if (r8 == 0) goto L_0x0065;	 Catch:{ all -> 0x0141 }
        r8 = r6.next();	 Catch:{ all -> 0x0141 }
        r8 = (java.lang.String) r8;	 Catch:{ all -> 0x0141 }
        r9 = 0;	 Catch:{ all -> 0x0141 }
        r10 = com.snap.core.db.column.FriendmojiType.BLOCKED;	 Catch:{ all -> 0x0141 }
        r5.a(r8, r9, r10, r3);	 Catch:{ all -> 0x0141 }
        r8 = defpackage.ajxw.a;	 Catch:{ all -> 0x0141 }
        r7.add(r8);	 Catch:{ all -> 0x0141 }
        goto L_0x004d;	 Catch:{ all -> 0x0141 }
        r5 = r4.a;	 Catch:{ all -> 0x0141 }
        if (r5 != 0) goto L_0x006b;	 Catch:{ all -> 0x0141 }
        r5 = 0;	 Catch:{ all -> 0x0141 }
        goto L_0x0071;	 Catch:{ all -> 0x0141 }
        r5 = r4.a;	 Catch:{ all -> 0x0141 }
        r5 = r5.size();	 Catch:{ all -> 0x0141 }
        r14 = (long) r5;	 Catch:{ all -> 0x0141 }
        r5 = r1.f;	 Catch:{ all -> 0x0141 }
        r13 = new abkq;	 Catch:{ all -> 0x0141 }
        r7 = r4.s;	 Catch:{ all -> 0x0141 }
        r8 = r4.r;	 Catch:{ all -> 0x0141 }
        r9 = r4.bE;	 Catch:{ all -> 0x0141 }
        r10 = r4.z;	 Catch:{ all -> 0x0141 }
        r11 = r4.A;	 Catch:{ all -> 0x0141 }
        r12 = r4.t;	 Catch:{ all -> 0x0141 }
        r6 = r4.w;	 Catch:{ all -> 0x0141 }
        r16 = r6;	 Catch:{ all -> 0x0141 }
        r6 = r4.L;	 Catch:{ all -> 0x0141 }
        r17 = defpackage.jij.a(r6);	 Catch:{ all -> 0x0141 }
        r6 = r4.y;	 Catch:{ all -> 0x0141 }
        r2 = r4.Y;	 Catch:{ all -> 0x0141 }
        r3 = r4.ca;	 Catch:{ all -> 0x0141 }
        r0 = r4.bJ;	 Catch:{ all -> 0x0141 }
        r1 = r4.cg;	 Catch:{ all -> 0x00e2 }
        r24 = r5;	 Catch:{ all -> 0x00e2 }
        r5 = r4.co;	 Catch:{ all -> 0x00e2 }
        r4 = r4.ch;	 Catch:{ all -> 0x00e2 }
        r18 = r6;	 Catch:{ all -> 0x00e2 }
        r6 = r13;	 Catch:{ all -> 0x00e2 }
        r25 = r13;	 Catch:{ all -> 0x00e2 }
        r13 = r16;	 Catch:{ all -> 0x00e2 }
        r19 = r14;	 Catch:{ all -> 0x00e2 }
        r14 = r17;	 Catch:{ all -> 0x00e2 }
        r15 = r18;	 Catch:{ all -> 0x00e2 }
        r16 = r19;	 Catch:{ all -> 0x00e2 }
        r18 = r2;	 Catch:{ all -> 0x00e2 }
        r19 = r3;	 Catch:{ all -> 0x00e2 }
        r20 = r0;	 Catch:{ all -> 0x00e2 }
        r21 = r1;	 Catch:{ all -> 0x00e2 }
        r22 = r5;	 Catch:{ all -> 0x00e2 }
        r23 = r4;	 Catch:{ all -> 0x00e2 }
        r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23);	 Catch:{ all -> 0x00e2 }
        r0 = r24;	 Catch:{ all -> 0x00e2 }
        r1 = r25;	 Catch:{ all -> 0x00e2 }
        r0.b(r1);	 Catch:{ all -> 0x00e2 }
        r1 = r26;
        r0 = r1.i;	 Catch:{ all -> 0x0141 }
        r2 = new -$$Lambda$jij$aem_irL49_Lna35QzX4nXdunsl8;	 Catch:{ all -> 0x0141 }
        r2.<init>(r1);	 Catch:{ all -> 0x0141 }
        r2 = defpackage.ajcx.a(r2);	 Catch:{ all -> 0x0141 }
        r3 = r1.n;	 Catch:{ all -> 0x0141 }
        r3 = r3.f();	 Catch:{ all -> 0x0141 }
        r3 = (defpackage.ajdw) r3;	 Catch:{ all -> 0x0141 }
        r2 = r2.b(r3);	 Catch:{ all -> 0x0141 }
        r2 = r2.e();	 Catch:{ all -> 0x0141 }
        r0.a(r2);	 Catch:{ all -> 0x0141 }
        goto L_0x00e6;	 Catch:{ all -> 0x0141 }
        r0 = move-exception;	 Catch:{ all -> 0x0141 }
        r1 = r26;	 Catch:{ all -> 0x0141 }
        goto L_0x0142;	 Catch:{ all -> 0x0141 }
        r0 = r27;	 Catch:{ all -> 0x0141 }
        r2 = r0.d;	 Catch:{ all -> 0x0141 }
        if (r2 == 0) goto L_0x012a;
        r2 = r0.d;	 Catch:{ all -> 0x0128 }
        r3 = r28;	 Catch:{ all -> 0x0128 }
        r4 = r29;	 Catch:{ all -> 0x0128 }
        r1.a(r2, r3, r4);	 Catch:{ all -> 0x0128 }
        r2 = r1.a;	 Catch:{ all -> 0x0126 }
        r5 = r0.d;	 Catch:{ all -> 0x0126 }
        r2.a(r5, r3, r4);	 Catch:{ all -> 0x0126 }
        r2 = r1.c;	 Catch:{ all -> 0x0124 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0124 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x0124 }
        if (r3 == 0) goto L_0x0118;	 Catch:{ all -> 0x0124 }
        r3 = r2.next();	 Catch:{ all -> 0x0124 }
        r3 = (defpackage.itr) r3;	 Catch:{ all -> 0x0124 }
        r5 = r0.d;	 Catch:{ all -> 0x0124 }
        r5 = r5.a;	 Catch:{ all -> 0x0124 }
        r6 = "all_updates";	 Catch:{ all -> 0x0124 }
        r3.a(r5, r6);	 Catch:{ all -> 0x0124 }
        goto L_0x0102;
        r2 = r0.d;	 Catch:{ all -> 0x0122 }
        if (r2 == 0) goto L_0x012a;	 Catch:{ all -> 0x0122 }
        r3 = r1.d;	 Catch:{ all -> 0x0122 }
        r3.a(r2, r4);	 Catch:{ all -> 0x0122 }
        goto L_0x012a;
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0141 }
        r0 = move-exception;	 Catch:{ all -> 0x0141 }
        throw r0;	 Catch:{ all -> 0x0141 }
        r0 = move-exception;	 Catch:{ all -> 0x0141 }
        throw r0;	 Catch:{ all -> 0x0141 }
        r0 = move-exception;	 Catch:{ all -> 0x0141 }
        throw r0;	 Catch:{ all -> 0x0141 }
        r26.a(r27);	 Catch:{ all -> 0x0141 }
        r0 = r1.i;	 Catch:{ all -> 0x0141 }
        r2 = r1.q;	 Catch:{ all -> 0x0141 }
        r2 = r2.a();	 Catch:{ all -> 0x0141 }
        r3 = defpackage.-$$Lambda$jij$SDlqhObBrRhBmIzNzJESeouaZ5Q.INSTANCE;	 Catch:{ all -> 0x0141 }
        r4 = defpackage.-$$Lambda$jij$SFdwQm1B7GNXoGwtgg1qHJrJJlY.INSTANCE;	 Catch:{ all -> 0x0141 }
        r2 = r2.a(r3, r4);	 Catch:{ all -> 0x0141 }
        r0.a(r2);	 Catch:{ all -> 0x0141 }
        return;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jij.applyUpdates(aecy, com.snap.core.db.api.SnapDb, com.snap.core.db.api.DbTransaction):void");
    }

    public final void dispose() {
        this.i.dispose();
    }

    public final boolean isDisposed() {
        return this.i.isDisposed();
    }
}
