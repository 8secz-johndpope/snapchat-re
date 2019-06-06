package com.snap.payments.lib.views;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.tjy.b;
import java.util.Arrays;

public class AddressView extends RelativeLayout {
    public FloatLabelLayout a = ((FloatLabelLayout) this.j.findViewById(R.id.marco_polo_address_first_name));
    public FloatLabelLayout b = ((FloatLabelLayout) this.j.findViewById(R.id.marco_polo_address_last_name));
    public FloatLabelLayout c = ((FloatLabelLayout) this.j.findViewById(R.id.marco_polo_street_address_1));
    public FloatLabelLayout d = ((FloatLabelLayout) this.j.findViewById(R.id.marco_polo_street_address_2));
    public FloatLabelLayout e = ((FloatLabelLayout) this.j.findViewById(R.id.marco_polo_address_city));
    public FloatLabelLayout f = ((FloatLabelLayout) this.j.findViewById(R.id.marco_polo_address_state));
    public FloatLabelLayout g = ((FloatLabelLayout) this.j.findViewById(R.id.marco_polo_zip_float_label));
    public TextView h = ((TextView) this.j.findViewById(R.id.shipping_address_country));
    public TextView i = ((TextView) this.j.findViewById(R.id.marco_polo_address_error));
    private final RelativeLayout j;

    /* renamed from: com.snap.payments.lib.views.AddressView$1 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[b.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        static {
            /*
            r0 = defpackage.tjy.b.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.tjy.b.FIRST_NAME_ERROR;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.tjy.b.LAST_NAME_ERROR;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.tjy.b.ADDRESS1_ERROR;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.tjy.b.ADDRESS2_ERROR;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = defpackage.tjy.b.CITY_ERROR;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = defpackage.tjy.b.STATE_ERROR;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = defpackage.tjy.b.ZIP_ERROR;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.payments.lib.views.AddressView$AnonymousClass1.<clinit>():void");
        }
    }

    public AddressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = (RelativeLayout) inflate(context, R.layout.marco_polo_address_layout, this);
        EditText editText = this.f.a;
        if (editText != null) {
            InputFilter[] filters = editText.getFilters();
            filters = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            filters[filters.length - 1] = new AllCaps();
            FloatLabelLayout floatLabelLayout = this.f;
            if (floatLabelLayout.a != null) {
                floatLabelLayout.a.setFilters(filters);
            }
        }
    }
}
