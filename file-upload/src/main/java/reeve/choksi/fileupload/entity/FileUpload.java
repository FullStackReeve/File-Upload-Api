package reeve.choksi.fileupload.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class FileUpload {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fileName;
	private String fileType;
	@Lob
	private byte[] fileContent;

	public FileUpload() {

	}

	public FileUpload(int id, String fileName, String fileType, byte[] fileContent) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileContent = fileContent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getFileContent() {
		return fileContent;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}
	
	@Override
	public String toString() {
		return "FileUpload [id=" + id + ", fileName=" + fileName + ", fileType=" + fileType + ", fileContent="
				+ Arrays.toString(fileContent) + "]";
	}

}
