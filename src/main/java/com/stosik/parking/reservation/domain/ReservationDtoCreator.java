package com.stosik.parking.reservation.domain;

import com.stosik.parking.reservation.domain.model.Reservation;
import com.stosik.parking.reservation.dto.ReservationDto;

class ReservationDtoCreator
{
    public ReservationDto from(Reservation reservation)
    {
        return ReservationDto
            .builder()
            .id(reservation.getId())
            .driverType(reservation.getDriverType())
            .startTime(reservation.getStartTime())
            .stopTime(reservation.getStopTime())
            .carLicenseId(reservation.getCarLicenseId())
            .cost(reservation.getCost())
            .build();
    }
}
