package com.addlive.impl.video;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
class CodecSupport {
    static final String CODEC_NOT_AVAILABLE = "NO-CODEC";
    private static final int DEFAULT_ENCODER_IFRAME_INTERVAL = 9999;
    static final int ENCODING_FRAME_RATE = 24;
    private static final String LOG_TAG = "AddLive_SDKCodecSupport";
    static final int SD_HEIGHT = 640;
    static final int SD_WIDTH = 360;
    private static final long STOP_CODEC_TIMEOUT_MS = 2000;
    private static final int VGA_WIDTH = 480;
    static final String VideoCodecMimeAVC = "video/avc";
    static final String VideoCodecMimeHEVC = "video/hevc";
    static final String VideoCodecMimeVP8 = "video/x-vnd.on2.vp8";
    static final Object globalCodecInitializationLock = new Object();

    interface CodecCheck {
        boolean isCodecUsable(MediaCodecInfo mediaCodecInfo);
    }

    static class AvcCapabilityChecker implements CodecCheck {
        AvcCapabilityChecker() {
        }

        public boolean isCodecUsable(MediaCodecInfo mediaCodecInfo) {
            return (mediaCodecInfo.isEncoder() && mediaCodecInfo.getName().startsWith("OMX.sprd")) ? false : true;
        }
    }

    static class Vp8CapabilityChecker implements CodecCheck {
        private static final WhiteListItem[] whiteList = new WhiteListItem[]{new WhiteListItem("OMX.qcom.", 21), new WhiteListItem("OMX.Exynos.", 23)};

        static class WhiteListItem {
            final String prefix;
            public final int version;

            WhiteListItem(String str, int i) {
                this.prefix = str;
                this.version = i;
            }
        }

        Vp8CapabilityChecker() {
        }

        public boolean isCodecUsable(MediaCodecInfo mediaCodecInfo) {
            for (WhiteListItem whiteListItem : whiteList) {
                if (mediaCodecInfo.getName().startsWith(whiteListItem.prefix) && VERSION.SDK_INT >= whiteListItem.version) {
                    return true;
                }
            }
            return false;
        }
    }

    CodecSupport() {
    }

    static MediaFormat createDecoderFormat(String str) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, SD_WIDTH, SD_HEIGHT);
        createVideoFormat.setInteger("color-format", 2135033992);
        if (VERSION.SDK_INT >= 23) {
            createVideoFormat.setInteger("priority", 0);
        }
        return createVideoFormat;
    }

    static MediaFormat createEncoderFormat(String str, int i, int i2, int i3, int i4) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
        createVideoFormat.setInteger("frame-rate", i3);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("i-frame-interval", DEFAULT_ENCODER_IFRAME_INTERVAL);
        createVideoFormat.setInteger("bitrate-mode", 2);
        createVideoFormat.setInteger("bitrate", i4);
        if (VERSION.SDK_INT >= 23) {
            createVideoFormat.setInteger("priority", 0);
        }
        createVideoFormat.setInteger("intra-refresh-period", i3 * 30);
        return createVideoFormat;
    }

    static String findDecoder(String str) {
        int i = VERSION.SDK_INT;
        String str2 = CODEC_NOT_AVAILABLE;
        if (i < 21) {
            return str2;
        }
        try {
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, SD_WIDTH, SD_HEIGHT);
            createVideoFormat.setInteger("color-format", 2135033992);
            str = new MediaCodecList(1).findDecoderForFormat(createVideoFormat);
            return str != null ? str : str2;
        } catch (RuntimeException e) {
            Log.e(LOG_TAG, "An error occured while searching for encoder ".concat(String.valueOf(e)));
        }
    }

    static String findEncoder(String str, int i, int i2) {
        return findEncoder(str, i, i2, null);
    }

    static String findEncoder(String str, int i, int i2, CodecCheck codecCheck) {
        int i3 = VERSION.SDK_INT;
        String str2 = CODEC_NOT_AVAILABLE;
        if (i3 < 21) {
            return str2;
        }
        try {
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
            createVideoFormat.setInteger("color-format", 2130708361);
            MediaCodecList mediaCodecList = new MediaCodecList(1);
            String findEncoderForFormat = mediaCodecList.findEncoderForFormat(createVideoFormat);
            String str3 = "width";
            if (findEncoderForFormat == null && i == SD_WIDTH && i2 == SD_HEIGHT) {
                createVideoFormat.setInteger(str3, VGA_WIDTH);
                findEncoderForFormat = mediaCodecList.findEncoderForFormat(createVideoFormat);
                i = VGA_WIDTH;
            }
            if (findEncoderForFormat == null && i < i2) {
                createVideoFormat.setInteger(str3, i2);
                createVideoFormat.setInteger("height", i);
                findEncoderForFormat = mediaCodecList.findEncoderForFormat(createVideoFormat);
            }
            if (findEncoderForFormat == null) {
                return str2;
            }
            if (codecCheck == null) {
                return findEncoderForFormat;
            }
            MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
            i = codecInfos.length;
            i2 = 0;
            while (i2 < i) {
                MediaCodecInfo mediaCodecInfo = codecInfos[i2];
                if (mediaCodecInfo.isEncoder() && mediaCodecInfo.getName().equals(findEncoderForFormat)) {
                    return codecCheck.isCodecUsable(mediaCodecInfo) ? findEncoderForFormat : str2;
                } else {
                    i2++;
                }
            }
            return str2;
        } catch (RuntimeException e) {
            Log.e(LOG_TAG, "An error occured while searching for encoder ".concat(String.valueOf(e)));
        }
    }

    static void stopAndReleaseCodec(final MediaCodec mediaCodec) {
        String str;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new Thread(new Runnable() {
            public final void run() {
                String str = CodecSupport.LOG_TAG;
                try {
                    mediaCodec.stop();
                } catch (Exception e) {
                    Log.e(str, "MediaCodec.stop() failed ".concat(String.valueOf(e)));
                }
                try {
                    mediaCodec.release();
                } catch (Exception e2) {
                    Log.e(str, "Unexpected failure in codec.release()", e2);
                }
                countDownLatch.countDown();
            }
        }).start();
        while (true) {
            long count = countDownLatch.getCount();
            str = LOG_TAG;
            if (count > 0 && SystemClock.elapsedRealtime() - elapsedRealtime < STOP_CODEC_TIMEOUT_MS) {
                try {
                    countDownLatch.await(STOP_CODEC_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    Log.d(str, "Waiting for stop() was interrupted");
                }
            }
        }
        if (countDownLatch.getCount() > 0) {
            Log.e(str, "MediaCodec.stop() becomes unresponsive, will leak an instance");
        }
    }
}
