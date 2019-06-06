package com.snap.identity.api.sharedui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.os.CountDownTimer;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.ajzg;
import defpackage.akcr;
import defpackage.akef;
import java.util.Iterator;

public final class VerificationCodeEditTextView extends AppCompatEditText {
    boolean a = true;
    private int b;
    private int c = ((int) getResources().getDimension(R.dimen.verification_code_margin));
    private Paint d = new Paint();
    private Paint e = new Paint();
    private float f = getResources().getDimension(R.dimen.bottom_line_stroke_width);
    private float g;
    private CountDownTimer h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b extends CountDownTimer {
        private /* synthetic */ VerificationCodeEditTextView a;

        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 5, insn: 0x0000: IPUT  (r5 com.snap.identity.api.sharedui.VerificationCodeEditTextView), (r4 com.snap.identity.api.sharedui.VerificationCodeEditTextView$b) com.snap.identity.api.sharedui.VerificationCodeEditTextView.b.a com.snap.identity.api.sharedui.VerificationCodeEditTextView, block:B:0:0x0000, method: com.snap.identity.api.sharedui.VerificationCodeEditTextView.b.<init>(com.snap.identity.api.sharedui.VerificationCodeEditTextView):void
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:162)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:133)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        b(long r4) {
            /*
            r3 = this;
            r4.a = r5;
            r0 = 10000000; // 0x989680 float:1.4012985E-38 double:4.9406565E-317;
            r2 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
            r4.<init>(r0, r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.api.sharedui.VerificationCodeEditTextView$b.<init>(com.snap.identity.api.sharedui.VerificationCodeEditTextView):void");
        }

        public final void onFinish() {
            this.a.a();
        }

        public final void onTick(long j) {
            VerificationCodeEditTextView verificationCodeEditTextView = this.a;
            verificationCodeEditTextView.a ^= 1;
            this.a.postInvalidate();
        }
    }

    static {
        a aVar = new a();
    }

    public VerificationCodeEditTextView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        this.d.setStrokeWidth(this.f);
        this.d.setColor(getResources().getColor(R.color.dark_grey));
        this.e.setStyle(Style.FILL);
        this.e.setColor(getResources().getColor(R.color.medium_blue));
        this.g = getResources().getDimension(R.dimen.cursor_line_stroke_width);
        this.e.setStrokeWidth(this.g);
        a();
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        CountDownTimer countDownTimer = this.h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.h = new b(this).start();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        int a;
        int i;
        akcr.b(canvas, "canvas");
        super.onDraw(canvas);
        String obj = getText().toString();
        Iterator it = akef.a(0, obj.length()).iterator();
        while (it.hasNext()) {
            a = ((ajzg) it).a();
            int i2 = this.c;
            int i3 = this.b;
            i2 = ((i2 + i3) * a) + (i3 / 2);
            Object paint = getPaint();
            String str = "paint";
            akcr.a(paint, str);
            paint.setTextAlign(Align.CENTER);
            paint = getPaint();
            akcr.a(paint, str);
            paint.setColor(getResources().getColor(R.color.black));
            paint = getPaint();
            akcr.a(paint, str);
            FontMetrics fontMetrics = paint.getFontMetrics();
            canvas.drawText(String.valueOf(obj.charAt(a)), (float) i2, (((((float) getMeasuredHeight()) - fontMetrics.bottom) + fontMetrics.top) / 2.0f) - fontMetrics.top, getPaint());
        }
        int length = obj.length();
        if (this.a) {
            i = this.c;
            a = this.b;
            float f = (float) (((i + a) * length) + (a / 4));
            canvas.drawLine(f, MapboxConstants.MINIMUM_ZOOM, f, ((float) getMeasuredHeight()) - this.g, this.e);
        }
        Iterator it2 = akef.a(0, 6).iterator();
        while (it2.hasNext()) {
            i = ((ajzg) it2).a();
            float measuredHeight = ((float) getMeasuredHeight()) - (this.f / 2.0f);
            int i4 = this.c;
            a = this.b;
            float f2 = (float) ((i4 + a) * i);
            canvas.drawLine(f2, measuredHeight, ((float) a) + f2, measuredHeight, this.d);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = (getMeasuredWidth() - (this.c * 5)) / 6;
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }
}
