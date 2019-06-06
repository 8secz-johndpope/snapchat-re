package com.looksery.sdk.domain;

import java.util.Map;

public final class ClientInterfaceData {
    private static final String CLIENT_INTERFACE_DATA_TRUE = "1";
    private static final String FACE_FILTERING_ENABLED_KEY = "FaceFilteringEnabled";
    private static final String MODAL_DESCRIPTION_ID_KEY = "DescriptionId";
    private static final String MODAL_HEADER_ID_KEY = "HeaderId";
    private final Map<String, String> mData;

    public enum ImagePickerMode {
        Originals,
        Faces
    }

    public ClientInterfaceData(Map<String, String> map) {
        this.mData = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClientInterfaceData clientInterfaceData = (ClientInterfaceData) obj;
            Map map = this.mData;
            if (map != null) {
                return map.equals(clientInterfaceData.mData);
            }
            if (clientInterfaceData.mData == null) {
                return true;
            }
        }
        return false;
    }

    public final ImagePickerMode getImagePickerMode() {
        Map map = this.mData;
        String str = FACE_FILTERING_ENABLED_KEY;
        if (!map.containsKey(str)) {
            return ImagePickerMode.Faces;
        }
        return "1".equals(this.mData.get(str)) ? ImagePickerMode.Faces : ImagePickerMode.Originals;
    }

    public final ClientInterfaceModalData getModalData() {
        return new ClientInterfaceModalData((String) this.mData.get(MODAL_HEADER_ID_KEY), (String) this.mData.get(MODAL_DESCRIPTION_ID_KEY));
    }

    public final int hashCode() {
        Map map = this.mData;
        return map != null ? map.hashCode() : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClientInterfaceData{mData=");
        stringBuilder.append(this.mData);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
