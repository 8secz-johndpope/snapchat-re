package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.common.base.Optional;
import com.snap.core.db.column.DynamicSnapSource;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.PublisherSnapPageModel;
import com.snapchat.android.R;
import defpackage.gwr.a;
import defpackage.hgg.d;
import defpackage.hgg.e;
import defpackage.hgg.f;
import defpackage.hhv.b;
import defpackage.hog.c;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: hon */
public final class hon implements hol {
    final zfw a = zgb.a(hbn.f, "OperaNavigableProvider");
    final ajxe b;
    final hog c;
    final hge d;
    final hgg e;
    final gwb f;
    final hpv g;
    final hhu h;
    final sdu i;
    final Context j;
    private final ajxe k;
    private final Map<String, akbl<Uri, ajdx<hhh>>> l;
    private final hpg m;

    /* renamed from: hon$m */
    static final class m extends akcq implements akbk<hhv> {
        m(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (hhv) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hon$p */
    static final class p extends akcq implements akbk<hgr> {
        p(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (hgr) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hon$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: hon$n */
    static final class n extends akcs implements akbl<Uri, ajdx<hhh>> {
        private /* synthetic */ hon a;

        n(hon hon) {
            this.a = hon;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            Uri uri = (Uri) obj;
            akcr.b(uri, MessageMediaRefModel.URI);
            hon hon = this.a;
            String a = hoc.a(uri);
            String str2 = "receiver$0";
            akcr.b(uri, str2);
            String queryParameter = uri.getQueryParameter("publisher");
            akcr.b(uri, str2);
            str2 = uri.getQueryParameter("dsnap_id");
            r4 = new String[3];
            int i = 0;
            r4[0] = a;
            r4[1] = queryParameter;
            r4[2] = str2;
            Iterable<String> b = ajym.b((Object[]) r4);
            if (!((b instanceof Collection) && ((Collection) b).isEmpty())) {
                for (String str3 : b) {
                    Object obj2;
                    if (str3 != null) {
                        obj2 = 1;
                        continue;
                    } else {
                        obj2 = null;
                        continue;
                    }
                    if (obj2 == null) {
                        break;
                    }
                }
            }
            i = 1;
            if (i == 0) {
                StringBuilder stringBuilder = new StringBuilder("discover deep link (path ");
                stringBuilder.append(uri);
                stringBuilder.append(") not supported yet");
                obj = ajdx.b((Throwable) new ajxl(stringBuilder.toString()));
                str = "Single.error(NotImplemen…his) not supported yet\"))";
            } else {
                hog hog = hon.c;
                if (a == null) {
                    akcr.a();
                }
                if (queryParameter == null) {
                    akcr.a();
                }
                if (str2 == null) {
                    akcr.a();
                }
                akcr.b(a, PublisherSnapPageModel.EDITIONID);
                akcr.b(queryParameter, PublisherSnapPageModel.PUBLISHERNAME);
                akcr.b(str2, "dsnapId");
                Object f = hog.c.a(str2).b((ajdw) hog.b.g()).f(new c(hog, queryParameter, a));
                akcr.a(f, "deeplinkValidator\n      …edSnap)\n                }");
                obj = f.a((ajdw) hon.a.b()).a((ajfc) new g(hon, uri));
                str = "deepLinkStoryProcessor\n …      }\n                }";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: hon$o */
    static final class o extends akcs implements akbl<Uri, ajdx<hhh>> {
        private /* synthetic */ hon a;

        o(hon hon) {
            this.a = hon;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Uri uri = (Uri) obj;
            akcr.b(uri, MessageMediaRefModel.URI);
            String str = "Single.error(IllegalStat…d ( ${storyRowId()} ) \"))";
            String str2 = " ) ";
            String str3 = "Uri missing storyRowId ( ";
            hon hon;
            ajdx f;
            StringBuilder stringBuilder;
            if (hoc.c(uri) != null) {
                hon = this.a;
                if (hoc.c(uri) != null) {
                    str = hoc.c(uri);
                    if (str == null) {
                        akcr.a();
                    }
                    long parseLong = Long.parseLong(str);
                    hgg hgg = hon.e;
                    ajdj a = ajdx.c((Callable) new e(hgg, parseLong)).a((ajdw) hgg.a().f()).a((ajfl) f.a);
                    Object f2 = ajdx.c((Callable) new hgg.c(hgg)).b((ajdw) hgg.a().f()).a((ajdw) hgg.a().f()).f(new d(hgg, String.valueOf(parseLong)));
                    akcr.a(f2, "Single.fromCallable { fi…      }\n                }");
                    f2 = a.a((ajeb) f2);
                    akcr.a(f2, "Single.fromCallable { re…k(storyRowId.toString()))");
                    f = f2.f(new h(hon, uri));
                    str2 = "deepLinkStoryRepo.readSt…  }\n                    }";
                    akcr.a((Object) f, str2);
                    obj = igs.a(f, (akbl) new i(hon)).a((ajfc) new j(hon, uri));
                    akcr.a(obj, str2);
                    return obj;
                }
                stringBuilder = new StringBuilder(str3);
                stringBuilder.append(hoc.c(uri));
                stringBuilder.append(str2);
                obj = ajdx.b((Throwable) new IllegalStateException(stringBuilder.toString()));
                akcr.a(obj, str);
                return obj;
            }
            hon = this.a;
            if (hoc.f(uri) != null) {
                f = hon.g.a(new hpw(afnd.DISCOVER, 1, hiy.a(hoc.f(uri)), null)).a(2).b((ajdw) hon.a.g()).a((ajdw) hon.a.b()).c((ajfb) new b(uri)).d((ajfb) new c(hon)).a((ajfc) new d(hon));
                akcr.a((Object) f, "storiesNetworkApi.lookup…! }\n                    }");
                obj = igs.a(f, (akbl) new e(hon)).a((ajfc) new f(hon, uri));
                akcr.a(obj, "storiesNetworkApi.lookup…  }\n                    }");
                return obj;
            }
            stringBuilder = new StringBuilder(str3);
            stringBuilder.append(hoc.c(uri));
            stringBuilder.append(str2);
            obj = ajdx.b((Throwable) new IllegalStateException(stringBuilder.toString()));
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: hon$b */
    static final class b<T> implements ajfb<vim> {
        private /* synthetic */ Uri a;

        b(Uri uri) {
            this.a = uri;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: hon$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ hon a;

        c(hon hon) {
            this.a = hon;
        }

        public final /* synthetic */ void accept(Object obj) {
            hon hon = this.a;
            String string = hon.j.getString(R.string.story_notification_content_unavailable);
            akcr.a((Object) string, "context.getString(R.stri…tion_content_unavailable)");
            hon.i.b(sdt.a(new seg(string, null, 14)).h("STATUS_BAR").a(sec.STATUS_BAR).a());
        }
    }

    /* renamed from: hon$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ hon a;

        d(hon hon) {
            this.a = hon;
        }

        public final /* synthetic */ Object apply(Object obj) {
            vim vim = (vim) obj;
            akcr.b(vim, "storyLookupResponse");
            obj = vim.a;
            akcr.a(obj, "storyCard");
            obj.q();
            obj.o();
            Object c = obj.c();
            akcr.a(c, "storyCard.storyId");
            Object obj2 = obj.j().a;
            akcr.a(obj2, "storyCard.publicUserStoryCard.metadata");
            String b = obj2.b();
            Object obj3 = obj.j().b;
            akcr.a(obj3, "storyCard.publicUserStoryCard.snaps");
            return this.a.f.a(ajzl.a(ajxs.a(obj.c(), a.a(c, b, ajyh.a((Object[]) obj3), true, DynamicSnapSource.PUBLIC_USER))), FeatureType.DISCOVER_FEED).f(new ajfc<T, R>(this) {
                private /* synthetic */ d a;

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((List) obj, "it");
                    hon hon = this.a.a;
                    vii vii = obj;
                    akcr.a((Object) vii, "storyCard");
                    hjx a = hon.m.a(vii, vdi.a(vii.d), "", true, "", hje.b, null);
                    if (a == null) {
                        akcr.a();
                    }
                    return a;
                }
            });
        }
    }

    /* renamed from: hon$f */
    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ Uri a;
        private /* synthetic */ hon b;

        f(hon hon, Uri uri) {
            this.b = hon;
            this.a = uri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final hjx hjx = (hjx) obj;
            akcr.b(hjx, "notificationStory");
            return this.b.b().a(hje.b).f(new ajfc<T, R>(this) {
                private /* synthetic */ f a;

                public final /* synthetic */ Object apply(Object obj) {
                    znh znh = (znh) obj;
                    akcr.b(znh, "it");
                    Object obj2 = hjx;
                    akcr.a(obj2, "notificationStory");
                    return new hhh(obj2, znh.a() == 0 ? ajyl.a(hjx) : ajyu.l(znh), SystemClock.elapsedRealtime(), hoc.h(this.a.a));
                }
            });
        }
    }

    /* renamed from: hon$g */
    static final class g<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ hon a;
        final /* synthetic */ Uri b;

        /* renamed from: hon$g$1 */
        static final class 1<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ g a;

            1(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Long l = (Long) obj;
                akcr.b(l, "storyRowId");
                hjx hjx = (hjx) this.a.a.d.b.get(Long.valueOf(l.longValue()));
                if (hjx != null) {
                    ajdx b = ajdx.b(new hhh(hjx, ajyl.a(hjx), SystemClock.elapsedRealtime()));
                    if (b != null) {
                        return b;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder("Failed to locate deeplink story ");
                stringBuilder.append(this.a.b.getPath());
                return ajdx.b((Throwable) new IllegalStateException(stringBuilder.toString()));
            }
        }

        g(hon hon, Uri uri) {
            this.a = hon;
            this.b = uri;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:68:0x01b8 in {3, 9, 10, 12, 13, 16, 22, 23, 25, 26, 27, 30, 31, 34, 37, 40, 43, 46, 49, 52, 55, 58, 63, 65, 67} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r15) {
            /*
            r14 = this;
            r15 = (defpackage.ajxm) r15;
            r0 = "<name for destructuring parameter 0>";
            defpackage.akcr.b(r15, r0);
            r0 = r15.a;
            r0 = (defpackage.agll) r0;
            r15 = r15.b;
            r15 = (defpackage.vhr) r15;
            r1 = new vcy;
            r1.<init>();
            r2 = 16;
            r1.a(r2);
            r2 = r0.h;
            r1.a(r2);
            r2 = 0;
            r1.a(r2);
            r2 = r14.a;
            r2 = r2.c;
            r3 = "sharedChannel";
            defpackage.akcr.b(r0, r3);
            r3 = "sharedSnap";
            defpackage.akcr.b(r15, r3);
            r3 = "compositeStoryId";
            defpackage.akcr.b(r1, r3);
            r3 = new vii;
            r3.<init>();
            r3.d = r1;
            r4 = r3.c();
            r3.a(r4);
            r4 = new java.util.ArrayList;
            r4.<init>();
            r4 = (java.util.List) r4;
            r5 = r0.q;
            r6 = "response.dsnapsData";
            defpackage.akcr.a(r5, r6);
            r5 = (java.lang.Iterable) r5;
            r6 = new java.util.ArrayList;
            r7 = 10;
            r7 = defpackage.ajyn.a(r5, r7);
            r6.<init>(r7);
            r6 = (java.util.Collection) r6;
            r5 = r5.iterator();
            r7 = r5.hasNext();
            if (r7 == 0) goto L_0x0082;
            r7 = r5.next();
            r7 = (defpackage.agly) r7;
            r8 = "it";
            defpackage.akcr.a(r7, r8);
            r8 = defpackage.hog.a(r0);
            r7 = defpackage.hog.a(r7, r8);
            r6.add(r7);
            goto L_0x0065;
            r6 = (java.util.List) r6;
            r6 = (java.util.Collection) r6;
            r4.addAll(r6);
            r5 = r4;
            r5 = (java.lang.Iterable) r5;
            r5 = r5.iterator();
            r6 = r5.hasNext();
            r7 = 0;
            r8 = 1;
            if (r6 == 0) goto L_0x00b1;
            r6 = r5.next();
            r9 = r6;
            r9 = (defpackage.vhr) r9;
            r9 = r9.d();
            r11 = r15.d();
            r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
            if (r13 != 0) goto L_0x00ad;
            r9 = 1;
            goto L_0x00ae;
            r9 = 0;
            if (r9 == 0) goto L_0x0090;
            goto L_0x00b2;
            r6 = 0;
            r6 = (defpackage.vhr) r6;
            if (r6 != 0) goto L_0x00bd;
            r5 = r4.add(r15);
            java.lang.Boolean.valueOf(r5);
            r5 = r4.iterator();
            r6 = 0;
            r9 = r5.hasNext();
            if (r9 == 0) goto L_0x00e3;
            r9 = r5.next();
            r9 = (defpackage.vhr) r9;
            r9 = r9.d();
            r11 = r15.d();
            r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
            if (r13 != 0) goto L_0x00dc;
            r9 = 1;
            goto L_0x00dd;
            r9 = 0;
            if (r9 == 0) goto L_0x00e0;
            goto L_0x00e4;
            r6 = r6 + 1;
            goto L_0x00c2;
            r6 = -1;
            r5 = -r6;
            java.util.Collections.rotate(r4, r5);
            r5 = new vht;
            r5.<init>();
            r9 = r5.a();
            r5.a(r9);
            r6 = r0.Q;
            if (r6 == 0) goto L_0x00fd;
            r6 = r6.booleanValue();
            goto L_0x00fe;
            r6 = 1;
            r5.a(r6);
            r6 = new vhp;
            r6.<init>();
            r6.a(r8);
            r8 = r0.N;
            if (r8 == 0) goto L_0x0116;
            r8 = (java.lang.Number) r8;
            r8 = r8.longValue();
            r6.a(r8);
            r8 = r0.e;
            if (r8 == 0) goto L_0x011d;
            r6.a(r8);
            r8 = r0.e;
            if (r8 == 0) goto L_0x0124;
            r6.b(r8);
            r8 = r0.f;
            if (r8 == 0) goto L_0x012b;
            r6.c(r8);
            r8 = r0.i;
            if (r8 == 0) goto L_0x0132;
            r6.g(r8);
            r8 = r0.P;
            if (r8 == 0) goto L_0x0139;
            r6.d(r8);
            r8 = r0.x;
            if (r8 == 0) goto L_0x0140;
            r6.h(r8);
            r8 = r0.h;
            if (r8 == 0) goto L_0x0147;
            r6.e(r8);
            r8 = r0.g;
            if (r8 == 0) goto L_0x014e;
            r6.f(r8);
            r5.b = r6;
            r6 = new vhs;
            r6.<init>();
            r4 = (java.util.Collection) r4;
            r7 = new defpackage.vhr[r7];
            r4 = r4.toArray(r7);
            if (r4 == 0) goto L_0x01b0;
            r4 = (defpackage.vhr[]) r4;
            r6.b = r4;
            r4 = r0.h;
            r6.a(r4);
            r5.e = r6;
            r0 = r0.p;
            if (r0 == 0) goto L_0x0175;
            r6 = java.lang.Long.parseLong(r0);
            r5.b(r6);
            r3.a(r5);
            r0 = defpackage.vdi.a(r1);
            r1 = "RankingLoggingUtils.comp…oItemId(compositeStoryId)";
            defpackage.akcr.a(r0, r1);
            r1 = r2.e;
            r4 = r2.a;
            r1 = r1.a(r0, r4);
            r4 = new hog$a;
            r4.<init>(r2, r0, r3);
            r4 = (defpackage.ajfc) r4;
            r1 = r1.a(r4);
            r4 = new hog$b;
            r4.<init>(r2, r3, r0, r15);
            r4 = (defpackage.ajfb) r4;
            r15 = r1.c(r4);
            r0 = "publisherStorySnapMediaR…snapId)\n                }";
            defpackage.akcr.a(r15, r0);
            r0 = new hon$g$1;
            r0.<init>(r14);
            r0 = (defpackage.ajfc) r0;
            r15 = r15.a(r0);
            return r15;
            r15 = new ajxt;
            r0 = "null cannot be cast to non-null type kotlin.Array<T>";
            r15.<init>(r0);
            throw r15;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hon$g.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: hon$h */
    static final class h<T, R> implements ajfc<T, R> {
        private /* synthetic */ hon a;
        private /* synthetic */ Uri b;

        h(hon hon, Uri uri) {
            this.a = hon;
            this.b = uri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "cachedCard");
            vii vii = (vii) optional.orNull();
            if (vii != null) {
                hon hon = this.a;
                akcr.a((Object) vii, "it");
                obj = hon.m.a(vii, vdi.a(vii.d), "", true, "", hje.b, null);
            } else {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
            StringBuilder stringBuilder = new StringBuilder("Failed to locate deeplink story ");
            stringBuilder.append(this.b.getPath());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: hon$j */
    static final class j<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ Uri a;
        private /* synthetic */ hon b;

        j(hon hon, Uri uri) {
            this.b = hon;
            this.a = uri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final hjx hjx = (hjx) obj;
            akcr.b(hjx, "notificationStory");
            return this.b.b().a(hje.b).f(new ajfc<T, R>(this) {
                private /* synthetic */ j a;

                public final /* synthetic */ Object apply(Object obj) {
                    znh znh = (znh) obj;
                    akcr.b(znh, "it");
                    Object obj2 = hjx;
                    akcr.a(obj2, "notificationStory");
                    return new hhh(obj2, znh.a() == 0 ? ajyl.a(hjx) : ajyu.l(znh), SystemClock.elapsedRealtime(), hoc.h(this.a.a));
                }
            });
        }
    }

    /* renamed from: hon$k */
    static final class k<T, R> implements ajfc<T, R> {
        private /* synthetic */ hon a;
        private /* synthetic */ Uri b;

        k(hon hon, Uri uri) {
            this.a = hon;
            this.b = uri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            hhh hhh = (hhh) obj;
            akcr.b(hhh, "it");
            hhv hhv = (hhv) this.a.b.b();
            hhu hhu = this.a.h;
            Uri uri = this.b;
            akcr.b(uri, "receiver$0");
            String queryParameter = uri.getQueryParameter("from_in_app_notif");
            return hhv.a(null, hhu, queryParameter != null ? Boolean.parseBoolean(queryParameter) : false ? b.IN_APP_NOTIFICATION : b.SYSTEM_NOTIFICATION, aahb.DEEPLINK, new hho(SystemClock.elapsedRealtime()), hhh, hhh.a.a().g().k());
        }
    }

    /* renamed from: hon$l */
    static final class l<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final l a = new l();

        l() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            hhv.a aVar = (hhv.a) obj;
            akcr.b(aVar, "it");
            return aVar.b();
        }
    }

    /* renamed from: hon$e */
    static final class e extends akcs implements akbl<hjx, ajcx> {
        private /* synthetic */ hon a;

        e(hon hon) {
            this.a = hon;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            hjx hjx = (hjx) obj;
            hon hon = this.a;
            akcr.a((Object) hjx, "it");
            return hon.b().a(hje.b, hjx);
        }
    }

    /* renamed from: hon$i */
    static final class i extends akcs implements akbl<hjx, ajcx> {
        private /* synthetic */ hon a;

        i(hon hon) {
            this.a = hon;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            hjx hjx = (hjx) obj;
            hon hon = this.a;
            akcr.a((Object) hjx, "it");
            return hon.b().a(hje.b, hjx);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hon.class), "operaLauncher", "getOperaLauncher()Lcom/snap/discoverfeed/dependency/StoriesFullscreenViewerLauncher;"), new akdc(akde.a(hon.class), "storiesRepo", "getStoriesRepo()Lcom/snap/discoverfeed/data/DiscoverFeedStoriesRepo;")};
        a aVar = new a();
    }

    public hon(ajwy<zgb> ajwy, ajwy<hhv> ajwy2, ajwy<hgr> ajwy3, hog hog, hge hge, hgg hgg, gwb gwb, hpv hpv, hpg hpg, hhu hhu, sdu sdu, Context context) {
        akcr.b(ajwy, "schedulersProvider");
        akcr.b(ajwy2, "storiesFullscreenViewerLauncherProvider");
        akcr.b(ajwy3, "discoverFeedStoriesRepo");
        akcr.b(hog, "deepLinkStoryProcessor");
        akcr.b(hge, "deepLinkStoryCache");
        akcr.b(hgg, "deepLinkStoryRepo");
        akcr.b(gwb, "dynamicStorySnapMediaRepository");
        akcr.b(hpv, "storiesNetworkApi");
        akcr.b(hpg, "clientModelFactory");
        akcr.b(hhu, "storiesAnalytics");
        akcr.b(sdu, "notificationEmitter");
        akcr.b(context, "context");
        this.c = hog;
        this.d = hge;
        this.e = hgg;
        this.f = gwb;
        this.g = hpv;
        this.m = hpg;
        this.h = hhu;
        this.i = sdu;
        this.j = context;
        ajwy.get();
        this.b = ajxh.a(new m(ajwy2));
        this.k = ajxh.a(new p(ajwy3));
        r2 = new ajxm[2];
        r2[0] = ajxs.a("edition", new n(this));
        r2[1] = ajxs.a("notification", new o(this));
        this.l = ajzm.a(r2);
    }

    public final int a() {
        return 1;
    }

    public final boolean a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object pathSegments = uri.getPathSegments();
        akcr.a(pathSegments, "uri.pathSegments");
        String str = (String) ajyu.g((List) pathSegments);
        return str == null ? false : this.l.containsKey(str);
    }

    public final ajdx<acig<zjm, zjk>> b(Uri uri) {
        Object a;
        akcr.b(uri, MessageMediaRefModel.URI);
        Object pathSegments = uri.getPathSegments();
        akcr.a(pathSegments, "uri.pathSegments");
        String str = (String) ajyu.g((List) pathSegments);
        if (str == null) {
            a = ajvo.a(ajsn.a);
            str = "Single.never()";
        } else {
            akbl akbl = (akbl) this.l.get(str);
            if (akbl == null) {
                StringBuilder stringBuilder = new StringBuilder("discover deep link (path ");
                stringBuilder.append(this);
                stringBuilder.append(") not supported yet");
                a = ajdx.b((Throwable) new ajxl(stringBuilder.toString()));
                str = "Single.error(NotImplemen…his) not supported yet\"))";
            } else {
                a = ((ajdx) akbl.invoke(uri)).a((ajdw) this.a.b()).f(new k(this, uri)).a((ajdw) this.a.l()).a((ajfc) l.a);
                str = "bundleProvider.invoke(ur…ap { it.launchNavigable }";
            }
        }
        akcr.a(a, str);
        return a;
    }

    /* Access modifiers changed, original: final */
    public final hgr b() {
        return (hgr) this.k.b();
    }
}
