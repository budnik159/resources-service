package ru.study.msdemo.resourcesservice.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.study.msdemo.resourcesservice.model.dto.ResourcesRequestDTO;
import ru.study.msdemo.resourcesservice.model.dto.ResourcesResponseDTO;
import ru.study.msdemo.resourcesservice.service.ResourcesService;

import java.util.Random;

@Slf4j
@Service
public class ResourcesServiceImpl implements ResourcesService {

    @Override
    public ResourcesResponseDTO resourcesCheck(ResourcesRequestDTO request) {
        return randomStatusResponse(request);
    }

    private ResourcesResponseDTO randomStatusResponse(ResourcesRequestDTO allocationRequestDTO) {

        if (new Random().nextInt(10) == 9) {
            log.info("Сотрудник не доступен с {}, по {}. Заявка отклонена, id: {}",
                    allocationRequestDTO.periodFrom(),
                    allocationRequestDTO.periodTo(),
                    allocationRequestDTO.requestId());

            return new ResourcesResponseDTO(10L, allocationRequestDTO.requestId(), false);
        }
        log.info("Сотрудник доступен с {}, по {}. Заявка согласована, id: {}",
                allocationRequestDTO.periodFrom(),
                allocationRequestDTO.periodTo(),
                allocationRequestDTO.requestId());

        return new ResourcesResponseDTO(10L, allocationRequestDTO.requestId(), true);
    }


}
