package com.snap.identity.ui.profile;

import android.support.v7.widget.RecyclerView;
import com.brightcove.player.event.Event;
import com.snap.core.db.column.FriendSuggestionPlacement;
import defpackage.ajcx;
import defpackage.ajcz;
import defpackage.ajdc;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajwl;
import defpackage.ajwm;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akqq;
import defpackage.ftl;
import defpackage.gpb;
import defpackage.igs;
import defpackage.ihh;
import defpackage.iqs;
import defpackage.iqv;
import defpackage.iqy;
import defpackage.iqz;
import defpackage.ira;
import defpackage.irc;
import defpackage.isi;
import defpackage.isj;
import defpackage.isk;
import defpackage.ism;
import defpackage.iso;
import defpackage.isq;
import defpackage.isr;
import defpackage.ist;
import defpackage.isv;
import defpackage.isw;
import defpackage.isy;
import defpackage.itc;
import defpackage.ite;
import defpackage.itm;
import defpackage.iuf;
import defpackage.ixj;
import defpackage.jkd;
import defpackage.jri;
import defpackage.jsv;
import defpackage.jtg;
import defpackage.jth;
import defpackage.usd;
import defpackage.ypo;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zln;
import defpackage.zmh;
import defpackage.zms;
import defpackage.zpd;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

public final class AddFriendsPresenterV2 extends zll<AddFriendsFragmentV2> implements defpackage.k {
    private ajwm A;
    private final ajxe B;
    private final zgb C;
    final ajxe a;
    final ajxe b;
    final ajxe c;
    final ajxe d;
    final ajxe e = ajxh.a(new u(this));
    zmh f;
    zmh g;
    final zms h = new zms(jri.class);
    final zfw i = zgb.a(irc.t.callsite("AddFriendsPresenterV2"));
    final ajwl<Integer> j;
    final ajwl<Boolean> k;
    final ajwl<Boolean> l;
    final jth m;
    final ajwl<Integer> n;
    final zpd o;
    final ihh p;
    final ajwy<jsv> q;
    final ajwy<iuf> r;
    private final ajxe s;
    private final ajxe t;
    private final ajxe u;
    private final ajxe v;
    private final ajxe w;
    private final ajxe x;
    private final ajxe y;
    private zkf z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class j<V> implements Callable<Object> {
        private /* synthetic */ AddFriendsPresenterV2 a;

        j(AddFriendsPresenterV2 addFriendsPresenterV2) {
            this.a = addFriendsPresenterV2;
        }

        /* JADX WARNING: Missing block: B:14:0x0072, code skipped:
            if (r3 == null) goto L_0x0074;
     */
        public final /* synthetic */ java.lang.Object call() {
            /*
            r49 = this;
            r0 = r49;
            r1 = r0.a;
            r1 = r1.getTarget();
            r1 = (com.snap.identity.ui.profile.AddFriendsFragmentV2) r1;
            if (r1 != 0) goto L_0x000f;
        L_0x000c:
            defpackage.akcr.a();
        L_0x000f:
            r2 = "target!!";
            defpackage.akcr.a(r1, r2);
            r1 = r1.getActivity();
            if (r1 == 0) goto L_0x0450;
        L_0x001a:
            r1 = (android.content.Context) r1;
            r3 = r0.a;
            r3 = r3.c();
            r3 = r3.a();
            r3 = java.lang.Long.valueOf(r3);
            r15 = defpackage.ajwl.i(r3);
            r3 = "BehaviorSubject.createDe…stSeenAddedMeTimestamp())";
            defpackage.akcr.a(r15, r3);
            r14 = new jrp;
            r3 = r0.a;
            r3 = r3.k;
            r3 = (defpackage.ajdp) r3;
            r4 = r0.a;
            r4 = r4.l;
            r4 = (defpackage.ajdp) r4;
            r5 = r0.a;
            r5 = r5.getTarget();
            r5 = (com.snap.identity.ui.profile.AddFriendsFragmentV2) r5;
            if (r5 != 0) goto L_0x004e;
        L_0x004b:
            defpackage.akcr.a();
        L_0x004e:
            r5 = r5.e;
            r14.<init>(r3, r4, r5);
            r13 = new ajwl;
            r13.<init>();
            r12 = "BehaviorSubject.create<Boolean>()";
            defpackage.akcr.a(r13, r12);
            r3 = r0.a;
            r3 = r3.getTarget();
            r3 = (com.snap.identity.ui.profile.AddFriendsFragmentV2) r3;
            r4 = r3 instanceof defpackage.itg;
            if (r4 != 0) goto L_0x006a;
        L_0x0069:
            r3 = 0;
        L_0x006a:
            r3 = (defpackage.itg) r3;
            if (r3 == 0) goto L_0x0074;
        L_0x006e:
            r3 = r3.b();
            if (r3 != 0) goto L_0x0076;
        L_0x0074:
            r3 = defpackage.ith.PROFILE;
        L_0x0076:
            r25 = r3;
            r11 = new jry;
            r3 = r0.a;
            r3 = r3.a();
            r5 = r3.c();
            r3 = r0.a;
            r6 = r3.j;
            r8 = defpackage.irc.a;
            r3 = defpackage.irc.t;
            r9 = r3.getName();
            r10 = defpackage.iqt.PROFILE;
            r3 = r0.a;
            r7 = r3.m;
            r3 = r0.a;
            r3 = r3.getTarget();
            r3 = (com.snap.identity.ui.profile.AddFriendsFragmentV2) r3;
            if (r3 != 0) goto L_0x00a3;
        L_0x00a0:
            defpackage.akcr.a();
        L_0x00a3:
            r4 = r3.f;
            r3 = r0.a;
            r3 = ((defpackage.ypo) r3.y.b());
            r26 = r2;
            r2 = "publicUserStoriesSyncableSection";
            defpackage.akcr.a(r3, r2);
            r16 = r3;
            r3 = r11;
            r17 = r4;
            r4 = r1;
            r18 = r7;
            r7 = r15;
            r27 = r11;
            r11 = r25;
            r28 = r1;
            r1 = r12;
            r12 = r18;
            r29 = r13;
            r30 = r14;
            r14 = r17;
            r31 = r15;
            r15 = r16;
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
            r13 = new ajwl;
            r20 = r13;
            r13.<init>();
            defpackage.akcr.a(r13, r1);
            r1 = new jut;
            r3 = r1;
            r4 = defpackage.ajhn.a;
            r4 = defpackage.ajvo.a(r4);
            r5 = r4;
            r6 = "Completable.complete()";
            defpackage.akcr.a(r4, r6);
            r4 = r0.a;
            r4 = r4.a();
            r6 = com.snap.core.db.column.FriendSuggestionPlacement.ADD_FRIENDS_FOOTER;
            r7 = "friendSuggestionPlacement";
            defpackage.akcr.b(r6, r7);
            r7 = new jkd$q;
            r7.<init>(r4, r6);
            r7 = (java.util.concurrent.Callable) r7;
            r6 = defpackage.ajdp.a(r7);
            r7 = r4.b();
            r7 = r7.i();
            r7 = (defpackage.ajdw) r7;
            r6 = r6.b(r7);
            r7 = "Observable\n             …eOn(schedulers.queries())";
            defpackage.akcr.a(r6, r7);
            r8 = r4.a();
            r8 = r8.e();
            r9 = "friendRepository.friendsWithActionsInProgress()";
            defpackage.akcr.a(r8, r9);
            r9 = defpackage.jkd.r.a;
            r9 = (defpackage.akbw) r9;
            r6 = defpackage.igs.a(r6, r8, r9);
            r4 = r4.b();
            r4 = r4.i();
            r4 = (defpackage.ajdw) r4;
            r4 = r6.a(r4);
            r6 = r4;
            defpackage.akcr.a(r4, r7);
            r4 = java.lang.Boolean.TRUE;
            r4 = defpackage.ajwl.i(r4);
            r7 = "BehaviorSubject.createDefault(true)";
            defpackage.akcr.a(r4, r7);
            r7 = r4;
            r7 = (defpackage.ajdp) r7;
            r4 = r0.a;
            r8 = r4.m;
            r4 = java.lang.Boolean.FALSE;
            r4 = defpackage.ajwl.i(r4);
            r9 = "BehaviorSubject.createDefault(false)";
            defpackage.akcr.a(r4, r9);
            r9 = r4;
            r9 = (defpackage.ajdp) r9;
            r10 = defpackage.irc.a;
            r4 = defpackage.irc.t;
            r11 = r4.getName();
            r12 = defpackage.iqt.PROFILE;
            r4 = r0.a;
            r14 = r4.i;
            r4 = r0.a;
            r4 = r4.d;
            r4 = r4.b();
            r4 = (defpackage.ftl) r4;
            r15 = r4;
            r32 = r13;
            r13 = "configurationProvider";
            defpackage.akcr.a(r4, r13);
            r4 = r0.a;
            r4 = r4.k;
            r16 = r4;
            r16 = (defpackage.ajdp) r16;
            r4 = r0.a;
            r4 = r4.l;
            r17 = r4;
            r17 = (defpackage.ajdp) r17;
            r18 = 1;
            r4 = defpackage.jri.HEADER_BLACK_LEFT;
            r19 = r4;
            r19 = (defpackage.zlv) r19;
            r21 = 0;
            r22 = 1;
            r4 = r0.a;
            r4 = ((defpackage.ypo) r4.y.b());
            r23 = r4;
            defpackage.akcr.a(r4, r2);
            r24 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
            r4 = r28;
            r28 = r32;
            r13 = r25;
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
            r3 = r0.a;
            r4 = com.snap.identity.ui.profile.AddFriendsPresenterV2.b(r3);
            r5 = r27;
            r33 = r4.a(r5);
            r4 = r0.a;
            r34 = r4;
            r34 = (defpackage.zln) r34;
            r35 = 0;
            r36 = 0;
            r37 = 6;
            r38 = 0;
            r32 = r3;
            defpackage.zln.bindTo$default(r32, r33, r34, r35, r36, r37, r38);
            r6 = r0.a;
            r3 = com.snap.identity.ui.profile.AddFriendsPresenterV2.b(r6);
            r7 = r3.a(r1);
            r3 = r0.a;
            r8 = r3;
            r8 = (defpackage.zln) r8;
            r9 = 0;
            r10 = 0;
            r11 = 6;
            r12 = 0;
            defpackage.zln.bindTo$default(r6, r7, r8, r9, r10, r11, r12);
            r3 = new jss;
            r4 = r0.a;
            r4 = r4.k;
            r4 = (defpackage.ajdp) r4;
            r6 = r0.a;
            r6 = r6.l;
            r6 = (defpackage.ajdp) r6;
            r13 = r29;
            r13 = (defpackage.ajdp) r13;
            r7 = r28;
            r7 = (defpackage.ajdp) r7;
            r3.<init>(r4, r6, r13, r7);
            r4 = r0.a;
            r13 = new zmh;
            r7 = r4.h;
            r6 = r0.a;
            r6 = com.snap.identity.ui.profile.AddFriendsPresenterV2.b(r6);
            r8 = r6.a();
            r15 = "bus.eventDispatcher";
            defpackage.akcr.a(r8, r15);
            r6 = r0.a;
            r6 = r6.i;
            r6 = r6.b();
            r9 = r6;
            r9 = (defpackage.ajdw) r9;
            r10 = defpackage.ajef.a();
            r14 = "AndroidSchedulers.mainThread()";
            defpackage.akcr.a(r10, r14);
            r6 = 5;
            r6 = new defpackage.zma[r6];
            r11 = new jtl;
            r11.<init>();
            r11 = (defpackage.zma) r11;
            r19 = 0;
            r6[r19] = r11;
            r11 = r30;
            r11 = (defpackage.zma) r11;
            r20 = 1;
            r6[r20] = r11;
            r11 = r5;
            r11 = (defpackage.zma) r11;
            r21 = 2;
            r6[r21] = r11;
            r1 = (defpackage.zma) r1;
            r5 = 3;
            r6[r5] = r1;
            r1 = 4;
            r3 = (defpackage.zma) r3;
            r6[r1] = r3;
            r11 = defpackage.ajym.b(r6);
            r12 = 32;
            r6 = r13;
            r6.<init>(r7, r8, r9, r10, r11, r12);
            r4.f = r13;
            r1 = r0.a;
            r3 = com.snap.identity.ui.profile.AddFriendsPresenterV2.c(r1);
            r33 = r3.e();
            r3 = r0.a;
            r34 = r3;
            r34 = (defpackage.zln) r34;
            r32 = r1;
            defpackage.zln.bindTo$default(r32, r33, r34, r35, r36, r37, r38);
            r1 = new jkb;
            r3 = r0.a;
            r3 = r3.getTarget();
            r3 = (com.snap.identity.ui.profile.AddFriendsFragmentV2) r3;
            if (r3 != 0) goto L_0x027c;
        L_0x0279:
            defpackage.akcr.a();
        L_0x027c:
            r4 = r26;
            defpackage.akcr.a(r3, r4);
            r3 = r3.getActivity();
            if (r3 != 0) goto L_0x028a;
        L_0x0287:
            defpackage.akcr.a();
        L_0x028a:
            r6 = "target!!.activity!!";
            defpackage.akcr.a(r3, r6);
            r3 = r3.getResources();
            r7 = "target!!.activity!!.resources";
            defpackage.akcr.a(r3, r7);
            r8 = r0.a;
            r8 = r8.getTarget();
            r8 = (com.snap.identity.ui.profile.AddFriendsFragmentV2) r8;
            if (r8 != 0) goto L_0x02a5;
        L_0x02a2:
            defpackage.akcr.a();
        L_0x02a5:
            r8 = r8.s;
            r41 = r8;
            r41 = (defpackage.ajdp) r41;
            r8 = r0.a;
            r8 = r8.n;
            r9 = r0.a;
            r9 = r9.a();
            r10 = new jkd$h;
            r10.<init>(r9);
            r10 = (java.util.concurrent.Callable) r10;
            r10 = defpackage.ajdp.a(r10);
            r9 = r9.b();
            r9 = r9.i();
            r9 = (defpackage.ajdw) r9;
            r9 = r10.b(r9);
            r10 = defpackage.ajfu.a;
            r9 = r9.j(r10);
            r10 = "Observable\n             …  .distinctUntilChanged()";
            defpackage.akcr.a(r9, r10);
            r10 = r0.a;
            r10 = r10.p;
            r11 = r0.a;
            r11 = r11.c;
            r11 = r11.b();
            r11 = (defpackage.iqz) r11;
            r12 = "friendmojiApi";
            defpackage.akcr.a(r11, r12);
            r12 = r0.a;
            r12 = r12.i;
            r13 = r0.a;
            r13 = r13.o;
            r39 = r1;
            r40 = r3;
            r42 = r8;
            r43 = r9;
            r44 = r10;
            r45 = r11;
            r46 = r12;
            r47 = r13;
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47);
            r3 = new jjz;
            r8 = r0.a;
            r8 = r8.b();
            r9 = "identityApi";
            defpackage.akcr.a(r8, r9);
            r9 = r0.a;
            r9 = r9.getTarget();
            r9 = (com.snap.identity.ui.profile.AddFriendsFragmentV2) r9;
            if (r9 != 0) goto L_0x0321;
        L_0x031e:
            defpackage.akcr.a();
        L_0x0321:
            r9 = r9.s;
            r9 = (defpackage.ajdp) r9;
            r10 = defpackage.irc.a;
            r11 = defpackage.irc.t;
            r11 = r11.getName();
            r12 = r0.a;
            r12 = r12.i;
            r13 = r0.a;
            r13 = r13.getTarget();
            r13 = (com.snap.identity.ui.profile.AddFriendsFragmentV2) r13;
            if (r13 != 0) goto L_0x033e;
        L_0x033b:
            defpackage.akcr.a();
        L_0x033e:
            defpackage.akcr.a(r13, r4);
            r4 = r13.getActivity();
            if (r4 != 0) goto L_0x034a;
        L_0x0347:
            defpackage.akcr.a();
        L_0x034a:
            defpackage.akcr.a(r4, r6);
            r13 = r4.getResources();
            defpackage.akcr.a(r13, r7);
            r4 = r0.a;
            r7 = r4.a();
            r4 = "dataProvider";
            defpackage.akcr.a(r7, r4);
            r4 = r0.a;
            r6 = r4.m;
            r4 = r0.a;
            r4 = r4.b;
            r4 = r4.b();
            r4 = (defpackage.ixj) r4;
            r5 = "friendRepository";
            defpackage.akcr.a(r4, r5);
            r5 = r0.a;
            r5 = r5.o;
            r17 = r4;
            r4 = r0.a;
            r4 = r4.a;
            r4 = r4.b();
            r4 = (defpackage.usd) r4;
            r18 = r5;
            r5 = "unifiedProfileLauncher";
            defpackage.akcr.a(r4, r5);
            r5 = r0.a;
            r5 = ((defpackage.ypo) r5.y.b());
            defpackage.akcr.a(r5, r2);
            r2 = r17;
            r17 = r4;
            r4 = r3;
            r16 = r18;
            r18 = r5;
            r5 = r8;
            r22 = r6;
            r6 = r9;
            r23 = r7;
            r7 = r10;
            r8 = r11;
            r9 = r12;
            r10 = r13;
            r11 = r23;
            r12 = r22;
            r13 = r31;
            r48 = r14;
            r14 = r2;
            r2 = r15;
            r15 = r16;
            r16 = r17;
            r17 = r18;
            r18 = r25;
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
            r4 = r0.a;
            r5 = com.snap.identity.ui.profile.AddFriendsPresenterV2.b(r4);
            r27 = r5.a(r1);
            r5 = r0.a;
            r28 = r5;
            r28 = (defpackage.zln) r28;
            r29 = 0;
            r30 = 0;
            r31 = 6;
            r32 = 0;
            r26 = r4;
            defpackage.zln.bindTo$default(r26, r27, r28, r29, r30, r31, r32);
            r5 = r0.a;
            r4 = com.snap.identity.ui.profile.AddFriendsPresenterV2.b(r5);
            r6 = r4.a(r3);
            r4 = r0.a;
            r7 = r4;
            r7 = (defpackage.zln) r7;
            r8 = 0;
            r9 = 0;
            r10 = 6;
            r11 = 0;
            defpackage.zln.bindTo$default(r5, r6, r7, r8, r9, r10, r11);
            r4 = r0.a;
            r12 = new zmh;
            r6 = r4.h;
            r5 = r0.a;
            r5 = com.snap.identity.ui.profile.AddFriendsPresenterV2.b(r5);
            r7 = r5.a();
            defpackage.akcr.a(r7, r2);
            r2 = r0.a;
            r2 = r2.i;
            r2 = r2.b();
            r8 = r2;
            r8 = (defpackage.ajdw) r8;
            r9 = defpackage.ajef.a();
            r2 = r48;
            defpackage.akcr.a(r9, r2);
            r2 = 3;
            r2 = new defpackage.zma[r2];
            r5 = new jtl;
            r5.<init>();
            r5 = (defpackage.zma) r5;
            r2[r19] = r5;
            r1 = (defpackage.zma) r1;
            r2[r20] = r1;
            r3 = (defpackage.zma) r3;
            r2[r21] = r3;
            r10 = defpackage.ajym.b(r2);
            r11 = 32;
            r5 = r12;
            r5.<init>(r6, r7, r8, r9, r10, r11);
            r4.g = r12;
            r13 = r0.a;
            r1 = com.snap.identity.ui.profile.AddFriendsPresenterV2.d(r13);
            r14 = r1.e();
            r1 = r0.a;
            r15 = r1;
            r15 = (defpackage.zln) r15;
            r16 = 0;
            r17 = 0;
            r18 = 6;
            r19 = 0;
            r1 = defpackage.zln.bindTo$default(r13, r14, r15, r16, r17, r18, r19);
            return r1;
        L_0x0450:
            r1 = new ajxt;
            r2 = "null cannot be cast to non-null type android.content.Context";
            r1.<init>(r2);
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.profile.AddFriendsPresenterV2$j.call():java.lang.Object");
        }
    }

    static final class l<T> implements ajfb<ajxm<? extends Boolean, ? extends Boolean>> {
        private /* synthetic */ AddFriendsPresenterV2 a;

        l(AddFriendsPresenterV2 addFriendsPresenterV2) {
            this.a = addFriendsPresenterV2;
        }

        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            ajxm ajxm = (ajxm) obj;
            Object obj2 = (Boolean) ajxm.a;
            obj = (Boolean) ajxm.b;
            AddFriendsPresenterV2 addFriendsPresenterV2 = this.a;
            akcr.a(obj2, "isPhoneNumberVerified");
            if (obj2.booleanValue()) {
                akcr.a(obj, "isGivenAccessToContacts");
                if (obj.booleanValue()) {
                    z = true;
                    addFriendsPresenterV2.onClickAddContacts(new isi(z));
                }
            }
            z = false;
            addFriendsPresenterV2.onClickAddContacts(new isi(z));
        }
    }

    static final class m implements ajev {
        private /* synthetic */ AddFriendsPresenterV2 a;

        m(AddFriendsPresenterV2 addFriendsPresenterV2) {
            this.a = addFriendsPresenterV2;
        }

        public final void run() {
            AddFriendsFragmentV2 addFriendsFragmentV2 = (AddFriendsFragmentV2) this.a.getTarget();
            RecyclerView recyclerView = null;
            RecyclerView a = addFriendsFragmentV2 != null ? addFriendsFragmentV2.a() : null;
            if (a == null) {
                akcr.a();
            }
            a.setAdapter(AddFriendsPresenterV2.c(this.a));
            addFriendsFragmentV2 = (AddFriendsFragmentV2) this.a.getTarget();
            if (addFriendsFragmentV2 != null) {
                recyclerView = addFriendsFragmentV2.f();
            }
            if (recyclerView == null) {
                akcr.a();
            }
            recyclerView.setAdapter(AddFriendsPresenterV2.d(this.a));
        }
    }

    static final class n implements ajev {
        public static final n a = new n();

        n() {
        }

        public final void run() {
        }
    }

    static final class o<T> implements ajfb<Throwable> {
        public static final o a = new o();

        o() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class p<T, R> implements ajfc<T, R> {
        public static final p a = new p();

        p() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, Event.LIST);
            long j = 0;
            if (!list.isEmpty()) {
                Long l = ((itm) list.get(0)).h;
                if (l != null) {
                    j = l.longValue();
                }
            }
            return Long.valueOf(j);
        }
    }

    static final class q<T> implements ajfb<Long> {
        private /* synthetic */ AddFriendsPresenterV2 a;

        q(AddFriendsPresenterV2 addFriendsPresenterV2) {
            this.a = addFriendsPresenterV2;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Long) obj;
            iqy c = this.a.c();
            akcr.a(obj, "it");
            c.a(obj.longValue(), true);
        }
    }

    static final class r<T> implements ajfb<Integer> {
        private /* synthetic */ AddFriendsPresenterV2 a;

        r(AddFriendsPresenterV2 addFriendsPresenterV2) {
            this.a = addFriendsPresenterV2;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (akcr.a(((Integer) obj).intValue(), 0) > 0) {
                this.a.c().d();
            }
        }
    }

    static final class b extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    static final class c extends akcs implements akbk<jkd> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (jkd) this.a.get();
        }
    }

    static final class d extends akcs implements akbk<iqs> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iqs) this.a.get();
        }
    }

    static final class e extends akcs implements akbk<iqv> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iqv) this.a.get();
        }
    }

    static final class f extends akcs implements akbk<ixj> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ixj) this.a.get();
        }
    }

    static final class g extends akcs implements akbk<iqy> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iqy) this.a.get();
        }
    }

    static final class h extends akcs implements akbk<iqz> {
        private /* synthetic */ ajwy a;

        h(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iqz) this.a.get();
        }
    }

    static final class i extends akcs implements akbk<ira> {
        private /* synthetic */ ajwy a;

        i(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ira) this.a.get();
        }
    }

    static final class k extends akcs implements akbl<ajcx, ajcx> {
        private /* synthetic */ AddFriendsPresenterV2 a;

        k(AddFriendsPresenterV2 addFriendsPresenterV2) {
            this.a = addFriendsPresenterV2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ajcx ajcx = (ajcx) obj;
            akcr.b(ajcx, "it");
            Object obj2 = (jsv) this.a.e.b();
            akcr.a(obj2, "showToastOnError");
            akcr.b(ajcx, "receiver$0");
            akcr.b(obj2, "toaster");
            obj = ajcx.a((ajdc) new defpackage.jsv.a(obj2));
            akcr.a(obj, "this.compose(toaster.com…ble(errorStringResource))");
            return obj;
        }
    }

    static final class s extends akcs implements akbk<ypo> {
        private /* synthetic */ ajwy a;

        s(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ypo) this.a.get();
        }
    }

    static final class t extends akcs implements akbk<ajdp<Integer>> {
        private /* synthetic */ AddFriendsPresenterV2 a;

        t(AddFriendsPresenterV2 addFriendsPresenterV2) {
            this.a = addFriendsPresenterV2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((iuf) this.a.r.get()).a().b((ajdw) this.a.i.i()).a((ajdw) this.a.i.i());
        }
    }

    static final class u extends akcs implements akbk<jsv> {
        private /* synthetic */ AddFriendsPresenterV2 a;

        u(AddFriendsPresenterV2 addFriendsPresenterV2) {
            this.a = addFriendsPresenterV2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (jsv) this.a.q.get();
        }
    }

    static final class v extends akcs implements akbk<usd> {
        private /* synthetic */ ajwy a;

        v(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (usd) this.a.get();
        }
    }

    static final class w extends akcs implements akbk<gpb> {
        private /* synthetic */ ajwy a;

        w(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gpb) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(AddFriendsPresenterV2.class), "dataProvider", "getDataProvider()Lcom/snap/identity/ui/profile/data/ProfileAddFriendsDataProvider;"), new akdc(akde.a(AddFriendsPresenterV2.class), "friendActionDispatcher", "getFriendActionDispatcher()Lcom/snap/identity/api/FriendActionDispatchInterface;"), new akdc(akde.a(AddFriendsPresenterV2.class), "friendActionProcessor", "getFriendActionProcessor()Lcom/snap/identity/api/FriendActionProcessor;"), new akdc(akde.a(AddFriendsPresenterV2.class), "identityApi", "getIdentityApi()Lcom/snap/identity/api/IdentityApi;"), new akdc(akde.a(AddFriendsPresenterV2.class), "friendingApi", "getFriendingApi()Lcom/snap/identity/api/FriendingApi;"), new akdc(akde.a(AddFriendsPresenterV2.class), "userAuth", "getUserAuth()Lcom/snap/core/store/UserAuthStore;"), new akdc(akde.a(AddFriendsPresenterV2.class), "unifiedProfileLauncher", "getUnifiedProfileLauncher()Lcom/snap/profile/api/ui/UnifiedProfileLauncher;"), new akdc(akde.a(AddFriendsPresenterV2.class), "friendRepository", "getFriendRepository()Lcom/snap/identity/db/FriendRepository;"), new akdc(akde.a(AddFriendsPresenterV2.class), "friendmojiApi", "getFriendmojiApi()Lcom/snap/identity/api/FriendmojiApi;"), new akdc(akde.a(AddFriendsPresenterV2.class), "publicUserStoriesSyncableSection", "getPublicUserStoriesSyncableSection()Lcom/snap/stories/ui/PublicUserStoriesSyncableSection;"), new akdc(akde.a(AddFriendsPresenterV2.class), "configurationProvider", "getConfigurationProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(AddFriendsPresenterV2.class), "showToastOnError", "getShowToastOnError()Lcom/snap/identity/ui/shared/error/ShowToastOnError;"), new akdc(akde.a(AddFriendsPresenterV2.class), "resurrectionBadging", "getResurrectionBadging()Lio/reactivex/Observable;")};
        a aVar = new a();
    }

    public AddFriendsPresenterV2(zgb zgb, jtg jtg, ajwy<jkd> ajwy, ajwy<iqs> ajwy2, ajwy<iqv> ajwy3, ajwy<ira> ajwy4, ajwy<iqy> ajwy5, ajwy<gpb> ajwy6, ihh ihh, ajwy<usd> ajwy7, ajwy<ixj> ajwy8, ajwy<iqz> ajwy9, ajwy<ypo> ajwy10, ajwy<ftl> ajwy11, ajwy<jsv> ajwy12, ajwy<iuf> ajwy13) {
        zgb zgb2 = zgb;
        jtg jtg2 = jtg;
        ajwy<jkd> ajwy14 = ajwy;
        ajwy<iqs> ajwy15 = ajwy2;
        ajwy<iqv> ajwy16 = ajwy3;
        ajwy<ira> ajwy17 = ajwy4;
        ajwy<iqy> ajwy18 = ajwy5;
        ajwy<gpb> ajwy19 = ajwy6;
        ihh ihh2 = ihh;
        ajwy<usd> ajwy20 = ajwy7;
        ajwy<ixj> ajwy21 = ajwy8;
        ajwy<iqz> ajwy22 = ajwy9;
        ajwy<ypo> ajwy23 = ajwy10;
        ajwy<ftl> ajwy24 = ajwy11;
        ajwy<jsv> ajwy25 = ajwy12;
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(jtg2, "addedMeAndQuickAddSeenListener");
        akcr.b(ajwy14, "addFriendsDataProvider");
        akcr.b(ajwy15, "friendActionDispatcherProvider");
        akcr.b(ajwy16, "friendActionProcessorProvider");
        akcr.b(ajwy17, "identityApiProvider");
        akcr.b(ajwy18, "friendingApiProvider");
        akcr.b(ajwy19, "userAuthProvider");
        akcr.b(ihh2, "clock");
        akcr.b(ajwy20, "unifiedProfileLauncherProvider");
        akcr.b(ajwy21, "friendRepositoryProvider");
        akcr.b(ajwy22, "friendmojiApiProvider");
        akcr.b(ajwy23, "publicUserStoriesSyncableSectionProvider");
        akcr.b(ajwy24, "configurationProviderProvider");
        akcr.b(ajwy25, "showToastOnErrorProvider");
        ajwy<iuf> ajwy26 = ajwy13;
        akcr.b(ajwy26, "resurrectionBadgeDataProvider");
        this.C = zgb2;
        this.p = ihh2;
        this.q = ajwy25;
        this.r = ajwy26;
        this.s = ajxh.a(new c(ajwy14));
        this.t = ajxh.a(new d(ajwy15));
        this.u = ajxh.a(new e(ajwy16));
        this.v = ajxh.a(new i(ajwy17));
        this.w = ajxh.a(new g(ajwy18));
        this.x = ajxh.a(new w(ajwy19));
        this.a = ajxh.a(new v(ajwy20));
        this.b = ajxh.a(new f(ajwy21));
        this.c = ajxh.a(new h(ajwy22));
        this.y = ajxh.a(new s(ajwy23));
        this.d = ajxh.a(new b(ajwy24));
        Object i = ajwl.i(Integer.valueOf(3));
        String str = "BehaviorSubject.createDe…CTION_INITIAL_ITEM_COUNT)";
        akcr.a(i, str);
        this.j = i;
        i = d();
        akcr.a(i, "userAuth");
        i = ajwl.i(Boolean.valueOf(i.a().e != null));
        akcr.a(i, "BehaviorSubject.createDe…serSession.phone != null)");
        this.k = i;
        c();
        i = ajwl.i(Boolean.FALSE);
        akcr.a(i, "BehaviorSubject.createDe…sGivenAccessToContacts())");
        this.l = i;
        this.m = new jth(FriendSuggestionPlacement.ADD_FRIENDS_FOOTER, jtg);
        i = ajwl.i(Integer.valueOf(4));
        akcr.a(i, str);
        this.n = i;
        this.o = new zpd();
        i = new ajwm();
        akcr.a(i, "CompletableSubject.create()");
        this.A = i;
        this.B = ajxh.a(new t(this));
    }

    public static final /* synthetic */ zkf b(AddFriendsPresenterV2 addFriendsPresenterV2) {
        zkf zkf = addFriendsPresenterV2.z;
        if (zkf == null) {
            akcr.a("bus");
        }
        return zkf;
    }

    public static final /* synthetic */ zmh c(AddFriendsPresenterV2 addFriendsPresenterV2) {
        zmh zmh = addFriendsPresenterV2.f;
        if (zmh == null) {
            akcr.a("adapter");
        }
        return zmh;
    }

    public static final /* synthetic */ zmh d(AddFriendsPresenterV2 addFriendsPresenterV2) {
        zmh zmh = addFriendsPresenterV2.g;
        if (zmh == null) {
            akcr.a("searchAdapter");
        }
        return zmh;
    }

    private final iqs e() {
        return (iqs) this.t.b();
    }

    /* Access modifiers changed, original: final */
    public final jkd a() {
        return (jkd) this.s.b();
    }

    /* renamed from: a */
    public final void takeTarget(AddFriendsFragmentV2 addFriendsFragmentV2) {
        akcr.b(addFriendsFragmentV2, "target");
        super.takeTarget(addFriendsFragmentV2);
        zkf zkf = new zkf();
        zln.bindTo$default(this, zkf, this, null, null, 6, null);
        this.z = zkf;
        zkf = this.z;
        if (zkf == null) {
            akcr.a("bus");
        }
        zkf.a(this);
        addFriendsFragmentV2.getLifecycle().a(this);
        ajcx b = ajcx.b((Callable) new j(this));
        akcr.a((Object) b, "Completable.fromCallable…ribe().bindTo(this)\n    }");
        igs.a(b, "initAdapterAsync").b((ajdw) this.i.h()).a((ajdw) this.i.l()).a((ajcz) this.A);
    }

    /* Access modifiers changed, original: final */
    public final ira b() {
        return (ira) this.v.b();
    }

    /* Access modifiers changed, original: final */
    public final iqy c() {
        return (iqy) this.w.b();
    }

    /* Access modifiers changed, original: final */
    public final gpb d() {
        return (gpb) this.x.b();
    }

    public final void dropTarget() {
        AddFriendsFragmentV2 addFriendsFragmentV2 = (AddFriendsFragmentV2) getTarget();
        if (addFriendsFragmentV2 != null) {
            defpackage.j lifecycle = addFriendsFragmentV2.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAddFriendEvent(isj isj) {
        akcr.b(isj, "event");
        ((iqv) this.u.b()).a(isj, (akbl) new k(this));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClickAddContacts(isi isi) {
        akcr.b(isi, "event");
        e().a(isi);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClickAddSnapcode(isk isk) {
        akcr.b(isk, "event");
        e().a(isk);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onEmptyStateAddFriendsClickEvent(ism ism) {
        akcr.b(ism, "event");
        e().a(ism);
    }

    @defpackage.s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        zln zln = this;
        zln.bindTo$default(this, this.A.g(new m(this)), zln, null, null, 6, null);
        zln zln2 = zln;
        zln.bindTo$default(this, b().c().a((ajev) n.a, (ajfb) o.a), zln2, null, null, 6, null);
        this.m.b();
        zln.bindTo$default(this, a().c().p(p.a).f((ajfb) new q(this)), zln2, null, null, 6, null);
        zln.bindTo$default(this, ((ajdp) this.B.b()).f((ajfb) new r(this)), zln2, null, null, 6, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendClickAvatarIconEvent(iso iso) {
        akcr.b(iso, "event");
        e().a(iso);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendItemLongPressEvent(isq isq) {
        akcr.b(isq, "event");
        e().a(isq);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendLongClickEvent(isr isr) {
        akcr.b(isr, "event");
        e().a(isr);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onHideFriendEvent(ist ist) {
        akcr.b(ist, "event");
        e().a(ist);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onIgnoreFriendEvent(isv isv) {
        akcr.b(isv, "event");
        e().a(isv);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onInviteFriendEvent(isw isw) {
        akcr.b(isw, "event");
        e().a(isw);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onLaunchChatPageEvent(isy isy) {
        akcr.b(isy, "event");
        e().a(isy);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onRemoveFriendEvent(itc itc) {
        akcr.b(itc, "event");
        e().a(itc);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onStartReplyCameraEvent(ite ite) {
        akcr.b(ite, "event");
        e().a(ite);
    }
}
