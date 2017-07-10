package reeve.choksi.fileupload.repository;

import org.springframework.data.repository.CrudRepository;

import reeve.choksi.fileupload.entity.FileUpload;

public interface FileUploadRepository extends CrudRepository<FileUpload, Integer> {

}
