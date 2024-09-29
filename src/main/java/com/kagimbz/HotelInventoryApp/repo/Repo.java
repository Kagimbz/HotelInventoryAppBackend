package com.kagimbz.HotelInventoryApp.repo;

import com.kagimbz.HotelInventoryApp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Room, Integer> {
}
