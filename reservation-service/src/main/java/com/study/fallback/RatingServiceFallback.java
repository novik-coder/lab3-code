package com.study.fallback;

import com.study.client.RatingServiceClient;
import com.study.common.dto.rating.UserRatingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class RatingServiceFallback implements RatingServiceClient {
    @Override
    public UserRatingResponse getUserRating(String username) {
        return null;
    }

    @Override
    public ResponseEntity<Void> increaseRating(String username) {
        return null;
    }
}
