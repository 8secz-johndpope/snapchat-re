package com.snap.messaging.sendto.internal.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import com.snapchat.android.R;

public class SendToCheckBox extends AppCompatCheckBox {

    /* renamed from: com.snap.messaging.sendto.internal.ui.view.SendToCheckBox$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[a.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0013 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Missing block: B:9:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.snap.messaging.sendto.internal.ui.view.SendToCheckBox.a.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x000e }
            r1 = 1;
            r0[r1] = r1;	 Catch:{ NoSuchFieldError -> 0x000e }
        L_0x000e:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0013 }
            r1 = 2;
            r0[r1] = r1;	 Catch:{ NoSuchFieldError -> 0x0013 }
        L_0x0013:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0018 }
            r1 = 3;
            r0[r1] = r1;	 Catch:{ NoSuchFieldError -> 0x0018 }
        L_0x0018:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.sendto.internal.ui.view.SendToCheckBox$AnonymousClass1.<clinit>():void");
        }
    }

    public enum a {
        ;

        static {
            a = new int[]{1, 2, 3, 4};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    public SendToCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.rgp.a.a);
            try {
                int i = AnonymousClass1.a[a.a()[obtainStyledAttributes.getInt(0, 0)] - 1];
                i = i != 1 ? i != 2 ? i != 3 ? R.drawable.send_to_button_selector : R.drawable.mischief_send_to_checkbox : R.drawable.send_to_story_checkbox : R.drawable.send_to_best_checkbox;
                setButtonDrawable(i);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
