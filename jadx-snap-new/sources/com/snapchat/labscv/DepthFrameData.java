package com.snapchat.labscv;

import org.opencv.core.Mat;

public final class DepthFrameData {
    final CameraData depthCamera = new CameraData();
    int frameIndex;
    final ModuleData left = new ModuleData();
    final CameraData rgbCamera = new CameraData();
    final ModuleData right = new ModuleData();
    double timeStamp;

    final class ModuleData {
        final Mat confidence = new Mat();
        final Mat depth = new Mat();
        final Mat disparity = new Mat();
        final Mat lookupTable = new Mat();
        final Mat rgb = new Mat();
        final Mat rgbThumbnail = new Mat();

        ModuleData() {
        }

        public final void releaseData() {
            this.rgb.release();
            this.rgbThumbnail.release();
            this.lookupTable.release();
            this.depth.release();
            this.disparity.release();
            this.confidence.release();
        }
    }
}
