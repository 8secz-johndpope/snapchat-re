package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import com.snap.ui.avatar.Avatar;
import com.snap.ui.avatar.AvatarCache;
import com.snap.ui.avatar.AvatarView;
import com.snap.ui.view.TakeSnapButton;
import com.snapchat.android.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: acnp */
public final class acnp implements acot {
    private final float a = 0.13f;
    private LinearLayout b;
    private cgj c;
    private final View d;
    private final long e;
    private final String f;
    private final List<alhq> g;
    private final String h;
    private final nbo i;
    private final AvatarCache j;
    private final zfw k;

    /* renamed from: acnp$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acnp$b */
    public static final class b implements akbw<Long, List<? extends Avatar>, ajxw> {
        private final WeakReference<AvatarView> a;

        public b(WeakReference<AvatarView> weakReference) {
            akcr.b(weakReference, "avatarRef");
            this.a = weakReference;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ((Number) obj).longValue();
            List list = (List) obj2;
            akcr.b(list, "avatars");
            Object obj3 = (AvatarView) this.a.get();
            if (obj3 != null) {
                akcr.a(obj3, "avatarRef.get() ?: return");
                AvatarView.setAvatarsInfo$default(obj3, list, null, false, false, adcw.a(), 14, null);
            }
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public acnp(View view, long j, String str, List<alhq> list, String str2, nbo nbo, AvatarCache avatarCache, zfw zfw) {
        akcr.b(view, "mapContainer");
        akcr.b(str, "displayName");
        akcr.b(list, "friendLocations");
        akcr.b(str2, "ownUserId");
        akcr.b(nbo, "friendLocationManager");
        akcr.b(avatarCache, "avatarCache");
        akcr.b(zfw, "schedulers");
        this.d = view;
        this.e = j;
        this.f = str;
        this.g = list;
        this.h = str2;
        this.i = nbo;
        this.j = avatarCache;
        this.k = zfw;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x00d6 in {6, 14, 17, 18, 20, 22, 24} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final android.view.View a(android.view.ViewGroup r11, android.view.LayoutInflater r12) {
        /*
        r10 = this;
        r0 = "carouselLayout";
        defpackage.akcr.b(r11, r0);
        r0 = "layoutInflater";
        defpackage.akcr.b(r12, r0);
        r0 = 0;
        r1 = 2131559389; // 0x7f0d03dd float:1.874412E38 double:1.053130266E-314;
        r12 = r12.inflate(r1, r11, r0);
        if (r12 == 0) goto L_0x00ce;
        r12 = (android.widget.LinearLayout) r12;
        r10.b = r12;
        r1 = r12;
        r1 = (android.view.View) r1;
        r11.addView(r1);
        r11 = 2131428486; // 0x7f0b0486 float:1.8478618E38 double:1.0530655915E-314;
        r11 = r12.findViewById(r11);
        r11 = (android.widget.TextView) r11;
        r2 = "friendName";
        defpackage.akcr.a(r11, r2);
        r2 = r10.f;
        r2 = (java.lang.CharSequence) r2;
        r11.setText(r2);
        r11 = 2131428514; // 0x7f0b04a2 float:1.8478675E38 double:1.0530656053E-314;
        r11 = r12.findViewById(r11);
        r11 = (android.widget.TextView) r11;
        r2 = r10.g;
        r3 = r10.h;
        r2 = (java.lang.Iterable) r2;
        r4 = r2 instanceof java.util.Collection;
        r5 = 1;
        if (r4 == 0) goto L_0x0052;
        r4 = r2;
        r4 = (java.util.Collection) r4;
        r4 = r4.isEmpty();
        if (r4 == 0) goto L_0x0052;
        r4 = 0;
        goto L_0x0076;
        r2 = r2.iterator();
        r4 = 0;
        r6 = r2.hasNext();
        if (r6 == 0) goto L_0x0076;
        r6 = r2.next();
        r6 = (defpackage.alhq) r6;
        r6 = r6.b();
        r6 = defpackage.akcr.a(r6, r3);
        r6 = r6 ^ r5;
        if (r6 == 0) goto L_0x0057;
        r4 = r4 + 1;
        if (r4 >= 0) goto L_0x0057;
        defpackage.ajym.b();
        goto L_0x0057;
        r2 = "friendTimestamp";
        if (r4 != r5) goto L_0x0096;
        defpackage.akcr.a(r11, r2);
        r2 = r12.getResources();
        r3 = 2131888271; // 0x7f12088f float:1.9411173E38 double:1.0532927555E-314;
        r5 = new java.lang.Object[r5];
        r4 = java.lang.Integer.valueOf(r4);
        r5[r0] = r4;
        r0 = r2.getString(r3, r5);
        r0 = (java.lang.CharSequence) r0;
        r11.setText(r0);
        goto L_0x00ab;
        if (r4 <= r5) goto L_0x00ab;
        defpackage.akcr.a(r11, r2);
        r2 = r12.getResources();
        r3 = 2131888272; // 0x7f120890 float:1.9411175E38 double:1.053292756E-314;
        r5 = new java.lang.Object[r5];
        r4 = java.lang.Integer.valueOf(r4);
        r5[r0] = r4;
        goto L_0x008c;
        r11 = 2131427627; // 0x7f0b012b float:1.8476876E38 double:1.053065167E-314;
        r11 = r12.findViewById(r11);
        r11 = (com.snap.ui.avatar.AvatarView) r11;
        r2 = r10.j;
        r3 = r10.e;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = r10.k;
        r12 = new acnp$b;
        r0 = new java.lang.ref.WeakReference;
        r0.<init>(r11);
        r12.<init>(r0);
        r9 = r12;
        r9 = (defpackage.akbw) r9;
        r2.loadAvatarsForFeed(r3, r5, r6, r7, r8, r9);
        return r1;
        r11 = new ajxt;
        r12 = "null cannot be cast to non-null type android.widget.LinearLayout";
        r11.<init>(r12);
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acnp.a(android.view.ViewGroup, android.view.LayoutInflater):android.view.View");
    }

    public final void a(aclg aclg) {
        akcr.b(aclg, "snapMap");
        Object j = aclg.j();
        String str = "snapMap.viewHost";
        akcr.a(j, str);
        acmj j2 = j.j();
        if (j2 != null) {
            akcr.a((Object) j2, "snapMap.viewHost.mapController ?: return");
            Object j3 = aclg.j();
            akcr.a(j3, str);
            if (j3.e()) {
                aclg.k().f();
                List a = this.i.a(this.g);
                int a2 = adby.a(this.d, null, 0.13f);
                if (a.size() == 1) {
                    j2.a(0, aclg.g().getDimensionPixelSize(R.dimen.map_host_carousel_card_height), 0, 0);
                    Object obj = a.get(0);
                    String str2 = "friendClusters[0]";
                    akcr.a(obj, str2);
                    double b = (double) ((alhm) obj).b();
                    obj = a.get(0);
                    akcr.a(obj, str2);
                    j2.a(cgo.a(b, (double) ((alhm) obj).c()), 10.0d);
                    return;
                }
                int i = a2 / 2;
                int i2 = a2 / 4;
                Rect rect = new Rect(i, a2, i, aclg.g().getDimensionPixelSize(R.dimen.map_host_carousel_card_height) + i2);
                if (this.c == null) {
                    this.c = adby.a(this.g, rect, j2, 10.0d, 18.0d).b;
                }
                if (this.c == null) {
                    this.c = adby.a(this.i, this.g);
                }
                cgj cgj = this.c;
                if (cgj != null) {
                    j2.a();
                    j2.a(0, 0, 0, 0);
                    j2.a(cgj, new Rect(i, a2, i, aclg.g().getDimensionPixelSize(R.dimen.map_host_carousel_card_height) + i2), (int) TakeSnapButton.LONG_PRESS_TIME, null);
                }
            }
        }
    }
}
