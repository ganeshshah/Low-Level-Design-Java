package com.lowleveldesign.parkinglot.services;

import com.lowleveldesign.parkinglot.models.ParkingLot;
import com.lowleveldesign.parkinglot.repositories.ParkingLotRepository;

public class ParkingLotService {

    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot createParkingLot(ParkingLot parkingLot) {
        return parkingLotRepository.save(parkingLot);
    }

    public ParkingLot updateAddress(Long id, String newAddress) {
        // 1. Get current Parking Lot
        // 2. Update rhe address
        // 3. Save
        // 4. Return
        ParkingLot curentParkingLot = parkingLotRepository.getById(id);
        curentParkingLot.setAddress(newAddress);
        ParkingLot updatedParkingLot = parkingLotRepository.update(
                id, curentParkingLot
        );

        return updatedParkingLot;
    }
}
