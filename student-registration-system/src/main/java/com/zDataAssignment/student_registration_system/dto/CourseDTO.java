package com.zDataAssignment.student_registration_system.dto;

import lombok.*;
import jakarta.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {
    @NotBlank(message = "Course code is required")
    private String code;

    @NotBlank(message = "Course title is required")
    private String title;

    @NotBlank(message = "Instructor name is required")
    private String instructor;
}
