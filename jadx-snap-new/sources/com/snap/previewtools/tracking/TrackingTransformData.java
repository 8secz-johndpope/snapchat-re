package com.snap.previewtools.tracking;

import com.google.common.base.Preconditions;
import defpackage.abpp;
import defpackage.acap;
import defpackage.akmc;
import defpackage.akmd;

public class TrackingTransformData implements acap {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final Integer e;

    public TrackingTransformData(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = null;
    }

    private TrackingTransformData(float f, float f2, float f3, float f4, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = Integer.valueOf(i);
    }

    public final int a() {
        Integer num = this.e;
        if (num == null) {
            return 2;
        }
        int intValue = num.intValue();
        return intValue != -1 ? intValue != 0 ? intValue != 1 ? 4 : 3 : 2 : 1;
    }

    public final /* synthetic */ acap a(acap acap, float f) {
        Preconditions.checkState(acap instanceof TrackingTransformData);
        TrackingTransformData trackingTransformData = (TrackingTransformData) acap;
        float f2 = 1.0f - f;
        return new TrackingTransformData((this.a * f2) + (trackingTransformData.a * f), (this.b * f2) + (trackingTransformData.b * f), (this.c * f2) + (trackingTransformData.c * f), (f2 * this.d) + (f * trackingTransformData.d));
    }

    public final TrackingTransformData a(float f, float f2, float f3, int i, int i2) {
        double toDegrees = Math.toDegrees((double) this.a);
        double d = (double) f3;
        Double.isNaN(d);
        return new TrackingTransformData((float) (toDegrees + d), this.b * f2, (this.c * f) - (((float) i) / 2.0f), (this.d * f) - (((float) i2) / 2.0f), abpp.a(this.e, 0));
    }

    public final float b() {
        return this.a;
    }

    public final float c() {
        return this.b;
    }

    public final float d() {
        return this.c;
    }

    public final float e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TrackingTransformData)) {
            return false;
        }
        TrackingTransformData trackingTransformData = (TrackingTransformData) obj;
        return new akmc().a(this.a, trackingTransformData.a).a(this.b, trackingTransformData.b).a(this.c, trackingTransformData.c).a(this.d, trackingTransformData.d).a(this.e, trackingTransformData.e).a;
    }

    public int hashCode() {
        return new akmd().a(this.a).a(this.b).a(this.c).a(this.d).a(this.e).a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("TransformData{mRotation=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mScale=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mXPosition=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mYPosition=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mStatus=");
        stringBuilder.append(this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
