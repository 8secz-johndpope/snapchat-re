package org.jcodec.codecs.aac;

public class ADTSParser {

    public static class Header {
        private int chanConfig;
        private int objectType;
        private int samplingIndex;

        public int getChanConfig() {
            return this.chanConfig;
        }

        public int getObjectType() {
            return this.objectType;
        }

        public int getSamplingIndex() {
            return this.samplingIndex;
        }
    }
}
