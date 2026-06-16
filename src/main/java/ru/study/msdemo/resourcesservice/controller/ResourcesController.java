package ru.study.msdemo.resourcesservice.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.study.msdemo.resourcesservice.model.dto.ResourcesRequestDTO;
import ru.study.msdemo.resourcesservice.model.dto.ResourcesResponseDTO;
import ru.study.msdemo.resourcesservice.service.ResourcesService;

@RequestMapping("/api/v1/resources")
@RestController
public class ResourcesController {

    private final ResourcesService resourcesService;

    public ResourcesController(ResourcesService resourcesService) {
        this.resourcesService = resourcesService;
    }

    @PostMapping("/check")
    public ResponseEntity<ResourcesResponseDTO> resourcesCheck(@Valid  @RequestBody ResourcesRequestDTO resourcesRequestDTO) {
        return ResponseEntity
                .ok()
                .body(resourcesService.resourcesCheck(resourcesRequestDTO));
    }

}
