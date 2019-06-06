package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraPosition.Builder;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.utils.ColorUtils;
import defpackage.hh;
import java.util.Arrays;

public class MapboxMapOptions implements Parcelable {
    public static final Creator<MapboxMapOptions> CREATOR = new Creator<MapboxMapOptions>() {
        public final MapboxMapOptions createFromParcel(Parcel parcel) {
            return new MapboxMapOptions(parcel, null);
        }

        public final MapboxMapOptions[] newArray(int i) {
            return new MapboxMapOptions[i];
        }
    };
    private static final float FOUR_DP = 4.0f;
    private static final float NINETY_TWO_DP = 92.0f;
    private static final int UNDEFINED_COLOR = -1;
    private String apiBaseUrl;
    private boolean attributionEnabled;
    private int attributionGravity;
    private int[] attributionMargins;
    private int attributionTintColor;
    private CameraPosition cameraPosition;
    private boolean compassEnabled;
    private int compassGravity;
    private Drawable compassImage;
    private int[] compassMargins;
    private boolean debugActive;
    private boolean doubleTapGesturesEnabled;
    private boolean fadeCompassFacingNorth;
    private boolean logoEnabled;
    private int logoGravity;
    private int[] logoMargins;
    private double maxZoom;
    private double minZoom;
    private int myLocationAccuracyAlpha;
    private int myLocationAccuracyTintColor;
    private Drawable myLocationBackgroundDrawable;
    private int[] myLocationBackgroundPadding;
    private int myLocationBackgroundTintColor;
    private boolean myLocationEnabled;
    private Drawable myLocationForegroundBearingDrawable;
    private Drawable myLocationForegroundDrawable;
    private int myLocationForegroundTintColor;
    private boolean rotateGesturesEnabled;
    private boolean scrollGesturesEnabled;
    private boolean simpleMode;
    private String style;
    @Deprecated
    private boolean textureMode;
    private boolean tiltGesturesEnabled;
    private boolean zoomControlsEnabled;
    private boolean zoomGesturesEnabled;

    public MapboxMapOptions() {
        this.compassEnabled = true;
        this.fadeCompassFacingNorth = true;
        this.compassGravity = 8388661;
        this.logoEnabled = true;
        this.logoGravity = 8388691;
        this.attributionTintColor = -1;
        this.attributionEnabled = true;
        this.attributionGravity = 80;
        this.minZoom = 0.0d;
        this.maxZoom = 20.0d;
        this.rotateGesturesEnabled = true;
        this.scrollGesturesEnabled = true;
        this.tiltGesturesEnabled = true;
        this.zoomGesturesEnabled = true;
        this.zoomControlsEnabled = false;
        this.doubleTapGesturesEnabled = true;
        this.myLocationForegroundTintColor = -1;
        this.myLocationBackgroundTintColor = -1;
    }

    private MapboxMapOptions(Parcel parcel) {
        boolean z = true;
        this.compassEnabled = true;
        this.fadeCompassFacingNorth = true;
        this.compassGravity = 8388661;
        this.logoEnabled = true;
        this.logoGravity = 8388691;
        this.attributionTintColor = -1;
        this.attributionEnabled = true;
        this.attributionGravity = 80;
        this.minZoom = 0.0d;
        this.maxZoom = 20.0d;
        this.rotateGesturesEnabled = true;
        this.scrollGesturesEnabled = true;
        this.tiltGesturesEnabled = true;
        this.zoomGesturesEnabled = true;
        this.zoomControlsEnabled = false;
        this.doubleTapGesturesEnabled = true;
        this.myLocationForegroundTintColor = -1;
        this.myLocationBackgroundTintColor = -1;
        this.cameraPosition = (CameraPosition) parcel.readParcelable(CameraPosition.class.getClassLoader());
        this.debugActive = parcel.readByte() != (byte) 0;
        this.compassEnabled = parcel.readByte() != (byte) 0;
        this.compassGravity = parcel.readInt();
        this.compassMargins = parcel.createIntArray();
        this.fadeCompassFacingNorth = parcel.readByte() != (byte) 0;
        Bitmap bitmap = (Bitmap) parcel.readParcelable(getClass().getClassLoader());
        if (bitmap != null) {
            this.compassImage = new BitmapDrawable(bitmap);
        }
        this.logoEnabled = parcel.readByte() != (byte) 0;
        this.logoGravity = parcel.readInt();
        this.logoMargins = parcel.createIntArray();
        this.attributionEnabled = parcel.readByte() != (byte) 0;
        this.attributionGravity = parcel.readInt();
        this.attributionMargins = parcel.createIntArray();
        this.attributionTintColor = parcel.readInt();
        this.minZoom = parcel.readDouble();
        this.maxZoom = parcel.readDouble();
        this.rotateGesturesEnabled = parcel.readByte() != (byte) 0;
        this.scrollGesturesEnabled = parcel.readByte() != (byte) 0;
        this.tiltGesturesEnabled = parcel.readByte() != (byte) 0;
        this.zoomControlsEnabled = parcel.readByte() != (byte) 0;
        this.zoomGesturesEnabled = parcel.readByte() != (byte) 0;
        this.doubleTapGesturesEnabled = parcel.readByte() != (byte) 0;
        this.myLocationEnabled = parcel.readByte() != (byte) 0;
        bitmap = (Bitmap) parcel.readParcelable(getClass().getClassLoader());
        if (bitmap != null) {
            this.myLocationForegroundDrawable = new BitmapDrawable(bitmap);
        }
        bitmap = (Bitmap) parcel.readParcelable(getClass().getClassLoader());
        if (bitmap != null) {
            this.myLocationForegroundBearingDrawable = new BitmapDrawable(bitmap);
        }
        bitmap = (Bitmap) parcel.readParcelable(getClass().getClassLoader());
        if (bitmap != null) {
            this.myLocationBackgroundDrawable = new BitmapDrawable(bitmap);
        }
        this.myLocationForegroundTintColor = parcel.readInt();
        this.myLocationBackgroundTintColor = parcel.readInt();
        this.myLocationBackgroundPadding = parcel.createIntArray();
        this.myLocationAccuracyAlpha = parcel.readInt();
        this.myLocationAccuracyTintColor = parcel.readInt();
        this.style = parcel.readString();
        this.apiBaseUrl = parcel.readString();
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.textureMode = z;
    }

    /* synthetic */ MapboxMapOptions(Parcel parcel, AnonymousClass1 anonymousClass1) {
        this(parcel);
    }

    public static MapboxMapOptions createFromAttributes(Context context, AttributeSet attributeSet, boolean z) {
        MapboxMapOptions mapboxMapOptions = new MapboxMapOptions();
        mapboxMapOptions.simpleMode = z;
        float f = context.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.mapbox_MapView, 0, 0);
        try {
            mapboxMapOptions.camera(new Builder(obtainStyledAttributes).build());
            mapboxMapOptions.styleUrl(obtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_styleUrl));
            mapboxMapOptions.apiBaseUrl(obtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_apiBaseUrl));
            mapboxMapOptions.zoomGesturesEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_uiZoomGestures, true));
            mapboxMapOptions.scrollGesturesEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_uiScrollGestures, true));
            mapboxMapOptions.rotateGesturesEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_uiRotateGestures, true));
            mapboxMapOptions.tiltGesturesEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_uiTiltGestures, true));
            mapboxMapOptions.zoomControlsEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_uiZoomControls, false));
            mapboxMapOptions.doubleTapGesturesEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_uiDoubleTapGestures, true));
            mapboxMapOptions.maxZoomPreference((double) obtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_cameraZoomMax, 20.0f));
            mapboxMapOptions.minZoomPreference((double) obtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_cameraZoomMin, MapboxConstants.MINIMUM_ZOOM));
            mapboxMapOptions.compassEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_uiCompass, true));
            mapboxMapOptions.compassGravity(obtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_uiCompassGravity, 8388661));
            r5 = new int[4];
            float f2 = FOUR_DP * f;
            r5[0] = (int) obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_uiCompassMarginLeft, f2);
            r5[1] = (int) obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_uiCompassMarginTop, f2);
            r5[2] = (int) obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_uiCompassMarginRight, f2);
            r5[3] = (int) obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_uiCompassMarginBottom, f2);
            mapboxMapOptions.compassMargins(r5);
            mapboxMapOptions.compassFadesWhenFacingNorth(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_uiCompassFadeFacingNorth, true));
            Drawable drawable = null;
            Drawable drawable2 = mapboxMapOptions.isSimpleMode() ? null : obtainStyledAttributes.getDrawable(R.styleable.mapbox_MapView_mapbox_uiCompassDrawable);
            if (drawable2 == null && !mapboxMapOptions.isSimpleMode()) {
                drawable2 = hh.a(context.getResources(), R.drawable.mapbox_compass_icon, null);
            }
            mapboxMapOptions.compassImage(drawable2);
            mapboxMapOptions.logoEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_uiLogo, true));
            mapboxMapOptions.logoGravity(obtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_uiLogoGravity, 8388691));
            mapboxMapOptions.logoMargins(new int[]{(int) obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_uiLogoMarginLeft, f2), (int) obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_uiLogoMarginTop, f2), (int) obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_uiLogoMarginRight, f2), (int) obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_uiLogoMarginBottom, f2)});
            mapboxMapOptions.attributionTintColor(obtainStyledAttributes.getColor(R.styleable.mapbox_MapView_mapbox_uiAttributionTintColor, -1));
            mapboxMapOptions.attributionEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_uiAttribution, true));
            mapboxMapOptions.attributionGravity(obtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_uiAttributionGravity, 80));
            mapboxMapOptions.attributionMargins(new int[]{(int) obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_uiAttributionMarginLeft, NINETY_TWO_DP * f), (int) obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_uiAttributionMarginTop, f2), (int) obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_uiAttributionMarginRight, f2), (int) obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_uiAttributionMarginBottom, f2)});
            mapboxMapOptions.locationEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_myLocation, false));
            mapboxMapOptions.myLocationForegroundTintColor(obtainStyledAttributes.getColor(R.styleable.mapbox_MapView_mapbox_myLocationTintColor, -1));
            mapboxMapOptions.myLocationBackgroundTintColor(obtainStyledAttributes.getColor(R.styleable.mapbox_MapView_mapbox_myLocationBackgroundTintColor, -1));
            drawable2 = mapboxMapOptions.isSimpleMode() ? null : obtainStyledAttributes.getDrawable(R.styleable.mapbox_MapView_mapbox_myLocationDrawable);
            if (drawable2 == null && !mapboxMapOptions.isSimpleMode()) {
                drawable2 = ContextCompat.getDrawable(context, R.drawable.mapbox_mylocation_icon_default);
            }
            Drawable drawable3 = mapboxMapOptions.isSimpleMode() ? null : obtainStyledAttributes.getDrawable(R.styleable.mapbox_MapView_mapbox_myLocationBearingDrawable);
            if (drawable3 == null && !mapboxMapOptions.isSimpleMode()) {
                drawable3 = ContextCompat.getDrawable(context, R.drawable.mapbox_mylocation_icon_bearing);
            }
            if (!mapboxMapOptions.isSimpleMode()) {
                drawable = obtainStyledAttributes.getDrawable(R.styleable.mapbox_MapView_mapbox_myLocationBackgroundDrawable);
            }
            if (drawable == null && !mapboxMapOptions.isSimpleMode()) {
                drawable = ContextCompat.getDrawable(context, R.drawable.mapbox_mylocation_bg_shape);
            }
            mapboxMapOptions.myLocationForegroundDrawables(drawable2, drawable3);
            mapboxMapOptions.myLocationBackgroundDrawable(drawable);
            mapboxMapOptions.myLocationBackgroundPadding(new int[]{(int) (obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_myLocationBackgroundMarginLeft, MapboxConstants.MINIMUM_ZOOM) * f), (int) (obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_myLocationBackgroundMarginTop, MapboxConstants.MINIMUM_ZOOM) * f), (int) (obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_myLocationBackgroundMarginRight, MapboxConstants.MINIMUM_ZOOM) * f), (int) (obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_myLocationBackgroundMarginBottom, MapboxConstants.MINIMUM_ZOOM) * f)});
            mapboxMapOptions.myLocationAccuracyAlpha(obtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_myLocationAccuracyAlpha, 100));
            mapboxMapOptions.myLocationAccuracyTint(obtainStyledAttributes.getColor(R.styleable.mapbox_MapView_mapbox_myLocationAccuracyTintColor, ColorUtils.getPrimaryColor(context)));
            mapboxMapOptions.textureMode(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_renderTextureMode, false));
            if (mapboxMapOptions.simpleMode) {
                mapboxMapOptions.setSimpleMode();
            }
            obtainStyledAttributes.recycle();
            return mapboxMapOptions;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    static Bitmap getBitmapFromDrawable(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public MapboxMapOptions apiBaseUrl(String str) {
        this.apiBaseUrl = str;
        return this;
    }

    public MapboxMapOptions attributionEnabled(boolean z) {
        this.attributionEnabled = z;
        return this;
    }

    public MapboxMapOptions attributionGravity(int i) {
        this.attributionGravity = i;
        return this;
    }

    public MapboxMapOptions attributionMargins(int[] iArr) {
        this.attributionMargins = iArr;
        return this;
    }

    public MapboxMapOptions attributionTintColor(int i) {
        this.attributionTintColor = i;
        return this;
    }

    public MapboxMapOptions camera(CameraPosition cameraPosition) {
        this.cameraPosition = cameraPosition;
        return this;
    }

    public MapboxMapOptions compassEnabled(boolean z) {
        this.compassEnabled = z;
        return this;
    }

    public MapboxMapOptions compassFadesWhenFacingNorth(boolean z) {
        this.fadeCompassFacingNorth = z;
        return this;
    }

    public MapboxMapOptions compassGravity(int i) {
        this.compassGravity = i;
        return this;
    }

    public MapboxMapOptions compassImage(Drawable drawable) {
        this.compassImage = drawable;
        return this;
    }

    public MapboxMapOptions compassMargins(int[] iArr) {
        this.compassMargins = iArr;
        return this;
    }

    public MapboxMapOptions debugActive(boolean z) {
        this.debugActive = z;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public MapboxMapOptions doubleTapGesturesEnabled(boolean z) {
        this.doubleTapGesturesEnabled = z;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MapboxMapOptions mapboxMapOptions = (MapboxMapOptions) obj;
            if (this.debugActive != mapboxMapOptions.debugActive || this.compassEnabled != mapboxMapOptions.compassEnabled || this.fadeCompassFacingNorth != mapboxMapOptions.fadeCompassFacingNorth) {
                return false;
            }
            Drawable drawable = this.compassImage;
            if (!drawable == null ? drawable.equals(mapboxMapOptions.compassImage) : mapboxMapOptions.compassImage == null) {
                return false;
            }
            if (this.compassGravity != mapboxMapOptions.compassGravity || this.logoEnabled != mapboxMapOptions.logoEnabled || this.logoGravity != mapboxMapOptions.logoGravity || this.attributionTintColor != mapboxMapOptions.attributionTintColor || this.attributionEnabled != mapboxMapOptions.attributionEnabled || this.attributionGravity != mapboxMapOptions.attributionGravity || Double.compare(mapboxMapOptions.minZoom, this.minZoom) != 0 || Double.compare(mapboxMapOptions.maxZoom, this.maxZoom) != 0 || this.rotateGesturesEnabled != mapboxMapOptions.rotateGesturesEnabled || this.scrollGesturesEnabled != mapboxMapOptions.scrollGesturesEnabled || this.tiltGesturesEnabled != mapboxMapOptions.tiltGesturesEnabled || this.zoomGesturesEnabled != mapboxMapOptions.zoomGesturesEnabled || this.zoomControlsEnabled != mapboxMapOptions.zoomControlsEnabled || this.doubleTapGesturesEnabled != mapboxMapOptions.doubleTapGesturesEnabled || this.myLocationEnabled != mapboxMapOptions.myLocationEnabled || this.myLocationForegroundTintColor != mapboxMapOptions.myLocationForegroundTintColor || this.myLocationBackgroundTintColor != mapboxMapOptions.myLocationBackgroundTintColor || this.myLocationAccuracyTintColor != mapboxMapOptions.myLocationAccuracyTintColor || this.myLocationAccuracyAlpha != mapboxMapOptions.myLocationAccuracyAlpha) {
                return false;
            }
            CameraPosition cameraPosition = this.cameraPosition;
            if (!cameraPosition == null ? cameraPosition.equals(mapboxMapOptions.cameraPosition) : mapboxMapOptions.cameraPosition == null) {
                return false;
            }
            if (!Arrays.equals(this.compassMargins, mapboxMapOptions.compassMargins) || !Arrays.equals(this.logoMargins, mapboxMapOptions.logoMargins) || !Arrays.equals(this.attributionMargins, mapboxMapOptions.attributionMargins)) {
                return false;
            }
            drawable = this.myLocationForegroundDrawable;
            if (!drawable == null ? drawable.equals(mapboxMapOptions.myLocationForegroundDrawable) : mapboxMapOptions.myLocationForegroundDrawable == null) {
                return false;
            }
            drawable = this.myLocationForegroundBearingDrawable;
            if (!drawable == null ? drawable.equals(mapboxMapOptions.myLocationForegroundBearingDrawable) : mapboxMapOptions.myLocationForegroundBearingDrawable == null) {
                return false;
            }
            drawable = this.myLocationBackgroundDrawable;
            if (!drawable == null ? drawable.equals(mapboxMapOptions.myLocationBackgroundDrawable) : mapboxMapOptions.myLocationBackgroundDrawable == null) {
                return false;
            }
            if (!Arrays.equals(this.myLocationBackgroundPadding, mapboxMapOptions.myLocationBackgroundPadding)) {
                return false;
            }
            String str = this.style;
            if (!str == null ? str.equals(mapboxMapOptions.style) : mapboxMapOptions.style == null) {
                return false;
            }
            str = this.apiBaseUrl;
            if (str == null) {
                String str2 = mapboxMapOptions.apiBaseUrl;
            } else if (!str.equals(mapboxMapOptions.apiBaseUrl)) {
            }
        }
        return false;
    }

    public String getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    public boolean getAttributionEnabled() {
        return this.attributionEnabled;
    }

    public int getAttributionGravity() {
        return this.attributionGravity;
    }

    public int[] getAttributionMargins() {
        return this.attributionMargins;
    }

    public int getAttributionTintColor() {
        return this.attributionTintColor;
    }

    public CameraPosition getCamera() {
        return this.cameraPosition;
    }

    public boolean getCompassEnabled() {
        return this.compassEnabled;
    }

    public boolean getCompassFadeFacingNorth() {
        return this.fadeCompassFacingNorth;
    }

    public int getCompassGravity() {
        return this.compassGravity;
    }

    public Drawable getCompassImage() {
        return this.compassImage;
    }

    public int[] getCompassMargins() {
        return this.compassMargins;
    }

    public boolean getDebugActive() {
        return this.debugActive;
    }

    public boolean getDoubleTapGesturesEnabled() {
        return this.doubleTapGesturesEnabled;
    }

    public boolean getLocationEnabled() {
        return this.myLocationEnabled;
    }

    public boolean getLogoEnabled() {
        return this.logoEnabled;
    }

    public int getLogoGravity() {
        return this.logoGravity;
    }

    public int[] getLogoMargins() {
        return this.logoMargins;
    }

    public double getMaxZoomPreference() {
        return this.maxZoom;
    }

    public double getMinZoomPreference() {
        return this.minZoom;
    }

    public int getMyLocationAccuracyAlpha() {
        return this.myLocationAccuracyAlpha;
    }

    public int getMyLocationAccuracyTintColor() {
        return this.myLocationAccuracyTintColor;
    }

    public Drawable getMyLocationBackgroundDrawable() {
        return this.myLocationBackgroundDrawable;
    }

    public int[] getMyLocationBackgroundPadding() {
        return this.myLocationBackgroundPadding;
    }

    public int getMyLocationBackgroundTintColor() {
        return this.myLocationBackgroundTintColor;
    }

    public Drawable getMyLocationForegroundBearingDrawable() {
        return this.myLocationForegroundBearingDrawable;
    }

    public Drawable getMyLocationForegroundDrawable() {
        return this.myLocationForegroundDrawable;
    }

    public int getMyLocationForegroundTintColor() {
        return this.myLocationForegroundTintColor;
    }

    public boolean getRotateGesturesEnabled() {
        return this.rotateGesturesEnabled;
    }

    public boolean getScrollGesturesEnabled() {
        return this.scrollGesturesEnabled;
    }

    public String getStyle() {
        return this.style;
    }

    public boolean getTextureMode() {
        return this.textureMode;
    }

    public boolean getTiltGesturesEnabled() {
        return this.tiltGesturesEnabled;
    }

    public boolean getZoomControlsEnabled() {
        return this.zoomControlsEnabled;
    }

    public boolean getZoomGesturesEnabled() {
        return this.zoomGesturesEnabled;
    }

    public int hashCode() {
        CameraPosition cameraPosition = this.cameraPosition;
        int i = 0;
        int hashCode = (((((((((cameraPosition != null ? cameraPosition.hashCode() : 0) * 31) + this.debugActive) * 31) + this.compassEnabled) * 31) + this.fadeCompassFacingNorth) * 31) + this.compassGravity) * 31;
        Drawable drawable = this.compassImage;
        hashCode = ((((((((((((((((hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31) + Arrays.hashCode(this.compassMargins)) * 31) + this.logoEnabled) * 31) + this.logoGravity) * 31) + Arrays.hashCode(this.logoMargins)) * 31) + this.attributionTintColor) * 31) + this.attributionEnabled) * 31) + this.attributionGravity) * 31) + Arrays.hashCode(this.attributionMargins);
        long doubleToLongBits = Double.doubleToLongBits(this.minZoom);
        hashCode = (hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.maxZoom);
        hashCode = ((((((((((((((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.rotateGesturesEnabled) * 31) + this.scrollGesturesEnabled) * 31) + this.tiltGesturesEnabled) * 31) + this.zoomGesturesEnabled) * 31) + this.zoomControlsEnabled) * 31) + this.doubleTapGesturesEnabled) * 31) + this.myLocationEnabled) * 31;
        drawable = this.myLocationForegroundDrawable;
        hashCode = (hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        drawable = this.myLocationForegroundBearingDrawable;
        hashCode = (hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        drawable = this.myLocationBackgroundDrawable;
        hashCode = (((((((((((hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31) + this.myLocationForegroundTintColor) * 31) + this.myLocationBackgroundTintColor) * 31) + Arrays.hashCode(this.myLocationBackgroundPadding)) * 31) + this.myLocationAccuracyTintColor) * 31) + this.myLocationAccuracyAlpha) * 31;
        String str = this.apiBaseUrl;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.textureMode) * 31;
        str = this.style;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public boolean isSimpleMode() {
        return this.simpleMode;
    }

    public MapboxMapOptions locationEnabled(boolean z) {
        this.myLocationEnabled = z;
        return this;
    }

    public MapboxMapOptions logoEnabled(boolean z) {
        this.logoEnabled = z;
        return this;
    }

    public MapboxMapOptions logoGravity(int i) {
        this.logoGravity = i;
        return this;
    }

    public MapboxMapOptions logoMargins(int[] iArr) {
        this.logoMargins = iArr;
        return this;
    }

    public MapboxMapOptions maxZoomPreference(double d) {
        this.maxZoom = d;
        return this;
    }

    public MapboxMapOptions minZoomPreference(double d) {
        this.minZoom = d;
        return this;
    }

    public MapboxMapOptions myLocationAccuracyAlpha(int i) {
        this.myLocationAccuracyAlpha = i;
        return this;
    }

    public MapboxMapOptions myLocationAccuracyTint(int i) {
        this.myLocationAccuracyTintColor = i;
        return this;
    }

    public MapboxMapOptions myLocationBackgroundDrawable(Drawable drawable) {
        this.myLocationBackgroundDrawable = drawable;
        return this;
    }

    public MapboxMapOptions myLocationBackgroundPadding(int[] iArr) {
        this.myLocationBackgroundPadding = iArr;
        return this;
    }

    public MapboxMapOptions myLocationBackgroundTintColor(int i) {
        this.myLocationBackgroundTintColor = i;
        return this;
    }

    public MapboxMapOptions myLocationForegroundDrawable(Drawable drawable) {
        this.myLocationForegroundDrawable = drawable;
        return this;
    }

    public MapboxMapOptions myLocationForegroundDrawables(Drawable drawable, Drawable drawable2) {
        this.myLocationForegroundDrawable = drawable;
        this.myLocationForegroundBearingDrawable = drawable2;
        return this;
    }

    public MapboxMapOptions myLocationForegroundTintColor(int i) {
        this.myLocationForegroundTintColor = i;
        return this;
    }

    public MapboxMapOptions rotateGesturesEnabled(boolean z) {
        this.rotateGesturesEnabled = z;
        return this;
    }

    public MapboxMapOptions scrollGesturesEnabled(boolean z) {
        this.scrollGesturesEnabled = z;
        return this;
    }

    public void setSimpleMode() {
        this.simpleMode = true;
        locationEnabled(false);
        compassEnabled(false);
        attributionEnabled(false);
        logoEnabled(false);
    }

    public MapboxMapOptions styleUrl(String str) {
        this.style = str;
        return this;
    }

    public MapboxMapOptions textureMode(boolean z) {
        this.textureMode = z;
        return this;
    }

    public MapboxMapOptions tiltGesturesEnabled(boolean z) {
        this.tiltGesturesEnabled = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.cameraPosition, i);
        parcel.writeByte((byte) this.debugActive);
        parcel.writeByte((byte) this.compassEnabled);
        parcel.writeInt(this.compassGravity);
        parcel.writeIntArray(this.compassMargins);
        parcel.writeByte((byte) this.fadeCompassFacingNorth);
        Drawable drawable = this.compassImage;
        Parcelable parcelable = null;
        parcel.writeParcelable(drawable != null ? getBitmapFromDrawable(drawable) : null, i);
        parcel.writeByte((byte) this.logoEnabled);
        parcel.writeInt(this.logoGravity);
        parcel.writeIntArray(this.logoMargins);
        parcel.writeByte((byte) this.attributionEnabled);
        parcel.writeInt(this.attributionGravity);
        parcel.writeIntArray(this.attributionMargins);
        parcel.writeInt(this.attributionTintColor);
        parcel.writeDouble(this.minZoom);
        parcel.writeDouble(this.maxZoom);
        parcel.writeByte((byte) this.rotateGesturesEnabled);
        parcel.writeByte((byte) this.scrollGesturesEnabled);
        parcel.writeByte((byte) this.tiltGesturesEnabled);
        parcel.writeByte((byte) this.zoomControlsEnabled);
        parcel.writeByte((byte) this.zoomGesturesEnabled);
        parcel.writeByte((byte) this.doubleTapGesturesEnabled);
        parcel.writeByte((byte) this.myLocationEnabled);
        drawable = this.myLocationForegroundDrawable;
        parcel.writeParcelable(drawable != null ? getBitmapFromDrawable(drawable) : null, i);
        drawable = this.myLocationForegroundBearingDrawable;
        parcel.writeParcelable(drawable != null ? getBitmapFromDrawable(drawable) : null, i);
        drawable = this.myLocationBackgroundDrawable;
        if (drawable != null) {
            parcelable = getBitmapFromDrawable(drawable);
        }
        parcel.writeParcelable(parcelable, i);
        parcel.writeInt(this.myLocationForegroundTintColor);
        parcel.writeInt(this.myLocationBackgroundTintColor);
        parcel.writeIntArray(this.myLocationBackgroundPadding);
        parcel.writeInt(this.myLocationAccuracyAlpha);
        parcel.writeInt(this.myLocationAccuracyTintColor);
        parcel.writeString(this.style);
        parcel.writeString(this.apiBaseUrl);
        parcel.writeByte((byte) this.textureMode);
    }

    public MapboxMapOptions zoomControlsEnabled(boolean z) {
        this.zoomControlsEnabled = z;
        return this;
    }

    public MapboxMapOptions zoomGesturesEnabled(boolean z) {
        this.zoomGesturesEnabled = z;
        return this;
    }
}
