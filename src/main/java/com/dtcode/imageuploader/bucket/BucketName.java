package com.dtcode.imageuploader.bucket;

public enum BucketName {

    PROFILE_IMAGE("imageuploaderv1");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
