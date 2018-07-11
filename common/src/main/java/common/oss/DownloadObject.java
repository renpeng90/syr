package common.oss;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


public class DownloadObject {
	private String fileName;
	
	private String bucket;
	
	private InputStream inputStream;
	
	private String localFilename;
	
	private Map<String, Object> metadata = new HashMap<String, Object>();

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
	public String getLocalFilename() {
		return localFilename;
	}

	public void setLocalFilename(String localFilename) {
		this.localFilename = localFilename;
	}
}
