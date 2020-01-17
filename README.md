"# microservice-profile-service" 

Service application handel the Service and Controller classes.

Use the Entity or the Model from the commons-project

it will activated by adding the following annotation on the top of the main class file and point to the package that will be scanned as Entity, as shown below:

@SpringBootApplication
@EntityScan(basePackages = "com.atr.rentcloud.rentcloud_comons.model")