# bootrestjpa
Spring Boot, Rest, JPA with multiple table reference key relation, H2 DB


Steps
1. Add models/Pojo for tables wtih @Entity tag, optional to create packages for different type of classes
2. Add @EnityScan tag in BootApplication(Configuration) class with basePackage for scan
3. Add @EnableJpaRepositories tag in BootApplication with basepackge for scan
4. Add @ComponentScan with basePackage for Bean scan
5. Add Datasource properties in application.properties
6. Create Repository Classes with @Repository tag extending CrudRepository
7. Create Controoler Classes for Exposing rest services
8. write business logic
