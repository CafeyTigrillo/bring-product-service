# Bring Product Service

## 🚀 Overview

The **Bring Product Service** is a RESTful API designed to retrieve a specific product from the database using its unique identifier (`id_product`). Built with **Spring Boot** and integrated with **JPA**, this service allows users to quickly access detailed product information such as the name, description, price, availability, and category ID.

Perfect for e-commerce platforms or inventory management systems, this service enables you to retrieve individual product data on-demand.

## 🌟 Key Features

- **RESTful API**: Exposes an endpoint to bring a product by its ID.
- **JPA Integration**: Uses Java Persistence API for database interactions, making product retrieval smooth and efficient.
- **Product Details**: Provides key product data, including name, description, price, category, and availability.

## 🔑 API Endpoint

- **GET** `/products/bring-product/{id_product}`:  
  Retrieves a single product from the database based on its ID.

  **Response Example**:
  ```json
  {
    "id_product": 1,
    "name": "Product Name",
    "description": "Product description goes here",
    "price": 19.99,
    "id_category": 2,
    "availability": true
  }

## 🔧 Technologies Used
Spring Boot: Framework used to build the application.
JPA (Java Persistence API): For database interactions and fetching product data.
H2 Database (or any relational database): Stores product information.
Java: The core programming language of the service.

## 💡 Use Case
The Bring Product Service is ideal for scenarios where you need to expose product details via a REST API. Whether you're managing an e-commerce platform, an inventory system, or any other product-related service, this service simplifies the process of retrieving individual product data.