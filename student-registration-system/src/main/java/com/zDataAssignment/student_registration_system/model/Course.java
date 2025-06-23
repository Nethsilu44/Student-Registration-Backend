package com.zDataAssignment.student_registration_system.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private UUID id;

    @NotBlank
    private String code;

    @NotBlank
    private String title;

    @NotBlank
    private String instructor;
}
