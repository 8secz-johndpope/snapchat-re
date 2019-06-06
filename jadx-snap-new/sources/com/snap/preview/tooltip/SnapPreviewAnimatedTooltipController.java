package com.snap.preview.tooltip;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.collect.Sets;
import com.snapchat.android.R;
import defpackage.tyq;
import defpackage.uai;
import java.util.Set;

public class SnapPreviewAnimatedTooltipController implements uai {
    final Handler a = new Handler(Looper.getMainLooper());
    final Set<Animator> b = Sets.newHashSet();
    boolean c = false;
    TextView d;
    ImageView e;
    AnimationDrawable f;
    ImageView g;
    float h;
    ImageView i;
    AnimationDrawable j;
    float k;
    private final a l;
    private boolean m = false;
    private Context n;
    private View o;
    private View p;
    private ImageView q;
    private String r;
    private View s;
    private ImageView t;
    private View u;
    private ImageView v;
    private uai w;
    private View x;
    private ImageView y;
    private boolean z;

    public interface a {
        View a();

        View b();

        View c();

        View d();
    }

    public SnapPreviewAnimatedTooltipController(a aVar) {
        this.l = aVar;
    }

    private static void a(View view, View view2) {
        r1 = new int[2];
        view.getLocationOnScreen(r1);
        r1[0] = r1[0] + (view.getWidth() / 2);
        r1[1] = r1[1] + (view.getHeight() / 2);
        ((View) view2.getParent()).getLocationOnScreen(new int[2]);
        int[] iArr = new int[]{r1[0] - r4[0], r1[1] - r4[1]};
        view2.setX(((float) iArr[0]) - (((float) view2.getMeasuredWidth()) / 2.0f));
        view2.setY(((float) iArr[1]) - (((float) view2.getMeasuredHeight()) / 2.0f));
    }

    private static void a(View view, View view2, float f) {
        float measuredWidth = ((float) view2.getMeasuredWidth()) + f;
        f = ((float) (view.getMeasuredHeight() - view2.getMeasuredHeight())) / 2.0f;
        view2.setX(view.getX() - measuredWidth);
        view2.setY(view.getY() + f);
    }

    private static Animator b(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet a = tyq.a(view, 0.5f);
        AnimatorSet b = tyq.b(view);
        animatorSet.playTogether(new Animator[]{a, b});
        return animatorSet;
    }

    @Keep
    private void setCaptionText(float f) {
        StringBuilder stringBuilder;
        int length = this.r.length();
        int i = length + 2;
        int i2 = (int) (((float) i) * f);
        String str = "|";
        if (i2 < length) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.r.substring(0, i2));
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.r);
            if (i2 != i) {
                str = "";
            }
        }
        stringBuilder.append(str);
        this.d.setText(stringBuilder.toString());
    }

    public final void a(Context context, View view) {
        this.n = context;
        this.o = view;
        View inflate = ((ViewStub) this.o.findViewById(R.id.snap_preview_animated_tooltip_stub)).inflate();
        inflate.measure(0, 0);
        this.q = (ImageView) inflate.findViewById(R.id.snap_preview_animated_tooltip_caption_selected);
        this.d = (TextView) inflate.findViewById(R.id.snap_preview_animated_tooltip_caption_text);
        this.v = (ImageView) inflate.findViewById(R.id.snap_preview_animated_tooltip_sticker_selected);
        this.g = (ImageView) inflate.findViewById(R.id.snap_preview_animated_tooltip_sticker_emoji);
        this.t = (ImageView) inflate.findViewById(R.id.snap_preview_animated_tooltip_draw_selected);
        this.e = (ImageView) inflate.findViewById(R.id.snap_preview_animated_tooltip_draw_face);
        this.f = (AnimationDrawable) this.e.getBackground();
        this.y = (ImageView) inflate.findViewById(R.id.face_craft_animated_tooltip_btn_selected);
        this.i = (ImageView) inflate.findViewById(R.id.face_craft_animated_tooltip);
        this.j = (AnimationDrawable) this.i.getBackground();
    }

    public final void a(View view) {
    }

    public final void a(defpackage.uai.a aVar) {
    }

    public final void a(uai uai) {
        this.w = uai;
        this.w.a(new defpackage.uai.a() {
            public final void a(View view) {
                if (view instanceof TextView) {
                    ((TextView) view).setText(R.string.caption_onboarding_message_treatment_1);
                }
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ab A:{RETURN} */
    public final void a(boolean r19) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r0.c;
        if (r1 != 0) goto L_0x0301;
    L_0x0006:
        r1 = r0.m;
        if (r1 != 0) goto L_0x0301;
    L_0x000a:
        r1 = 1;
        r0.m = r1;
        r2 = r0.n;
        r2 = r2.getResources();
        r3 = 2131167731; // 0x7f0709f3 float:1.7949744E38 double:1.0529367614E-314;
        r2 = r2.getDimension(r3);
        r3 = r0.l;
        r3 = r3.a();
        r0.p = r3;
        r3 = r0.p;
        r4 = 0;
        if (r3 == 0) goto L_0x00a8;
    L_0x0027:
        r5 = r0.q;
        a(r3, r5);
        r3 = r0.q;
        r5 = r0.d;
        a(r3, r5, r2);
        r3 = r0.d;
        r3.setVisibility(r4);
        r3 = r0.n;
        r3 = r3.getResources();
        r5 = 2131886502; // 0x7f1201a6 float:1.9407585E38 double:1.0532918815E-314;
        r3 = r3.getString(r5);
        r0.r = r3;
        r3 = r0.l;
        r3 = r3.c();
        r0.u = r3;
        r3 = r0.u;
        if (r3 == 0) goto L_0x00a8;
    L_0x0053:
        r5 = r0.v;
        a(r3, r5);
        r3 = r0.v;
        r5 = r0.g;
        a(r3, r5, r2);
        r3 = r0.g;
        r3 = r3.getX();
        r0.h = r3;
        r3 = r0.l;
        r3 = r3.b();
        r0.s = r3;
        r3 = r0.s;
        if (r3 == 0) goto L_0x00a8;
    L_0x0073:
        r5 = r0.t;
        a(r3, r5);
        r3 = r0.t;
        r5 = r0.e;
        a(r3, r5, r2);
        r3 = r0.z;
        if (r3 == 0) goto L_0x00a6;
    L_0x0083:
        r3 = r0.l;
        r3 = r3.d();
        r0.x = r3;
        r3 = r0.x;
        if (r3 != 0) goto L_0x0092;
    L_0x008f:
        r0.z = r4;
        goto L_0x00a6;
    L_0x0092:
        r5 = r0.y;
        a(r3, r5);
        r3 = r0.y;
        r5 = r0.i;
        a(r3, r5, r2);
        r2 = r0.i;
        r2 = r2.getX();
        r0.k = r2;
    L_0x00a6:
        r2 = 1;
        goto L_0x00a9;
    L_0x00a8:
        r2 = 0;
    L_0x00a9:
        if (r2 != 0) goto L_0x00ac;
    L_0x00ab:
        return;
    L_0x00ac:
        r2 = new android.animation.AnimatorSet;
        r2.<init>();
        r3 = new java.util.ArrayList;
        r5 = 3;
        r3.<init>(r5);
        r6 = 0;
    L_0x00b8:
        if (r6 >= r5) goto L_0x02ee;
    L_0x00ba:
        r7 = new android.animation.AnimatorSet;
        r7.<init>();
        r8 = com.google.common.collect.ImmutableList.builder();
        r9 = new android.animation.Animator[r5];
        r10 = new android.animation.AnimatorSet;
        r10.<init>();
        r11 = new com.snap.preview.tooltip.SnapPreviewAnimatedTooltipController$3;
        r11.<init>();
        r10.addListener(r11);
        r11 = r0.d;
        r12 = android.view.View.SCALE_X;
        r13 = 2;
        r14 = new float[r13];
        r14 = {1065353216, 0};
        r11 = android.animation.ObjectAnimator.ofFloat(r11, r12, r14);
        r14 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r11 = r11.setDuration(r14);
        r16 = r6;
        r5 = 1851; // 0x73b float:2.594E-42 double:9.145E-321;
        r11.setStartDelay(r5);
        r12 = r0.d;
        r1 = android.view.View.SCALE_Y;
        r4 = new float[r13];
        r4 = {1065353216, 0};
        r1 = android.animation.ObjectAnimator.ofFloat(r12, r1, r4);
        r1 = r1.setDuration(r14);
        r1.setStartDelay(r5);
        r4 = r0.d;
        r12 = android.view.View.ALPHA;
        r5 = new float[r13];
        r5 = {1065353216, 1058642330};
        r4 = android.animation.ObjectAnimator.ofFloat(r4, r12, r5);
        r4 = r4.setDuration(r14);
        r5 = 1851; // 0x73b float:2.594E-42 double:9.145E-321;
        r4.setStartDelay(r5);
        r5 = new float[r13];
        r5 = {0, 1065353216};
        r6 = "captionText";
        r5 = android.animation.ObjectAnimator.ofFloat(r0, r6, r5);
        r14 = 433; // 0x1b1 float:6.07E-43 double:2.14E-321;
        r5 = r5.setDuration(r14);
        r14 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r5.setStartDelay(r14);
        r6 = 6;
        r6 = new android.animation.Animator[r6];
        r12 = r0.p;
        r12 = defpackage.tyq.a(r12);
        r14 = 0;
        r6[r14] = r12;
        r12 = r0.q;
        r12 = b(r12);
        r15 = 1;
        r6[r15] = r12;
        r6[r13] = r11;
        r11 = 3;
        r6[r11] = r1;
        r1 = 4;
        r6[r1] = r4;
        r4 = 5;
        r6[r4] = r5;
        r10.playTogether(r6);
        r9[r14] = r10;
        r5 = new android.animation.AnimatorSet;
        r5.<init>();
        r6 = new com.snap.preview.tooltip.SnapPreviewAnimatedTooltipController$4;
        r6.<init>();
        r5.addListener(r6);
        r6 = r0.e;
        r10 = android.view.View.SCALE_X;
        r11 = new float[r13];
        r11 = {1065353216, 1056964608};
        r6 = android.animation.ObjectAnimator.ofFloat(r6, r10, r11);
        r10 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r6 = r6.setDuration(r10);
        r14 = 1851; // 0x73b float:2.594E-42 double:9.145E-321;
        r6.setStartDelay(r14);
        r12 = r0.e;
        r1 = android.view.View.SCALE_Y;
        r4 = new float[r13];
        r4 = {1065353216, 1056964608};
        r1 = android.animation.ObjectAnimator.ofFloat(r12, r1, r4);
        r1 = r1.setDuration(r10);
        r1.setStartDelay(r14);
        r4 = r0.e;
        r12 = android.view.View.ALPHA;
        r14 = new float[r13];
        r14 = {1065353216, 0};
        r4 = android.animation.ObjectAnimator.ofFloat(r4, r12, r14);
        r4 = r4.setDuration(r10);
        r10 = 1851; // 0x73b float:2.594E-42 double:9.145E-321;
        r4.setStartDelay(r10);
        r10 = new com.snap.preview.tooltip.SnapPreviewAnimatedTooltipController$5;
        r10.<init>();
        r5.addListener(r10);
        r10 = 5;
        r11 = new android.animation.Animator[r10];
        r10 = r0.s;
        r10 = defpackage.tyq.a(r10);
        r12 = 0;
        r11[r12] = r10;
        r10 = r0.t;
        r10 = b(r10);
        r14 = 1;
        r11[r14] = r10;
        r11[r13] = r6;
        r6 = 3;
        r11[r6] = r1;
        r1 = 4;
        r11[r1] = r4;
        r5.playTogether(r11);
        r9[r14] = r5;
        r1 = new android.animation.AnimatorSet;
        r1.<init>();
        r4 = new com.snap.preview.tooltip.SnapPreviewAnimatedTooltipController$6;
        r4.<init>();
        r1.addListener(r4);
        r4 = r0.g;
        r4 = defpackage.tyq.b(r4);
        r5 = r0.g;
        r6 = 1053609165; // 0x3ecccccd float:0.4 double:5.205520926E-315;
        r5 = defpackage.tyq.a(r5, r6);
        r10 = r0.v;
        r10 = r10.getX();
        r11 = r0.v;
        r11 = r11.getWidth();
        r11 = (float) r11;
        r14 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r11 = r11 / r14;
        r10 = r10 + r11;
        r11 = r0.g;
        r11 = r11.getMeasuredWidth();
        r11 = (float) r11;
        r11 = r11 / r14;
        r10 = r10 - r11;
        r11 = r0.g;
        r11 = r11.getX();
        r15 = r0.g;
        r10 = defpackage.tyq.b(r15, r10, r11);
        r11 = 5;
        r15 = new android.animation.Animator[r11];
        r11 = r0.u;
        r11 = defpackage.tyq.a(r11);
        r17 = 0;
        r15[r17] = r11;
        r11 = r0.v;
        r11 = b(r11);
        r17 = 1;
        r15[r17] = r11;
        r15[r13] = r4;
        r4 = 3;
        r15[r4] = r5;
        r4 = 4;
        r15[r4] = r10;
        r1.playTogether(r15);
        r9[r13] = r1;
        r8.add(r9);
        r1 = r0.z;
        if (r1 == 0) goto L_0x02d3;
    L_0x0238:
        r1 = new android.animation.AnimatorSet;
        r1.<init>();
        r4 = new com.snap.preview.tooltip.SnapPreviewAnimatedTooltipController$7;
        r4.<init>();
        r1.addListener(r4);
        r4 = r0.x;
        r4 = defpackage.tyq.a(r4);
        r5 = r0.i;
        r5 = defpackage.tyq.b(r5);
        r9 = r0.i;
        r6 = defpackage.tyq.a(r9, r6);
        r9 = r0.y;
        r9 = r9.getX();
        r10 = r0.y;
        r10 = r10.getWidth();
        r10 = (float) r10;
        r10 = r10 / r14;
        r9 = r9 + r10;
        r10 = r0.i;
        r10 = r10.getMeasuredWidth();
        r10 = (float) r10;
        r10 = r10 / r14;
        r9 = r9 - r10;
        r10 = r0.i;
        r10 = r10.getX();
        r11 = r0.i;
        r9 = defpackage.tyq.b(r11, r9, r10);
        r10 = r9.getChildAnimations();
        r11 = r10.isEmpty();
        r14 = 1;
        r11 = r11 ^ r14;
        com.google.common.base.Preconditions.checkArgument(r11);
        r11 = 0;
        r10 = r10.get(r11);
        r10 = (android.animation.Animator) r10;
        r11 = new com.snap.preview.tooltip.SnapPreviewAnimatedTooltipController$8;
        r11.<init>();
        r10.addListener(r11);
        r10 = r9.getChildAnimations();
        r11 = r10.isEmpty();
        r11 = r11 ^ r14;
        com.google.common.base.Preconditions.checkArgument(r11);
        r11 = r10.size();
        r11 = r11 - r14;
        r10 = r10.get(r11);
        r10 = (android.animation.Animator) r10;
        r11 = new com.snap.preview.tooltip.SnapPreviewAnimatedTooltipController$9;
        r11.<init>();
        r10.addListener(r11);
        r10 = 5;
        r10 = new android.animation.Animator[r10];
        r11 = 0;
        r10[r11] = r4;
        r4 = r0.y;
        r4 = b(r4);
        r10[r14] = r4;
        r10[r13] = r5;
        r4 = 3;
        r10[r4] = r6;
        r5 = 4;
        r10[r5] = r9;
        r1.playTogether(r10);
        r8.add(r1);
        goto L_0x02d6;
    L_0x02d3:
        r4 = 3;
        r11 = 0;
        r14 = 1;
    L_0x02d6:
        r1 = r8.build();
        r7.playSequentially(r1);
        if (r16 <= 0) goto L_0x02e4;
    L_0x02df:
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r7.setStartDelay(r5);
    L_0x02e4:
        r3.add(r7);
        r6 = r16 + 1;
        r1 = 1;
        r4 = 0;
        r5 = 3;
        goto L_0x00b8;
    L_0x02ee:
        r2.playSequentially(r3);
        r1 = r0.b;
        r1.add(r2);
        r1 = new com.snap.preview.tooltip.SnapPreviewAnimatedTooltipController$2;
        r1.<init>();
        r2.addListener(r1);
        r2.start();
    L_0x0301:
        r1 = r0.w;
        if (r1 == 0) goto L_0x030f;
    L_0x0305:
        r1.a();
        r1 = r0.w;
        r2 = r19;
        r1.a(r2);
    L_0x030f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.preview.tooltip.SnapPreviewAnimatedTooltipController.a(boolean):void");
    }

    public final boolean a() {
        if (this.b.isEmpty()) {
            uai uai = this.w;
            if (uai == null || !uai.a()) {
                return false;
            }
        }
        return true;
    }

    public final void b(boolean z) {
        this.c = true;
        this.f.stop();
        Set set = this.b;
        for (Animator end : (Animator[]) set.toArray(new Animator[set.size()])) {
            end.end();
        }
        this.b.clear();
        uai uai = this.w;
        if (uai != null) {
            uai.b(z);
        }
    }

    public final void c(boolean z) {
        this.z = z;
    }
}
