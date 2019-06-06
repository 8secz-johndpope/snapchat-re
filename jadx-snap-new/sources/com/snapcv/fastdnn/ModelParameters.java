package com.snapcv.fastdnn;

public final class ModelParameters {
    private final Backend backendType;
    private final TensorShape inputDimensions;
    private final String inputLayerName;
    private final String modelFilePath;
    private final String[] outputLayerNames;

    public static class ModelParameterBuilder {
        private Backend backendType;
        private TensorShape inputDimensions;
        private String inputLayerName;
        private String modelFilePath;
        private String[] outputLayerNames;

        public ModelParameters build() {
            if (this.backendType == null) {
                this.backendType = Backend.LIBDNN;
            }
            if (this.inputDimensions == null) {
                this.inputDimensions = new TensorShape();
            }
            return new ModelParameters(this.backendType, this.modelFilePath, this.inputDimensions, this.inputLayerName, this.outputLayerNames);
        }

        public ModelParameterBuilder setBackendType(Backend backend) {
            this.backendType = backend;
            return this;
        }

        public ModelParameterBuilder setInputDimensions(TensorShape tensorShape) {
            this.inputDimensions = tensorShape;
            return this;
        }

        public ModelParameterBuilder setInputLayerName(String str) {
            this.inputLayerName = str;
            return this;
        }

        public ModelParameterBuilder setModelFilePath(String str) {
            this.modelFilePath = str;
            return this;
        }

        public ModelParameterBuilder setOutputLayerNames(String[] strArr) {
            this.outputLayerNames = strArr;
            return this;
        }
    }

    ModelParameters(Backend backend, String str, TensorShape tensorShape, String str2, String[] strArr) {
        this.backendType = backend;
        this.modelFilePath = str;
        this.inputDimensions = tensorShape;
        this.inputLayerName = str2;
        this.outputLayerNames = strArr;
    }

    public final Backend getBackendType() {
        return this.backendType;
    }

    public final TensorShape getInputDimensions() {
        return this.inputDimensions;
    }

    public final String getInputLayerName() {
        return this.inputLayerName;
    }

    public final String getModelFilePath() {
        return this.modelFilePath;
    }

    public final String[] getOutputLayerNames() {
        return this.outputLayerNames;
    }
}
