package reeve.choksi.fileupload.service;

import java.util.List;

import reeve.choksi.fileupload.entity.FileUpload;

public interface FileUploadService {
	
	public void uploadFile(FileUpload fileupload);

	public List<FileUpload> getFile();

	public FileUpload getOneFile(int id);
}
