package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.snapchat.android.R;
import defpackage.dd;
import defpackage.dj;
import defpackage.hj;
import defpackage.hr;
import defpackage.iv;
import defpackage.ja;
import defpackage.jb;
import defpackage.ji;
import defpackage.os;
import defpackage.ot;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class AppCompatDrawableManager {
    private static final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
    private static final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    private static final b COLOR_FILTER_CACHE = new b();
    private static final boolean DEBUG = false;
    private static final Mode DEFAULT_MODE = Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "AppCompatDrawableManag";
    private static final int[] TINT_CHECKABLE_BUTTON_LIST = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material};
    private static final int[] TINT_COLOR_CONTROL_NORMAL = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] TINT_COLOR_CONTROL_STATE_LIST = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
    private iv<String, c> mDelegates;
    private final Object mDrawableCacheLock = new Object();
    private final WeakHashMap<Context, ja<WeakReference<ConstantState>>> mDrawableCaches = new WeakHashMap(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private ji<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, ji<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;

    static class b extends jb<Integer, PorterDuffColorFilter> {
        public b() {
            super(6);
        }

        static int a(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    interface c {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    static class d implements c {
        d() {
        }

        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return dj.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    static class a implements c {
        a() {
        }

        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                Resources resources = context.getResources();
                dd ddVar = new dd(context);
                ddVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return ddVar;
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    private void addDelegate(String str, c cVar) {
        if (this.mDelegates == null) {
            this.mDelegates = new iv();
        }
        this.mDelegates.put(str, cVar);
    }

    private boolean addDrawableToCache(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.mDrawableCacheLock) {
            ja jaVar = (ja) this.mDrawableCaches.get(context);
            if (jaVar == null) {
                jaVar = new ja();
                this.mDrawableCaches.put(context, jaVar);
            }
            jaVar.a(j, new WeakReference(constantState));
        }
        return true;
    }

    private void addTintListToCache(Context context, int i, ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap();
        }
        ji jiVar = (ji) this.mTintLists.get(context);
        if (jiVar == null) {
            jiVar = new ji();
            this.mTintLists.put(context, jiVar);
        }
        jiVar.c(i, colorStateList);
    }

    private static boolean arrayContains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void checkVectorDrawableSetup(Context context) {
        if (!this.mHasCheckedVectorDrawableSetup) {
            this.mHasCheckedVectorDrawableSetup = true;
            Drawable drawable = getDrawable(context, R.drawable.abc_vector_test);
            if (drawable == null || !isVectorDrawable(drawable)) {
                this.mHasCheckedVectorDrawableSetup = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private ColorStateList createBorderlessButtonColorStateList(Context context) {
        return createButtonColorStateList(context, 0);
    }

    private ColorStateList createButtonColorStateList(Context context, int i) {
        r1 = new int[4][];
        r0 = new int[4];
        int a = os.a(context, R.attr.colorControlHighlight);
        int c = os.c(context, R.attr.colorButtonNormal);
        r1[0] = os.a;
        r0[0] = c;
        r1[1] = os.c;
        r0[1] = hj.a(a, i);
        r1[2] = os.b;
        r0[2] = hj.a(a, i);
        r1[3] = os.e;
        r0[3] = i;
        return new ColorStateList(r1, r0);
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private ColorStateList createColoredButtonColorStateList(Context context) {
        return createButtonColorStateList(context, os.a(context, R.attr.colorAccent));
    }

    private ColorStateList createDefaultButtonColorStateList(Context context) {
        return createButtonColorStateList(context, os.a(context, R.attr.colorButtonNormal));
    }

    private Drawable createDrawableIfNeeded(Context context, int i) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        if (i == R.drawable.abc_cab_background_top_material) {
            cachedDrawable = new LayerDrawable(new Drawable[]{getDrawable(context, R.drawable.abc_cab_background_internal_bg), getDrawable(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (cachedDrawable != null) {
            cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, createCacheKey, cachedDrawable);
        }
        return cachedDrawable;
    }

    private ColorStateList createSwitchThumbColorStateList(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList b = os.b(context, R.attr.colorSwitchThumbNormal);
        if (b == null || !b.isStateful()) {
            iArr[0] = os.a;
            iArr2[0] = os.c(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = os.d;
            iArr2[1] = os.a(context, R.attr.colorControlActivated);
            iArr[2] = os.e;
            iArr2[2] = os.a(context, R.attr.colorSwitchThumbNormal);
        } else {
            iArr[0] = os.a;
            iArr2[0] = b.getColorForState(iArr[0], 0);
            iArr[1] = os.d;
            iArr2[1] = os.a(context, R.attr.colorControlActivated);
            iArr[2] = os.e;
            iArr2[2] = b.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, Mode mode, int[] iArr) {
        return (colorStateList == null || mode == null) ? null : getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static AppCompatDrawableManager get() {
        if (INSTANCE == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            INSTANCE = appCompatDrawableManager;
            installDefaultInflateDelegates(appCompatDrawableManager);
        }
        return INSTANCE;
    }

    /* JADX WARNING: Missing block: B:16:0x002e, code skipped:
            return null;
     */
    private android.graphics.drawable.Drawable getCachedDrawable(android.content.Context r5, long r6) {
        /*
        r4 = this;
        r0 = r4.mDrawableCacheLock;
        monitor-enter(r0);
        r1 = r4.mDrawableCaches;	 Catch:{ all -> 0x002f }
        r1 = r1.get(r5);	 Catch:{ all -> 0x002f }
        r1 = (defpackage.ja) r1;	 Catch:{ all -> 0x002f }
        r2 = 0;
        if (r1 != 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return r2;
    L_0x0010:
        r3 = r1.b(r6);	 Catch:{ all -> 0x002f }
        r3 = (java.lang.ref.WeakReference) r3;	 Catch:{ all -> 0x002f }
        if (r3 == 0) goto L_0x002d;
    L_0x0018:
        r3 = r3.get();	 Catch:{ all -> 0x002f }
        r3 = (android.graphics.drawable.Drawable.ConstantState) r3;	 Catch:{ all -> 0x002f }
        if (r3 == 0) goto L_0x002a;
    L_0x0020:
        r5 = r5.getResources();	 Catch:{ all -> 0x002f }
        r5 = r3.newDrawable(r5);	 Catch:{ all -> 0x002f }
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return r5;
    L_0x002a:
        r1.c(r6);	 Catch:{ all -> 0x002f }
    L_0x002d:
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return r2;
    L_0x002f:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatDrawableManager.getCachedDrawable(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static PorterDuffColorFilter getPorterDuffColorFilter(int i, Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) COLOR_FILTER_CACHE.a((Object) Integer.valueOf(b.a(i, mode)));
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        COLOR_FILTER_CACHE.a(Integer.valueOf(b.a(i, mode)), porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    private ColorStateList getTintListFromCache(Context context, int i) {
        WeakHashMap weakHashMap = this.mTintLists;
        if (weakHashMap != null) {
            ji jiVar = (ji) weakHashMap.get(context);
            if (jiVar != null) {
                return (ColorStateList) jiVar.a(i, null);
            }
        }
        return null;
    }

    static Mode getTintMode(int i) {
        return i == R.drawable.abc_switch_thumb_material ? Mode.MULTIPLY : null;
    }

    private static void installDefaultInflateDelegates(AppCompatDrawableManager appCompatDrawableManager) {
        if (VERSION.SDK_INT < 24) {
            appCompatDrawableManager.addDelegate("vector", new d());
            appCompatDrawableManager.addDelegate("animated-vector", new a());
        }
    }

    private static boolean isVectorDrawable(Drawable drawable) {
        if (!(drawable instanceof dj)) {
            if (!PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName())) {
                return false;
            }
        }
        return true;
    }

    private Drawable loadDrawableFromDelegates(Context context, int i) {
        iv ivVar = this.mDelegates;
        if (ivVar == null || ivVar.isEmpty()) {
            return null;
        }
        ji jiVar = this.mKnownDrawableIdTags;
        String str = SKIP_DRAWABLE_TAG;
        if (jiVar != null) {
            String str2 = (String) jiVar.a(i, null);
            if (str.equals(str2) || (str2 != null && this.mDelegates.get(str2) == null)) {
                return null;
            }
        }
        this.mKnownDrawableIdTags = new ji();
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                int next;
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.mKnownDrawableIdTags.c(i, name);
                    c cVar = (c) this.mDelegates.get(name);
                    if (cVar != null) {
                        cachedDrawable = cVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (cachedDrawable != null) {
                        cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                        addDrawableToCache(context, createCacheKey, cachedDrawable);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e) {
                Log.e(TAG, "Exception while inflating drawable", e);
            }
        }
        if (cachedDrawable == null) {
            this.mKnownDrawableIdTags.c(i, str);
        }
        return cachedDrawable;
    }

    private void removeDelegate(String str, c cVar) {
        iv ivVar = this.mDelegates;
        if (ivVar != null && ivVar.get(str) == cVar) {
            this.mDelegates.remove(str);
        }
    }

    private static void setPorterDuffColorFilter(Drawable drawable, int i, Mode mode) {
        if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = DEFAULT_MODE;
        }
        drawable.setColorFilter(getPorterDuffColorFilter(i, mode));
    }

    private Drawable tintDrawable(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList tintList = getTintList(context, i);
        if (tintList != null) {
            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = hr.d(drawable);
            hr.a(drawable, tintList);
            Mode tintMode = getTintMode(i);
            if (tintMode == null) {
                return drawable;
            }
            hr.a(drawable, tintMode);
            return drawable;
        }
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int a;
        if (i == R.drawable.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908288), os.a(context, R.attr.colorControlNormal), DEFAULT_MODE);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            a = os.a(context, R.attr.colorControlNormal);
        } else if (i != R.drawable.abc_ratingbar_material && i != R.drawable.abc_ratingbar_indicator_material && i != R.drawable.abc_ratingbar_small_material) {
            return (tintDrawableUsingColorFilter(context, i, drawable) || !z) ? drawable : null;
        } else {
            layerDrawable = (LayerDrawable) drawable;
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908288), os.c(context, R.attr.colorControlNormal), DEFAULT_MODE);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            a = os.a(context, R.attr.colorControlActivated);
        }
        setPorterDuffColorFilter(findDrawableByLayerId, a, DEFAULT_MODE);
        setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908301), os.a(context, R.attr.colorControlActivated), DEFAULT_MODE);
        return drawable;
    }

    public static void tintDrawable(Drawable drawable, ot otVar, int[] iArr) {
        if (!DrawableUtils.canSafelyMutateDrawable(drawable) || drawable.mutate() == drawable) {
            if (otVar.d || otVar.c) {
                drawable.setColorFilter(createTintFilter(otVar.d ? otVar.a : null, otVar.c ? otVar.b : DEFAULT_MODE, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d(TAG, "Mutated drawable is not the same instance as the input.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    public static boolean tintDrawableUsingColorFilter(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
        r0 = DEFAULT_MODE;
        r1 = COLORFILTER_TINT_COLOR_CONTROL_NORMAL;
        r1 = arrayContains(r1, r7);
        r2 = 16842801; // 0x1010031 float:2.3693695E-38 double:8.3214494E-317;
        r3 = -1;
        r4 = 0;
        r5 = 1;
        if (r1 == 0) goto L_0x0016;
    L_0x0010:
        r2 = 2130968770; // 0x7f0400c2 float:1.7546203E38 double:1.0528384616E-314;
    L_0x0013:
        r7 = 1;
        r1 = -1;
        goto L_0x0048;
    L_0x0016:
        r1 = COLORFILTER_COLOR_CONTROL_ACTIVATED;
        r1 = arrayContains(r1, r7);
        if (r1 == 0) goto L_0x0022;
    L_0x001e:
        r2 = 2130968768; // 0x7f0400c0 float:1.7546199E38 double:1.0528384606E-314;
        goto L_0x0013;
    L_0x0022:
        r1 = COLORFILTER_COLOR_BACKGROUND_MULTIPLY;
        r1 = arrayContains(r1, r7);
        if (r1 == 0) goto L_0x002d;
    L_0x002a:
        r0 = android.graphics.PorterDuff.Mode.MULTIPLY;
        goto L_0x0013;
    L_0x002d:
        r1 = 2131230774; // 0x7f080036 float:1.807761E38 double:1.052967909E-314;
        if (r7 != r1) goto L_0x003f;
    L_0x0032:
        r2 = 16842800; // 0x1010030 float:2.3693693E-38 double:8.321449E-317;
        r7 = 1109603123; // 0x42233333 float:40.8 double:5.482167836E-315;
        r7 = java.lang.Math.round(r7);
        r1 = r7;
        r7 = 1;
        goto L_0x0048;
    L_0x003f:
        r1 = 2131230751; // 0x7f08001f float:1.8077564E38 double:1.0529678974E-314;
        if (r7 != r1) goto L_0x0045;
    L_0x0044:
        goto L_0x0013;
    L_0x0045:
        r7 = 0;
        r1 = -1;
        r2 = 0;
    L_0x0048:
        if (r7 == 0) goto L_0x0065;
    L_0x004a:
        r7 = android.support.v7.widget.DrawableUtils.canSafelyMutateDrawable(r8);
        if (r7 == 0) goto L_0x0054;
    L_0x0050:
        r8 = r8.mutate();
    L_0x0054:
        r6 = defpackage.os.a(r6, r2);
        r6 = getPorterDuffColorFilter(r6, r0);
        r8.setColorFilter(r6);
        if (r1 == r3) goto L_0x0064;
    L_0x0061:
        r8.setAlpha(r1);
    L_0x0064:
        return r5;
    L_0x0065:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatDrawableManager.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public final Drawable getDrawable(Context context, int i) {
        return getDrawable(context, i, false);
    }

    /* Access modifiers changed, original: final */
    public final Drawable getDrawable(Context context, int i, boolean z) {
        checkVectorDrawableSetup(context);
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = createDrawableIfNeeded(context, i);
        }
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = ContextCompat.getDrawable(context, i);
        }
        if (loadDrawableFromDelegates != null) {
            loadDrawableFromDelegates = tintDrawable(context, i, z, loadDrawableFromDelegates);
        }
        if (loadDrawableFromDelegates != null) {
            DrawableUtils.fixDrawable(loadDrawableFromDelegates);
        }
        return loadDrawableFromDelegates;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086  */
    public final android.content.res.ColorStateList getTintList(android.content.Context r3, int r4) {
        /*
        r2 = this;
        r0 = r2.getTintListFromCache(r3, r4);
        if (r0 != 0) goto L_0x0089;
    L_0x0006:
        r1 = 2131230752; // 0x7f080020 float:1.8077566E38 double:1.052967898E-314;
        if (r4 != r1) goto L_0x0013;
    L_0x000b:
        r0 = 2131099668; // 0x7f060014 float:1.7811696E38 double:1.052903134E-314;
    L_0x000e:
        r0 = defpackage.ma.a(r3, r0);
        goto L_0x0084;
    L_0x0013:
        r1 = 2131230801; // 0x7f080051 float:1.8077665E38 double:1.052967922E-314;
        if (r4 != r1) goto L_0x001c;
    L_0x0018:
        r0 = 2131099671; // 0x7f060017 float:1.7811702E38 double:1.0529031353E-314;
        goto L_0x000e;
    L_0x001c:
        r1 = 2131230800; // 0x7f080050 float:1.8077663E38 double:1.0529679216E-314;
        if (r4 != r1) goto L_0x0026;
    L_0x0021:
        r0 = r2.createSwitchThumbColorStateList(r3);
        goto L_0x0084;
    L_0x0026:
        r1 = 2131230741; // 0x7f080015 float:1.8077543E38 double:1.0529678925E-314;
        if (r4 != r1) goto L_0x0030;
    L_0x002b:
        r0 = r2.createDefaultButtonColorStateList(r3);
        goto L_0x0084;
    L_0x0030:
        r1 = 2131230736; // 0x7f080010 float:1.8077533E38 double:1.05296789E-314;
        if (r4 != r1) goto L_0x003a;
    L_0x0035:
        r0 = r2.createBorderlessButtonColorStateList(r3);
        goto L_0x0084;
    L_0x003a:
        r1 = 2131230740; // 0x7f080014 float:1.8077541E38 double:1.052967892E-314;
        if (r4 != r1) goto L_0x0044;
    L_0x003f:
        r0 = r2.createColoredButtonColorStateList(r3);
        goto L_0x0084;
    L_0x0044:
        r1 = 2131230798; // 0x7f08004e float:1.8077659E38 double:1.0529679207E-314;
        if (r4 == r1) goto L_0x0080;
    L_0x0049:
        r1 = 2131230799; // 0x7f08004f float:1.807766E38 double:1.052967921E-314;
        if (r4 != r1) goto L_0x004f;
    L_0x004e:
        goto L_0x0080;
    L_0x004f:
        r1 = TINT_COLOR_CONTROL_NORMAL;
        r1 = arrayContains(r1, r4);
        if (r1 == 0) goto L_0x005f;
    L_0x0057:
        r0 = 2130968770; // 0x7f0400c2 float:1.7546203E38 double:1.0528384616E-314;
        r0 = defpackage.os.b(r3, r0);
        goto L_0x0084;
    L_0x005f:
        r1 = TINT_COLOR_CONTROL_STATE_LIST;
        r1 = arrayContains(r1, r4);
        if (r1 == 0) goto L_0x006b;
    L_0x0067:
        r0 = 2131099667; // 0x7f060013 float:1.7811694E38 double:1.0529031333E-314;
        goto L_0x000e;
    L_0x006b:
        r1 = TINT_CHECKABLE_BUTTON_LIST;
        r1 = arrayContains(r1, r4);
        if (r1 == 0) goto L_0x0077;
    L_0x0073:
        r0 = 2131099666; // 0x7f060012 float:1.7811692E38 double:1.052903133E-314;
        goto L_0x000e;
    L_0x0077:
        r1 = 2131230795; // 0x7f08004b float:1.8077653E38 double:1.052967919E-314;
        if (r4 != r1) goto L_0x0084;
    L_0x007c:
        r0 = 2131099669; // 0x7f060015 float:1.7811698E38 double:1.0529031343E-314;
        goto L_0x000e;
    L_0x0080:
        r0 = 2131099670; // 0x7f060016 float:1.78117E38 double:1.052903135E-314;
        goto L_0x000e;
    L_0x0084:
        if (r0 == 0) goto L_0x0089;
    L_0x0086:
        r2.addTintListToCache(r3, r4, r0);
    L_0x0089:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatDrawableManager.getTintList(android.content.Context, int):android.content.res.ColorStateList");
    }

    public final void onConfigurationChanged(Context context) {
        synchronized (this.mDrawableCacheLock) {
            ja jaVar = (ja) this.mDrawableCaches.get(context);
            if (jaVar != null) {
                jaVar.b();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i) {
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = vectorEnabledTintResources.superGetDrawable(i);
        }
        return loadDrawableFromDelegates != null ? tintDrawable(context, i, false, loadDrawableFromDelegates) : null;
    }
}
