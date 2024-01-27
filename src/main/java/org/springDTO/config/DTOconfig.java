package org.springDTO.config;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DTOconfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
