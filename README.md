# South African Mobile Number Validator (Java)

This project is a simple Java console application that validates South African
mobile phone numbers and determines the originally allocated mobile network
based on the number prefix.

## Features
- Validates South African mobile numbers (06x, 07x, 08x)
- Limits user input attempts
- Determines the original mobile network using prefix-based logic
- Handles invalid input gracefully

## Example Input
0712345678

## Example Output
Phone number is valid  
Network: Vodacom

## Notes
Network determination is based on original number allocation.
Due to mobile number portability, the actual current network may differ.

## Purpose
This project demonstrates input validation, string manipulation,
and basic decision making logic in Java.
