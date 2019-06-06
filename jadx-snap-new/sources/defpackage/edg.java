package defpackage;

import android.annotation.TargetApi;

/* renamed from: edg */
public final class edg {
    public final ecd a;
    public final ecc b = null;
    public final abtl c;
    public final abtl d;
    public final Integer e;
    public final Float f;
    public final Boolean g;
    public final Boolean h;
    public final ecf i;
    public final ecb j;

    /* renamed from: edg$a */
    public static class a {
        public ecd a;
        public abtl b;
        public abtl c;
        public Integer d;
        public Float e;
        public ecf f;
        public ecb g;
        private Boolean h;
        private Boolean i;

        public final a a(abtl abtl) {
            this.b = abtl;
            return this;
        }

        public final a a(ecf ecf) {
            this.f = ecf;
            return this;
        }

        @TargetApi(15)
        public final a a(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final edg a() {
            return new edg(this.a, this.b, this.c, this.d, this.e, this.h, this.i, this.f, this.g);
        }

        public final a b(abtl abtl) {
            this.c = abtl;
            return this;
        }

        public final a b(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a != aVar.a) {
                return false;
            }
            abtl abtl = this.b;
            if (!abtl == null ? abtl.equals(aVar.b) : aVar.b == null) {
                return false;
            }
            abtl = this.c;
            if (!abtl == null ? abtl.equals(aVar.c) : aVar.c == null) {
                return false;
            }
            Integer num = this.d;
            if (!num == null ? num.equals(aVar.d) : aVar.d == null) {
                return false;
            }
            Float f = this.e;
            if (!f == null ? f.equals(aVar.e) : aVar.e == null) {
                return false;
            }
            Boolean bool = this.h;
            if (!bool == null ? bool.equals(aVar.h) : aVar.h == null) {
                return false;
            }
            bool = this.i;
            if (!bool == null ? bool.equals(aVar.i) : aVar.i == null) {
                return false;
            }
            if (this.f != aVar.f) {
                return false;
            }
            ecb ecb = this.g;
            return ecb != null ? ecb.equals(aVar.g) : aVar.g == null;
        }

        public final int hashCode() {
            ecd ecd = this.a;
            int i = 0;
            int hashCode = ((ecd != null ? ecd.hashCode() : 0) * 31) * 31;
            abtl abtl = this.b;
            hashCode = (hashCode + (abtl != null ? abtl.hashCode() : 0)) * 31;
            abtl = this.c;
            hashCode = (hashCode + (abtl != null ? abtl.hashCode() : 0)) * 31;
            Integer num = this.d;
            hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            Float f = this.e;
            hashCode = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
            Boolean bool = this.h;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            bool = this.i;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            ecf ecf = this.f;
            hashCode = (hashCode + (ecf != null ? ecf.hashCode() : 0)) * 31;
            ecb ecb = this.g;
            if (ecb != null) {
                i = ecb.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ScCameraSettingsBuilder{mScFocusMode=");
            stringBuilder.append(this.a);
            stringBuilder.append(", mScFlashMode=");
            stringBuilder.append(null);
            stringBuilder.append(", mPreviewResolution=");
            stringBuilder.append(this.b);
            stringBuilder.append(", mPictureResolution=");
            stringBuilder.append(this.c);
            stringBuilder.append(", mExposureCompensation=");
            stringBuilder.append(this.d);
            stringBuilder.append(", mZoomPercent=");
            stringBuilder.append(this.e);
            stringBuilder.append(", mVideoStabilizationEnabled=");
            stringBuilder.append(this.h);
            stringBuilder.append(", mOpticalImageStabilizationEnabled=");
            stringBuilder.append(this.i);
            stringBuilder.append(", mPictureMode=");
            stringBuilder.append(this.f);
            stringBuilder.append(", mFpsRange=");
            stringBuilder.append(this.g);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public edg(ecd ecd, abtl abtl, abtl abtl2, Integer num, Float f, Boolean bool, Boolean bool2, ecf ecf, ecb ecb) {
        this.a = ecd;
        this.c = abtl;
        this.d = abtl2;
        this.e = num;
        this.f = f;
        this.g = bool;
        this.h = bool2;
        this.i = ecf;
        this.j = ecb;
    }

    public final String toString() {
        return String.format("FocusMode %s, FlashMode %s, previewResolution %s, pictureResolution %s, exposureCompensation %s, VideoStabilizationEnabled %s, OpticalStabilizationEnabled %s, PictureMode %s, FpsRange %s", new Object[]{this.a, null, this.c, this.d, this.e, this.g, this.h, this.i, this.j});
    }
}
