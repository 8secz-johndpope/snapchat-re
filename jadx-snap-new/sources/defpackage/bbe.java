package defpackage;

@Deprecated
/* renamed from: bbe */
public interface bbe<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends bbh> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}
