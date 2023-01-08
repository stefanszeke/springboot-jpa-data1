package com.example.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.example.entities.Student;

@Configuration
public class RestConfig implements RepositoryRestConfigurer { // This is a configuration class, it is used to configure the REST API
    
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        // config.exposeIdsFor(Student.class, Another.class, Another.class); // This will expose the id of the entity, multiple entities can be added
        config.exposeIdsFor(Student.class); // This will expose the id of the entity
        
        // more configuration can be added here, for example:
        config.setBasePath("/api/v2"); // This will change the base path of the REST API, for each entity set the path: @RepositoryRestResource annotation in the repository
  
        
    }

}
