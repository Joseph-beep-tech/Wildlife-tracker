##AUTHOR##
##Joseph Okoth##

##Description##

* The app simply tracks the endangered different species of 
animals available in the wild.

##Application set-up##

* You have an idea (preferred Intellij) -You have a idea (preferred Intellij) -Clone the repo git clone https://github.com/Joseph-beep-tech/Wildlife-tracker -Open the folder from github in your Intellij Idea -On your terminal type psql to open postgresql command shell -Create database CREATE DATABASE database_name -Connect to the DB \c database_name -Create table CREATE TABLE table_name(name varchar)

##in psql:##

* CREATE DATABASE wildlife_tracker;
* CREATE TABLE animals (id serial PRIMARY KEY, animalName varchar ,type varchar ,age varchar, health varchar);
* CREATE TABLE sightings (id serial PRIMARY KEY, location varchar, rangerName varchar, wildlifeId int );

##Contribution##
* You can fork the repo and add your extra feature to the web app.
Click on the following link:
https://github.com/Joseph-beep-tech/Wildlife-tracker

##Known bugs##
If there seem to be any bugs on the web app, do reach via the following email.
* Josephcluff006@gmail.com

##Licence and copyright##
The app is under the: MIT Licence Joseph Okoth 2020 

