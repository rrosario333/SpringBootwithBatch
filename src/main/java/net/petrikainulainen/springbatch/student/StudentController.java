package net.petrikainulainen.springbatch.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/api/student")
public class StudentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @RequestMapping(method = RequestMethod.GET)
    public List<StudentDTO> findStudents() {
        LOGGER.info("Finding all students");

        List<StudentDTO> students = createStudents();
        LOGGER.info("Found {} students", students.size());

        return students;
    }

    private List<StudentDTO> createStudents() {
        StudentDTO tony = new StudentDTO();
        tony.setEmailAddress("tony.tester@gmail.com");
        tony.setName("Tony Tester");
        tony.setPurchasedPackage("master");

        StudentDTO nick = new StudentDTO();
        nick.setEmailAddress("nick.newbie@gmail.com");
        nick.setName("Nick Newbie");
        nick.setPurchasedPackage("starter");

        StudentDTO ian = new StudentDTO();
        ian.setEmailAddress("ian.intermediate@gmail.com");
        ian.setName("Ian Intermediate");
        ian.setPurchasedPackage("intermediate");
        
        StudentDTO ian1 = new StudentDTO();
        ian1.setEmailAddress("ian.intermediate@gmail.com");
        ian1.setName("Ian Intermediate");
        ian1.setPurchasedPackage("intermediate");
        
        StudentDTO ian2 = new StudentDTO();
        ian2.setEmailAddress("ian.intermediate@gmail.com");
        ian2.setName("Ian Intermediate");
        ian2.setPurchasedPackage("intermediate");
        
        
        StudentDTO ian18 = new StudentDTO();
        ian18.setEmailAddress("robert@gmail.com");
        ian18.setName("Ian Intermediate");
        ian18.setPurchasedPackage("intermediate");
        

        return Arrays.asList(tony, nick, ian,ian1,ian2,ian18);
    }
}
