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
      curl -X POST -H "Content-Type:application/json" -d "{\"name\":\"Stockton Hotel\",\"location\":\"Ohio\",\"description\":\"A budget hotel in the heart of the city.\",\"pricePerNight\":50.0}" http://localhost:8080/hotels
      ```
    - In MacOS/Linux:
      ```bash
      curl -X POST -H "Content-Type:application/json" -d '{"name":"Stockton Hotel","location":"Ohio","description":"A budget hotel in the heart of the city.","pricePerNight":50.0}' http://localhost:8080/hotels
      ```
    - Response:
      ```json
      {"id":1,"name":"Stockton Hotel","location":"Ohio","description":"A budget hotel in the heart of the city.","pricePerNight":50.0}
      ```

- **Retrieve All Hotels**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/hotels
      ```
    - Response:
      ```json
      [
        {"id":1,"name":"Stockton Hotel","location":"Ohio","description":"A budget hotel in the heart of the city.","pricePerNight":50.0}
      ]
      ```

- **Retrieve a Specific Hotel**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/hotels/1
      ```
    - Response:
      ```json
      {"id":1,"name":"Stockton Hotel","location":"Ohio","description":"A budget hotel in the heart of the city.","pricePerNight":50.0}
      ```

- **Update a Hotel**
    - In Windows CMD:
      ```shell
      curl -X PUT -H "Content-Type:application/json" -d "{\"name\":\"Stockton Hotel\",\"location\":\"Ohio\",\"description\":\"An updated description of the budget hotel.\",\"pricePerNight\":55.0}" http://localhost:8080/hotels/1
      ```
    - In MacOS/Linux:
      ```bash
      curl -X PUT -H "Content-Type:application/json" -d '{"name":"Stockton Hotel","location":"Ohio","description":"An updated description of the budget hotel.","pricePerNight":55.0}' http://localhost:8080/hotels/1
      ```
    - Response:
      ```json
      {"id":1,"name":"Stockton Hotel","location":"Ohio","description":"An updated description of the budget hotel.","pricePerNight":55.0}
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
      curl -X POST -H "Content-Type:application/json" -d "{\"roomNumber\":\"007\",\"type\":\"Deluxe\",\"price\":150.0,\"availability\":true,\"hotel\":{\"id\":1}}" http://localhost:8080/rooms
      ```
    - In MacOS/Linux:
      ```bash
      curl -X POST -H "Content-Type:application/json" -d '{"roomNumber":"007","type":"Deluxe","price":150.0,"availability":true,"hotel":{"id":1}}' http://localhost:8080/rooms
      ```
    - Response:
      ```json
      {"id":1,"roomNumber":"007","type":"Deluxe","price":150.0,"availability":true,"hotel":{"id":1,"name":"Stockton Hotel"}}
      ```

- **Retrieve All Rooms**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/rooms
      ```
    - Response:
      ```json
      [
        {"id":1,"roomNumber":"007","type":"Deluxe","price":150.0,"availability":true,"hotel":{"id":1,"name":"Stockton Hotel"}}
      ]
      ```

- **Retrieve a Specific Room**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/rooms/1
      ```
    - Response:
      ```json
      {"id":1,"roomNumber":"007","type":"Deluxe","price":150.0,"availability":true,"hotel":{"id":1,"name":"Stockton Hotel"}}
      ```

- **Update a Room**
    - In Windows CMD:
      ```shell
      curl -X PUT -H "Content-Type:application/json" -d "{\"roomNumber\":\"007\",\"type\":\"Suite\",\"price\":200.0,\"availability\":false,\"hotel"\: {"id": 1 }}" http://localhost:8080/rooms/1
      ```
    - In MacOS/Linux:
      ```bash
      curl -X PUT -H "Content-Type:application/json" -d '{"roomNumber":"007","type":"Suite","price":200.0,"availability":false,"hotel":{"id":1}}' http://localhost:8080/rooms/1
      ```
    - Response:
      ```json
      {"id":1,"roomNumber":"007","type":"Suite","price":200.0,"availability":false,"hotel":{"id":1,"name":"Stockton Hotel"}}
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
      {"id":1,"checkInDate":"2024-08-01","checkOutDate":"2024-08-07","hotel":{"id":1,"name":"Stockton Hotel"},"room":{"id":1,"roomNumber":"007","type":"Suite"}}
      ```

- **Retrieve All Bookings**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/bookings
      ```
    - Response:
      ```json
      [
        {"id":1,"checkInDate":"2024-08-01","checkOutDate":"2024-08-07","hotel":{"id":1,"name":"Stockton Hotel"},"room":{"id":1,"roomNumber":"007","type":"Suite"}}
      ]
      ```

- **Retrieve a Specific Booking**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/bookings/1
      ```
    - Response:
      ```json
      {"id":1,"checkInDate":"2024-08-01","checkOutDate":"2024-08-07","hotel":{"id":1,"name":"Stockton Hotel"},"room":{"id":1,"roomNumber":"007","type":"Suite"}}
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
      {"id":1,"checkInDate":"2024-08-05","checkOutDate":"2024-08-10","hotel":{"id":1,"name":"Stockton Hotel"},"room":{"id":1,"roomNumber":"007","type":"Suite"}}
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

### Users

- **Create a New User**
    - In Windows CMD:
      ```shell
      curl -X POST -H "Content-Type:application/json" -d "{\"name\":\"Gia Bach Nhu\",\"email\":\"gbn447@uow.com\",\"password\":\"123\"}" http://localhost:8080/users
      ```
    - In MacOS/Linux:
      ```bash
      curl -X POST -H "Content-Type:application/json" -d '{"name":"Gia Bach Nhu","email":"gbn447@uow.com","password":"123"}' http://localhost:8080/users
      ```
    - Response:
      ```json
      {"id":1,"name":"Gia Bach Nhu","email":"gbn447@uow.com"}
      ```

- **Retrieve All Users**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/users
      ```
    - Response:
      ```json
      [
        {"id":1,"name":"Gia Bach Nhu","email":"gbn447@uow.com"}
      ]
      ```

- **Retrieve a Specific User**
    - Request:
      ```shell
      curl -X GET http://localhost:8080/users/1
      ```
    - Response:
      ```json
      {"id":1,"name":"Gia Bach Nhu","email":"gbn447@uow.com"}
      ```

- **Update a User**
    - In Windows CMD:
      ```shell
      curl -X PUT -H "Content-Type:application/json" -d "{\"name\":\"Gia Bach Nhu\",\"email\":\"gbn447@uow.com\",\"password\":\"newpassword\"}" http://localhost:8080/users/1
      ```
    - In MacOS/Linux:
      ```bash
      curl -X PUT -H "Content-Type:application/json" -d '{"name":"Gia Bach Nhu","email":"gbn447@uow.com","password":"newpassword"}' http://localhost:8080/users/1
      ```
    - Response:
      ```json
      {"id":1,"name":"Gia Bach Nhu","email":"gbn447@uow.com"}
      ```

- **Delete a User**
    - Request:
      ```shell
      curl -X DELETE http://localhost:8080/users/1
      ```
    - Response:
      ```json
      {}
      ```
