# Proxy Pattern for Online Retail Store

This Java program demonstrates the Proxy Pattern for an online retail store with global distribution and warehousing. The proxy acts as an intermediary that controls access to the real warehousing system, allowing for additional features like stock checking, order tracking, and product shipment.

## Features

- **RetailStore Interface:** Defines the operations that both the real subject (`GlobalWarehouse`) and the proxy (`RetailStoreProxy`) must implement, including requesting a product, checking stock availability, tracking orders, and shipping products.

- **GlobalWarehouse (Real Subject):** Represents the real warehousing system, managing inventory and simulating order tracking and product shipment.

- **RetailStoreProxy (Proxy):** Acts as a proxy for the retail store, forwarding product requests and managing additional features such as stock checking, order tracking, and product shipment.

## Usage

1. Create a `RetailStore` instance (either `GlobalWarehouse` for real subject or `RetailStoreProxy` for the proxy).

2. Use the methods provided by the retail store to interact with it:
   - `requestProduct(product)` to request a product.
   - `checkStockAvailability(product)` to check if a product is in stock.
   - `trackOrder(orderNumber)` to track the status of an order.
   - `shipProduct(orderNumber, product)` to simulate the shipment of a product.

3. The program simulates an online retail store's behavior, showing how the proxy controls access to the global warehousing system and adds features like order tracking and stock checking.