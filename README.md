# Task Scheduler

This is a task management project developed in Java using the Spring Boot framework and Gradle as the build tool.

## Technologies Used

- Java
- Spring Boot
- Gradle
- MapStruct
- Lombok

## Project Structure

- `src/main/java/com/felipe/agendadortarefas/controller`: Contains the REST controllers.
- `src/main/java/com/felipe/agendadortarefas/business`: Contains the business logic.
- `src/main/java/com/felipe/agendadortarefas/business/dto`: Contains the Data Transfer Objects (DTOs).
- `src/main/java/com/felipe/agendadortarefas/business/mapper`: Contains the entity mappers.
- `src/main/java/com/felipe/agendadortarefas/infrastructure/entity`: Contains the database entities.
- `src/main/java/com/felipe/agendadortarefas/infrastructure/enums`: Contains the enums used in the project.
- `src/main/java/com/felipe/agendadortarefas/infrastructure/exceptions`: Contains the exception classes.
- `src/main/java/com/felipe/agendadortarefas/infrastructure/repository`: Contains the database access repositories.
- `src/main/java/com/felipe/agendadortarefas/infrastructure/security`: Contains the security classes.

## Endpoints

### Create Task

- **URL**: `/tarefas`
- **Method**: `POST`
- **Headers**: `Authorization: Bearer <token>`
- **Body**: `TarefasDTO`

### Get Tasks by Period

- **URL**: `/tarefas/eventos`
- **Method**: `GET`
- **Parameters**: `dataInicial`, `dataFinal`

### Get Tasks by Email

- **URL**: `/tarefas`
- **Method**: `GET`
- **Headers**: `Authorization: Bearer <token>`

### Delete Task by ID

- **URL**: `/tarefas`
- **Method**: `DELETE`
- **Parameters**: `id`

### Change Task Status

- **URL**: `/tarefas`
- **Method**: `PATCH`
- **Parameters**: `status`, `id`

### Update Task

- **URL**: `/tarefas`
- **Method**: `PUT`
- **Parameters**: `id`
- **Body**: `TarefasDTO`

## How to Run the Project

1. Clone the repository.
2. Navigate to the project directory.
3. Run the command `./gradlew bootRun` to start the application.

## Contribution

1. Fork the project.
2. Create a branch for your feature (`git checkout -b feature/new-feature`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature/new-feature`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.
