package mx.clip.api.services;

import java.net.URI;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

@Service
public class AmazonDynamoDbClient {

    @Bean
    public DynamoDbClient amazonDynamoClient() {
        return getDynamoDbClient();
    }

    @Bean
    DynamoDbEnhancedClient amazonDynamoDBEnhancedClient() {
        return DynamoDbEnhancedClient.builder().dynamoDbClient(getDynamoDbClient()).build();
    }

    private DynamoDbClient getDynamoDbClient() {

        Region region = Region.US_EAST_2;
        AwsBasicCredentials credentials = AwsBasicCredentials.create(
            "AKIAY45LP3T7AGTC4KNW",
            "jtvDbclG58yeGhNL1AXJcQAJ9nHnBRNcCaFjxhIw");

        ClientOverrideConfiguration.Builder overrideConfig =
            ClientOverrideConfiguration.builder();

        return DynamoDbClient.builder()
            .overrideConfiguration(overrideConfig.build())
            .region(region)
            .credentialsProvider(StaticCredentialsProvider.create(credentials))
            .build();
    }
    
}
