package com.barclays.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaskResult {
    private String taskName;
    private Object taskResult;
}
