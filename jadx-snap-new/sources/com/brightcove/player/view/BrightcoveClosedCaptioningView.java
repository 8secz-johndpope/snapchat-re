package com.brightcove.player.view;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.brightcove.player.R;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.captioning.BrightcoveCaptionStyle;
import com.brightcove.player.captioning.BrightcoveClosedCaption;
import com.brightcove.player.captioning.BrightcoveClosedCaptioningTextView;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.event.RegisteringEventEmitter;
import com.brightcove.player.management.BrightcoveClosedCaptioningManager;
import com.brightcove.player.mediacontroller.ShowHideController;
import com.brightcove.player.model.Block;
import com.brightcove.player.model.CaptionsDocument;
import com.brightcove.player.model.Length;
import com.brightcove.player.model.Region;
import com.brightcove.player.model.Region.DisplayAlign;
import com.brightcove.player.model.Span;
import com.brightcove.player.model.StyledElement;
import com.brightcove.player.model.StyledElement.FontStyle;
import com.brightcove.player.model.StyledElement.FontWeight;
import com.brightcove.player.model.StyledElement.TextAlign;
import com.brightcove.player.model.StyledElement.TextDecoration;
import com.brightcove.player.model.StyledElement.Unit;
import com.brightcove.player.model.TTMLDocument;
import com.brightcove.player.model.WebVTTDocument;
import com.brightcove.player.util.StringUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

@ListensFor(events = {"caption", "completed", "didLoadClosedCaptions", "progress", "toggleClosedCaptions", "didShowMediaControls", "didHideMediaControls", "selectClosedCaptionTrack"})
@Emits(events = {"captionsAvailable"})
public class BrightcoveClosedCaptioningView extends FrameLayout implements Component {
    @Deprecated
    public static final int DEFAULT_HORIZONTAL_GRAVITY = 17;
    @Deprecated
    public static final int DEFAULT_VERTICAL_GRAVITY = 80;
    protected static final String a = "BrightcoveClosedCaptioningView";
    protected TreeMap<Integer, TimeMapEntry> b;
    protected LinearLayout c;
    int d;
    private EventEmitter e;
    private ClosedCaptioningMode f;
    private LayoutInflater g;
    private int h = -1;
    private int i = 0;
    private BaseVideoView j;
    private Span k;
    private String l;
    private boolean m = true;
    private EventListener n = new EventListener() {
        @Default
        public final void processEvent(Event event) {
            if (BrightcoveClosedCaptioningView.this.isEnabled() && BrightcoveClosedCaptioningView.this.getMode() == ClosedCaptioningMode.ON) {
                if (!(BrightcoveClosedCaptioningView.this.c == null || BrightcoveClosedCaptioningView.this.c.getParent() == null)) {
                    BrightcoveClosedCaptioningView brightcoveClosedCaptioningView = BrightcoveClosedCaptioningView.this;
                    brightcoveClosedCaptioningView.removeView(brightcoveClosedCaptioningView.c);
                }
                Map map = event.properties;
                String str = "text";
                if (map.containsKey(str)) {
                    ViewGroup a = BrightcoveClosedCaptioningView.this.a(BrightcoveClosedCaptioningView.this.a(null, new BrightcoveClosedCaption(-1, -1, (String) map.get(str))));
                    BrightcoveClosedCaptioningView.this.addView(a);
                    a.setVisibility(0);
                    a.invalidate();
                    BrightcoveClosedCaptioningView.this.c = (LinearLayout) a;
                }
            }
        }
    };
    private EventListener o = new EventListener() {
        @Default
        public final void processEvent(Event event) {
            int integerProperty = event.getIntegerProperty(Event.ORIGINAL_PLAYHEAD_POSITION);
            if (integerProperty == -1) {
                integerProperty = event.getIntegerProperty(Event.PLAYHEAD_POSITION);
            }
            BrightcoveClosedCaptioningView.this.a(integerProperty);
        }
    };
    private EventListener p = new EventListener() {
        @Default
        public final void processEvent(Event event) {
            TTMLDocument tTMLDocument = (TTMLDocument) event.properties.get(Event.TTML_DOCUMENT);
            if (tTMLDocument != null) {
                BrightcoveClosedCaptioningView.this.prepareDFXPCaptions(tTMLDocument);
            } else {
                WebVTTDocument webVTTDocument = (WebVTTDocument) event.properties.get(Event.WEBVTT_DOCUMENT);
                if (webVTTDocument != null) {
                    BrightcoveClosedCaptioningView.this.prepareWebVTTCaptions(webVTTDocument);
                } else {
                    Log.e(BrightcoveClosedCaptioningView.a, "Captions document was null. No captions to load.");
                    BrightcoveClosedCaptioningView.this.clear();
                }
            }
            BrightcoveClosedCaptioningView.a(BrightcoveClosedCaptioningView.this);
        }
    };
    private EventListener q = new EventListener() {
        @Default
        public final void processEvent(Event event) {
            if (((Boolean) event.properties.get(Event.BOOLEAN)).booleanValue()) {
                BrightcoveClosedCaptioningView.this.setMode(ClosedCaptioningMode.ON);
                BrightcoveClosedCaptioningView.this.setVisibility(0);
                BrightcoveClosedCaptioningView.this.bringToFront();
                if (!BrightcoveClosedCaptioningView.this.b.isEmpty()) {
                    BrightcoveClosedCaptioningView.this.a();
                    return;
                }
            }
            BrightcoveClosedCaptioningView.this.setMode(ClosedCaptioningMode.OFF);
            BrightcoveClosedCaptioningView.this.setVisibility(8);
            BrightcoveClosedCaptioningView.this.b();
        }
    };
    private EventListener r = new EventListener() {
        public final void processEvent(Event event) {
            Object obj = event.properties.get(Event.CAPTION_URI);
            if ((obj instanceof Uri) && obj.toString().startsWith(BrightcoveCaptionFormat.BRIGHTCOVE_SCHEME)) {
                BrightcoveClosedCaptioningView.this.b.clear();
                BrightcoveClosedCaptioningView.this.b();
            }
        }
    };
    private EventListener s = new EventListener() {
        @Default
        public final void processEvent(Event event) {
            BrightcoveClosedCaptioningView.this.d = event.getIntegerProperty(ShowHideController.CONTROLS_HEIGHT);
            BrightcoveClosedCaptioningView.a(BrightcoveClosedCaptioningView.this);
        }
    };
    private EventListener t = new EventListener() {
        @Default
        public final void processEvent(Event event) {
            BrightcoveClosedCaptioningView brightcoveClosedCaptioningView = BrightcoveClosedCaptioningView.this;
            brightcoveClosedCaptioningView.d = -1;
            BrightcoveClosedCaptioningView.a(brightcoveClosedCaptioningView);
        }
    };

    /* renamed from: com.brightcove.player.view.BrightcoveClosedCaptioningView$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[FontStyle.values().length];
        static final /* synthetic */ int[] b = new int[FontWeight.values().length];
        static final /* synthetic */ int[] c = new int[TextDecoration.values().length];

        static {
            try {
                c[TextDecoration.UNDERLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[FontWeight.BOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[FontStyle.ITALIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum ClosedCaptioningMode {
        OFF,
        ON
    }

    public class TimeMapEntry {
        public ViewGroup block;
        public BrightcoveClosedCaption closedCaption;

        public TimeMapEntry(BrightcoveClosedCaption brightcoveClosedCaption, ViewGroup viewGroup) {
            this.closedCaption = brightcoveClosedCaption;
            this.block = viewGroup;
        }
    }

    public BrightcoveClosedCaptioningView(Context context) {
        super(context);
    }

    public BrightcoveClosedCaptioningView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BrightcoveClosedCaptioningView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private static int a(BrightcoveClosedCaption brightcoveClosedCaption) {
        if (brightcoveClosedCaption.getTextAlign() != null) {
            if (brightcoveClosedCaption.getTextAlign() == TextAlign.LEFT) {
                return 3;
            }
            if (brightcoveClosedCaption.getTextAlign() == TextAlign.START) {
                return 8388611;
            }
            if (brightcoveClosedCaption.getTextAlign() == TextAlign.RIGHT) {
                return 5;
            }
            if (brightcoveClosedCaption.getTextAlign() == TextAlign.END) {
                return 8388613;
            }
        }
        return 1;
    }

    private static int a(String str) {
        return (str.charAt(0) == '#' && str.length() == 4) ? Integer.parseInt(str.substring(1), 16) | -16777216 : Color.parseColor(str);
    }

    private LinearLayout a(Region region, LinearLayout linearLayout, BrightcoveClosedCaptioningTextView brightcoveClosedCaptioningTextView) {
        Length originX = region.getOriginX();
        if (originX != null) {
            double value = originX.getValue();
            Unit unit = originX.getUnit();
            if (unit != Unit.PERCENT) {
                Log.w(a, "applyHorizontal: unhandled X length unit = ".concat(String.valueOf(unit)));
            } else if (value != 50.0d) {
                int i = 17;
                if (linearLayout == null) {
                    linearLayout = new LinearLayout(getContext());
                    linearLayout.setGravity(17);
                    linearLayout.setBaselineAligned(false);
                    linearLayout.setWeightSum(100.0f);
                }
                View view = new View(getContext());
                linearLayout.addView(view);
                linearLayout.addView(brightcoveClosedCaptioningTextView);
                View view2 = new View(getContext());
                linearLayout.addView(view2);
                if (value < 50.0d) {
                    i = 19;
                } else if (value > 50.0d) {
                    i = 21;
                }
                linearLayout.setGravity(i);
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.weight = (float) value;
                layoutParams.height = 50;
                layoutParams.width = 0;
                view.setLayoutParams(layoutParams);
                layoutParams = (LayoutParams) brightcoveClosedCaptioningTextView.getLayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -2;
                layoutParams.gravity = i;
                brightcoveClosedCaptioningTextView.setLayoutParams(layoutParams);
                LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                layoutParams2.weight = (float) (100.0d - value);
                layoutParams2.height = 50;
                layoutParams2.width = 0;
                view2.setLayoutParams(layoutParams2);
            }
        }
        return linearLayout;
    }

    private LinearLayout a(Region region, BrightcoveClosedCaptioningTextView brightcoveClosedCaptioningTextView) {
        DisplayAlign displayAlign = region.getDisplayAlign();
        if (displayAlign == null || displayAlign == DisplayAlign.CENTER) {
            return null;
        }
        int i = 17;
        if (displayAlign == DisplayAlign.BEFORE) {
            i = 3;
        } else if (displayAlign == DisplayAlign.AFTER) {
            i = 5;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setGravity(i);
        linearLayout.setBaselineAligned(false);
        linearLayout.addView(brightcoveClosedCaptioningTextView);
        LayoutParams layoutParams = (LayoutParams) brightcoveClosedCaptioningTextView.getLayoutParams();
        layoutParams.gravity = i;
        layoutParams.height = -2;
        layoutParams.width = -2;
        brightcoveClosedCaptioningTextView.setLayoutParams(layoutParams);
        return linearLayout;
    }

    private static Region a(Block block, CaptionsDocument captionsDocument) {
        String region = block.getRegion();
        return !StringUtil.isEmpty(region) ? (Region) captionsDocument.getRegions().get(region) : null;
    }

    private static CharSequence a(Span span) {
        String str;
        StringBuilder stringBuilder;
        if (StringUtil.isEmpty(span.getText())) {
            return "";
        }
        SpannableString spannableString = new SpannableString(span.getText());
        int length = span.getText().length();
        if (span.getFontStyle() != null && AnonymousClass2.a[span.getFontStyle().ordinal()] == 1) {
            spannableString.setSpan(new StyleSpan(R.style.caption_text_italic), 0, length, 33);
        }
        if (span.getFontWeight() != null && AnonymousClass2.b[span.getFontWeight().ordinal()] == 1) {
            spannableString.setSpan(new StyleSpan(R.style.caption_text_bold), 0, length, 33);
        }
        if (span.getTextDecoration() != null && AnonymousClass2.c[span.getTextDecoration().ordinal()] == 1) {
            spannableString.setSpan(new UnderlineSpan(), 0, length, 33);
        }
        String str2 = "Invalid color: ";
        if (!StringUtil.isEmpty(span.getColor())) {
            try {
                spannableString.setSpan(new ForegroundColorSpan(a(span.getColor())), 0, length, 33);
            } catch (IllegalArgumentException unused) {
                str = a;
                stringBuilder = new StringBuilder(str2);
                stringBuilder.append(span.getColor());
                Log.w(str, stringBuilder.toString());
            }
        }
        if (!StringUtil.isEmpty(span.getBackgroundColor())) {
            try {
                spannableString.setSpan(new BackgroundColorSpan(a(span.getBackgroundColor())), 0, length, 33);
            } catch (IllegalArgumentException unused2) {
                str = a;
                stringBuilder = new StringBuilder(str2);
                stringBuilder.append(span.getColor());
                Log.w(str, stringBuilder.toString());
            }
        }
        if (span.getFontSize() != null) {
            Length fontSize = span.getFontSize();
            if (fontSize != null) {
                spannableString.setSpan(new AbsoluteSizeSpan((int) fontSize.getValue()), 0, length, 33);
            }
        }
        spannableString.setSpan(new RelativeSizeSpan(1.0f), 0, length, 33);
        return spannableString;
    }

    private void a(int i) {
        if (isEnabled() && getMode() == ClosedCaptioningMode.ON) {
            this.i = i;
            LinearLayout linearLayout = this.c;
            if (!(linearLayout == null || linearLayout.getParent() == null)) {
                removeView(this.c);
            }
            if (i != -1) {
                this.c = (LinearLayout) findCaptionForPosition(i);
                LinearLayout linearLayout2 = this.c;
                if (linearLayout2 != null) {
                    addView(linearLayout2);
                    requestLayout();
                }
            }
        }
    }

    private void a(CaptionsDocument captionsDocument, BrightcoveClosedCaption brightcoveClosedCaption, BrightcoveClosedCaptioningTextView brightcoveClosedCaptioningTextView) {
        CharSequence replaceAll;
        if (captionsDocument instanceof TTMLDocument) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Iterator it = brightcoveClosedCaption.getLines().iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                List list = (List) it.next();
                if (list.size() != 0) {
                    while (i < list.size()) {
                        Span span = (Span) list.get(i);
                        if (brightcoveClosedCaption.getStyleName() == null || brightcoveClosedCaption.getStyleName().equals(this.l)) {
                            span.setFontSize(this.k.getFontSize());
                            span.setFontStyle(this.k.getFontStyle());
                            span.setColor(this.k.getColor());
                            span.setBackgroundColor(this.k.getBackgroundColor());
                        }
                        spannableStringBuilder.append(a(span));
                        i++;
                    }
                }
            }
            String[] strArr = new String[]{"\n", "\r", "\t", "  "};
            r0 = new CharSequence[4];
            String str = " ";
            r0[0] = str;
            r0[1] = str;
            r0[2] = str;
            r0[3] = str;
            replaceAll = StringUtil.replaceAll(spannableStringBuilder, strArr, r0);
        } else {
            if (!(captionsDocument instanceof WebVTTDocument)) {
                Log.w(a, "Unrecognized document type: ".concat(String.valueOf(captionsDocument)));
            }
            replaceAll = Html.fromHtml(brightcoveClosedCaption.getCaption());
        }
        brightcoveClosedCaptioningTextView.setText(replaceAll);
    }

    private void a(Region region, LinearLayout linearLayout, LinearLayout linearLayout2, BrightcoveClosedCaptioningTextView brightcoveClosedCaptioningTextView) {
        Length originY = region.getOriginY();
        if (originY != null) {
            double value = originY.getValue();
            Unit unit = originY.getUnit();
            if (unit == Unit.PERCENT) {
                View linearLayout22;
                if (linearLayout22 == null) {
                    linearLayout22 = brightcoveClosedCaptioningTextView;
                }
                int i = 17;
                LayoutParams layoutParams;
                if (value != 50.0d) {
                    linearLayout.setWeightSum(100.0f);
                    View view = new View(getContext());
                    linearLayout.addView(view);
                    linearLayout.addView(linearLayout22);
                    View view2 = new View(getContext());
                    linearLayout.addView(view2);
                    if (value < 50.0d) {
                        i = 49;
                    } else if (value > 50.0d) {
                        i = 81;
                    }
                    linearLayout.setGravity(i);
                    layoutParams = (LayoutParams) view.getLayoutParams();
                    layoutParams.weight = (float) value;
                    layoutParams.height = 0;
                    layoutParams.width = 50;
                    view.setLayoutParams(layoutParams);
                    layoutParams = (LayoutParams) linearLayout22.getLayoutParams();
                    layoutParams.height = -2;
                    layoutParams.width = -2;
                    layoutParams.gravity = i;
                    linearLayout22.setLayoutParams(layoutParams);
                    LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                    layoutParams2.weight = (float) (100.0d - value);
                    layoutParams2.height = 0;
                    layoutParams2.width = 50;
                    view2.setLayoutParams(layoutParams2);
                    return;
                }
                linearLayout.setGravity(17);
                linearLayout.addView(linearLayout22);
                layoutParams = (LayoutParams) linearLayout22.getLayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -2;
                layoutParams.gravity = 17;
                linearLayout22.setLayoutParams(layoutParams);
                return;
            }
            Log.w(a, "applyVertical: unhandled Y length unit = ".concat(String.valueOf(unit)));
        }
    }

    private void a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(Event.BOOLEAN, Boolean.valueOf(z));
        this.e.emit(EventType.CAPTIONS_AVAILABLE, hashMap);
    }

    /* Access modifiers changed, original: protected|final */
    public final ViewGroup a(ViewGroup viewGroup) {
        BrightcoveCaptionStyle style = BrightcoveClosedCaptioningManager.getInstance(getContext()).getStyle();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof BrightcoveClosedCaptioningTextView) {
                ((BrightcoveClosedCaptioningTextView) childAt).setStyle(style);
            } else if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt);
            }
        }
        viewGroup.invalidate();
        viewGroup.requestLayout();
        return viewGroup;
    }

    /* Access modifiers changed, original: protected|final */
    public final ViewGroup a(CaptionsDocument captionsDocument, BrightcoveClosedCaption brightcoveClosedCaption) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setGravity(80);
        linearLayout.setBaselineAligned(false);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(6, 6, 6, 6);
        BrightcoveClosedCaptioningTextView brightcoveClosedCaptioningTextView = new BrightcoveClosedCaptioningTextView(getContext());
        LinearLayout linearLayout2 = null;
        Region a = captionsDocument != null ? a((Block) brightcoveClosedCaption, captionsDocument) : null;
        if (a != null) {
            linearLayout2 = a(a, a(a, brightcoveClosedCaptioningTextView), brightcoveClosedCaptioningTextView);
            a(a, linearLayout, linearLayout2, brightcoveClosedCaptioningTextView);
        }
        if (linearLayout2 != null && linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2);
            LayoutParams layoutParams = (LayoutParams) linearLayout2.getLayoutParams();
            layoutParams.gravity = 80;
            layoutParams.height = -2;
            layoutParams.width = -1;
            linearLayout2.setLayoutParams(layoutParams);
        } else if (brightcoveClosedCaptioningTextView.getParent() == null) {
            linearLayout.addView(brightcoveClosedCaptioningTextView);
            LayoutParams layoutParams2 = (LayoutParams) brightcoveClosedCaptioningTextView.getLayoutParams();
            layoutParams2.gravity = 81;
            layoutParams2.height = -2;
            layoutParams2.width = -1;
            brightcoveClosedCaptioningTextView.setLayoutParams(layoutParams2);
        }
        a(captionsDocument, brightcoveClosedCaption, brightcoveClosedCaptioningTextView);
        brightcoveClosedCaptioningTextView.setGravity(a(brightcoveClosedCaption));
        return linearLayout;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        if (this.h == -1) {
            this.h = this.e.on("progress", this.o);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        int i = this.h;
        if (i != -1) {
            this.e.off("progress", i);
            this.h = -1;
        }
    }

    public void clear() {
        setMode(ClosedCaptioningMode.OFF);
        b();
        a(false);
        if (getChildCount() > 0) {
            removeAllViews();
        }
        TreeMap treeMap = this.b;
        if (treeMap != null && treeMap.size() > 0) {
            this.b.clear();
        }
    }

    public ViewGroup findCaptionForPosition(int i) {
        Entry floorEntry = this.b.floorEntry(Integer.valueOf(i));
        return (floorEntry == null || floorEntry.getValue() == null || ((TimeMapEntry) floorEntry.getValue()).closedCaption.getEndTime() < i) ? null : a(((TimeMapEntry) floorEntry.getValue()).block);
    }

    public ClosedCaptioningMode getMode() {
        return this.f;
    }

    public int getSafeAreaMarginHeight() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i = 0;
        int i2 = layoutParams != null ? layoutParams.height : 0;
        if (i2 <= 0) {
            i2 = this.j.getHeight();
            if (this.m) {
                i = (i2 - this.j.getMeasuredVideoHeight()) / 2;
            }
        }
        return Math.round(((float) i2) * 0.05f) + i;
    }

    public int getSafeAreaMarginWidth() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i = 0;
        int i2 = layoutParams != null ? layoutParams.width : 0;
        if (i2 <= 0) {
            i2 = this.j.getWidth();
            if (this.m) {
                i = (i2 - this.j.getMeasuredVideoWidth()) / 2;
            }
        }
        return Math.round(((float) i2) * 0.05f) + i;
    }

    @Deprecated
    public void initialize(EventEmitter eventEmitter) {
        initialize(eventEmitter, null);
    }

    public void initialize(EventEmitter eventEmitter, BaseVideoView baseVideoView) {
        this.e = RegisteringEventEmitter.build(eventEmitter, getClass());
        this.g = (LayoutInflater) getContext().getSystemService("layout_inflater");
        this.b = new TreeMap();
        this.e.on(EventType.DID_LOAD_CLOSED_CAPTIONS, this.p);
        this.e.on(EventType.TOGGLE_CLOSED_CAPTIONS, this.q);
        this.e.on(ShowHideController.DID_SHOW_MEDIA_CONTROLS, this.s);
        this.e.on(ShowHideController.DID_HIDE_MEDIA_CONTROLS, this.t);
        this.e.on(EventType.CAPTION, this.n);
        this.e.on(EventType.SELECT_CLOSED_CAPTION_TRACK, this.r);
        this.e.on(EventType.COMPLETED, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                if (BrightcoveClosedCaptioningView.this.c != null) {
                    BrightcoveClosedCaptioningView.this.c.setVisibility(8);
                }
            }
        });
        this.j = baseVideoView;
        this.f = this.j.getClosedCaptioningController().isCaptioningEnabled() ? ClosedCaptioningMode.ON : ClosedCaptioningMode.OFF;
        this.j.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i != i5 || i3 != i7 || i2 != i6 || i4 != i8) {
                    BrightcoveClosedCaptioningView.a(BrightcoveClosedCaptioningView.this);
                }
            }
        });
    }

    public void prepareDFXPCaptions(TTMLDocument tTMLDocument) {
        Iterator it = tTMLDocument.getStyles().entrySet().iterator();
        if (it != null && it.hasNext()) {
            this.k = new Span((StyledElement) ((Entry) it.next()).getValue());
            this.l = this.k.getID();
        }
        List<BrightcoveClosedCaption> captions = tTMLDocument.getCaptions();
        if (captions == null || captions.size() <= 0) {
            Log.w(a, "No captions found, cannot prepare captions for this video");
            a(false);
            return;
        }
        if (this.j.getClosedCaptioningController().isCaptioningEnabled()) {
            setMode(ClosedCaptioningMode.ON);
            a();
        }
        a(true);
        if (this.b.size() > 0) {
            for (Integer intValue : this.b.keySet()) {
                TimeMapEntry timeMapEntry = (TimeMapEntry) this.b.get(Integer.valueOf(intValue.intValue()));
                if (!(timeMapEntry == null || timeMapEntry.block == null)) {
                    removeView(timeMapEntry.block);
                }
            }
            this.b.clear();
        }
        for (BrightcoveClosedCaption brightcoveClosedCaption : captions) {
            ViewGroup a = a((CaptionsDocument) tTMLDocument, brightcoveClosedCaption);
            if (a.getChildCount() > 0) {
                this.b.put(Integer.valueOf(brightcoveClosedCaption.getBeginTime()), new TimeMapEntry(brightcoveClosedCaption, a));
            }
        }
        this.b.put(Integer.valueOf(((BrightcoveClosedCaption) captions.get(captions.size() - 1)).getEndTime()), null);
        refreshCaptions();
    }

    @Deprecated
    public void prepareLayout() {
    }

    public void prepareWebVTTCaptions(WebVTTDocument webVTTDocument) {
        List<BrightcoveClosedCaption> captions = webVTTDocument.getCaptions();
        if (captions == null || captions.size() <= 0) {
            Log.w(a, "No captions found, cannot prepare captions for this video");
            a(false);
            return;
        }
        if (this.j.getClosedCaptioningController().isCaptioningEnabled()) {
            setMode(ClosedCaptioningMode.ON);
            a();
        }
        a(true);
        if (this.b.size() > 0) {
            for (Integer intValue : this.b.keySet()) {
                TimeMapEntry timeMapEntry = (TimeMapEntry) this.b.get(Integer.valueOf(intValue.intValue()));
                if (!(timeMapEntry == null || timeMapEntry.block == null)) {
                    removeView(timeMapEntry.block);
                }
            }
            this.b.clear();
        }
        for (BrightcoveClosedCaption brightcoveClosedCaption : captions) {
            ViewGroup a = a((CaptionsDocument) webVTTDocument, brightcoveClosedCaption);
            if (a.getChildCount() > 0) {
                this.b.put(Integer.valueOf(brightcoveClosedCaption.getBeginTime()), new TimeMapEntry(brightcoveClosedCaption, a));
            }
        }
        this.b.put(Integer.valueOf(((BrightcoveClosedCaption) captions.get(captions.size() - 1)).getEndTime()), null);
        refreshCaptions();
    }

    public void refreshCaptions() {
        int i = this.i;
        if (i != -1) {
            a(i);
        }
    }

    public void refreshCaptions(int i) {
        if (i != -1) {
            a(i);
        }
    }

    public void setKeepCaptionsWithinVideoBounds(boolean z) {
        this.m = z;
    }

    public void setMode(ClosedCaptioningMode closedCaptioningMode) {
        this.f = closedCaptioningMode;
    }
}
