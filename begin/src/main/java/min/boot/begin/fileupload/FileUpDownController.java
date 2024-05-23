package min.boot.begin.fileupload;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FileUpDownController {
	private final FileUpDownService fileUpDownService;
	@GetMapping("/upload")
	public String form() {
		return "./fileupdown/uploadform";
	}
	@PostMapping("/upload")
	public String upload(Model model, FileUpDownDTO fileUpDownDTO, MultipartHttpServletRequest multipartHttpServletRequest ) throws Exception{
		return fileUpDownService.uploadFile(model, fileUpDownDTO, multipartHttpServletRequest);
	}
	@GetMapping("/down")
	public String down(@RequestParam(value="fileName", required = true)String fileName, HttpServletResponse response) throws Exception {
		return fileUpDownService.downloadFile(fileName, response);
	}

}
