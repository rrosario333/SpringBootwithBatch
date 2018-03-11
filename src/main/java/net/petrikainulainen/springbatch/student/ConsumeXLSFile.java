package net.petrikainulainen.springbatch.student;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConsumeXLSFile {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
	 @RequestMapping(value="/download/{type}", method = RequestMethod.GET)
	    public void downloadFile(HttpServletResponse response, @PathVariable("type") String type) throws IOException {
	     
	        File file = new File("D:/Project/spring-batch-examples-master/spring-boot/object-list-sample.csv");  
	        if(!file.exists()){
	            String errorMessage = "Sorry. The file you are looking for does not exist";
	            System.out.println(errorMessage);
	            OutputStream outputStream = response.getOutputStream();
	            outputStream.write(errorMessage.getBytes(Charset.forName("UTF-8")));
	            outputStream.close();
	            return;
	        }
	         
	        String mimeType= URLConnection.guessContentTypeFromName(file.getName());
	        if(mimeType==null){
	            System.out.println("mimetype is not detectable, will take default");
	            mimeType = "application/octet-stream";
	        }
	         
	        response.setContentType(mimeType);
	        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getName() +"\""));
	        response.setContentLength((int)file.length());
	        InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
	        FileCopyUtils.copy(inputStream, response.getOutputStream());
	    }
}
