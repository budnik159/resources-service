package ru.study.msdemo.resourcesservice.service;

import ru.study.msdemo.resourcesservice.model.dto.ResourcesRequestDTO;
import ru.study.msdemo.resourcesservice.model.dto.ResourcesResponseDTO;

public interface ResourcesService {

    ResourcesResponseDTO resourcesCheck(ResourcesRequestDTO resources);

}
