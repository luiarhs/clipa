package mx.clip.api.service;

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
            "your_access_key_id",
            "your_secret_access_key");

        ClientOverrideConfiguration.Builder overrideConfig =
            ClientOverrideConfiguration.builder();

        return DynamoDbClient.builder()
            .overrideConfiguration(overrideConfig.build())
            .region(region)
            .credentialsProvider(StaticCredentialsProvider.create(credentials))
            .build();
    }
    
}
