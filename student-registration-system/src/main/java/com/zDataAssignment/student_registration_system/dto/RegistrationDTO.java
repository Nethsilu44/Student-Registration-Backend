package com.zDataAssignment.student_registration_system.dto;

import lombok.*;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;
import jakarta.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDTO {

    @NotNull(message = "Student ID is required")
    private UUID courseID;

    @NotNull(message = "Course ID is required")
    private UUID studentID;
}
