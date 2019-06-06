package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: ge */
final class ge implements Parcelable {
    public static final Creator<ge> CREATOR = new 1();
    final int a;
    Bundle b;
    fv c;
    private String d;
    private boolean e;
    private int f;
    private int g;
    private String h;
    private boolean i;
    private boolean j;
    private Bundle k;
    private boolean l;

    /* renamed from: ge$1 */
    static class 1 implements Creator<ge> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ge(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ge[i];
        }
    }

    ge(Parcel parcel) {
        this.d = parcel.readString();
        this.a = parcel.readInt();
        boolean z = true;
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.l = z;
        this.b = parcel.readBundle();
    }

    ge(fv fvVar) {
        this.d = fvVar.getClass().getName();
        this.a = fvVar.mIndex;
        this.e = fvVar.mFromLayout;
        this.f = fvVar.mFragmentId;
        this.g = fvVar.mContainerId;
        this.h = fvVar.mTag;
        this.i = fvVar.mRetainInstance;
        this.j = fvVar.mDetached;
        this.k = fvVar.mArguments;
        this.l = fvVar.mHidden;
    }

    public final fv a(fy fyVar, fw fwVar, fv fvVar, gb gbVar, y yVar) {
        if (this.c == null) {
            Context context = fyVar.b;
            Bundle bundle = this.k;
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            this.c = fwVar != null ? fwVar.a(context, this.d, this.k) : fv.instantiate(context, this.d, this.k);
            Bundle bundle2 = this.b;
            if (bundle2 != null) {
                bundle2.setClassLoader(context.getClassLoader());
                this.c.mSavedFragmentState = this.b;
            }
            this.c.setIndex(this.a, fvVar);
            fv fvVar2 = this.c;
            fvVar2.mFromLayout = this.e;
            fvVar2.mRestored = true;
            fvVar2.mFragmentId = this.f;
            fvVar2.mContainerId = this.g;
            fvVar2.mTag = this.h;
            fvVar2.mRetainInstance = this.i;
            fvVar2.mDetached = this.j;
            fvVar2.mHidden = this.l;
            fvVar2.mFragmentManager = fyVar.d;
        }
        fv fvVar3 = this.c;
        fvVar3.mChildNonConfig = gbVar;
        fvVar3.mViewModelStore = yVar;
        return fvVar3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeInt(this.a);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.l);
        parcel.writeBundle(this.b);
    }
}
