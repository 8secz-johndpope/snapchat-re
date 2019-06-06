package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintLayout.a;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.akdd.e;
import java.util.List;

/* renamed from: zvo */
public final class zvo extends zly<tqj, zvp> {
    SnapFontTextView a;
    TextView b;
    ConstraintLayout c;
    ImageView d;
    boolean e;
    private final ajxe f = ajxh.a(new c(this));
    private RelativeLayout g;
    private ImageView h;
    private ImageView i;
    private LinearLayout j;
    private final ajei k = new ajei();

    /* renamed from: zvo$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zvo$b */
    public final class b extends SimpleOnGestureListener {
        private boolean a;
        private Rect b = new Rect();

        public final boolean onDown(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            zvo.a(zvo.this).getGlobalVisibleRect(this.b);
            boolean z = ((int) motionEvent.getY()) > this.b.top && ((int) motionEvent.getY()) < this.b.bottom;
            if (z) {
                this.a = true;
                zvo.this.e = false;
            }
            return z;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            akcr.b(motionEvent, "e1");
            akcr.b(motionEvent2, "e2");
            if (this.a) {
                zvo.this.e = Math.abs(motionEvent2.getY() - motionEvent.getY()) > Math.abs(motionEvent2.getX() - motionEvent.getX());
                this.a = false;
            }
            if (zvo.this.e) {
                zvo zvo = zvo.this;
                SnapFontTextView snapFontTextView = zvo.a;
                if (snapFontTextView == null) {
                    akcr.a("titleText");
                }
                String obj = snapFontTextView.getText().toString();
                TextView textView = zvo.this.b;
                if (textView == null) {
                    akcr.a("localityText");
                }
                zvo.a(obj, textView.getText().toString(), f2);
            }
            return zvo.this.e;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            zvo.a(zvo.this).getGlobalVisibleRect(this.b);
            if (((int) motionEvent.getY()) <= this.b.top || ((int) motionEvent.getY()) >= this.b.bottom) {
                return false;
            }
            zvo zvo = zvo.this;
            zmy model = zvo.getModel();
            if (model == null) {
                akcr.a();
            }
            zvp zvp = (zvp) model;
            if (zvp.a.a().size() == 1) {
                ConstraintLayout constraintLayout = zvo.c;
                String str = "constraintInnerLayout";
                if (constraintLayout == null) {
                    akcr.a(str);
                }
                Animation loadAnimation = AnimationUtils.loadAnimation(constraintLayout.getContext(), R.anim.single_venue_filter);
                ConstraintLayout constraintLayout2 = zvo.c;
                if (constraintLayout2 == null) {
                    akcr.a(str);
                }
                constraintLayout2.startAnimation(loadAnimation);
            }
            int i = zvp.b;
            zvp.b = (zvp.b + 1) % zvp.a.a().size();
            if (zvp.b < i) {
                zvp.c = true;
            }
            List a = zvp.a.a();
            if (a != null) {
                acac acac = (acac) ajyu.a(a, zvp.b);
                if (acac != null) {
                    String c = acac.c();
                    if (c != null) {
                        akcr.a((Object) c, "it");
                        akcr.b(c, "venueId");
                        zvp.a.a(c);
                    }
                }
            }
            if (zvp.c()) {
                ImageView imageView = zvo.d;
                if (imageView == null) {
                    akcr.a("feedbackButtonView");
                }
                imageView.setVisibility(0);
            }
            zvo.a(zvp.a(), zvp.b(), MapboxConstants.MINIMUM_ZOOM);
            return true;
        }
    }

    /* renamed from: zvo$d */
    static final class d<T> implements ajfb<tqh> {
        private /* synthetic */ zvo a;

        d(zvo zvo) {
            this.a = zvo;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((tqh) obj) == tqh.OVERLAY_CAPTURE) {
                ImageView imageView = this.a.d;
                if (imageView == null) {
                    akcr.a("feedbackButtonView");
                }
                imageView.setVisibility(4);
            }
        }
    }

    /* renamed from: zvo$c */
    static final class c extends akcs implements akbk<GestureDetector> {
        final /* synthetic */ zvo a;

        c(zvo zvo) {
            this.a = zvo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            GestureDetector gestureDetector = new GestureDetector(zvo.b(this.a).getContext(), new b());
            final e eVar = new e();
            eVar.a = new int[2];
            final e eVar2 = new e();
            eVar2.a = new int[2];
            zvo.b(this.a).setOnTouchListener(new OnTouchListener(this) {
                private /* synthetic */ c a;

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean onTouchEvent = this.a.a.a().onTouchEvent(motionEvent);
                    if (!this.a.a.e) {
                        zvo.b(this.a.a).getLocationOnScreen((int[]) eVar.a);
                        tqj tqj = (tqj) this.a.a.e();
                        int[] iArr = (int[]) eVar2.a;
                        akcr.b(iArr, "coord");
                        tqj.r.getLocationOnScreen(iArr);
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        float f = (float) (((int[]) eVar.a)[0] - ((int[]) eVar2.a)[0]);
                        akcr.a((Object) motionEvent, "ev");
                        obtain.setLocation(f + motionEvent.getX(), ((float) (((int[]) eVar.a)[1] - ((int[]) eVar2.a)[1])) + motionEvent.getY());
                        tqj tqj2 = (tqj) this.a.a.e();
                        akcr.a((Object) obtain, "newEv");
                        tqj2.a(obtain);
                    }
                    return onTouchEvent;
                }
            });
            return gestureDetector;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zvo.class), "detector", "getDetector()Landroid/view/GestureDetector;");
        a aVar = new a();
    }

    public static final /* synthetic */ LinearLayout a(zvo zvo) {
        LinearLayout linearLayout = zvo.j;
        if (linearLayout == null) {
            akcr.a("textboxesView");
        }
        return linearLayout;
    }

    public static final /* synthetic */ RelativeLayout b(zvo zvo) {
        RelativeLayout relativeLayout = zvo.g;
        if (relativeLayout == null) {
            akcr.a("relativeLayout");
        }
        return relativeLayout;
    }

    private void b(String str, String str2, float f) {
        akcr.b(str, "title");
        akcr.b(str2, "subtitle");
        Object context = getItemView().getContext();
        akcr.a(context, "itemView.context");
        context = context.getResources();
        akcr.a(context, "itemView.context.resources");
        float f2 = ((float) context.getDisplayMetrics().heightPixels) * 0.8f;
        ConstraintLayout constraintLayout = this.c;
        String str3 = "constraintInnerLayout";
        if (constraintLayout == null) {
            akcr.a(str3);
        }
        LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            int i;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (int) Math.min(Math.max(f, MapboxConstants.MINIMUM_ZOOM), f2);
            zvp zvp = (zvp) getModel();
            if (zvp != null) {
                zvp.a(Double.valueOf((double) marginLayoutParams.bottomMargin));
            }
            ConstraintLayout constraintLayout2 = this.c;
            if (constraintLayout2 == null) {
                akcr.a(str3);
            }
            constraintLayout2.setLayoutParams(marginLayoutParams);
            SnapFontTextView snapFontTextView = this.a;
            String str4 = "titleText";
            if (snapFontTextView == null) {
                akcr.a(str4);
            }
            snapFontTextView.setText(str);
            TextView textView = this.b;
            String str5 = "localityText";
            if (textView == null) {
                akcr.a(str5);
            }
            CharSequence charSequence = str2;
            textView.setText(charSequence);
            if (akgb.a(charSequence)) {
                textView = this.b;
                if (textView == null) {
                    akcr.a(str5);
                }
                i = 8;
            } else {
                textView = this.b;
                if (textView == null) {
                    akcr.a(str5);
                }
                i = 0;
            }
            textView.setVisibility(i);
            ImageView imageView = this.h;
            if (imageView == null) {
                akcr.a("leftImageView");
            }
            imageView.forceLayout();
            imageView = this.i;
            if (imageView == null) {
                akcr.a("rightImageView");
            }
            imageView.forceLayout();
            textView = this.b;
            if (textView == null) {
                akcr.a(str5);
            }
            textView.forceLayout();
            SnapFontTextView snapFontTextView2 = this.a;
            if (snapFontTextView2 == null) {
                akcr.a(str4);
            }
            snapFontTextView2.forceLayout();
            LinearLayout linearLayout = this.j;
            if (linearLayout == null) {
                akcr.a("textboxesView");
            }
            linearLayout.forceLayout();
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* Access modifiers changed, original: final */
    public final GestureDetector a() {
        return (GestureDetector) this.f.b();
    }

    public final void a(String str, String str2, float f) {
        akcr.b(str, "title");
        akcr.b(str2, "subtitle");
        ConstraintLayout constraintLayout = this.c;
        if (constraintLayout == null) {
            akcr.a("constraintInnerLayout");
        }
        LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            b(str, str2, ((float) ((MarginLayoutParams) layoutParams).bottomMargin) + f);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final /* synthetic */ void a(zlx zlx, View view) {
        akcr.b((tqj) zlx, "bindingContext");
        akcr.b(view, "itemView");
        Object findViewById = view.findViewById(R.id.filter_title);
        akcr.a(findViewById, "itemView.findViewById(R.id.filter_title)");
        this.a = (SnapFontTextView) findViewById;
        findViewById = view.findViewById(R.id.filter_locality);
        akcr.a(findViewById, "itemView.findViewById(R.id.filter_locality)");
        this.b = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.venue_anchor_view);
        if (findViewById2 != null) {
            this.g = (RelativeLayout) findViewById2;
            findViewById2 = view.findViewById(R.id.venue_inner_view);
            if (findViewById2 != null) {
                this.c = (ConstraintLayout) findViewById2;
                ConstraintLayout constraintLayout = this.c;
                if (constraintLayout == null) {
                    akcr.a("constraintInnerLayout");
                }
                if (constraintLayout != null) {
                    Drawable background = constraintLayout.getBackground();
                    if (background != null) {
                        background.setAlpha(93);
                    }
                }
                findViewById2 = view.findViewById(R.id.view_left);
                String str = "null cannot be cast to non-null type android.widget.ImageView";
                if (findViewById2 != null) {
                    this.h = (ImageView) findViewById2;
                    findViewById2 = view.findViewById(R.id.view_right);
                    if (findViewById2 != null) {
                        this.i = (ImageView) findViewById2;
                        findViewById2 = view.findViewById(R.id.venuefilter_textboxes);
                        if (findViewById2 != null) {
                            this.j = (LinearLayout) findViewById2;
                            findViewById = view.findViewById(R.id.venuefilter_reporting_tool_img);
                            akcr.a(findViewById, "itemView.findViewById(R.…ilter_reporting_tool_img)");
                            this.d = (ImageView) findViewById;
                            findViewById = view.getContext();
                            akcr.a(findViewById, "itemView.context");
                            findViewById = findViewById.getResources();
                            akcr.a(findViewById, "itemView.context.resources");
                            int i = findViewById.getDisplayMetrics().widthPixels;
                            ImageView imageView = this.h;
                            str = "leftImageView";
                            if (imageView == null) {
                                akcr.a(str);
                            }
                            LayoutParams layoutParams = imageView.getLayoutParams();
                            String str2 = "null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams";
                            if (layoutParams != null) {
                                i -= ((a) layoutParams).I;
                                imageView = this.h;
                                if (imageView == null) {
                                    akcr.a(str);
                                }
                                layoutParams = imageView.getLayoutParams();
                                if (layoutParams != null) {
                                    i -= ((a) layoutParams).leftMargin;
                                    imageView = this.h;
                                    if (imageView == null) {
                                        akcr.a(str);
                                    }
                                    layoutParams = imageView.getLayoutParams();
                                    if (layoutParams != null) {
                                        i -= ((a) layoutParams).rightMargin;
                                        LinearLayout linearLayout = this.j;
                                        str = "textboxesView";
                                        if (linearLayout == null) {
                                            akcr.a(str);
                                        }
                                        layoutParams = linearLayout.getLayoutParams();
                                        if (layoutParams != null) {
                                            i -= ((a) layoutParams).leftMargin;
                                            linearLayout = this.j;
                                            if (linearLayout == null) {
                                                akcr.a(str);
                                            }
                                            layoutParams = linearLayout.getLayoutParams();
                                            if (layoutParams != null) {
                                                i -= ((a) layoutParams).rightMargin;
                                                imageView = this.i;
                                                str = "rightImageView";
                                                if (imageView == null) {
                                                    akcr.a(str);
                                                }
                                                layoutParams = imageView.getLayoutParams();
                                                if (layoutParams != null) {
                                                    i -= ((a) layoutParams).I;
                                                    imageView = this.i;
                                                    if (imageView == null) {
                                                        akcr.a(str);
                                                    }
                                                    layoutParams = imageView.getLayoutParams();
                                                    if (layoutParams != null) {
                                                        i -= ((a) layoutParams).leftMargin;
                                                        imageView = this.i;
                                                        if (imageView == null) {
                                                            akcr.a(str);
                                                        }
                                                        layoutParams = imageView.getLayoutParams();
                                                        if (layoutParams != null) {
                                                            i -= ((a) layoutParams).rightMargin;
                                                            SnapFontTextView snapFontTextView = this.a;
                                                            if (snapFontTextView == null) {
                                                                akcr.a("titleText");
                                                            }
                                                            snapFontTextView.setMaxWidth(i);
                                                            return;
                                                        }
                                                        throw new ajxt(str2);
                                                    }
                                                    throw new ajxt(str2);
                                                }
                                                throw new ajxt(str2);
                                            }
                                            throw new ajxt(str2);
                                        }
                                        throw new ajxt(str2);
                                    }
                                    throw new ajxt(str2);
                                }
                                throw new ajxt(str2);
                            }
                            throw new ajxt(str2);
                        }
                        throw new ajxt("null cannot be cast to non-null type android.widget.LinearLayout");
                    }
                    throw new ajxt(str);
                }
                throw new ajxt(str);
            }
            throw new ajxt("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.RelativeLayout");
    }

    public final /* synthetic */ void onBind(zmy zmy, zmy zmy2) {
        zvp zvp = (zvp) zmy;
        akcr.b(zvp, "viewModel");
        a();
        if (zvp.a.c() != null) {
            b(zvp.a(), zvp.b(), (float) zvp.a.c().doubleValue());
        } else {
            a(zvp.a(), zvp.b(), MapboxConstants.MINIMUM_ZOOM);
        }
        if (zvp.c()) {
            ImageView imageView = this.d;
            if (imageView == null) {
                akcr.a("feedbackButtonView");
            }
            imageView.setVisibility(0);
        }
        this.k.a(((tqj) e()).i.f((ajfb) new d(this)));
    }

    public final void onRecycle() {
        this.k.a();
        super.onRecycle();
    }
}
