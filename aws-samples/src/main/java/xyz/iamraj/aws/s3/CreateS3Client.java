package xyz.iamraj.aws.s3;

import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.services.s3.S3Client;
import xyz.iamraj.aws.utils.Constants;

/**
 * An utility class to create S3Client instance
 *
 * @author rraigonde
 */
public class CreateS3Client {

    public static S3Client getS3Client() {
        S3Client s3 = S3Client.builder()
                .region(Constants.REGION_MUMBAI)
                .credentialsProvider(ProfileCredentialsProvider.create(Constants.CREDENTIAL_PROFILE_NAME))
                .build();
        return s3;
    }
}
