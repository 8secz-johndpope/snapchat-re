package com.mapbox.services.android.telemetry.utils;

class AudioTypeChain {
    AudioTypeChain() {
    }

    /* Access modifiers changed, original: 0000 */
    public AudioTypeResolver setup() {
        UnknownAudioType unknownAudioType = new UnknownAudioType();
        SpeakerAudioType speakerAudioType = new SpeakerAudioType();
        speakerAudioType.nextChain(unknownAudioType);
        HeadphonesAudioType headphonesAudioType = new HeadphonesAudioType();
        headphonesAudioType.nextChain(speakerAudioType);
        BluetoothAudioType bluetoothAudioType = new BluetoothAudioType();
        bluetoothAudioType.nextChain(headphonesAudioType);
        return bluetoothAudioType;
    }
}
