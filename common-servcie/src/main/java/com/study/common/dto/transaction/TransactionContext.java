// TransactionContext.java
package com.study.common.dto.transaction;

import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
public class TransactionContext implements Serializable {
    private String transactionId;
    private String operation;  // TAKE_BOOK, RETURN_BOOK
    private String username;
    private Map<String, Object> params;
    private List<String> completedSteps = new ArrayList<>();
    private int retryCount;
    private LocalDateTime createTime;
    private String errorMessage;
}



