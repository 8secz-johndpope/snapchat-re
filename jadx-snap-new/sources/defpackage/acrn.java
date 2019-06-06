package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.adew.a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* renamed from: acrn */
public final class acrn {
    final tnj a;
    final ajei b;
    boolean c;
    public ViewGroup d;
    ViewGroup e;
    TextView f;
    public LayoutParams g;
    private final zfw h;
    private final a i;
    private final long j;
    private final ftl k;
    private alkk l;
    private ViewGroup m;
    private ImageView n;
    private TextView o;
    private final Resources p;
    private final acro q;
    private SimpleDateFormat r;
    private boolean s = true;
    private abur<ViewGroup> t;

    /* renamed from: acrn$1 */
    class 1 implements OnClickListener {
        1() {
        }

        public final void onClick(View view) {
            if (acrn.this.e.getVisibility() == 0 && acrn.this.f.getText() != null && acrn.this.f.getText().length() > 0) {
                acrn acrn = acrn.this;
                acrn.c ^= 1;
                acrn.this.b.a(acrn.this.a.b().a(adew.IS_TEMPERATURE_SCALE_IMPERIAL, acrn.this.c ? a.TRUE : a.FALSE).b());
                acrn.this.d();
            }
        }
    }

    /* renamed from: acrn$a */
    public interface a {
        String a(Context context, defpackage.alkk.a aVar, int i, boolean z);
    }

    /* renamed from: acrn$b */
    public enum b {
        UNKNOWN(0, R.drawable.sunny),
        CLEAR_NIGHT(1, R.drawable.clear_night),
        CLOUDY(2, R.drawable.cloudy),
        HAIL(3, R.drawable.hail),
        LIGHTNING(4, R.drawable.lightning),
        LOW_VISIBILITY(5, R.drawable.cloudy),
        PARTIAL_CLOUDY(6, R.drawable.partly_cloudy),
        PARTIAL_CLOUDY_NIGHT(7, R.drawable.night_cloudy),
        RAINY(8, R.drawable.rainy),
        SNOW(9, R.drawable.snow),
        SUNNY(10, R.drawable.sunny),
        WINDY(11, R.drawable.windy);
        
        private static final SparseArray<b> map = null;
        final int drawableResId;
        final int weather;

        static {
            map = new SparseArray();
            b[] values = b.values();
            int length = values.length;
            int i;
            while (i < length) {
                b bVar = values[i];
                map.put(bVar.weather, bVar);
                i++;
            }
        }

        private b(int i, int i2) {
            this.weather = i;
            this.drawableResId = i2;
        }

        public static b a(int i) {
            b bVar = (b) map.get(i);
            return bVar == null ? UNKNOWN : bVar;
        }
    }

    public acrn(a aVar, Resources resources, acro acro, ftl ftl, tnj tnj, ajei ajei) {
        this.i = aVar;
        this.p = resources;
        this.j = 250;
        this.q = acro;
        this.k = ftl;
        this.a = tnj;
        this.b = ajei;
        this.h = zgb.a(adcw.b.callsite("SnapMapMetadata"));
    }

    private static void a(TextView textView, String str) {
        if (!str.equals(textView.getText())) {
            textView.setText(str);
        }
    }

    private /* synthetic */ void b(alkk alkk) {
        if (this.d == null) {
            abur abur = this.t;
            if (abur != null) {
                a((ViewGroup) ((ViewGroup) abur.a()).findViewById(R.id.map_metadata));
            }
        }
        if (this.d != null) {
            this.l = alkk;
            acro acro = this.q;
            if (acro == null || acro.a()) {
                String str = null;
                int i = 8;
                if (alkk != null) {
                    Object obj = 1;
                    if ((alkk.c < Integer.MAX_VALUE ? 1 : null) != null) {
                        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(alkk.c, "TimezoneOffset");
                        Date time = Calendar.getInstance().getTime();
                        this.r.setTimeZone(TimeZone.getDefault());
                        String format = this.r.format(time);
                        this.r.setTimeZone(simpleTimeZone);
                        String format2 = this.r.format(time);
                        if (!format2.equals(format)) {
                            str = format2.toLowerCase(Locale.getDefault());
                        }
                        Object obj2 = str != null ? 1 : null;
                        if (obj2 != null) {
                            acrn.a(this.o, str);
                        }
                        if (alkk.d == null) {
                            obj = null;
                        }
                        if (obj != null) {
                            d();
                            this.n.setImageDrawable(this.p.getDrawable(b.a(alkk.d.a).drawableResId));
                        }
                        this.o.setVisibility(obj2 != null ? 0 : 8);
                        this.e.setVisibility(obj != null ? 0 : 8);
                        ViewGroup viewGroup = this.m;
                        int i2 = (obj2 == null || obj == null) ? 8 : 0;
                        viewGroup.setVisibility(i2);
                        if (!(obj2 == null && obj == null)) {
                            i = 0;
                        }
                        a(i);
                    }
                }
                this.l = null;
                a(i);
            }
        }
    }

    public final Bitmap a() {
        ViewGroup viewGroup = this.d;
        return viewGroup == null ? null : viewGroup.getDrawingCache();
    }

    public final void a(int i) {
        if (this.d != null) {
            if (i == 4) {
                i = 8;
            }
            if (this.d.getVisibility() != i || this.d.getAnimation() != null) {
                if ((i == 0 && this.l != null) || i == 8) {
                    this.d.clearAnimation();
                    acks.a.a(this.d, i, 250, null);
                }
            }
        }
    }

    public final void a(alkk alkk) {
        this.h.l().a((Runnable) new -$$Lambda$acrn$cLHPGBYmC3y4zqN13y_t3HdhBMQ(this, alkk));
    }

    public final void a(View view) {
        this.t = new abur(view, (int) R.id.map_metadata, (int) R.id.map_metadata);
    }

    public final void a(ViewGroup viewGroup) {
        SimpleDateFormat simpleDateFormat;
        this.d = viewGroup;
        LayoutParams layoutParams = this.g;
        if (layoutParams != null) {
            this.d.setLayoutParams(layoutParams);
            this.g = null;
        }
        if (DateFormat.is24HourFormat(viewGroup.getContext())) {
            simpleDateFormat = new SimpleDateFormat("H:mm", Locale.US);
        } else {
            simpleDateFormat = new SimpleDateFormat("h:mm aa", Locale.US);
        }
        this.r = simpleDateFormat;
        a aVar = (a) this.k.y(adew.IS_TEMPERATURE_SCALE_IMPERIAL);
        boolean equals = TextUtils.equals(Locale.getDefault().getCountry(), Locale.US.getCountry());
        if (aVar == a.TRUE) {
            equals = true;
        } else if (aVar == a.FALSE) {
            equals = false;
        }
        this.c = equals;
        this.e = (ViewGroup) viewGroup.findViewById(R.id.weather_container);
        this.m = (ViewGroup) viewGroup.findViewById(R.id.divider_container);
        this.f = (TextView) viewGroup.findViewById(R.id.weather_temp);
        this.n = (ImageView) viewGroup.findViewById(R.id.weather_icon);
        this.o = (TextView) viewGroup.findViewById(R.id.time);
        if (this.s) {
            this.e.setOnClickListener(new 1());
        }
        viewGroup.setDrawingCacheEnabled(true);
        viewGroup.setVisibility(8);
    }

    public final boolean b() {
        ViewGroup viewGroup = this.d;
        return viewGroup != null && viewGroup.getVisibility() == 0;
    }

    public final void c() {
        this.s = false;
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        alkk alkk = this.l;
        if (alkk != null) {
            alkk.a aVar = alkk.d;
            if (aVar != null) {
                int i = (int) this.l.d.b;
                TextView textView = this.f;
                a aVar2 = this.i;
                Context context = textView.getContext();
                if (!this.c) {
                    double d = (double) (i - 32);
                    Double.isNaN(d);
                    i = (int) (d * 0.5556d);
                }
                acrn.a(textView, aVar2.a(context, aVar, i, this.c));
            }
        }
    }
}
