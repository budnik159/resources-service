package ru.study.msdemo.resourcesservice.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.UUID;

public record ResourcesRequestDTO(

    @NotNull(message = "requestId не может быть null")
    Long requestId,

    @NotBlank(message = "type не может быть пустым")
    String type,

    @NotBlank(message = "name не может быть пустым")
    @Size(max = 100, message = "name не может быть длиннее 100 символов")
    String name,

    @NotBlank(message = "surname не может быть пустым")
    @Size(max = 100, message = "surname не может быть длиннее 100 символов")
    String surname,

    @NotNull(message = "cvUuid не может быть null")
    UUID cvUuid,

    @NotNull(message = "periodFrom не может быть null")
    LocalDate periodFrom,

    @NotNull(message = "periodTo не может быть null")
    LocalDate periodTo

)
{ }
