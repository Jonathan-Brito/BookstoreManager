package com.jonathanbrito.bookstoremanager.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data  // Added getters, setters
@Builder // Added design pattern
@AllArgsConstructor // Added constructor default
@NoArgsConstructor // Added constructor
public class ApiError {

    private int code;

    private String status;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;

    private String message;

    private List<String> errors;
}
