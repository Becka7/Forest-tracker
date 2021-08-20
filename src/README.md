# Forest-tracker
#### An application that allows Rangers to track wildlife sightings in the Douglas Fir forest.
#### By **Rabecca Nzau**
## Description
An application that allows Rangers to track wildlife sightings animals either endangered or not in the Douglas Fir. Forest
## Setup/Installation Requirements
* git clone https://github.com/Becka7/Forest-tracker.git
* cd your/path/to/Forest-tracker
* open with editor of choice 


##### DATABASE SETUP
 "CREATE DATABASE wildlife_tracker;"

 CREATE TABLE animals (id serial PRIMARY KEY, name varchar, age varchar , health varchar,location  varchar);

 CREATE TABLE sightings (id serial PRIMARY KEY, animal name varchar, type varchar,location varchar, rangername varchar timesighted timestamp);
'

## Known Bugs
There are no known bugs at the moment
## Technologies Used
Java, Spark, Handlebars, PostgreSQL Bootstrap, CSS
## Support and contact details
ericwathome007@gmail.com
### License