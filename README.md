## GATLING >>>
Gatling is Scala based open-source performance testing framework. Gatling scripts are to be written using Scala DSL.
Gatling also has a GUI to record the requests & generate a simulation scripts which can be used to run the simulations.

----------------------------------------------
### Install Java 
`brew cask install java`

### Install Maven
`brew install maven`

----------------------------------------------
### Create Gatling Project
`mvn archetype:generate`

Filter by gatling

Select 1 and choose latest version of Gatling

Also provide groupID: com.project.example, 
archetypeID: GatlingTestFramework, 
Gatling version and package & hit ENTER `Y`

----------------------------------------------
### Import project in IntelliJ
Set up Scala SDK in recorders file

### Running the test
`mvn gatling:test`

### Test Report 
target>gatling>SimulationName — timestamp> `index.html`

----------------------------------------------