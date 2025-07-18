package com.global;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.Data;

@Entity
@Table(name = "employee_app")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // الاسم الكامل
    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Middle name is required")
    private String middleName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    
    
    // تاريخ الميلاد
    @NotBlank(message = "Birth month is required")
    private String birthMonth;

    @NotNull(message = "Birth day is required")
    @Min(value = 1, message = "Birth day must be at least 1")
    @Max(value = 31, message = "Birth day must be at most 31")
    private Integer birthDay;

    @NotNull(message = "Birth year is required")
    @Min(value = 1900, message = "Birth year must be after 1900")
    @Max(value = 2024, message = "Birth year must be before or equal to 2024")
    private Integer birthYear;

    
    
    // العنوان الحالي
    @NotBlank(message = "Address line 1 is required")
    private String addressLine1;

    private String addressLine2; 
    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State or province is required")
    private String stateOrProvince;

    @NotBlank(message = "Postal code is required")
    private String postalCode;

    
    
    // بيانات الاتصال
    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Phone number is required")
    private String phoneNumber;

    private String linkedin;

    
    // الوظيفة
    @NotBlank(message = "Position applied is required")
    private String positionApplied;

    private String referralSource; 
    
    @NotNull(message = "Available start date is required")
    private LocalDate availableStartDate;

    
    // السيرة الذاتية
    private String resumeFileUrl; 
    

    // الخطاب التعريفي
    @Column(columnDefinition = "TEXT")
    private String coverLetter;
}
