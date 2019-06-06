package com.looksery.sdk.domain;

public final class ClientInterfaceModalData {
    private final String mDescriptionId;
    private final String mHeaderId;

    public ClientInterfaceModalData(String str, String str2) {
        this.mHeaderId = str;
        this.mDescriptionId = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClientInterfaceModalData clientInterfaceModalData = (ClientInterfaceModalData) obj;
            String str = this.mHeaderId;
            if (!str == null ? str.equals(clientInterfaceModalData.mHeaderId) : clientInterfaceModalData.mHeaderId == null) {
                return false;
            }
            str = this.mDescriptionId;
            if (str != null) {
                return str.equals(clientInterfaceModalData.mDescriptionId);
            }
            if (clientInterfaceModalData.mDescriptionId == null) {
                return true;
            }
        }
        return false;
    }

    public final String getDescriptionId() {
        return this.mDescriptionId;
    }

    public final String getHeaderId() {
        return this.mHeaderId;
    }

    public final int hashCode() {
        String str = this.mHeaderId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mDescriptionId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClientInterfaceModalData{mHeaderId='");
        stringBuilder.append(this.mHeaderId);
        stringBuilder.append('\'');
        stringBuilder.append(", mDescriptionId='");
        stringBuilder.append(this.mDescriptionId);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
