package reeve.choksi.fileupload.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import reeve.choksi.fileupload.entity.FileUpload;
import reeve.choksi.fileupload.service.FileUploadService;

@RestController
public class FileUploadController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FileUploadController.class);

	@Autowired
	private FileUploadService fileService;

	@PostMapping(value = "/file")
	public ResponseEntity<Void> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
		LOGGER.info("Calling uploadFile method...");
		FileUpload fileupload = new FileUpload();
		byte[] content = file.getBytes();
		fileupload.setFileName(file.getOriginalFilename());
		fileupload.setFileType(file.getContentType());			
		fileupload.setFileContent(content);
		fileService.uploadFile(fileupload);
		return ResponseEntity.ok().build();
	}

	@GetMapping(value = "/file")
	public List<FileUpload> getFile() {
		return fileService.getFile();
	}
	
	@GetMapping(value = "/file/{id}")
	public FileUpload getFile(@PathVariable int id) {
		return fileService.getOneFile(id);
	}
	
	

}
