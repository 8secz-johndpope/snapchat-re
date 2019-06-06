package com.snap.lenses.camera.debug;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.absj;
import defpackage.ajdp;
import defpackage.ajpy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akgc;
import defpackage.aqd;
import defpackage.cfu;
import defpackage.lxs;
import defpackage.lxs.b;
import defpackage.lxs.b.e;
import java.util.Arrays;
import java.util.Map.Entry;

public final class DefaultDebugView extends LinearLayout implements lxs {
    Switch a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TableLayout g;
    private int h;
    private int i;
    private float j;
    private final ajxe k;

    static final class a extends akcs implements akbk<ajdp<defpackage.lxs.a>> {
        private /* synthetic */ DefaultDebugView a;

        a(DefaultDebugView defaultDebugView) {
            this.a = defaultDebugView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Switch switchR = this.a.a;
            if (switchR == null) {
                akcr.a("qaProfilingSwitch");
            }
            Object p = cfu.a(switchR).p(AnonymousClass1.a);
            akcr.a(p, "checkedChanges(qaProfili…      }\n                }");
            p = p.a(defpackage.lxs.a.class);
            akcr.a(p, "cast(R::class.java)");
            return ajpy.k(p).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultDebugView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultDebugView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultDebugView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.k = ajxh.a(new a(this));
    }

    public final ajdp<defpackage.lxs.a> a() {
        return (ajdp) this.k.b();
    }

    public final /* synthetic */ void accept(Object obj) {
        b bVar = (b) obj;
        akcr.b(bVar, "viewModel");
        String str = "cameraAverageFps";
        String str2 = "cameraAverageMs";
        String str3 = "processingTimeSd";
        String str4 = "qaProfilingTable";
        String str5 = "processingTimeAverageFps";
        String str6 = "processingTimeAverageMs";
        if (bVar instanceof defpackage.lxs.b.a) {
            setVisibility(8);
            TextView textView = this.b;
            if (textView == null) {
                akcr.a(str6);
            }
            textView.setText(null);
            textView = this.c;
            if (textView == null) {
                akcr.a(str5);
            }
            textView.setText(null);
            textView = this.d;
            if (textView == null) {
                akcr.a(str3);
            }
            textView.setText(null);
            textView = this.e;
            if (textView == null) {
                akcr.a(str2);
            }
            textView.setText(null);
            textView = this.f;
            if (textView == null) {
                akcr.a(str);
            }
            textView.setText(null);
            TableLayout tableLayout = this.g;
            if (tableLayout == null) {
                akcr.a(str4);
            }
            tableLayout.removeAllViews();
        } else if (bVar instanceof b.b) {
            setVisibility(0);
            TextView textView2 = this.b;
            if (textView2 == null) {
                akcr.a(str6);
            }
            Object[] objArr = new Object[1];
            objArr[0] = Double.valueOf(((b.b) bVar).a);
            str6 = "%.3f";
            Object format = String.format(str6, Arrays.copyOf(objArr, 1));
            String str7 = "java.lang.String.format(this, *args)";
            akcr.a(format, str7);
            textView2.setText((CharSequence) format);
            textView2 = this.c;
            if (textView2 == null) {
                akcr.a(str5);
            }
            format = String.format(str6, Arrays.copyOf(new Object[]{Double.valueOf(r13.c)}, 1));
            akcr.a(format, str7);
            textView2.setText((CharSequence) format);
            textView2 = this.d;
            if (textView2 == null) {
                akcr.a(str3);
            }
            Object format2 = String.format(str6, Arrays.copyOf(new Object[]{Double.valueOf(r13.b)}, 1));
            akcr.a(format2, str7);
            textView2.setText((CharSequence) format2);
            textView2 = this.e;
            if (textView2 == null) {
                akcr.a(str2);
            }
            Object format3 = String.format(str6, Arrays.copyOf(new Object[]{Double.valueOf(r13.d)}, 1));
            akcr.a(format3, str7);
            textView2.setText((CharSequence) format3);
            textView2 = this.f;
            if (textView2 == null) {
                akcr.a(str);
            }
            obj = String.format(str6, Arrays.copyOf(new Object[]{Double.valueOf(r13.e)}, 1));
            akcr.a(obj, str7);
            textView2.setText((CharSequence) obj);
        } else {
            if (bVar instanceof e) {
                setVisibility(0);
                TableLayout tableLayout2 = this.g;
                if (tableLayout2 == null) {
                    akcr.a(str4);
                }
                tableLayout2.removeAllViews();
                LayoutParams layoutParams = new LayoutParams(this.h, -2);
                for (Entry entry : ((e) bVar).a.entrySet()) {
                    TextView textView3 = new TextView(tableLayout2.getContext());
                    str4 = (String) entry.getKey();
                    if (str4 != null) {
                        textView3.setText(akgc.b(str4).toString());
                        textView3.setTextColor(-1);
                        textView3.setTextSize(0, this.j);
                        textView3.setGravity(8388611);
                        int i = this.i;
                        textView3.setPadding(i, i, i, i);
                        TextView textView4 = new TextView(tableLayout2.getContext());
                        textView4.setText(textView4.getResources().getString(R.string.camera_debug_value_ms, new Object[]{entry.getValue()}));
                        textView4.setTextColor(-1);
                        textView4.setTextSize(0, this.j);
                        textView4.setGravity(8388613);
                        textView4.setSingleLine(true);
                        int i2 = this.i;
                        textView4.setPadding(i2, i2, i2, i2);
                        TableRow tableRow = new TableRow(tableLayout2.getContext());
                        tableRow.setLayoutParams(layoutParams);
                        tableRow.addView(textView3);
                        tableRow.addView(textView4);
                        tableLayout2.addView(tableRow);
                    } else {
                        throw new ajxt("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        int paddingLeft = getPaddingLeft();
        Object a = absj.a();
        akcr.a(a, "StatusBarUtils.getInstance()");
        setPadding(paddingLeft, a.c(), getPaddingRight(), getPaddingBottom());
        Object findViewById = findViewById(R.id.processing_time_average_value);
        akcr.a(findViewById, "findViewById(R.id.processing_time_average_value)");
        this.b = (TextView) findViewById;
        findViewById = findViewById(R.id.processing_time_average_fps_value);
        akcr.a(findViewById, "findViewById(R.id.proces…g_time_average_fps_value)");
        this.c = (TextView) findViewById;
        findViewById = findViewById(R.id.processing_time_sd_value);
        akcr.a(findViewById, "findViewById(R.id.processing_time_sd_value)");
        this.d = (TextView) findViewById;
        findViewById = findViewById(R.id.camera_average_ms_value);
        akcr.a(findViewById, "findViewById(R.id.camera_average_ms_value)");
        this.e = (TextView) findViewById;
        findViewById = findViewById(R.id.camera_average_fps_value);
        akcr.a(findViewById, "findViewById(R.id.camera_average_fps_value)");
        this.f = (TextView) findViewById;
        findViewById = findViewById(R.id.camera_qa_profiling_table);
        akcr.a(findViewById, "findViewById(R.id.camera_qa_profiling_table)");
        this.g = (TableLayout) findViewById;
        findViewById = findViewById(R.id.camera_qa_profiling_switch);
        akcr.a(findViewById, "findViewById(R.id.camera_qa_profiling_switch)");
        this.a = (Switch) findViewById;
        this.h = getResources().getDimensionPixelSize(R.dimen.lens_camera_debug_table_optimal_width);
        this.i = getResources().getDimensionPixelSize(R.dimen.lens_camera_debug_table_row_item_padding);
        this.j = getResources().getDimension(R.dimen.lens_camera_debug_text_size);
        setVisibility(8);
    }
}
