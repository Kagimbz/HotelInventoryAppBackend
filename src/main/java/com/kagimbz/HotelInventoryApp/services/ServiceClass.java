package com.kagimbz.HotelInventoryApp.services;

import com.kagimbz.HotelInventoryApp.dto.EntityResponse;
import com.kagimbz.HotelInventoryApp.models.Room;
import com.kagimbz.HotelInventoryApp.repo.Repo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ServiceClass {
    private final Repo repo;

    public EntityResponse<Room> addRoom(Room room) {
        EntityResponse<Room> response = new EntityResponse<>();

        if (!repo.existsById(room.getRoomNumber())) {
            repo.save(room);
            response.setMessage("Room Added Successfully");
            response.setResponseCode(HttpStatus.CREATED.value());
        } else {
            response.setMessage("Room Already Exists!");
            response.setResponseCode(HttpStatus.NOT_ACCEPTABLE.value());
        }
        return response;
    }

    public List<Room> getRooms() {
        return repo.findAll();
    }

    public EntityResponse<Room> updateRoom(Room room) {
        EntityResponse<Room> response = new EntityResponse<>();

        repo.findById(room.getRoomNumber()).ifPresentOrElse(roomToUpdate -> {
            roomToUpdate.setRoomType(room.getRoomType());
            roomToUpdate.setAmenities(room.getAmenities());
            roomToUpdate.setPrice(room.getPrice());
            roomToUpdate.setPhotos(room.getPhotos());
            roomToUpdate.setCheckInTime(room.getCheckInTime());
            roomToUpdate.setCheckOutTime(room.getCheckOutTime());
            repo.save(roomToUpdate);

            response.setMessage("Room Updated Successfully");
            response.setResponseCode(HttpStatus.OK.value());
        }, () -> {
            response.setMessage("Room Not Found!");
            response.setResponseCode(HttpStatus.NOT_FOUND.value());
        });

        return response;
    }

    public EntityResponse<Room> deleteRoom(Integer roomNumber) {
        EntityResponse<Room> response = new EntityResponse<>();

        if (repo.existsById(roomNumber)) {
            repo.deleteById(roomNumber);
            response.setMessage("Room Deleted Successfully");
            response.setResponseCode(HttpStatus.OK.value());
        } else {
            response.setMessage("Room Not Found!");
            response.setResponseCode(HttpStatus.NOT_FOUND.value());
        }
        return response;

    }
}
