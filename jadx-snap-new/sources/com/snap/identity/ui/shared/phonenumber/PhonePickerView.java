package com.snap.identity.ui.shared.phonenumber;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.ajyq;
import defpackage.ajzy;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.iqo;
import defpackage.juc;
import defpackage.jud;
import defpackage.jue;
import defpackage.juo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;

public final class PhonePickerView extends LinearLayout {
    public akbw<? super String, ? super String, ajxw> a;
    public String b;
    public String c;
    final juc d;
    public final TextView e;
    public final EditText f;
    private final ajxe g;
    private final ajxe h;

    /* renamed from: com.snap.identity.ui.shared.phonenumber.PhonePickerView$2 */
    public static final class AnonymousClass2 implements TextWatcher {
        private /* synthetic */ PhonePickerView a;

        AnonymousClass2(PhonePickerView phonePickerView) {
            this.a = phonePickerView;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.a.a(String.valueOf(charSequence));
        }
    }

    static final class a extends akcs implements akbk<AlertDialog> {
        final /* synthetic */ PhonePickerView a;
        private /* synthetic */ Context b;

        /* renamed from: com.snap.identity.ui.shared.phonenumber.PhonePickerView$a$1 */
        public static final class AnonymousClass1 implements TextWatcher {
            private /* synthetic */ a a;

            AnonymousClass1(a aVar) {
                this.a = aVar;
            }

            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARNING: Missing block: B:20:0x008b, code skipped:
            if (defpackage.akgb.b(r1, r2, false) != false) goto L_0x00a6;
     */
            public final void onTextChanged(java.lang.CharSequence r8, int r9, int r10, int r11) {
                /*
                r7 = this;
                r9 = r7.a;
                r9 = r9.a;
                r9 = r9.d;
                r10 = r7.a;
                r10 = r10.a;
                r10 = ((java.util.List) r10.h.b());
                r10 = (java.lang.Iterable) r10;
                r11 = new java.util.ArrayList;
                r11.<init>();
                r11 = (java.util.Collection) r11;
                r10 = r10.iterator();
            L_0x001b:
                r0 = r10.hasNext();
                if (r0 == 0) goto L_0x00ba;
            L_0x0021:
                r0 = r10.next();
                r1 = r0;
                r1 = (defpackage.jue) r1;
                r2 = r1.a;
                r2 = r2.b;
                r3 = "null cannot be cast to non-null type java.lang.String";
                if (r2 == 0) goto L_0x00b4;
            L_0x0030:
                r2 = r2.toLowerCase();
                r4 = "(this as java.lang.String).toLowerCase()";
                defpackage.akcr.a(r2, r4);
                r5 = java.lang.String.valueOf(r8);
                if (r5 == 0) goto L_0x00ae;
            L_0x003f:
                r5 = r5.toLowerCase();
                defpackage.akcr.a(r5, r4);
                r6 = 0;
                r2 = defpackage.akgb.b(r2, r5, r6);
                if (r2 != 0) goto L_0x00a6;
            L_0x004d:
                r2 = r1.a;
                r2 = r2.a;
                if (r2 == 0) goto L_0x00a0;
            L_0x0053:
                r2 = r2.toLowerCase();
                defpackage.akcr.a(r2, r4);
                r5 = java.lang.String.valueOf(r8);
                if (r5 == 0) goto L_0x009a;
            L_0x0060:
                r5 = r5.toLowerCase();
                defpackage.akcr.a(r5, r4);
                r2 = defpackage.akgb.b(r2, r5, r6);
                if (r2 != 0) goto L_0x00a6;
            L_0x006d:
                r1 = r1.a;
                r1 = r1.c;
                if (r1 == 0) goto L_0x0094;
            L_0x0073:
                r1 = r1.toLowerCase();
                defpackage.akcr.a(r1, r4);
                r2 = java.lang.String.valueOf(r8);
                if (r2 == 0) goto L_0x008e;
            L_0x0080:
                r2 = r2.toLowerCase();
                defpackage.akcr.a(r2, r4);
                r1 = defpackage.akgb.b(r1, r2, r6);
                if (r1 == 0) goto L_0x00a7;
            L_0x008d:
                goto L_0x00a6;
            L_0x008e:
                r8 = new ajxt;
                r8.<init>(r3);
                throw r8;
            L_0x0094:
                r8 = new ajxt;
                r8.<init>(r3);
                throw r8;
            L_0x009a:
                r8 = new ajxt;
                r8.<init>(r3);
                throw r8;
            L_0x00a0:
                r8 = new ajxt;
                r8.<init>(r3);
                throw r8;
            L_0x00a6:
                r6 = 1;
            L_0x00a7:
                if (r6 == 0) goto L_0x001b;
            L_0x00a9:
                r11.add(r0);
                goto L_0x001b;
            L_0x00ae:
                r8 = new ajxt;
                r8.<init>(r3);
                throw r8;
            L_0x00b4:
                r8 = new ajxt;
                r8.<init>(r3);
                throw r8;
            L_0x00ba:
                r11 = (java.util.List) r11;
                r9.a(r11);
                r8 = r7.a;
                r8 = r8.a;
                r8 = r8.d;
                r8.notifyDataSetChanged();
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.shared.phonenumber.PhonePickerView$a$AnonymousClass1.onTextChanged(java.lang.CharSequence, int, int, int):void");
            }
        }

        a(PhonePickerView phonePickerView, Context context) {
            this.a = phonePickerView;
            this.b = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Builder builder = new Builder(this.b);
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.country_code_view, null);
            builder.setView(inflate);
            Object obj = (RecyclerView) inflate.findViewById(R.id.recycler_view);
            akcr.a(obj, "recycleCenter");
            obj.setLayoutManager(new LinearLayoutManager(this.b));
            obj.setAdapter(this.a.d);
            this.a.d.a(((List) this.a.h.b()));
            this.a.d.notifyDataSetChanged();
            ((EditText) inflate.findViewById(R.id.search_bar)).addTextChangedListener(new AnonymousClass1(this));
            return builder.create();
        }
    }

    static final class b extends akcs implements akbk<List<jue>> {
        private /* synthetic */ PhonePickerView a;

        public static final class a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return ajzy.a(((jue) t).a.b, ((jue) t2).a.b);
            }
        }

        b(PhonePickerView phonePickerView) {
            this.a = phonePickerView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            List arrayList = new ArrayList();
            for (Entry entry : iqo.a().entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Object obj = Locale.getDefault();
                akcr.a(obj, "Locale.getDefault()");
                Object displayCountry = new Locale(obj.getLanguage(), str).getDisplayCountry();
                akcr.a(displayCountry, "display");
                arrayList.add(new jue(new jud(str, displayCountry, str2), new akbl<jud, ajxw>(this.a) {
                    public final String getName() {
                        return "countryCodeSelected";
                    }

                    public final akej getOwner() {
                        return akde.a(PhonePickerView.class);
                    }

                    public final String getSignature() {
                        return "countryCodeSelected(Lcom/snap/identity/ui/shared/phonenumber/CountryCodeItem;)V";
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        jud jud = (jud) obj;
                        akcr.b(jud, "p1");
                        PhonePickerView phonePickerView = (PhonePickerView) this.receiver;
                        phonePickerView.b(jud.a);
                        AlertDialog a = phonePickerView.a();
                        if (a != null) {
                            a.dismiss();
                        }
                        return ajxw.a;
                    }
                }));
            }
            if (arrayList.size() > 1) {
                ajyq.a(arrayList, new a());
            }
            return arrayList;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(PhonePickerView.class), "alertDialog", "getAlertDialog()Landroid/app/AlertDialog;"), new akdc(akde.a(PhonePickerView.class), "allCountryItems", "getAllCountryItems()Ljava/util/List;")};
    }

    public PhonePickerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private PhonePickerView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        String str = "";
        this.b = str;
        this.c = str;
        this.d = new juc();
        this.g = ajxh.a(new a(this, context));
        this.h = ajxh.a(new b(this));
        setOrientation(0);
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            final LayoutInflater layoutInflater = (LayoutInflater) systemService;
            layoutInflater.inflate(R.layout.phone_picker_view, this, true);
            if (getLayoutParams() == null && attributeSet != null) {
                setLayoutParams(new LayoutParams(context, attributeSet));
            }
            Object findViewById = findViewById(R.id.phone_country_code_field);
            akcr.a(findViewById, "findViewById(R.id.phone_country_code_field)");
            this.e = (TextView) findViewById;
            this.e.setOnClickListener(new OnClickListener(this) {
                private /* synthetic */ PhonePickerView a;

                public final void onClick(View view) {
                    AlertDialog a = this.a.a();
                    if (a != null) {
                        a.show();
                    }
                }
            });
            findViewById = findViewById(R.id.phone_form_field);
            akcr.a(findViewById, "findViewById(R.id.phone_form_field)");
            this.f = (EditText) findViewById;
            this.f.addTextChangedListener(new AnonymousClass2(this));
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* Access modifiers changed, original: final */
    public final AlertDialog a() {
        return (AlertDialog) this.g.b();
    }

    public final void a(String str) {
        akcr.b(str, "value");
        CharSequence charSequence = str;
        Appendable stringBuilder = new StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (Character.isDigit(charAt)) {
                stringBuilder.append(charAt);
            }
        }
        Object stringBuilder2 = ((StringBuilder) stringBuilder).toString();
        akcr.a(stringBuilder2, "filterTo(StringBuilder(), predicate).toString()");
        this.b = stringBuilder2;
        stringBuilder2 = juo.a(this.b, this.c);
        if ((akcr.a(this.f.getText().toString(), stringBuilder2) ^ 1) != 0) {
            this.f.setText((CharSequence) stringBuilder2);
            this.f.setSelection(stringBuilder2.length());
        }
        akbw akbw = this.a;
        if (akbw != null) {
            akbw.invoke(this.c, this.b);
        }
    }

    public final void b(String str) {
        akcr.b(str, "value");
        int i = 1;
        if ((akcr.a(this.c, (Object) str) ^ 1) != 0) {
            if (str.length() <= 0) {
                i = 0;
            }
            if (i != 0) {
                this.c = str;
                TextView textView = this.e;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.c);
                stringBuilder.append(" + ");
                stringBuilder.append((String) iqo.a().get(this.c));
                textView.setText(stringBuilder.toString());
                akbw akbw = this.a;
                if (akbw != null) {
                    akbw.invoke(this.c, this.b);
                }
            }
        }
    }
}
