//package com.kagimbz.HotelInventoryApp.services;
//
//import com.kagimbz.HotelInventoryApp.models.Room;
//import com.kagimbz.HotelInventoryApp.repo.Repo;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//import java.util.Calendar;
//import java.util.Date;
//
//@Component
//@RequiredArgsConstructor
//public class LoadRooms implements CommandLineRunner {
//    private final Repo repo;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Calendar calendarA = Calendar.getInstance();
//        calendarA.set(Calendar.YEAR, 2024);
//        calendarA.set(Calendar.MONTH, Calendar.MARCH);
//        calendarA.set(Calendar.DAY_OF_MONTH, 11);
//
//        Calendar calendarB = Calendar.getInstance();
//        calendarB.set(Calendar.YEAR, 2024);
//        calendarB.set(Calendar.MONTH, Calendar.MARCH);
//        calendarB.set(Calendar.DAY_OF_MONTH, 13);
//
//        Room[] rooms = {
//                new Room(1,
//                        "Deluxe",
//                        "Air Conditioner, TV, Kitchen, Free Wi-Fi",
//                        200.00,
//                        "https://images.unsplash.com/photo-1618773928121-c32242e63f39?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGhvdGVsfGVufDB8fDB8fHww",
//                        calendarA.getTime(),
//                        calendarB.getTime()
//                ),
//
//                new Room(2,
//                        "Deluxe",
//                        "Air Conditioner, TV, Kitchen, Free Wi-Fi",
//                        300.00,
//                        "https://images.unsplash.com/photo-1618773928121-c32242e63f39?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGhvdGVsfGVufDB8fDB8fHww",
//                        calendarA.getTime(),
//                        calendarB.getTime()
//                ),
//
//                new Room(3,
//                        "Private Suite",
//                        "Air Conditioner, TV, Kitchen, Free Wi-Fi",
//                        500.00,
//                        "https://images.unsplash.com/photo-1618773928121-c32242e63f39?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGhvdGVsfGVufDB8fDB8fHww",
//                        calendarA.getTime(),
//                        calendarB.getTime()
//                )
//        };
//
//        repo.saveAll(Arrays.asList(rooms));
//
//    }
//}
