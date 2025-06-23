package com.zDataAssignment.student_registration_system.model;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration {

    private UUID studentId;
    private UUID courseId;
    private LocalDateTime registeredAt;
}
