package com.msconducteur.demo.mappers;

import com.msconducteur.demo.dto.DriverRequestDTO;
import com.msconducteur.demo.dto.DriverResponseDTO;
import com.msconducteur.demo.entity.Driver;

public interface DriverMapper {
    DriverResponseDTO driverToDriverResponse(Driver driver);
    Driver driverRequestDtoTDriver(DriverRequestDTO driverRequestDTO);
}
