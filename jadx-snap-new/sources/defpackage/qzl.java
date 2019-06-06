package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;
import java.util.Set;

/* renamed from: qzl */
public final class qzl {
    static final List<sec> d = ajym.b((Object[]) new sec[]{sec.CHAT_REPLY, sec.TYPING});
    static final Set<sec> e = ajzt.a((Object[]) new sec[]{sec.FAILED_SNAP_AND_CHAT, sec.CONNECTIVITY, sec.INITIATE_AUDIO, sec.INITIATE_VIDEO, sec.MISCHIEF_INITIATE_AUDIO, sec.MISCHIEF_INITIATE_VIDEO, sec.COGNAC_INITIATE_INVITE, sec.STORY_NOTIFICATION_RECEIVED, sec.SPECTACLES_ERROR_REPORT, sec.DEBUG_GENERAL});
    public RecyclerView a;
    public final b b = new b(this);
    public sdm c;

    /* renamed from: qzl$a */
    static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: qzl$b */
    public static final class b implements sdl {
        private /* synthetic */ qzl b;

        b(qzl qzl) {
            this.b = qzl;
        }

        /* JADX WARNING: Missing block: B:20:0x004e, code skipped:
            if (r5 == null) goto L_0x0059;
     */
        /* JADX WARNING: Missing block: B:24:0x005a, code skipped:
            if (r0 != null) goto L_0x005c;
     */
        public final defpackage.sdl.a evaluateNotification(defpackage.sdr r5) {
            /*
            r4 = this;
            r0 = "notificationDisplayModel";
            defpackage.akcr.b(r5, r0);
            r1 = r4.b;
            defpackage.akcr.b(r5, r0);
            r0 = defpackage.qzl.e;
            r2 = r5.b;
            r0 = r0.contains(r2);
            if (r0 != 0) goto L_0x005f;
        L_0x0014:
            r0 = defpackage.qzl.d;
            r5 = r5.b;
            r5 = r0.contains(r5);
            if (r5 != 0) goto L_0x005c;
        L_0x001e:
            r5 = r1;
            r5 = (defpackage.qzl) r5;
            r5 = r5.a;
            r0 = 1;
            r2 = 0;
            if (r5 == 0) goto L_0x0059;
        L_0x0027:
            r5 = r1.a;
            r3 = "recyclerView";
            if (r5 != 0) goto L_0x0030;
        L_0x002d:
            defpackage.akcr.a(r3);
        L_0x0030:
            r5 = r5.getLayoutManager();
            if (r5 == 0) goto L_0x0051;
        L_0x0036:
            r5 = (android.support.v7.widget.LinearLayoutManager) r5;
            r5 = r5.getChildAt(r2);
            if (r5 == 0) goto L_0x004d;
        L_0x003e:
            r1 = r1.a;
            if (r1 != 0) goto L_0x0045;
        L_0x0042:
            defpackage.akcr.a(r3);
        L_0x0045:
            r5 = r1.getChildAdapterPosition(r5);
            if (r5 > r0) goto L_0x004d;
        L_0x004b:
            r5 = 1;
            goto L_0x004e;
        L_0x004d:
            r5 = 0;
        L_0x004e:
            if (r5 == 0) goto L_0x0059;
        L_0x0050:
            goto L_0x005a;
        L_0x0051:
            r5 = new ajxt;
            r0 = "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager";
            r5.<init>(r0);
            throw r5;
        L_0x0059:
            r0 = 0;
        L_0x005a:
            if (r0 == 0) goto L_0x005f;
        L_0x005c:
            r5 = defpackage.sdl.a.DROP;
            return r5;
        L_0x005f:
            r5 = defpackage.sdl.a.DISPLAY;
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qzl$b.evaluateNotification(sdr):sdl$a");
        }
    }

    static {
        a aVar = new a();
    }

    public qzl(sdm sdm) {
        akcr.b(sdm, "inAppNotificationPolicySetter");
        this.c = sdm;
    }
}
