# Temperature Conversion Tool

## Overview

The Temperature Conversion Tool is a Java application designed to convert temperatures from Celsius to both Kelvin and Fahrenheit. The tool reads a temperature in degrees Celsius from the user and outputs the corresponding temperatures in Kelvin and Fahrenheit.

## Features

- Converts a temperature from Celsius to Kelvin.
- Converts a temperature from Celsius to Fahrenheit.
- Provides a user-friendly interface for input and output.

## How It Works

1. The user inputs a temperature in degrees Celsius.
2. The application calculates:
   - The equivalent temperature in Kelvin using the formula: `Kelvin = Celsius + 273.15`
   - The equivalent temperature in Fahrenheit using the formula: `Fahrenheit = (Celsius * 9/5) + 32`
3. Displays the results with two decimal precision.

   Temperatureconvertion Class:

main(String[] args):
Prompts the user for temperature input in Celsius.
Creates an instance of temperatureFahrenhei with the input temperature.
Prints the converted temperature values in Kelvin and Fahrenheit.
temperatureFahrenhei Class:

temperatureFahrenhei(double temp): Constructor that initializes the temperature in Celsius.
Kelvin(): Converts and returns the temperature in Kelvin.
Fahrenhei(): Converts and returns the temperature in Fahrenheit.
