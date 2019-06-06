package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.snap.ui.avatar.Avatar;
import com.snap.ui.avatar.AvatarView;
import com.snapchat.android.R;
import defpackage.rlc.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: rlf */
public final class rlf extends rlc {
    final ajdx<Uri> a;
    private final zpd b;
    private final String c;
    private final String d;
    private final long e = 2131889445;
    private final String f;
    private final zms g;
    private final ris l;
    private final zke m;
    private final ajdp<znh<zmy>> n;
    private final String o;
    private final boolean p;
    private final boolean q;
    private final a r;
    private final rkj s;
    private final boolean t;
    private final ajwl<Boolean> u = new ajwl();

    /* renamed from: rlf$1 */
    class 1 implements rlk {
        private AvatarView a;
        private ajei b;

        1() {
        }

        public final void a() {
            ajei ajei = this.b;
            if (ajei != null) {
                ajei.a();
            }
            this.b = new ajei();
        }

        public final void a(AvatarView avatarView, List<Avatar> list, boolean z) {
            a();
            this.a = avatarView;
            boolean z2 = z && rlf.this.a != null;
            avatarView.setAvatarsInfo((List) list, z, null, z2, rgr.a);
            if (z && rlf.this.a != null) {
                this.b.a(rlf.this.a.a(new -$$Lambda$rlf$1$3Tx2BQApJffXLbWD_U1BfDU6asM(this), -$$Lambda$rlf$1$K547_dl0MFA3bma_3OlsY7-swL4.INSTANCE));
            }
        }
    }

    public rlf(riq riq, zpd zpd, List<? extends rjd> list, ajdp<? extends List<? extends rjd>> ajdp, zms zms, ris ris, zkf zkf, ajdp<rkh> ajdp2, a aVar, Context context, ajdx<Uri> ajdx, gpb gpb, ajdp<Boolean> ajdp3) {
        ajdp b;
        riq riq2 = riq;
        zkf zkf2 = zkf;
        super(riq, context);
        this.b = zpd;
        zkf2.a(this);
        this.m = zkf2.b;
        this.c = riq.a(R.string.send_to_story_group_title);
        this.d = riq.a(R.string.send_to_custom_story);
        this.f = "";
        this.g = zms;
        this.l = ris;
        this.o = null;
        this.p = false;
        this.q = false;
        this.r = aVar;
        Object rki = new rki(Collections.emptyMap());
        this.s = new rkj(rki);
        ajdw h = riq.k().h();
        ajdp g = g();
        this.u.a(Boolean.FALSE);
        if (this.r != a.SEARCH_ONLY) {
            List<? extends rjd> list2 = list;
            b = ajdp.b(new znf(c(a(list, false, abkr.a()))));
        } else {
            b = ajvo.a(ajot.a);
        }
        ajdt ajdt = b;
        ajdp<? extends List<? extends rjd>> ajdp4 = ajdp;
        this.n = ajdp.a(ajdt, ajdp.a(ajdp.a(h), ajdp.b(rki).c((ajdt) ajdp2).a(h), this.u.a(h), g.a(h), gpb.c().a(h), ajdp3.a(h), new -$$Lambda$rlf$6SlUROYr3OkUYfTYhQQ4RiJ5r8c(this)).a(f()));
        if (ajdx != null) {
            this.a = ajdx.a();
            this.j.a(this.a.a(-$$Lambda$rlf$_GLyy_8X8MJl2MOLFZGdM3q-9JU.INSTANCE, -$$Lambda$rlf$LvcnVw_SQexwJAt4pAgvG0XHILI.INSTANCE));
        } else {
            this.a = null;
        }
        this.t = false;
    }

    private /* synthetic */ List a(List list, rkh rkh, Boolean bool, String str, abkq abkq, Boolean bool2) {
        if (this.r == a.SEARCH_ONLY && !bool2.booleanValue()) {
            return Collections.emptyList();
        }
        str = vxg.a(str);
        this.s.a(rkh);
        boolean booleanValue = bool.booleanValue();
        a aVar = this.r;
        if (aVar == a.DEFAULT_ONLY) {
            if (!Strings.isNullOrEmpty(str)) {
                return Collections.emptyList();
            }
        } else if (aVar != a.SEARCH_ONLY) {
            return Collections.emptyList();
        } else {
            if (Strings.isNullOrEmpty(str)) {
                return Collections.emptyList();
            }
        }
        if (aVar == a.DEFAULT_ONLY) {
            a(list);
        } else if (aVar == a.SEARCH_ONLY) {
            list = this.s.a(list, str);
            b(list);
        } else {
            list = new ArrayList();
        }
        list = a(list, booleanValue, abkq);
        return (!list.isEmpty() || aVar == a.DEFAULT_ONLY) ? c(list) : Collections.emptyList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0248 A:{SYNTHETIC, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x023a  */
    private java.util.List<defpackage.zmy> a(java.util.List<? extends defpackage.rjd> r31, boolean r32, defpackage.abkq r33) {
        /*
        r30 = this;
        r0 = r30;
        r1 = r33;
        r2 = r31.isEmpty();
        if (r2 == 0) goto L_0x000f;
    L_0x000a:
        r1 = java.util.Collections.emptyList();
        return r1;
    L_0x000f:
        r2 = r31.size();
        r3 = new java.util.ArrayList;
        r3.<init>(r2);
        r4 = r2 + -1;
        r5 = 0;
    L_0x001b:
        if (r5 >= r2) goto L_0x024c;
    L_0x001d:
        r15 = r31;
        r6 = r15.get(r5);
        r7 = r6;
        r7 = (defpackage.rjd) r7;
        r6 = "StoryHorizScrollSection";
        r8 = "tag";
        defpackage.akcr.b(r6, r8);
        r6 = "storyData";
        defpackage.akcr.b(r7, r6);
        r8 = r0.l;
        r12 = new rlf$1;
        r12.<init>();
        r9 = r30.d();
        r10 = r7.a;
        r20 = r10.storyId();
        defpackage.akcr.b(r7, r6);
        r6 = "selectionState";
        defpackage.akcr.b(r9, r6);
        r6 = "userSession";
        defpackage.akcr.b(r1, r6);
        r6 = r7.a;
        r11 = r6.storyId();
        r6 = r7.a;
        r18 = r6.displayName();
        r6 = r7.a;
        r24 = r6.subtext();
        r6 = r8.d;
        r25 = r6.a(r11);
        r6 = new rhe;
        r10 = defpackage.rhc.STORY;
        r6.<init>(r10, r11);
        r27 = r9.a(r6);
        r28 = r7.h();
        r6 = r7.a;
        r6 = r6.isMyOverridenPrivacyStory();
        if (r6 == 0) goto L_0x00ad;
    L_0x007f:
        r22 = new rnl;
        r9 = r7.f();
        r13 = r7.x();
        r16 = 4;
        r19 = r8.a(r1);
        r14 = r8.c;
        r6 = r22;
        r7 = r25;
        r10 = r11;
        r11 = r18;
        r21 = r14;
        r14 = r24;
        r15 = r27;
        r17 = r5;
        r18 = r20;
        r20 = r28;
        r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
    L_0x00a7:
        r22 = (defpackage.rnn) r22;
    L_0x00a9:
        r6 = r22;
        goto L_0x0226;
    L_0x00ad:
        r6 = r7.a;
        r6 = r6.isMyStory();
        if (r6 == 0) goto L_0x00de;
    L_0x00b5:
        r22 = new rnc;
        r9 = r7.f();
        r13 = r7.x();
        r16 = 4;
        r19 = r8.a(r1);
        r15 = r8.c;
        r6 = r22;
        r7 = r25;
        r10 = r11;
        r11 = r18;
        r14 = r24;
        r21 = r15;
        r15 = r27;
        r17 = r5;
        r18 = r20;
        r20 = r28;
        r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        goto L_0x00a7;
    L_0x00de:
        r6 = r7.a;
        r6 = r6.isOurStory();
        if (r6 == 0) goto L_0x0137;
    L_0x00e6:
        r6 = r7.j();
        if (r6 == 0) goto L_0x00f0;
    L_0x00ec:
        r6 = 2131232302; // 0x7f08062e float:1.808071E38 double:1.0529686637E-314;
        goto L_0x00f3;
    L_0x00f0:
        r6 = 2131232309; // 0x7f080635 float:1.8080724E38 double:1.052968667E-314;
    L_0x00f3:
        r9 = new ris$c;
        r9.<init>(r8, r6);
        r9 = (java.util.concurrent.Callable) r9;
        r6 = defpackage.ajdx.c(r9);
        r19 = r6;
        r9 = "Single.fromCallable { se…tomizeStory(drawableId) }";
        defpackage.akcr.a(r6, r9);
        r29 = new rni;
        r6 = r29;
        r9 = r7.f();
        r13 = r7.x();
        r16 = 4;
        r21 = r7.j();
        r8 = r8.c;
        r22 = r8;
        r23 = r7.i();
        r7 = r25;
        r10 = r11;
        r11 = r18;
        r14 = r24;
        r15 = r27;
        r17 = r5;
        r18 = r20;
        r20 = r28;
        r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
    L_0x0131:
        r22 = r29;
        r22 = (defpackage.rnn) r22;
        goto L_0x00a9;
    L_0x0137:
        r6 = r7.a;
        r6 = r6.isMobStory();
        if (r6 == 0) goto L_0x0192;
    L_0x013f:
        r6 = r7.a;
        r6 = r6.isMischief();
        if (r6 == 0) goto L_0x0152;
    L_0x0147:
        r6 = r8.e;
        r9 = r7.r();
        r6 = r6.a(r9);
        goto L_0x0162;
    L_0x0152:
        r6 = new ris$d;
        r6.<init>(r8, r7);
        r6 = (java.util.concurrent.Callable) r6;
        r6 = defpackage.ajdx.c(r6);
        r9 = "Single.fromCallable {\n  …e))\n                    }";
        defpackage.akcr.a(r6, r9);
    L_0x0162:
        r21 = r6;
        r29 = new rmy;
        r6 = r29;
        r9 = r7.f();
        r14 = r7.x();
        r17 = 4;
        r8 = r8.c;
        r22 = r8;
        r7 = r7.a;
        r23 = r7.isGeoGroupStory();
        r7 = r25;
        r10 = r11;
        r13 = r12;
        r12 = r18;
        r15 = r24;
        r16 = r27;
        r18 = r5;
        r19 = r20;
        r20 = r21;
        r21 = r28;
        r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
        goto L_0x0131;
    L_0x0192:
        r6 = r7.a;
        r6 = r6.isBusinessStory();
        if (r6 == 0) goto L_0x01d5;
    L_0x019a:
        r6 = new ris$e;
        r6.<init>(r8);
        r6 = (java.util.concurrent.Callable) r6;
        r15 = defpackage.ajdx.c(r6);
        r6 = "Single.fromCallable {\n  …t_icon)\n                }";
        defpackage.akcr.a(r15, r6);
        r22 = new rmn;
        r9 = r7.f();
        r12 = r7;
        r12 = (defpackage.rlk) r12;
        r13 = r7.x();
        r16 = 4;
        r14 = r8.c;
        r6 = r22;
        r7 = r25;
        r10 = r11;
        r11 = r18;
        r21 = r14;
        r14 = r24;
        r19 = r15;
        r15 = r27;
        r17 = r5;
        r18 = r20;
        r20 = r28;
        r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        goto L_0x00a7;
    L_0x01d5:
        r6 = r7.a;
        r6 = r6.isOfficialStory();
        if (r6 == 0) goto L_0x0222;
    L_0x01dd:
        r6 = new ris$f;
        r6.<init>(r8, r7);
        r6 = (java.util.concurrent.Callable) r6;
        r15 = defpackage.ajdx.c(r6);
        r6 = "Single.fromCallable {\n  …(emoji)\n                }";
        defpackage.akcr.a(r15, r6);
        r22 = new rnf;
        r9 = r7.f();
        r6 = r7.a;
        r10 = r6.userName();
        r6 = r7.a;
        r11 = r6.displayName();
        r12 = r8.a();
        r13 = r7.x();
        r16 = 4;
        r14 = r8.c;
        r6 = r22;
        r7 = r25;
        r21 = r14;
        r14 = r24;
        r19 = r15;
        r15 = r27;
        r17 = r5;
        r18 = r20;
        r20 = r28;
        r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        goto L_0x00a7;
    L_0x0222:
        r22 = 0;
        goto L_0x00a9;
    L_0x0226:
        if (r6 == 0) goto L_0x0238;
    L_0x0228:
        r3.add(r6);
        r7 = r30.e();
        r8 = r6.f;
        r6 = r6.q();
        r7.a(r8, r6);
    L_0x0238:
        if (r32 == 0) goto L_0x0248;
    L_0x023a:
        r6 = 1;
        if (r5 != r6) goto L_0x0248;
    L_0x023d:
        if (r5 == r4) goto L_0x0248;
    L_0x023f:
        r1 = new rnm;
        r1.<init>();
        r3.add(r1);
        goto L_0x024c;
    L_0x0248:
        r5 = r5 + 1;
        goto L_0x001b;
    L_0x024c:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.a(java.util.List, boolean, abkq):java.util.List");
    }

    private List<zmy> c(List<zmy> list) {
        Resources resources = ((Context) this.i.get()).getResources();
        return ImmutableList.of(this.l.a(this.c, "", null, 2131889445, 4, this.f), new rnu(rit.STORIES_SECTION, this.g, this.m, list, 2131889445, resources.getDimensionPixelSize(R.dimen.send_to_stories_item_height), resources.getDimensionPixelSize(R.dimen.send_to_stories_padding), resources.getDimensionPixelSize(R.dimen.send_to_stories_offset)));
    }

    public final int a() {
        return 4;
    }

    public final ajdp<znh<zmy>> c() {
        return this.n;
    }

    @akqq
    public final void onViewMoreEvent(rjq rjq) {
        if (rjq.a == 4) {
            this.u.a(Boolean.FALSE);
        }
    }
}
