
# LLD_E-commerce-Cart-System


# 🛒 E-commerce Cart System (LLD + Java Implementation)

This project is a **Low-Level Design (LLD)** implementation of an **E-commerce Cart System** in Java.  
It demonstrates the use of **Factory Pattern** (for order creation) and **Strategy Pattern** (for payments).

---

## ✨ Features
- Users can add/remove products in their cart.  
- Products have **name, description, price, and stock quantity**.  
- Cart contains **CartItems** (product + quantity).  
- Orders are created from the cart using **OrderService (Factory)**.  
- **Payment methods** supported via Strategy Pattern:
  - Credit Card  
  - UPI  
- Prevents ordering if product stock is insufficient.  
- Reduces stock after a successful order.  

---

## 🏗️ Design
### Entities
- **User** → customer information (id, name, email).  
- **Product** → product details (id, name, price, stock).  
- **Cart** → user’s active cart, contains CartItems.  
- **CartItem** → product + quantity.  
- **Order** → finalized purchase details.  

### Enums
- `OrderStatus` → PENDING, CONFIRMED, CANCELLED  
- `PaymentMode` → CREDIT_CARD, UPI  

### Patterns Used
- **Factory Pattern** → `OrderService` creates Orders from Cart.  
- **Strategy Pattern** → `PaymentStrategy` interface with implementations:  
  - `CreditCardPayment`  
  - `UpiPayment`  

---

## 🛠️ Tech Stack
- Java 17+  
- Core Java (Collections, OOP, Enums)  
- No external frameworks required  

git clone https://github.com/your-username/ecommerce-cart-system.git
cd ecommerce-cart-system
