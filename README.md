# Hotel Booking Application

## Introduction

Welcome to the Hotel Booking Application! This project is a simple but powerful tool, built with Java Spring Boot. This software will make reserving hotel rooms simple and effective. Whether you're a hotel administrator or a guest, this app has you covered. It helps manage hotel details, room availability, and bookings with ease. Think of it as a virtual assistant for your hotel booking needs.

## Main Functionalities

### For Hotel Administrators
- **Manage Hotels**: Add new hotels, update their details, or remove them when needed. It’s all about keeping your hotel info up-to-date.
- **Room Management**: Add new rooms to your hotels, update existing ones, or remove rooms that are no longer available. You can also check if rooms are free based on the dates and type.

### For Guests
- **Booking Rooms**: Make a new booking, update an existing one, or cancel if your plans change. You can see all your booking details, like check-in/check-out dates and room type.
- **Search and Filter**: Find hotels by location, price, and other criteria. You can also filter available rooms to match your preferences and dates.

### User Accounts (if included)
- **Account Management**: Register for an account, log in, and manage your bookings easily.

## Getting Started

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/AgentZoil/HotelBooking.git

## CRUD Request Examples

### Hotels

- **Create a New Hotel**
    - In Windows CMD:
      ```shell
      curl -X POST -H "Content-Type:application/json" -d "{\"name\":\"Grand Hotel\",\"location\":\"New York\",\"description\":\"A luxury hotel in the heart of the city.\",\"pricePerNight\":250.0}" http://localhost:8080/hotels
      ```
    - In MacOS/Linux:
      ```bash
      curl -X POST -H "Content-Type:application/json" -d '{"name":"Grand Hotel","location":"New York","description":"A luxury hotel in the heart of the city.","pricePerNight":250.0}' http://localhost:8080/hotels
      ```
    - Response:
      ```json
      {"id":1,"name":"Grand Hotel","location":"New York","description":"A luxury hotel in the heart of the city.","pricePerNight":250.0}
      ```

- **Retrieve All Hotels**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/hotels
      ```
    - Response:
      ```json
      [
        {"id":1,"name":"Grand Hotel","location":"New York","description":"A luxury hotel in the heart of the city.","pricePerNight":250.0}
      ]
      ```

- **Retrieve a Specific Hotel**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/hotels/1
      ```
    - Response:
      ```json
      {"id":1,"name":"Grand Hotel","location":"New York","description":"A luxury hotel in the heart of the city.","pricePerNight":250.0}
      ```

- **Update a Hotel**
    - In Windows CMD:
      ```shell
      curl -X PUT -H "Content-Type:application/json" -d "{\"name\":\"Grand Hotel\",\"location\":\"New York\",\"description\":\"An updated description of the luxury hotel.\",\"pricePerNight\":275.0}" http://localhost:8080/hotels/1
      ```
    - In MacOS/Linux:
      ```bash
      curl -X PUT -H "Content-Type:application/json" -d '{"name":"Grand Hotel","location":"New York","description":"An updated description of the luxury hotel.","pricePerNight":275.0}' http://localhost:8080/hotels/1
      ```
    - Response:
      ```json
      {"id":1,"name":"Grand Hotel","location":"New York","description":"An updated description of the luxury hotel.","pricePerNight":275.0}
      ```

- **Delete a Hotel**
    - Request:
      ```shell
      curl -X DELETE http://localhost:8080/hotels/1
      ```
    - Response:
      ```json
      {}
      ```

### Rooms

- **Create a New Room**
    - In Windows CMD:
      ```shell
      curl -X POST -H "Content-Type:application/json" -d "{\"roomNumber\":\"101\",\"type\":\"Deluxe\",\"price\":150.0,\"availability\":true,\"hotelId\":1}" http://localhost:8080/rooms
      ```
    - In MacOS/Linux:
      ```bash
      curl -X POST -H "Content-Type:application/json" -d '{"roomNumber":"101","type":"Deluxe","price":150.0,"availability":true,"hotelId":1}' http://localhost:8080/rooms
      ```
    - Response:
      ```json
      {"id":1,"roomNumber":"101","type":"Deluxe","price":150.0,"availability":true,"hotel":{"id":1,"name":"Grand Hotel"}}
      ```

- **Retrieve All Rooms**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/rooms
      ```
    - Response:
      ```json
      [
        {"id":1,"roomNumber":"101","type":"Deluxe","price":150.0,"availability":true,"hotel":{"id":1,"name":"Grand Hotel"}}
      ]
      ```

- **Retrieve a Specific Room**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/rooms/1
      ```
    - Response:
      ```json
      {"id":1,"roomNumber":"101","type":"Deluxe","price":150.0,"availability":true,"hotel":{"id":1,"name":"Grand Hotel"}}
      ```

- **Update a Room**
    - In Windows CMD:
      ```shell
      curl -X PUT -H "Content-Type:application/json" -d "{\"roomNumber\":\"101\",\"type\":\"Suite\",\"price\":200.0,\"availability\":false,\"hotelId\":1}" http://localhost:8080/rooms/1
      ```
    - In MacOS/Linux:
      ```bash
      curl -X PUT -H "Content-Type:application/json" -d '{"roomNumber":"101","type":"Suite","price":200.0,"availability":false,"hotelId":1}' http://localhost:8080/rooms/1
      ```
    - Response:
      ```json
      {"id":1,"roomNumber":"101","type":"Suite","price":200.0,"availability":false,"hotel":{"id":1,"name":"Grand Hotel"}}
      ```

- **Delete a Room**
    - Request:
      ```shell
      curl -X DELETE http://localhost:8080/rooms/1
      ```
    - Response:
      ```json
      {}
      ```

### Bookings

- **Create a New Booking**
    - In Windows CMD:
      ```shell
      curl -X POST -H "Content-Type:application/json" -d "{\"checkInDate\":\"2024-08-01\",\"checkOutDate\":\"2024-08-07\",\"hotelId\":1,\"roomId\":1}" http://localhost:8080/bookings
      ```
    - In MacOS/Linux:
      ```bash
      curl -X POST -H "Content-Type:application/json" -d '{"checkInDate":"2024-08-01","checkOutDate":"2024-08-07","hotelId":1,"roomId":1}' http://localhost:8080/bookings
      ```
    - Response:
      ```json
      {"id":1,"checkInDate":"2024-08-01","checkOutDate":"2024-08-07","hotel":{"id":1,"name":"Grand Hotel"},"room":{"id":1,"roomNumber":"101","type":"Suite"}}
      ```

- **Retrieve All Bookings**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/bookings
      ```
    - Response:
      ```json
      [
        {"id":1,"checkInDate":"2024-08-01","checkOutDate":"2024-08-07","hotel":{"id":1,"name":"Grand Hotel"},"room":{"id":1,"roomNumber":"101","type":"Suite"}}
      ]
      ```

- **Retrieve a Specific Booking**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/bookings/1
      ```
    - Response:
      ```json
      {"id":1,"checkInDate":"2024-08-01","checkOutDate":"2024-08-07","hotel":{"id":1,"name":"Grand Hotel"},"room":{"id":1,"roomNumber":"101","type":"Suite"}}
      ```

- **Update a Booking**
    - In Windows CMD:
      ```shell
      curl -X PUT -H "Content-Type:application/json" -d "{\"checkInDate\":\"2024-08-05\",\"checkOutDate\":\"2024-08-10\",\"hotelId\":1,\"roomId\":1}" http://localhost:8080/bookings/1
      ```
    - In MacOS/Linux:
      ```bash
      curl -X PUT -H "Content-Type:application/json" -d '{"checkInDate":"2024-08-05","checkOutDate":"2024-08-10","hotelId":1,"roomId":1}' http://localhost:8080/bookings/1
      ```
    - Response:
      ```json
      {"id":1,"checkInDate":"2024-08-05","checkOutDate":"2024-08-10","hotel":{"id":1,"name":"Grand Hotel"},"room":{"id":1,"roomNumber":"101","type":"Suite"}}
      ```

- **Delete a Booking**
    - Request:
      ```shell
      curl -X DELETE http://localhost:8080/bookings/1
      ```
    - Response:
      ```json
      {}
      ```
