package reeve.choksi.fileupload.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reeve.choksi.fileupload.entity.FileUpload;
import reeve.choksi.fileupload.repository.FileUploadRepository;
import reeve.choksi.fileupload.service.FileUploadService;

@Service
public class FileUploadServiceImpl implements FileUploadService {

	@Autowired
	private FileUploadRepository fileRepo;

	public void uploadFile(FileUpload fileupload) {

		fileRepo.save(fileupload);

	}

	public List<FileUpload> getFile() {

		return (List<FileUpload>) fileRepo.findAll();

	}

	@Override
	public FileUpload getOneFile(int id) {
		
		return fileRepo.findOne(id);
	}

}
