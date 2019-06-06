package com.snap.scan.scannable;

import defpackage.ahov;
import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxy;
import defpackage.akyc;
import defpackage.vvg;

public interface ScannableHttpInterface {
    @akxy(a = "/scannablesv2/SNAPCODE/{snapcodeIdentifier}/actions")
    ajdx<ahov> getScannableForSnapcodeScan(@akyc(a = "snapcodeIdentifier") String str, @akxk vvg vvg);
}
