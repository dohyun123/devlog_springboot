package com.com.cnu.devlog_springboot.model.request;

import com.com.cnu.devlog_springboot.model.Project;
import java.time.LocalDate;

public record ProjectRequest(
        @@ -9,4 +10,14 @@ public record ProjectRequest(
        LocalDate startDate,
        LocalDate endDate
) {
    public Project toProject() {
        return new Project(
                null,
                title,
                summary,
                contents,
                startDate,
                endDate
        );
    }
}