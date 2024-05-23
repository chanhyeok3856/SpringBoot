package min.boot.begin.fileupload;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class FileUpDownDTO {
private String name;
private String subject;
private MultipartFile file;
}
