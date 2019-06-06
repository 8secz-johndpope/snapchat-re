package com.snapchat.research.previewcv;

import com.snapchat.research.previewcv.SnapCut.a;

public class SnapCutExt extends SnapCut {
    private transient long b;

    public SnapCutExt() {
        this(PreviewCVInterfaceJNI.new_SnapCutExt__SWIG_0());
    }

    private SnapCutExt(long j) {
        super(PreviewCVInterfaceJNI.SnapCutExt_SWIGUpcast(j));
        this.b = j;
    }

    public SnapCutExt(a aVar) {
        this(PreviewCVInterfaceJNI.new_SnapCutExt__SWIG_3(aVar.b, true));
    }

    public final synchronized void a() {
        if (this.b != 0) {
            if (this.a) {
                this.a = false;
                PreviewCVInterfaceJNI.delete_SnapCutExt(this.b);
            }
            this.b = 0;
        }
        super.a();
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
