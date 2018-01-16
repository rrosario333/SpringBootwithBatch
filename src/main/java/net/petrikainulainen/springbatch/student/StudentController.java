package net.petrikainulainen.springbatch.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author Petri Kainulainen
 */
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
        
        StudentDTO ian3 = new StudentDTO();
        ian3.setEmailAddress("ian.intermediate@gmail.com");
        ian3.setName("Ian Intermediate");
        ian3.setPurchasedPackage("intermediate");
        StudentDTO ian4 = new StudentDTO();
        ian4.setEmailAddress("ian.intermediate@gmail.com");
        ian4.setName("Ian Intermediate");
        ian4.setPurchasedPackage("intermediate");
        StudentDTO ian5 = new StudentDTO();
        ian5.setEmailAddress("ian.intermediate@gmail.com");
        ian5.setName("Ian Intermediate");
        ian5.setPurchasedPackage("intermediate");
        StudentDTO ian6 = new StudentDTO();
        ian6.setEmailAddress("ian.intermediate@gmail.com");
        ian6.setName("Ian Intermediate");
        ian6.setPurchasedPackage("intermediate");
        StudentDTO ian7 = new StudentDTO();
        ian7.setEmailAddress("ian.intermediate@gmail.com");
        ian7.setName("Ian Intermediate");
        ian7.setPurchasedPackage("intermediate");
        StudentDTO ian8 = new StudentDTO();
        ian8.setEmailAddress("ian.intermediate@gmail.com");
        ian8.setName("Ian Intermediate");
        ian8.setPurchasedPackage("intermediate");
        StudentDTO ian9 = new StudentDTO();
        ian9.setEmailAddress("ian.intermediate@gmail.com");
        ian9.setName("Ian Intermediate");
        ian9.setPurchasedPackage("intermediate");
        StudentDTO ian10 = new StudentDTO();
        ian10.setEmailAddress("ian.intermediate@gmail.com");
        ian10.setName("Ian Intermediate");
        ian10.setPurchasedPackage("intermediate");
        StudentDTO ian11 = new StudentDTO();
        ian11.setEmailAddress("ian.intermediate@gmail.com");
        ian11.setName("Ian Intermediate");
        ian11.setPurchasedPackage("intermediate");
        StudentDTO ian12 = new StudentDTO();
        ian12.setEmailAddress("ian.intermediate@gmail.com");
        ian12.setName("Ian Intermediate");
        ian12.setPurchasedPackage("intermediate");
        StudentDTO ian13 = new StudentDTO();
        ian13.setEmailAddress("ian.intermediate@gmail.com");
        ian13.setName("Ian Intermediate");
        ian13.setPurchasedPackage("intermediate");
        StudentDTO ian14 = new StudentDTO();
        ian14.setEmailAddress("ian.intermediate@gmail.com");
        ian14.setName("Ian Intermediate");
        ian14.setPurchasedPackage("intermediate");
        StudentDTO ian15 = new StudentDTO();
        ian15.setEmailAddress("ian.intermediate@gmail.com");
        ian15.setName("Ian Intermediate");
        ian15.setPurchasedPackage("intermediate");
        StudentDTO ian16 = new StudentDTO();
        ian16.setEmailAddress("ian.intermediate@gmail.com");
        ian16.setName("Ian Intermediate");
        ian16.setPurchasedPackage("intermediate");
        StudentDTO ian17 = new StudentDTO();
        ian17.setEmailAddress("robert.rosario@gmail.com");
        ian17.setName("Ian Intermediate");
        ian17.setPurchasedPackage("intermediate");
        StudentDTO ian18 = new StudentDTO();
        ian18.setEmailAddress("robert@gmail.com");
        ian18.setName("Ian Intermediate");
        ian18.setPurchasedPackage("intermediate");
        

        return Arrays.asList(tony, nick, ian,ian1,ian2,ian3,ian4,ian5,ian6,ian7,ian8,ian9,ian10,ian11,ian12,ian13,ian14,ian15,ian16,ian17,ian18);
    }
}
