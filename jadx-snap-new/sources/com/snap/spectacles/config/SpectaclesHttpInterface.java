package com.snap.spectacles.config;

import android.util.ArrayMap;
import defpackage.aedh;
import defpackage.ahga;
import defpackage.ahgc;
import defpackage.ahgl;
import defpackage.ajdx;
import defpackage.akhw;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxy;
import defpackage.gjh;
import java.util.ArrayList;

public interface SpectaclesHttpInterface {
    @akxy(a = "/loq/update_laguna_device")
    ajdx<String> deleteSpectaclesDevice(@akxk ahgl ahgl);

    @akxy(a = "/res_downloader/proxy")
    ajdx<akxa<akhw>> getReleaseNotes(@akxk aedh aedh);

    @akxy(a = "/loq/get_laguna_devices")
    ajdx<ahga> getSpectaclesDevices(@akxk aedh aedh);

    @akxy(a = "/res_downloader/proxy")
    ajdx<akxa<akhw>> getSpectaclesFirmwareBinary(@akxk aedh aedh);

    @akxy(a = "/res_downloader/proxy")
    ajdx<akxa<akhw>> getSpectaclesFirmwareMetadata(@akxk aedh aedh);

    @akxy(a = "/res_downloader/proxy")
    ajdx<ArrayList<ArrayMap<String, String>>> getSpectaclesFirmwareTags(@akxk aedh aedh);

    @akxy(a = "/res_downloader/proxy")
    ajdx<akxa<akhw>> getSpectaclesResourceReleaseTags(@akxk aedh aedh);

    @akxy(a = "/loq/update_laguna_device")
    ajdx<ahgc> updateSpectaclesDevice(@akxk ahgl ahgl);

    @gjh
    @akxy(a = "/spectacles/process_analytics_log")
    ajdx<akxa<akhw>> uploadAnalyticsFile(@akxk aedh aedh);
}
