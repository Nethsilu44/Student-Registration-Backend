package com.zDataAssignment.student_registration_system.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private UUID id;

    @NotBlank
    private String name;

    @Email
    private String email;


}
