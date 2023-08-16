package com.one.onetoone;

import com.one.onetoone.entity.Instructor;
import com.one.onetoone.entity.InstructorDetail;
import com.one.onetoone.services.IAppDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneToOneApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(IAppDAO iAppDAO){
        return runner->{createInstructor(iAppDAO);};
//        return runner->{
//            System.out.println("Well I am here");
//        }
    }
    public void createInstructor(IAppDAO iAppDAO){
        Instructor tempInstructor = new Instructor("Machong","Paul","poluxreloaded@gmail.com");
        InstructorDetail tempInstructorDetail= new InstructorDetail("http://www.paul.com","Playing football");
        tempInstructor.setInstructorDetail(tempInstructorDetail);
        System.out.println("Saving Instructor: "+tempInstructor);
        iAppDAO.save(tempInstructor);
        System.out.println("Done");
    }

}
