package xyz.iamraj.aws.s3;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.*;

public class S3Operations {

    public static void main(String[] args) {
        /**
         * Create S3Client object
         */
        S3Client s3Client = CreateS3Client.getS3Client();

        /**
         *  Create a bucket
         */
        String bucketName = createBucket(s3Client);


        /**
         *  List buckets
         *  --------------
         */
        listBuckets(s3Client);

        /**
         *  Delete empty bucket
         *  --------------------
         */
        deleteBucket(s3Client, bucketName);

    }

    /**
     * Creates a bucket and returns the bucket name
     *
     * @param s3Client
     * @return bucket name
     */

    public static String createBucket(S3Client s3Client) {

        String bucket = "bucket" + System.currentTimeMillis();
        System.out.println(bucket);

        CreateBucketRequest createBucketRequest = CreateBucketRequest
                .builder()
                .bucket(bucket)
                .createBucketConfiguration(CreateBucketConfiguration.builder()
                        .locationConstraint(Region.AP_SOUTH_1.id())
                        .build())
                .build();
        s3Client.createBucket(createBucketRequest);

        return bucket;
    }

    /**
     * List all buckets
     *
     * @param s3Client
     */
    public static void listBuckets(S3Client s3Client) {

        ListBucketsRequest listBucketsRequest = ListBucketsRequest.builder().build();
        ListBucketsResponse listBucketsResponse = s3Client.listBuckets(listBucketsRequest);
        listBucketsResponse.buckets().stream().forEach(x -> System.out.println(x.name()));
    }

    /**
     * Delete empty bucket
     *
     * @param s3Client
     * @param bucketName
     */
    public static void deleteBucket(S3Client s3Client, String bucketName) {
        DeleteBucketRequest deleteBucketRequest = DeleteBucketRequest.builder().bucket(bucketName).build();
        s3Client.deleteBucket(deleteBucketRequest);
    }
}
