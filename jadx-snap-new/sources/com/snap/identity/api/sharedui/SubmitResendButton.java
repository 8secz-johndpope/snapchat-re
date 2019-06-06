package com.snap.identity.api.sharedui;

import com.snap.ui.view.SnapFontTextView;
import com.snap.ui.view.StatefulView;
import com.snap.ui.view.button.ScButton;
import defpackage.ajxe;
import defpackage.akcr;
import java.util.Arrays;

public final class SubmitResendButton extends StatefulView {
    private String a;
    private final ajxe<ScButton> b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARNING: Missing block: B:21:0x00d1, code skipped:
            if (r6 != null) goto L_0x00d3;
     */
    /* JADX WARNING: Missing block: B:22:0x00d3, code skipped:
            r6.recycle();
     */
    /* JADX WARNING: Missing block: B:32:0x00e3, code skipped:
            if (r6 != null) goto L_0x00d3;
     */
    public SubmitResendButton(android.content.Context r17, android.util.AttributeSet r18) {
        /*
        r16 = this;
        r1 = r16;
        r0 = r17;
        r2 = r18;
        r3 = "context";
        defpackage.akcr.b(r0, r3);
        r16.<init>(r17, r18);
        r3 = new com.snap.ui.view.button.ScButton$Builder;
        r3.<init>();
        r4 = r17.getResources();
        r5 = 2131099843; // 0x7f0600c3 float:1.781205E38 double:1.0529032203E-314;
        r4 = r4.getColor(r5);
        r6 = 0;
        r3 = r3.backgroundColors(r4, r6);
        r3 = r3.disabled();
        r3 = r3.buildLazy(r0);
        r1.b = r3;
        r3 = 2131890378; // 0x7f1210ca float:1.9415446E38 double:1.0532937965E-314;
        r3 = r0.getString(r3);
        r4 = "context.getString(R.stri…phone_resend_sms_waiting)";
        defpackage.akcr.a(r3, r4);
        r1.a = r3;
        r3 = 2131890375; // 0x7f1210c7 float:1.941544E38 double:1.053293795E-314;
        r3 = r0.getString(r3);
        r4 = "context.getString(R.stri…verify_phone_button_text)";
        defpackage.akcr.a(r3, r4);
        r4 = 2131890379; // 0x7f1210cb float:1.9415448E38 double:1.053293797E-314;
        r4 = r0.getString(r4);
        r7 = "context.getString(R.string.verify_resend)";
        defpackage.akcr.a(r4, r7);
        r7 = r17.getResources();
        r8 = 2131100091; // 0x7f0601bb float:1.7812554E38 double:1.052903343E-314;
        r7 = r7.getColor(r8);
        r9 = r17.getResources();
        r10 = 2131099837; // 0x7f0600bd float:1.7812038E38 double:1.0529032173E-314;
        r9 = r9.getColor(r10);
        r11 = 4;
        r12 = 3;
        r13 = 2;
        r14 = 1;
        r15 = 0;
        if (r2 == 0) goto L_0x00e6;
    L_0x0070:
        r6 = r17.getTheme();	 Catch:{ Exception -> 0x00e2, all -> 0x00da }
        r5 = defpackage.irt.a.c;	 Catch:{ Exception -> 0x00e2, all -> 0x00da }
        r6 = r6.obtainStyledAttributes(r2, r5, r15, r15);	 Catch:{ Exception -> 0x00e2, all -> 0x00da }
        r2 = r6.hasValue(r11);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        if (r2 == 0) goto L_0x008b;
    L_0x0080:
        r2 = r6.getString(r11);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        r5 = "typedArray.getString(R.s…ResendButton_waitingText)";
        defpackage.akcr.a(r2, r5);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        r1.a = r2;	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
    L_0x008b:
        r2 = r6.hasValue(r12);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        if (r2 == 0) goto L_0x009b;
    L_0x0091:
        r2 = r6.getString(r12);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        r5 = "typedArray.getString(R.s….ResendButton_submitText)";
        defpackage.akcr.a(r2, r5);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        r3 = r2;
    L_0x009b:
        r2 = r6.hasValue(r13);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        if (r2 == 0) goto L_0x00ab;
    L_0x00a1:
        r2 = r6.getString(r13);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        r5 = "typedArray.getString(R.s….ResendButton_resendText)";
        defpackage.akcr.a(r2, r5);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        r4 = r2;
    L_0x00ab:
        r2 = r6.hasValue(r15);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        if (r2 == 0) goto L_0x00be;
    L_0x00b1:
        r2 = r17.getResources();	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        r2 = r2.getColor(r8);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        r2 = r6.getColor(r15, r2);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        r7 = r2;
    L_0x00be:
        r2 = r6.hasValue(r14);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        if (r2 == 0) goto L_0x00d1;
    L_0x00c4:
        r2 = r17.getResources();	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        r2 = r2.getColor(r10);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        r2 = r6.getColor(r14, r2);	 Catch:{ Exception -> 0x00d7, all -> 0x00d8 }
        r9 = r2;
    L_0x00d1:
        if (r6 == 0) goto L_0x00e6;
    L_0x00d3:
        r6.recycle();
        goto L_0x00e6;
    L_0x00d7:
        goto L_0x00e3;
    L_0x00d8:
        r0 = move-exception;
        goto L_0x00dc;
    L_0x00da:
        r0 = move-exception;
        r6 = 0;
    L_0x00dc:
        if (r6 == 0) goto L_0x00e1;
    L_0x00de:
        r6.recycle();
    L_0x00e1:
        throw r0;
    L_0x00e2:
        r6 = 0;
    L_0x00e3:
        if (r6 == 0) goto L_0x00e6;
    L_0x00e5:
        goto L_0x00d3;
    L_0x00e6:
        r2 = new com.snap.ui.view.button.ScButton$Builder;
        r2.<init>();
        r2 = r2.text(r3);
        r5 = r17.getResources();
        r6 = 2131099843; // 0x7f0600c3 float:1.781205E38 double:1.0529032203E-314;
        r5 = r5.getColor(r6);
        r6 = 0;
        r2 = r2.backgroundColors(r5, r6);
        r2 = r2.disabled();
        r2 = r2.buildLazy(r0);
        r1.addState(r15, r2);
        r2 = new com.snap.ui.view.button.ScButton$Builder;
        r2.<init>();
        r2 = r2.text(r3);
        r3 = java.lang.Integer.valueOf(r9);
        r2 = r2.backgroundColors(r7, r3);
        r2 = r2.buildLazy(r0);
        r1.addState(r14, r2);
        r2 = new com.snap.ui.view.button.ScButton$Builder;
        r2.<init>();
        r2 = r2.text(r4);
        r3 = java.lang.Integer.valueOf(r9);
        r2 = r2.backgroundColors(r7, r3);
        r2 = r2.buildLazy(r0);
        r1.addState(r13, r2);
        r2 = r1.b;
        r1.addState(r12, r2);
        r2 = new com.snap.ui.view.button.ScButton$Builder;
        r2.<init>();
        r2 = r2.spinner();
        r3 = r17.getResources();
        r4 = 2131100098; // 0x7f0601c2 float:1.7812568E38 double:1.0529033463E-314;
        r3 = r3.getColor(r4);
        r4 = 0;
        r2 = r2.backgroundColors(r3, r4);
        r2 = r2.disabled();
        r0 = r2.buildLazy(r0);
        r1.addState(r11, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.api.sharedui.SubmitResendButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void a(int i, Integer num) {
        if (i == 3 && num != null) {
            SnapFontTextView textView = ((ScButton) this.b.b()).getTextView();
            Object format = String.format(this.a, Arrays.copyOf(new Object[]{num}, 1));
            akcr.a(format, "java.lang.String.format(format, *args)");
            textView.setText((CharSequence) format);
        }
        setState(i);
    }
}
