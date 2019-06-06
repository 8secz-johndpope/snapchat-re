package com.snapchat.labscv;

import java.util.ArrayList;

public class DepthSystemDefs {

    final class AccelerationData {
        private float x;
        private float y;
        private float z;

        AccelerationData() {
        }
    }

    final class AlignmentData {
        final ArrayList<AlignmentFrameData> alignmentData = new ArrayList();

        AlignmentData() {
        }
    }

    final class AlignmentFrameData {
        private final float[] leftAlignmentComp = new float[9];
        private final float[] rightAlignmentComp = new float[9];
        private double timestamp;

        AlignmentFrameData() {
        }
    }

    enum DepthDataType {
        Depth,
        Disparity,
        Confidence
    }

    final class EulerAngles {
        private float pitch;
        private float roll;
        private float yaw;

        EulerAngles() {
        }
    }

    final class ImuDataRaw {
        public final ArrayList<ImuFrameDataRaw> imuData = new ArrayList();

        ImuDataRaw() {
        }
    }

    final class ImuFrameDataRaw {
        private final AccelerationData acceleration = new AccelerationData();
        private final RotationRateData rotationRate = new RotationRateData();
        private double timestamp;

        ImuFrameDataRaw() {
        }
    }

    public enum InputType {
        Video,
        Photo
    }

    public enum LutType {
        FishEye2Distorted,
        FishEye2Rectified,
        Rectified2Distorted
    }

    final class RotationRateData {
        private float x;
        private float y;
        private float z;

        RotationRateData() {
        }
    }

    final class SixdofData {
        final ArrayList<SixdofFrameData> sixdofData = new ArrayList();

        SixdofData() {
        }
    }

    final class SixdofFrameData {
        private final EulerAngles eulerAngles = new EulerAngles();
        private double timestamp;
        private final TranslationData translation = new TranslationData();

        SixdofFrameData() {
        }
    }

    final class TranslationData {
        private float x;
        private float y;
        private float z;

        TranslationData() {
        }
    }
}
