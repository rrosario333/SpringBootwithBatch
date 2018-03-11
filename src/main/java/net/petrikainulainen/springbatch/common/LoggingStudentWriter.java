package net.petrikainulainen.springbatch.common;

import net.petrikainulainen.springbatch.student.StudentDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * This custom {@code ItemWriter} writes the information of the student to
 * the log.
 *
 */
public class LoggingStudentWriter implements ItemWriter<StudentDTO> {
	@Autowired
	StudentCSVFileCreator studentCSVFileCreator;

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingStudentWriter.class);

    @Override
    public void write(List<? extends StudentDTO> items) throws Exception {
        LOGGER.info("Received the information of {} students", items.size());
   
        studentCSVFileCreator.csvCreation(items); 
        
        
    }
}
