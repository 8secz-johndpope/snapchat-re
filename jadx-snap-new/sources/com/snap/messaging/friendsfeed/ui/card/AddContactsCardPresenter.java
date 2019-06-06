package com.snap.messaging.friendsfeed.ui.card;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.snap.ui.avatar.AvatarCache;
import defpackage.ajxe;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akqq;
import defpackage.iqs;
import defpackage.isj;
import defpackage.ite;
import defpackage.j;
import defpackage.j.a;
import defpackage.k;
import defpackage.rbc;
import defpackage.rdh;
import defpackage.s;
import defpackage.ypo;
import defpackage.zfw;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zlm;
import defpackage.zmh;
import defpackage.zms;
import org.greenrobot.eventbus.ThreadMode;

public class AddContactsCardPresenter extends zll<zlm> implements k {
    private final zfw a;
    private rbc b;
    private zms c;
    private zkf d;
    private zmh e;
    private final ajxe f;
    private final ajxe g;
    private final AvatarCache h;
    private final iqs i;
    private final ypo j;

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(AddContactsCardPresenter.class), "contactsOnSnapchat", "getContactsOnSnapchat()Lio/reactivex/Observable;"), new akdc(akde.a(AddContactsCardPresenter.class), "dividerItemDecoration", "getDividerItemDecoration()Lcom/snap/messaging/friendsfeed/ui/view/OptionalDividerItemDecoration;")};
    }

    private final Context a() {
        zlm zlm = (zlm) getTarget();
        return zlm != null ? zlm.d() : null;
    }

    public void dropTarget() {
        zlm zlm = (zlm) getTarget();
        if (zlm != null) {
            j lifecycle = zlm.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAddFriendEvent(isj isj) {
        akcr.b(isj, "event");
        this.i.a(isj);
    }

    @s(a = a.ON_START)
    public final void onFragmentStart() {
        zlm zlm = (zlm) getTarget();
        RecyclerView a = zlm != null ? zlm.a() : null;
        if (a == null) {
            akcr.a();
        }
        if (a.getAdapter() == null) {
            zmh zmh = this.e;
            if (zmh == null) {
                akcr.a("adapter");
            }
            a.setAdapter(zmh);
            rdh rdh = (rdh) this.g.b();
            if (rdh == null) {
                akcr.a();
            }
            a.addItemDecoration(rdh);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onStartReplyCameraEvent(ite ite) {
        akcr.b(ite, "event");
        this.i.a(ite);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ff  */
    public /* synthetic */ void takeTarget(java.lang.Object r26) {
        /*
        r25 = this;
        r7 = r25;
        r8 = r26;
        r8 = (defpackage.zlm) r8;
        r0 = "target";
        defpackage.akcr.b(r8, r0);
        super.takeTarget(r8);
        r0 = new rbc;
        r1 = r7.h;
        r2 = r7.a;
        r0.<init>(r1, r2);
        r1 = r0;
        r1 = (defpackage.ajej) r1;
        r9 = r7;
        r9 = (defpackage.zln) r9;
        r3 = 0;
        r4 = 0;
        r5 = 6;
        r6 = 0;
        r0 = r25;
        r2 = r9;
        r0 = defpackage.zln.bindTo$default(r0, r1, r2, r3, r4, r5, r6);
        r0 = (defpackage.rbc) r0;
        r7.b = r0;
        r0 = new zms;
        r1 = r7.b;
        if (r1 != 0) goto L_0x0037;
    L_0x0032:
        r2 = "bindingContext";
        defpackage.akcr.a(r2);
    L_0x0037:
        r1 = (defpackage.zlx) r1;
        r2 = defpackage.ras.class;
        r0.<init>(r1, r2);
        r7.c = r0;
        r0 = new zkf;
        r0.<init>();
        r1 = r0;
        r1 = (defpackage.ajej) r1;
        r3 = 0;
        r4 = 0;
        r5 = 6;
        r6 = 0;
        r0 = r25;
        r2 = r9;
        r0 = defpackage.zln.bindTo$default(r0, r1, r2, r3, r4, r5, r6);
        r0 = (defpackage.zkf) r0;
        r7.d = r0;
        r0 = r8.getLifecycle();
        r1 = r7;
        r1 = (defpackage.k) r1;
        r0.a(r1);
        r0 = new zmh;
        r11 = r7.c;
        if (r11 != 0) goto L_0x006c;
    L_0x0067:
        r1 = "viewFactory";
        defpackage.akcr.a(r1);
    L_0x006c:
        r1 = r7.d;
        if (r1 != 0) goto L_0x0075;
    L_0x0070:
        r2 = "bus";
        defpackage.akcr.a(r2);
    L_0x0075:
        r12 = r1.a();
        r1 = "bus.eventDispatcher";
        defpackage.akcr.a(r12, r1);
        r1 = r7.a;
        r1 = r1.b();
        r13 = r1;
        r13 = (defpackage.ajdw) r13;
        r1 = r7.a;
        r1 = r1.l();
        r1 = (defpackage.zfr) r1;
        r14 = r1;
        r14 = (defpackage.ajdw) r14;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r15 = r1;
        r15 = (java.util.List) r15;
        r1 = new jsm;
        r2 = r7.f;
        r2 = r2.b();
        r17 = r2;
        r17 = (defpackage.ajdp) r17;
        r2 = defpackage.qxo.b;
        r18 = r2.getPage();
        r2 = defpackage.qxo.b;
        r19 = r2.getName();
        r2 = r25.a();
        r3 = 0;
        if (r2 == 0) goto L_0x00c9;
    L_0x00b9:
        r2 = r2.getResources();
        if (r2 == 0) goto L_0x00c9;
    L_0x00bf:
        r4 = 2131887228; // 0x7f12047c float:1.9409057E38 double:1.05329224E-314;
        r2 = r2.getString(r4);
        r20 = r2;
        goto L_0x00cb;
    L_0x00c9:
        r20 = r3;
    L_0x00cb:
        r21 = defpackage.iqt.FRIENDS_FEED;
        r22 = defpackage.ith.CONTACT_LIST_ON_FRIENDS_FEED;
        r2 = r25.a();
        if (r2 == 0) goto L_0x00e5;
    L_0x00d5:
        r2 = r2.getResources();
        if (r2 == 0) goto L_0x00e5;
    L_0x00db:
        r3 = 2131887254; // 0x7f120496 float:1.940911E38 double:1.053292253E-314;
        r2 = r2.getString(r3);
        r23 = r2;
        goto L_0x00e7;
    L_0x00e5:
        r23 = r3;
    L_0x00e7:
        r2 = r7.j;
        r16 = r1;
        r24 = r2;
        r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24);
        r15.add(r1);
        r16 = 32;
        r10 = r0;
        r10.<init>(r11, r12, r13, r14, r15, r16);
        r7.e = r0;
        r0 = r7.e;
        if (r0 != 0) goto L_0x0104;
    L_0x00ff:
        r1 = "adapter";
        defpackage.akcr.a(r1);
    L_0x0104:
        r1 = r0.e();
        r3 = 0;
        r4 = 0;
        r5 = 6;
        r6 = 0;
        r0 = r25;
        r2 = r9;
        defpackage.zln.bindTo$default(r0, r1, r2, r3, r4, r5, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.friendsfeed.ui.card.AddContactsCardPresenter.takeTarget(java.lang.Object):void");
    }
}
