# Requirement.md

## Internal Employee Login
- **Description**: Endpoint for internal employee login using employee number, name, and department.
- **Endpoint**: `/api/users/internal/login`
- **Method**: `POST`
- **Parameters**: `employeeNumber`, `name`, `department`

## External Employee Registration
- **Description**: Endpoint for external employee registration using name, date of birth, contact information, and store code.
- **Endpoint**: `/api/users/external/register`
- **Method**: `POST`
- **Parameters**: `name`, `dateOfBirth`, `contactInfo`, `storeCode`

## User Information Update
- **Description**: Endpoint for updating user information such as name, email, phone number, store code, and password.
- **Endpoint**: `/api/users/{id}`
- **Method**: `PUT`
- **Parameters**: `id`, `user` (request body)

## Consent Feature for Personal Information Usage
- **Description**: Endpoint for implementing consent feature for personal information usage and account management during the first login.
- **Endpoint**: `/api/users/{id}/consent`
- **Method**: `POST`
- **Parameters**: `id`, `consent`
