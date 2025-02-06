# Fixed Bottle o Enchanting
![Modrinth Downloads](https://img.shields.io/modrinth/dt/DMBySMdD)

## Description

This mod allows you to configure the amount of experience points dropped by Bottles o' Enchanting in Minecraft. It provides a more customizable experience for players and server administrators.

## Features

- Configurable minimum and maximum experience points for Bottles o' Enchanting.
- Ensures a consistent and balanced gameplay experience.

## Configuration

The configuration file is generated in the `config` folder of your Minecraft directory. You can edit the `fixed-bottle-o-enchanting.json` file to set the minimum and maximum experience points.

```json
{
  "xpMax": 50,
  "xpMin": 30
}
```

## Development

### Prerequisites

- Java Development Kit (JDK) 21 or higher
- [Gradle](https://gradle.org/)

### Building

1. Clone the repository:
    ```sh
    git clone https://github.com/siveryt/fixed-bottle-o-enchanting.git
    ```
2. Navigate to the project directory:
    ```sh
    cd fixed-bottle-o-enchanting
    ```
3. Build the project:
    ```sh
    ./gradlew build
    ```
4. The compiled JAR file will be located in the `build/libs` directory.

### Running

```sh
./gradlew runClient
```


## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

