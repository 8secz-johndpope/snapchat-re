package com.snap.hova;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.snap.ui.view.ViewStubWrapper;
import com.snapchat.android.R;
import defpackage.akcr;
import defpackage.iho;
import defpackage.ipp;
import defpackage.la;

public final class HovaNavIconContainerView extends FrameLayout implements ipp {
    private final ImageView a;
    private final View b;
    private final ViewStub c;
    private a d;
    private boolean e;
    private float f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private ViewStubWrapper<? extends TextView> k;
    private final ViewStubWrapper<View> l;

    public enum a {
        FEED(R.string.feed_title, Integer.valueOf(R.string.v11_feed_title), Integer.valueOf(R.id.hova_nav_feed_icon_name), R.id.hova_nav_feed_icon, Integer.valueOf(R.id.hova_nav_feed_icon_and_badge), R.drawable.hova_nav_feed_primary, Integer.valueOf(R.id.hova_nav_feed_notification_badge), Integer.valueOf(R.drawable.hova_nav_feed_notification_circle)),
        DISCOVER_FEED(R.string.discover_title, Integer.valueOf(R.string.v11_discover_title), Integer.valueOf(R.id.hova_nav_discoverfeed_icon_name), R.id.hova_nav_discoverfeed_icon, Integer.valueOf(R.id.hova_nav_discoverfeed_icon_and_badge), R.drawable.hova_nav_discoverfeed_primary, Integer.valueOf(R.id.hova_nav_discoverfeed_notification_badge), Integer.valueOf(R.drawable.hova_nav_stories_notification_circle)),
        MEMORIES(R.string.memories_title, null, null, R.id.hova_nav_memories_icon, null, R.drawable.hova_nav_memories_empty, Integer.valueOf(R.id.hova_nav_memories_notification_badge), Integer.valueOf(R.drawable.hova_nav_memories_notification_circle)),
        MAP(R.string.maps_title, null, null, R.id.hova_nav_map_icon, null, R.drawable.hova_nav_map, null, null);
        
        final Integer badgeId;
        final Integer badgeResource;
        final Integer iconAndBadgeContainerId;
        final int iconId;
        final Integer iconLabelId;
        final int iconLabelStringRes;
        final int imageResource;
        final Integer v11IconLabelStringRes;

        private a(int i, Integer num, Integer num2, int i2, Integer num3, int i3, Integer num4, Integer num5) {
            this.iconLabelStringRes = i;
            this.v11IconLabelStringRes = num;
            this.iconLabelId = num2;
            this.iconId = i2;
            this.iconAndBadgeContainerId = num3;
            this.imageResource = i3;
            this.badgeId = num4;
            this.badgeResource = num5;
        }
    }

    public HovaNavIconContainerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private HovaNavIconContainerView(Context context, AttributeSet attributeSet, byte b) {
        String str = "context";
        akcr.b(context, str);
        super(context, attributeSet, 0);
        this.f = 1.0f;
        FrameLayout.inflate(context, R.layout.hova_nav_icon_container_view, this);
        Object findViewById = findViewById(R.id.hova_nav_icon_and_badge_container);
        akcr.a(findViewById, "findViewById(R.id.hova_n…icon_and_badge_container)");
        this.b = findViewById;
        findViewById = findViewById(R.id.hova_icon);
        akcr.a(findViewById, "findViewById(R.id.hova_icon)");
        this.a = (ImageView) findViewById;
        findViewById = findViewById(R.id.hova_notification_badge);
        akcr.a(findViewById, "findViewById(R.id.hova_notification_badge)");
        this.c = (ViewStub) findViewById;
        this.l = new ViewStubWrapper(this.c);
        findViewById = findViewById(R.id.hova_icon_name);
        akcr.a(findViewById, "findViewById(R.id.hova_icon_name)");
        this.k = new ViewStubWrapper((ViewStub) findViewById);
        findViewById = getContext().obtainStyledAttributes(attributeSet, defpackage.ipr.a.b);
        akcr.a(findViewById, "context.obtainStyledAttr…HovaNavIconContainerView)");
        try {
            int i = findViewById.getInt(6, 0);
            this.e = findViewById.getBoolean(2, false);
            this.f = findViewById.getFloat(3, 1.0f);
            this.g = findViewById.getDimensionPixelSize(1, 0);
            this.h = findViewById.getDimensionPixelSize(0, 0);
            this.i = findViewById.getBoolean(7, false);
            this.j = findViewById.getBoolean(8, false);
            this.d = a.values()[i];
            ImageView imageView = this.a;
            a aVar = this.d;
            String str2 = "pageType";
            if (aVar == null) {
                akcr.a(str2);
            }
            imageView.setId(aVar.iconId);
            imageView = this.a;
            aVar = this.d;
            if (aVar == null) {
                akcr.a(str2);
            }
            imageView.setImageResource(aVar.imageResource);
            this.b.setScaleX(this.f);
            this.b.setScaleY(this.f);
            a aVar2 = this.d;
            if (aVar2 == null) {
                akcr.a(str2);
            }
            Integer num = aVar2.badgeId;
            if (num != null) {
                i = num.intValue();
                this.c.setId(i);
                this.c.setInflatedId(i);
            }
            aVar2 = this.d;
            if (aVar2 == null) {
                akcr.a(str2);
            }
            num = aVar2.iconAndBadgeContainerId;
            if (num != null) {
                this.b.setId(num.intValue());
            }
            if (this.e) {
                TextView textView = (TextView) this.k.get();
                Object context2 = textView.getContext();
                akcr.a(context2, str);
                textView.setText(context2.getResources().getString(d()));
                textView.setVisibility(0);
            }
            i = findViewById.getResourceId(4, -1);
            if (i != -1) {
                this.a.setBackgroundResource(i);
            }
            i = findViewById.getColor(5, 0);
            if (i != 0) {
                if (VERSION.SDK_INT > 19) {
                    la.a(this.a, ColorStateList.valueOf(i));
                } else {
                    this.a.getDrawable().mutate().setColorFilter(i, Mode.SRC_ATOP);
                }
                TextView textView2 = (TextView) this.k.getIfInflated();
                if (textView2 != null) {
                    textView2.setTextColor(i);
                }
            }
            la.a(this.a, Mode.SRC_ATOP);
        } finally {
            findViewById.recycle();
        }
    }

    private final void a(int i) {
        LayoutParams layoutParams = getLayoutParams();
        Object context = getContext();
        akcr.a(context, "context");
        layoutParams.height = (int) context.getResources().getDimension(i);
        setLayoutParams(layoutParams);
    }

    private final TextView c() {
        TextView textView = (TextView) this.k.getIfInflated();
        if (textView == null) {
            textView = (TextView) this.k.get();
            a aVar = this.d;
            if (aVar == null) {
                akcr.a("pageType");
            }
            Integer num = aVar.iconLabelId;
            if (num != null) {
                textView.setId(num.intValue());
            }
            textView.setVisibility(8);
        }
        return textView;
    }

    private final int d() {
        String str = "pageType";
        a aVar;
        if (this.j) {
            aVar = this.d;
            if (aVar == null) {
                akcr.a(str);
            }
            Integer num = aVar.v11IconLabelStringRes;
            if (num != null) {
                return num.intValue();
            }
            aVar = this.d;
            if (aVar == null) {
                akcr.a(str);
            }
            return aVar.iconLabelStringRes;
        }
        aVar = this.d;
        if (aVar == null) {
            akcr.a(str);
        }
        return aVar.iconLabelStringRes;
    }

    public final Float a() {
        View ifInflated = this.l.getIfInflated();
        return ifInflated != null ? Float.valueOf(ifInflated.getScaleX()) : null;
    }

    public final void a(float f) {
        View ifInflated = this.l.getIfInflated();
        if (ifInflated != null) {
            ifInflated.setScaleX(f);
            ifInflated.setScaleY(f);
        }
    }

    public final void a(boolean z) {
        if (z && this.l.getIfInflated() == null) {
            a aVar = this.d;
            if (aVar == null) {
                akcr.a("pageType");
            }
            Integer num = aVar.badgeResource;
            if (num != null) {
                int intValue = num.intValue();
                View view = this.l.get();
                view.setBackgroundResource(intValue);
                iho.f(view, this.g);
                intValue = this.h;
                akcr.b(view, "receiver$0");
                MarginLayoutParams f = iho.f(view);
                if (f != null) {
                    f.rightMargin = intValue;
                }
            }
        }
        this.l.setVisibility(z ? 0 : 8);
    }

    public final View b() {
        return this.l.getIfInflated();
    }

    public final void b(boolean z) {
        if (!this.e && (this.k.getIfInflated() != null || z)) {
            TextView c = c();
            if (z && c.getVisibility() == 8) {
                int i;
                if (this.i) {
                    Object context = c.getContext();
                    akcr.a(context, "context");
                    c.setText(context.getResources().getString(d()));
                    a((int) R.dimen.hova_icon_container_with_label_size);
                    i = 0;
                } else {
                    i = 4;
                }
                c.setVisibility(i);
            } else if (!(z || c.getVisibility() == 8)) {
                c.setVisibility(8);
                a((int) R.dimen.hova_icon_container_size);
            }
        }
    }
}
