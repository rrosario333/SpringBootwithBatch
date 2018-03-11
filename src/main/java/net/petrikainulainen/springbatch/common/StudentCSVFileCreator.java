package net.petrikainulainen.springbatch.common;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import net.petrikainulainen.springbatch.student.StudentDTO;

@Service
public class StudentCSVFileCreator {
	private static final String OBJECT_LIST_SAMPLE = "D:/Project/spring-batch-examples-master/spring-boot/object-list-sample.csv";
	private static final Logger LOGGER = LoggerFactory.getLogger(StudentCSVFileCreator.class);
	public  void csvCreation(List<? extends StudentDTO> items)
			throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		 LOGGER.info("Received the information of {} students", items.size());
		try (Writer writer = Files.newBufferedWriter(Paths.get(OBJECT_LIST_SAMPLE));) {
			StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer)
					.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).build();
			 LOGGER.info("Received the information of a student: {}", items);
			beanToCsv.write(items);
		}
	}

}
