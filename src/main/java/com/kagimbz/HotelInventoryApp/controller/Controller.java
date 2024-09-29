package com.kagimbz.HotelInventoryApp.controller;

import com.kagimbz.HotelInventoryApp.dto.EntityResponse;
import com.kagimbz.HotelInventoryApp.models.Room;
import com.kagimbz.HotelInventoryApp.services.ServiceClass;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/hotel-inventory")
@RequiredArgsConstructor
@Slf4j
public class Controller {
    private final ServiceClass serviceClass;

    @PostMapping
    public ResponseEntity<EntityResponse<Room>> addRoom(@RequestBody Room room) {
        EntityResponse<Room> entityResponse = serviceClass.addRoom(room);
        return ResponseEntity.ok(entityResponse);
    }

    @GetMapping
    public ResponseEntity<List<Room>> getRooms() {
        List<Room> rooms = serviceClass.getRooms();
        return ResponseEntity.ok(rooms);
    }

    @PutMapping
    public ResponseEntity<EntityResponse<Room>> updateRoom(@RequestBody Room room) {
        EntityResponse<Room> response = serviceClass.updateRoom(room);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping
    public ResponseEntity<EntityResponse<Room>> deleteRoom(@RequestParam Integer roomNumber) {
        EntityResponse<Room> response = serviceClass.deleteRoom(roomNumber);
        return ResponseEntity.ok(response);
    }
}
